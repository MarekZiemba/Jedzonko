package pl.coderslab.web.app.plan;

import pl.coderslab.dao.PlanDAO;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.Plan;
import pl.coderslab.model.Recipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/app/plan/list")
public class PlanList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PlanDAO planDAO = new PlanDAO();
        List<Plan> plans = planDAO.findAll();

        request.setAttribute("plan", plans);
        request.getRequestDispatcher("/app/plan/planList.jsp").forward(request, response);
    }

}