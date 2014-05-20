<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<body>
    <p>
        User: <br />
        gdyd/123456<br />
        lenovo/123456<br />
        huawei/123456<br />
        zte/123456
    </p>
    <s:form action="login">
        <s:textfield name="username" label="Username" />
        <s:password name="password" label="Password" />
        <s:submit value="Login" />
    </s:form>
</body>
</html>
