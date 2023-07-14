package pl.coderslab.web;

import pl.coderslab.dao.PlanDAO;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.PlanDetail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        int id = (int) session.getAttribute("adminId");


        RecipeDao recipeDao = new RecipeDao();
        int countOf = recipeDao.countRecipesByAdminId(id);
        request.setAttribute("countOfRecipes", countOf);


        PlanDAO planDAO = new PlanDAO();
        int count = planDAO.countOfPlans(id);
        List<PlanDetail> plan = planDAO.getPlanDetails(id);
        request.setAttribute("countOfPlans", count);
        request.setAttribute("lastPlan", plan);



        request.getRequestDispatcher("/logged/dashboard.jsp").forward(request, response);

    }


}
