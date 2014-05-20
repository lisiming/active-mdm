<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Active Mobile Model Management</title>
</head>

<body>
<s:if test="model.id != null">
    <h1>Editing model</h1>
</s:if>
<s:else>
    <h1>Add model</h1>
</s:else>

<s:form action="saveOrUpdateModel" method="post">
    <div class="field">
        <s:hidden name="model.id" value="%{model.id}" />
    </div>
    <div class="field">
        <s:textfield name="model.make_name" label="Make name" />
    </div>
    <div class="field">
        <s:textfield name="model.model_name" label="Model name" />
    </div>
    <div class="field">
        <s:hidden name="model.create_time" label="Create time" />
    </div>
    <div class="field">
        <s:textfield name="model.image_url" label="Image url" />
    </div>
    <div class="actions">
        <s:if test="model.id != null">
        <s:submit value="Update" />
        </s:if>
        <s:else>
        <s:submit value="Save" />
        </s:else>
  </div>
</s:form>

<s:if test="model.id != null">
<s:a href="showModel.action?modelId=%{model.id}">Show</s:a> |
</s:if>
<s:a action="listModel">Back</s:a>
</body>
</html>
