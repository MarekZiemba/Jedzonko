package pl.coderslab.web.app.plan;

import pl.coderslab.dao.DayNameDao;
import pl.coderslab.dao.PlanDAO;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.dao.RecipePlanDao;
import pl.coderslab.model.DayName;
import pl.coderslab.model.Plan;
import pl.coderslab.model.Recipe;
import pl.coderslab.model.RecipePlan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet("/app/plan/details/")
public class PlanDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int planId = Integer.parseInt(request.getParameter("id"));

        PlanDAO planDao = new PlanDAO();
        Plan plan = planDao.read(planId);

        RecipeDao recipeDao = new RecipeDao();
        Recipe recipe = recipeDao.read(planId);

        List<DayName> dayNames = new DayNameDao().findAll();

        RecipePlanDao recipePlanDao = new RecipePlanDao();
        RecipePlan recipePlan = recipePlanDao.read(planId);

        request.setAttribute("plan", plan);
        request.setAttribute("recipe", recipe);
        request.setAttribute("dayName", dayNames);
        request.setAttribute("recipePlan", recipePlan);
        request.getRequestDispatcher("/app/plan/planDetails.jsp").forward(request, response);
    }
}
