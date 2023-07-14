package pl.coderslab.web.app.plan;

import pl.coderslab.dao.PlanDAO;
import pl.coderslab.model.Admin;
import pl.coderslab.model.Plan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Time;

@WebServlet("/app/plan/add")
public class AddPlanForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("admin")!=null){
            response.sendRedirect("/app/plan/planAdd.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Admin admin = (Admin) session.getAttribute("admin");
        String planName = request.getParameter("planName");
        String planDescription = request.getParameter("planDescription");
        PlanDAO planDAO = new PlanDAO();
        Plan plan = new Plan();
        plan.setAdminId(admin.getId());
        plan.setName(planName);
        plan.setDescription(planDescription);
        planDAO.create(plan);
        response.sendRedirect("/app/plan/list");
    }
}
