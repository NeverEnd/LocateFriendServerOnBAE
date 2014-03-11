<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- The HTML 4.01 Transitional DOCTYPE declaration-->
<!-- above set at the top of the file will set     -->
<!-- the browser's rendering engine into           -->
<!-- "Quirks Mode". Replacing this declaration     -->
<!-- with a "Standards Mode" doctype is supported, -->
<!-- but may lead to some differences in layout.   -->

<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Hello locater</title>
  </head>

  <body>
  <%
  	String userName = request.getParameter("userName");
	if (userName == null)
		userName="default";
  %>
    <h1>Hello, <%=userName %></h1>
	<h4>Please input your email address!</h4>
    <form action="./sign" method="post">
		<input maxlength="30" name="username">
		<button name="Login">Submit</button>
	</form>
	
	<form action="./GetFriendList" method="get">
		<button name="test">TestJson</button>
	</form>
</body>
</html>