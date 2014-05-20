<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Active Mobile Model Management</title>
</head>

<body>
<h1>Listing models</h1>

<table>
    <tr>
        <th>Make name</th>
        <th>Model name</th>
        <th>Create time</th>
        <th>Image url</th>
    </tr>

<s:iterator value="modelList">
    <tr>
        <td><s:property value="make_name" /></td>
        <td><s:property value="model_name" /></td>
        <td><s:property value="create_time" /></td>
        <td><s:property value="image_url" /></td>
        <td>
            <s:a href="showModel.action?modelId=%{id}">Show</s:a>
            <s:a href="inputModel.action?modelId=%{id}">Edit</s:a>
            <s:a href="deleteModel.action?modelId=%{id}" preInvokeJS="confirm('Are you sure?');" method="delete">Destroy</s:a>
        </td>
    </tr>
</s:iterator>
</table>

<br />

<s:a action="inputModel">Add</s:a>
</body>
</html>
