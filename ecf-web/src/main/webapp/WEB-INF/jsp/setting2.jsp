<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript" src="/js/bootstrap.js"></script>

<link rel="stylesheet" href="/css/bootstrap.css" />
<title></title>

</head>
<body>

	<%@include file="navigate.jsp"%>


	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="jumbotron well">
					<h1>个人设置</h1>
					<!--<p>
					This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>-->
				</div>


				<div class="alert alert-dismissable alert-success">
					<button type="button" class="close" data-dismiss="alert"
						aria-hidden="true">×</button>
					<h4>注意!</h4>
					<strong>${remessage }!</strong>
					<!--  <a href="#" class="alert-link">alert link</a> -->
				</div>



				<div class="row clearfix">

					<div class="col-md-1 column"></div>

					<div class="col-md-4 column">
						<form class="form-horizontal" role="form" action="/user/setting">
							<div class="form-group">
								<label for="inputEmail3" class="">登录邮箱：</label> <input
									class="form-control" readonly="readonly" id="inputEmail3"
									type="text" value="${sessionScope.user.uemail}" name="uemail" />

							</div>
							<div class="form-group">
								<label for="inputEmail3" class="">用户名：</label> <input
									class="form-control" id="inputEmail3" type="text"
									value="${sessionScope.user.uname }" name="uname" />

							</div>
							<div class="form-group">
								<label for="inputPassword3" class="">密码：</label> <input
									class="form-control" id="inputPassword3" type="password"
									value="${sessionScope.user.upassword }" name="upassword" />

							</div>

							<div class="form-group">
								<label for="inputEmail3" class="">收件地址：</label> <input
									class="form-control" id="inputEmail3" type="text"
									value="${sessionScope.user.uaddress }" name="uaddress" />

							</div>

							<div class="form-group">
								<label for="inputEmail3" class="">收件人/联系方式：</label> <input
									class="form-control" id="inputEmail3" type="text"
									value="${sessionScope.user.uimage }" name="uimage" />

							</div>


							<button type="submit" class="btn btn-group btn-block">确认修改</button>


						</form>







					</div>
					<div class="col-md-1 column"></div>
					<div class="col-md-4 column"></div>



					<div class="col-md-1 column"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>