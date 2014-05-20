<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Active Mobile Device Management</title>
</head>

<body>
<h1>Listing devices</h1>

<table>
    <tr>
        <th>Equipment id</th>
        <th>MAC address</th>
        <th>Make model id</th>
        <th>Dialing number</th>
        <th>Create time</th>
        <th>Action</th>
    </tr>

<s:iterator value="deviceList">
    <tr>
        <td><s:property value="equipment_id" /></td>
        <td><s:property value="mac_addr" /></td>
        <td><s:property value="devicemodel_id" /></td>
        <td><s:property value="dialing_number" /></td>
        <td><s:property value="create_time" /></td>
        <td>
            <s:a href="showDevice.action?deviceId=%{id}">Show</s:a>
            <s:a href="inputDevice.action?deviceId=%{id}">Edit</s:a>
            <s:a href="deleteDevice.action?deviceId=%{id}" preInvokeJS="confirm('Are you sure?');" method="delete">Destroy</s:a>
        </td>
    </tr>
</s:iterator>
</table>

<br />

<s:a action="inputDevice">Add</s:a>
</body>
</html>
