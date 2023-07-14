package pl.coderslab.web.app.plan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/app/recipe/plan/add")
public class AddRecipeToPlan extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("admin")!= null){
            response.sendRedirect("/app/plan/addRecipeToPlan.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Do obsługi formularza:
        // "Wybierz plan" to argument "choosePlan;
        // "Nazwa posiłku" to argument "name"
        // "Numer posiłku" to argument "number"     mam na myśli request.getAttribute();
        // "Przepis" to argument "recipe"
        // "Dzień" to argument "day"
    }
}
