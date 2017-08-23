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
<%@include file = "navigate.jsp" %>

<div class="container">
	
<div class="row clearfix">
							<div class="col-md-12 column">
								<div class="row">





									<c:forEach var="recommendlist"
										items="${requestScope.projectbycate }">


										<div class="col-md-4">
											<div class="thumbnail">
												<img alt="300x200" src="${recommendlist.pcontent }" />
												<div class="caption">
													<h4>${recommendlist.pname }</h4>
													
													<p>
														<a class="btn btn-primary" href="/project?projectid=${recommendlist.pid }">参与</a>

													</p>
												</div>
												<!--进度条-->
												
												<div class="progress">
													<div id="getpercent" class="progress-bar"
														role="progressbar" aria-valuenow="60" aria-valuemin="0"
														aria-valuemax="100" style="width: ${recommendlist.pblurb }%">
														<span class="sr-only">40% 完成</span>

													</div>
												</div>

												<div class="row clearfix">
													<div class="col-md-12 column">
														<div class="row clearfix">
															<div class="col-md-3 column">
																<p>进度</p>
																<p>${recommendlist.pblurb }%</p>
															</div>
															<div class="col-md-6 column">
																<p>已筹</p>
																<p>￥${recommendlist.ppledged }</p>
															</div>
															<div class="col-md-3 column">
																<p>剩余时间</p>
																<p>
																	
																		${recommendlist.penddate } 天
																</p>
																<!-- <p></p> -->
															</div>
														</div>
													</div>
												</div>

												<!--<div>
														<div class="col-md-4">
															<p>进度</p>
															<p>40%</p>
														</div>

													</div>-->
											</div>

										</div>


									</c:forEach>


									
								</div>
							</div>
						</div>
</div>

</body>
</html>