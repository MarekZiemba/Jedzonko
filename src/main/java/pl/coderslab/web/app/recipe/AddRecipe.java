package pl.coderslab.web.app.recipe;

import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.Recipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/app/recipe/add")
public class AddRecipe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Przekieruj na widok formularza dodawania przepisu
        request.getRequestDispatcher("/app/recipe/recipeAdd.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Tworzenie obiektu modelu Recipe
        Recipe recipe = new Recipe();

        recipe.setName(request.getParameter("name"));
        recipe.setDescription(request.getParameter("description"));
        recipe.setPreparationTime(Integer.parseInt(request.getParameter("preparation_time")));
        recipe.setPreparation(request.getParameter("preparation"));
        recipe.setIngredients(request.getParameter("ingredients"));

        // Pobranie identyfikatora adminId z sesji i ustawienie wartości pola admin_id w obiekcie modelu Recipe
        HttpSession session = request.getSession();
        int adminId = (int) session.getAttribute("adminId");
        recipe.setAdminId(adminId);

        // Zapisanie obiektu do bazy danych
        RecipeDao recipeDao=new RecipeDao();
        recipeDao.create(recipe);
        request.setAttribute("name",recipe.getName());
        request.setAttribute("description",recipe.getDescription());
        request.setAttribute("preparation_time",recipe.getPreparationTime());
        request.setAttribute("preparation",recipe.getPreparation());
        request.setAttribute("ingredients",recipe.getIngredients());

        // Przekieruj na stronę z listą wszystkich przepisów
        response.sendRedirect(request.getContextPath() + "/app/recipe/list");
    }
}
