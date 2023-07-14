<%--
  Created by IntelliJ IDEA.
  User: adrian
  Date: 13.04.2023
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="/logged/header.jsp" %>
<%@ include file="/logged/sideMenu.jsp" %>

<div class="m-4 p-4 width-medium">
    <div class="dashboard-header m-4">
        <div class="dashboard-menu">
            <div class="menu-item border-dashed">
                <a href="<c:url value="/app/recipe/recipeAdd.jsp"/>">
                    <i class="far fa-plus-square icon-plus-square"></i>
                    <span class="title">dodaj przepis</span>
                </a>
            </div>
            <div class="menu-item border-dashed">
                <a href="<c:url value="/app/plan/planAdd.jsp"/>">
                    <i class="far fa-plus-square icon-plus-square"></i>
                    <span class="title">dodaj plan</span>
                </a>
            </div>
            <div class="menu-item border-dashed">
                <a href="<c:url value="/app/plan/addRecipeToPlan.jsp"/>">
                    <i class="far fa-plus-square icon-plus-square"></i>
                    <span class="title">dodaj przepis do planu</span>
                </a>
            </div>
        </div>

        <div class="dashboard-alerts">
            <div class="alert-item alert-info">
                <i class="fas icon-circle fa-info-circle"></i>
                <span class="font-weight-bold">Liczba przepisów: ${countOfRecipes}</span>


            </div>
            <div class="alert-item alert-light">
                <i class="far icon-calendar fa-calendar-alt"></i>
                <span class="font-weight-bold">Liczba planów: ${countOfPlans}</span>
            </div>
        </div>
    </div>
    <div class="m-4 p-4 border-dashed">
        <h2 class="dashboard-content-title">
            <span>Ostatnio dodany plan:</span>
        </h2>
        <c:forEach var="plan" items="${lastPlan}">
            <table class="table">
                <thead>
                <tr class="d-flex">
                    <th class="col-2">${plan.dayName}</th>
                    <th class="col-8"></th>
                    <th class="col-2"></th>
                </tr>
                </thead>
                <tbody>
                <tr class="d-flex">
                    <td class="col-2">${plan.mealName}</td>
                    <td class="col-8">${plan.recipeName}</td>
                    <td class="col-2">
                        <button type="button" class="btn btn-primary rounded-0">Szczegóły</button>
                    </td>
                </tr>

                </tbody>
            </table>

        </c:forEach>


    </div>
</div>


<%@ include file="/logged/footer.jsp" %>
