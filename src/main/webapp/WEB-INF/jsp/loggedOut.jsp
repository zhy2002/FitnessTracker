<%--
  Created by IntelliJ IDEA.
  User: ZHY
  Date: 1/07/2015
  Time: 10:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<t:page pageTitle="You have successfully Logged out">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <div class="alert alert-info">
                <h3><s:message code="fitnesstracker.logoutpage.header"/></h3>
            </div>

            <t:gobackLink />
        </div>
    </div>


</t:page>
