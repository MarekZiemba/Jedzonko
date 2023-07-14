<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="/logged/header.jsp" %>
<%@ include file="/logged/sideMenu.jsp" %>

<div class="m-4 p-3 width-medium ">
    <div class="dashboard-content border-dashed p-3 m-4">
        <div class="row border-bottom border-3 p-1 m-1">
            <div class="col noPadding">
                <h3 class="color-header text-uppercase">SZCZEGÓŁY PLANU</h3>
            </div>
            <div class="col d-flex justify-content-end mb-2 noPadding">
                <a href="<c:url value="/app/plan/list"/>" class="btn btn-success rounded-0 pt-0 pb-0 pr-4 pl-4">Powrót</a>
            </div>
        </div>

        <div class="schedules-content">
            <div class="schedules-content-header">
                <div class="form-group row">
                                <span class="col-sm-2 label-size col-form-label">
                                    Nazwa planu
                                </span>
                    <div class="col-sm-10">
                        <p class="schedules-text">${plan.name}</p>
                    </div>
                </div>
                <div class="form-group row">
                                <span class="col-sm-2 label-size col-form-label">
                                    Opis planu
                                </span>
                    <div class="col-sm-10">
                        <p class="schedules-text">
                            ${plan.description}
                    </div>
                </div>
            </div>

            <table class="table">
                <c:forEach var="dayName" items="${dayName}">
                <thead>
                <tr class="d-flex">
                    <th class="col-2">${dayName.name}</th>
                    <th class="col-7"></th>
                    <th class="col-1"></th>
                    <th class="col-2"></th>
                </tr>
                </thead>
                <tbody class="text-color-lighter">
                <tr class="d-flex">

                </tr>
                        <!-- Formularz do usuwania przepisu z planu -->
                        <form action="/app/plan/deleteRecipePlanConfirmation.jsp" method="post">
                            <input type="hidden" name="plan_id" value="${plan.id}">
                            <input type="hidden" name="recipe_id" value="${recipe.id}">
                <tr class="d-flex">
                    <td class="col-2">${recipePlan.mealName}</td>
                    <td class="col-7">${recipe.name}</td>
                    <td class="col-1 center">
                        <button type="submit" class="btn btn-danger rounded-0 text-light m-1">Usuń</button>
                    </td>
                    <td class="col-2 center">
                        <a href="<c:url value='/app/recipe/details?id=${recipe.id}'/>" class="btn btn-info rounded-0 text-light m-1">Szczegóły</a>
                    </td>
                </tr>
                        </form>
                </tbody>
                </c:forEach>
            </table>

        </div>
    </div>
</div>

<%@ include file="/logged/footer.jsp" %>
