<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Active Mobile Device Management</title>
</head>

<body>
<s:if test="device.id != null">
    <h1>Editing device</h1>
</s:if>
<s:else>
    <h1>Add device</h1>
</s:else>

<s:form action="saveOrUpdateDevice" method="post">
    <div class="field">
        <s:hidden name="device.id" value="%{device.id}" />
    </div>
    <div class="field">
        <s:textfield name="device.equipment_id" label="Equipment id" />
    </div>
    <div class="field">
        <s:textfield name="device.mac_addr" label="MAC address" />
    </div>
    
    <div class="field">
        <s:textfield name="device.devicemodel_id" label="Model id" />
    </div>
     <div class="field">
        <s:textfield name="device.make_name" label="Make name" />
    </div>
     <div class="field">
        <s:textfield name="device.model_name" label="Model name" />
    </div>
    <div class="field">
        <s:textfield name="device.user_id" label="User id" />
    </div>
    <div class="field">
        <s:textfield name="device.username" label="User name" />
    </div>
    <div class="field">
        <s:textfield name="device.dialing_number" label="Dialing number" />
    </div>
    <div class="field">
        <s:hidden name="device.create_time" label="Create time" />
    </div>
    <div class="actions">
        <s:if test="device.id != null">
        <s:submit value="Update" />
        </s:if>
        <s:else>
        <s:submit value="Save" />
        </s:else>
  </div>
</s:form>

<s:if test="device.id != null">
<s:a href="showDevice.action?deviceId=%{device.id}">Show</s:a> |
</s:if>
<s:a action="listDevice">Back</s:a>
</body>
</html>
