<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<%@include file="navigate.jsp" %>



	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
			<input type = "hidden" name="pid" value="${requestScope.pid }">
				<table class="table">
				
					<thead>
						<tr>
							
							<th>产品</th>
							<th>数量</th>
							<th>状态</th>
							<th>价格</th>
							<th></th>

						</tr>
					</thead>
					<tbody>
					
						<tr>
							
							<td>${requestScope.pcfintrouce }</td>
							<td><!-- <script language=Javascript>
										var now = new Date()
										document.write(1900 + now.getYear() + "-" + (now.getMonth() + 1) + "-" + now.getDate() + " " + now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds())
									</script> -->
								${requestScope.neworderlist.ocount }	
							</td>
							<td>${requestScope.neworderlist.ostatus }</td>
							<td>${requestScope.neworderlist.oprice }</td>
							<td></td>
						</tr>
						<!--<tr class="success">
								<td>
									1
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									01/04/2012
								</td>
								<td>
									Approved
								</td>
								<td>123</td>
							</tr>
							<tr class="error">
								<td>
									2
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									02/04/2012
								</td>
								<td>
									Declined
								</td>
								<td>123</td>
							</tr>
							<tr class="warning">
								<td>
									3
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									03/04/2012
								</td>
								<td>
									Pending
								</td>
								<td>123</td>
							</tr>
							<tr class="info">
								<td>
									4
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									04/04/2012
								</td>
								<td>
									Call in to confirm
								</td>
								<td>123</td>
							</tr>-->
					</tbody>
				</table>
			</div>
		</div>
	</div>

<script type="text/javascript">
	
</script>

</body>
</html>