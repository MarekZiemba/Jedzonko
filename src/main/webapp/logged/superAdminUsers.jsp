<%--
  Created by IntelliJ IDEA.
  User: adrian
  Date: 13.04.2023
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/logged/header.jsp" %>
<%@ include file="/logged/sideMenu.jsp" %>
<html>

<div class="m-4 p-3 width-medium">
    <div class="m-4 p-3 border-dashed view-height">

        <div class="row border-bottom border-3 p-1 m-1">
            <div class="col noPadding">
                <h3 class="color-header text-uppercase">LISTA UŻYTKOWNIKÓW</h3>
            </div>
            <div class="col d-flex justify-content-end mb-2 noPadding">
                <a href="#" class="btn btn-success rounded-0 pt-0 pb-0 pr-4 pl-4">Powrót</a>
            </div>
        </div>

        <div class="schedules-content">
            <table class="table">
                <thead>
                <tr class="d-flex">
                    <th class="col-1">ID</th>
                    <th class="col-3">IMIĘ</th>
                    <th class="col-6">NAZWISKO</th>
                    <th class="col-2 center">AKCJE</th>
                </tr>
                </thead>
                <tbody class="text-color-lighter">
                <tr class="d-flex">
                    <td class="col-1">1</td>
                    <td class="col-3">Marek</td>
                    <td class="col-6">Marecki</td>
                    <td class="col-2 center">
                        <a href="#" class="btn btn-danger rounded-0 text-light m-1">Blokuj</a>
                    </td>
                </tr>
                <tr class="d-flex">
                    <td class="col-1">2</td>
                    <td class="col-3">Marek</td>
                    <td class="col-6">Marecki</td>
                    <td class="col-2 center">
                        <a href="#" class="btn btn-danger rounded-0 text-light m-1">Blokuj</a>
                    </td>
                </tr>
                <tr class="d-flex">
                    <td class="col-1">3</td>
                    <td class="col-3">Marek</td>
                    <td class="col-6">Marecki</td>
                    <td class="col-2 center">
                        <a href="#" class="btn btn-danger rounded-0 text-light m-1">Blokuj</a>
                    </td>
                </tr>
                </tbody>
            </table>

        </div>
    </div>
</div>
</div>
</section>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>

</html>