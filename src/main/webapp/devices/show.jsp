<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Active Mobile Device Management</title>
</head>

<body>
<p>
  <b>Equipment id:</b>
  <s:property value="device.equipment_id" />
</p>

<p>
  <b>MAC address:</b>
  <s:property value="device.mac_addr" />
</p>

<p>
  <b>Make model id:</b>
  <s:property value="device.devicemodel_id" />
</p>

<p>
  <b>Dialing number:</b>
  <s:property value="device.dialing_number" />
</p>

<p>
  <b>Create time:</b>
  <s:property value="device.create_time" />
</p>


<s:a href="inputDevice.action?deviceId=%{device.id}">Edit</s:a> |
<s:a action="listDevice">Back</s:a>
</body>
</html>
