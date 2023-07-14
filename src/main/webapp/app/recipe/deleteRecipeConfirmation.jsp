<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/logged/header.jsp" %>
<%@ include file="/logged/sideMenu.jsp" %>

<html>
<head>
    <title>Usuwanie przepisu</title>
</head>
<body>

<div class="dashboard-content border-dashed p-3 m-4">
    <div class="row border-bottom border-3 p-1 m-1">
        <div class="col noPadding">
            <h3 class="color-header text-uppercase">Czy na pewno chcesz usunąć przepis z planu?</h3>
        </div>
        <div class="col d-flex justify-content-end mb-2 noPadding">
            <form method="post" action="${pageContext.request.contextPath}/recipeDelete">
                <input type="hidden" name="recipeId" value="${recipeId}">
                <td class="col-1 center">
                    <button type="submit" class="btn btn-danger rounded-0 text-light m-1" name="confirm" value=>OK</button>
                </td>
                <td class="col-2 center">
                    <a href="${pageContext.request.contextPath}/app/recipe/list?id=${recipeId}" class="btn btn-info rounded-0 text-light m-1">Anuluj</a>
                </td>
            </form>
        </div>
    </div>
</div>
</form>
</body>
</html>

<%@ include file="/logged/footer.jsp" %>