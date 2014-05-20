<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><decorator:title default="广东移动智能手机管理平台试用版" /></title>
<decorator:head />
</head>

<body>
    <div>
        <s:if test="#session.user_session_key != null">
        <s:a action="listDevice">All Devices</s:a>
        <s:a action="listModel">All Models</s:a>
        Welcome, you have logined.
        <s:a action="logout">Logout</s:a>
        </s:if>
        <s:else>
        <s:a action="login!input">Login</s:a> |
        <s:a action="register!input">Register</s:a>
        </s:else>
    </div>
    <hr />
    <div>Navigation</div>
    <hr />
    <decorator:body />
    <hr />
    <div>Powered by Tenggle Technologies.</div>
</body>
</html>
