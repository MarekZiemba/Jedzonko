package pl.coderslab.web.app.recipe;

import pl.coderslab.dao.AdminDAO;
import pl.coderslab.dao.RecipeDao;
import pl.coderslab.model.Recipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/app/recipe/edit")
public class EditRecipe extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        int adminId = (int) session.getAttribute("adminId");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String ingredients = request.getParameter("ingredients");
        String description = request.getParameter("description");
        int preparationTime = Integer.parseInt(request.getParameter("preparationTime"));
        String preparation = request.getParameter("preparation");

        RecipeDao recipeDao = new RecipeDao();
        Recipe recipe = new Recipe();

        recipe.setId((id));
        recipe.setName(name);
        recipe.setIngredients(ingredients);
        recipe.setDescription(description);
        recipe.setPreparationTime(preparationTime);
        recipe.setPreparation(preparation);
        recipe.setAdminId(adminId);

        recipeDao.update(recipe);
        response.sendRedirect(request.getContextPath() + "/app/recipe/list");



    }
}
