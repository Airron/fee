<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>regist</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		 <script src="https://code.jquery.com/jquery.js"></script>
		  <!--<script src="js/bootstrap.min.js"></script>-->
		
		<script type="text/javascript" src="/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="/css/bootstrap-responsive.css" />
		<link rel="stylesheet" href="/css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="/css/bootstrap.css" />
		<link rel="stylesheet" href="/css/bootstrap.min.css" />
		<link rel="stylesheet" href="/responsive-nav.css">
		<script src="responsive-nav.js"></script>
</head>
<body>
<!-- 导航栏 -->
<%@include file="navigate.jsp" %>

<!-- 注册模块 -->
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span4">
		</div>
		<div class="span4">
			<form class="form-horizontal" action="/user/regist" method="post">
				<div class="control-group">
					 <label class="control-label" for="inputEmail">用户名</label>
					<div class="controls">
						<input id="inputEmail" type="text" name="uname"/>
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputEmail">邮箱</label>
					<div class="controls">
						<input id="inputEmail" type="text" name="uemail"/>
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputPassword">密码</label>
					<div class="controls">
						<input id="inputPassword" type="password" name="upassword" />
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						 <button type="submit" class="btn btn-info btn-large btn-block" id="registbtn">注册</button>
					</div>
				</div>
			</form>
		</div>
		<div class="span4">
		</div>
	</div>
</div>
</body>
</html>