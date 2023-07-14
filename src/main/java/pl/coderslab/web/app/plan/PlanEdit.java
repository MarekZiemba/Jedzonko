package pl.coderslab.web.app.plan;

import pl.coderslab.dao.PlanDAO;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.Plan;
import pl.coderslab.model.Recipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/app/plan/edit")
public class PlanEdit extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int adminId = (int) session.getAttribute("adminId");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("planName");
        String description = request.getParameter("planDescription");

        PlanDAO planDAO = new PlanDAO();
        Plan plan = new Plan();

        plan.setId((id));
        plan.setName(name);
        plan.setDescription(description);

        plan.setAdminId(adminId);

        planDAO.update(plan);
        response.sendRedirect(request.getContextPath() + "/app/plan/list");
    }
}
