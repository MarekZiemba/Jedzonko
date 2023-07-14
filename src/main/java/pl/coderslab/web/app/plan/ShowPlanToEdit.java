package pl.coderslab.web.app.plan;

import pl.coderslab.dao.PlanDAO;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.Plan;
import pl.coderslab.model.Recipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/app/plan/showPlanToEdit")
public class ShowPlanToEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int adminId = (int) session.getAttribute("adminId");
        int id = Integer.parseInt(request.getParameter("id"));
        PlanDAO planDao = new PlanDAO();
        Plan plan = planDao.read(id);

        request.setAttribute("plan", plan);
        request.getRequestDispatcher("/app/plan/planEdit.jsp").forward(request, response);
    }
}
