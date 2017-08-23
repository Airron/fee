<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript" src="/js/bootstrap.js"></script>

<link rel="stylesheet" href="/css/bootstrap.css" />
<title></title>
</head>
<body>

	<form action="/user/regist" method="post">
		
			<label for="exampleInputEmail1">User name</label><input
				class="form-control" id="exampleInputEmail1" 
				name="uname" />
		
		
			<label for="exampleInputEmail1">Email address</label><input
				class="form-control" id="exampleInputEmail1" 
				name="uemail" />
		
		
			<label for="exampleInputPassword1">Password</label><input
				class="form-control" id="exampleInputPassword1" type="password"
				name="upassword" />
		
		
			
			
		
		
		<button type="submit" >Submit</button>
	</form>

</body>
</html>