<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Active Mobile Model Management</title>
</head>

<body>
<p>
  <b>Make name:</b>
  <s:property value="model.make_name" />
</p>

<p>
  <b>Model name:</b>
  <s:property value="model.model_name" />
</p>

<p>
  <b>Create time:</b>
  <s:property value="model.create_time" />
</p>

<p>
  <b>Image url:</b>
  <s:property value="model.image_url" />
</p>

<s:a href="inputModel.action?modelId=%{model.id}">Edit</s:a> |
<s:a action="listModel">Back</s:a>
</body>
</html>
