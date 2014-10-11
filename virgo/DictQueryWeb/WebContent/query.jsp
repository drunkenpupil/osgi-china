<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset= UTF-8"%>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Hello World</title>

    <meta name='description' content='A simple page'>

  </head>

  <body>

    <p><strong> 欢迎进入OSGI世界，你来测试个查询吧</strong>!</p>
    <form action="<%=request.getContextPath() %>/search">
     <input type="text" name="key" id="key"/>
     <input type="submit" name="searchBtn">
    </form>
  

  </body>

</html>