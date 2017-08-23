<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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



	<div class="container" style="margin-top: 15px;">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">
					<div class="col-md-8 column"
						style="padding-left: 15px; padding-right: 15px;">
						<img src="${requestScope.pjb.pcontent }" class="img-responsive" alt="" />

					</div>
					<div class="col-md-4 column" style="background-color: #C7C7C7;">
						<h3>${requestScope.pjb.pname }</h3>
						<p>已筹到</p>
						<h1>￥${requestScope.pjb.ppledged }</h1>

						<!--进度条-->
						<div class="progress">
							<div class="progress-bar" role="progressbar" aria-valuenow="60"
								aria-valuemin="0" aria-valuemax="100"
								style="width: ${requestScope.pjbp }%;">
								<span class="sr-only">完成${requestScope.pjbp } %</span>
							</div>

						</div>
						<p>
							<strong>已完成 ${requestScope.pjbp } %</strong>
						</p>
						<p>开始时间：<fmt:formatDate pattern="yyyy-MM-dd"
								value="${requestScope.pjb.pstartdate }" /></p>
						<p>剩余时间：
								${requestScope.pjb.penddate }天</p>
						<p>发起人：${requestScope.pjb.user }</p>
						<h3>目标金额：￥${requestScope.pjb.pgoal }</h3>

					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="container" style="margin-top: 20px;">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">

					<!--项目详情和评论-->
					<div class="col-md-8 column">
						<div class="tabbable" id="tabs-503809">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#panel-55629" data-toggle="tab">主页</a>
								</li>
								<!-- <li><a href="#panel-102139" data-toggle="tab">进度</a></li>
								<li><a href="#panel-55628" data-toggle="tab">话题</a></li> -->
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="panel-55629">
									<p>
										<c:forEach var="imageList" items="${imglist }">
											<img class="img-responsive" src="${imageList.value }" />  
										</c:forEach>
										<!--  <img class="img-responsive" src="img/pj3_1.jpg" /> <img
											class="img-responsive" src="img/pj3_2.jpg" /> <img
											class="img-responsive" src="img/pj3_3.jpg" /> <img
											class="img-responsive" src="img/pj3_4.jpg" /> <img
											class="img-responsive" src="img/pj3_5.jpg" /> <img
											class="img-responsive" src="img/pj3_6.jpg" /> <img
											class="img-responsive" src="img/pj3_7.jpg" /> -->
									</p>
								</div>
								<div class="tab-pane" id="panel-102139">
									<p>Howdy, I'm in Section 2.</p>
								</div>
								<div class="tab-pane" id="panel-55628">
									<p>section 3</p>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-4 column" style="padding-top: 40px;">
						<div class="panel-group" id="panel-313554">
						<c:forEach var="pcf" items="${pcflist }">
						
						
							<div class="panel panel-default">
							
							
								<div class="panel-heading">
									<a class="panel-title collapsed" data-toggle="collapse"
										data-parent="#panel-313554" href="#panel-element-${pcf.pcftypeid }">
										￥${pcf.pcfprice } <span>限额<strong>${pcf.pcfprix }份</strong></span>
									</a>
									<script>
										
									</script>

								</div>
							<form action="/project/neworder" method = "post">	
								<div id="panel-element-${pcf.pcftypeid }" class="panel-collapse collapse">
									<div class="panel-body">
										<h4>${pcf.pcfintrouce }</h4>
									<input class="hidden" name="pid" value="${pcf.pid }">
									<input class="hidden" name="pcfintrouce" value="${pcf.pcfintrouce }">
									<input class="hidden" name="pcftypeid" value="${pcf.pcftypeid }" />	
									<input class="hidden" name="pcfprice" value="${pcf.pcfprice }" />
									<input class="hidden" name="uid" value="${sessionScope.user.uid}"/>
									<input class="hidden" name="oaddress" value = "${sessionScope.user.uaddress}"/>

										<button type="submit" class="btn btn-default btn-primary">参与</button>
										<input name="ocount" />
										
									</div>
								</div>
							</form>
							</div>
							
							</c:forEach>
							
							
							
							
							
							
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



</body>
</html>