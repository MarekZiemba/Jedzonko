<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ include file="/header.jsp" %>

<section class="dashboard-section">
  <div class="container pt-4 pb-4">
    <div class="border-dashed view-height">
      <div class="container w-25">
        <form class="padding-small text-center" method="post" action="/register">
          <h1 class="text-color-darker">Rejestracja</h1>
          <div class="form-group">
            <input type="text" class="form-control" id="name" name="first_name" placeholder="podaj imię">
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="surname" name="last_name" placeholder="podaj nazwisko">
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="email" name="email" placeholder="podaj email">
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="password" name="password" placeholder="podaj hasło">
          </div>
          <div class="form-group">
            <input type="text" class="form-control" id="repassword" name="password" placeholder="powtórz hasło">
          </div>
          <button class="btn btn-color rounded-0" type="submit">Zarejestruj</button>
        </form>
      </div>
    </div>
  </div>
</section>

<%@ include file="/footer.jsp" %>
