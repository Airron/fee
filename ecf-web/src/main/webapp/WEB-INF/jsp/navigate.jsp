<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default navbar-inverse" role="navigation"
				style="margin-bottom: 0px;">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">切换导航</span><span class="icon-bar"></span><span
							class="icon-bar"></span><span class="icon-bar"></span>
					</button>
					<a rel="nofollow" class="navbar-brand" href="#">众筹</a>
				</div>

				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a rel="nofollow" href="/">主页</a></li>
						<li><a rel="nofollow" href="/newproject">发起众筹</a></li>
						<li class="dropdown"><a rel="nofollow" href="#"
							class="dropdown-toggle" data-toggle="dropdown">众筹分类<strong
								class="caret"></strong></a>
							<ul class="dropdown-menu">
								<c:forEach var="catelist" items="${pcategorylist}">
									<li><a href="/project/cate/${catelist.pcategoryid}">${catelist.pcategory}</a>
									</li>
								</c:forEach>
							</ul></li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input class="form-control" type="text" />
						</div>
						<button type="submit" class="btn btn-default">搜索</button>
					</form>

					<c:if test="${sessionScope.user != null}">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="/setting">${sessionScope.user.uname}</a></li>
						</ul>


					</c:if>

					<c:if test="${sessionScope.user == null}">

						<ul class="nav navbar-nav navbar-right">

							<li><a rel="nofollow" id="modal-364386"
								href="#modal-container-364386" role="button" class="btn"
								data-toggle="modal">用户注册</a>
								<div class="modal fade affix" id="modal-container-364386"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog" style="z-index: 1030;">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">×</button>
												<h4 class="modal-title" id="myModalLabel">用户注册</h4>
											</div>
											<div class="modal-body">
												<form class="form-horizontal" role="form"
													action="/user/regist" method = "post">
													<div class="form-group">
														<label for="inputEmail3" class="col-sm-2 control-label">用户名：</label>
														<div class="col-sm-10">
															<input class="form-control" id="inputEmail3" type="text"
																name="uname" />
														</div>
													</div>
													<div class="form-group">
														<label for="inputEmail3" class="col-sm-2 control-label">邮箱：</label>
														<div class="col-sm-10">
															<input class="form-control" id="inputEmail3" type="text"
																name="uemail" />
														</div>
													</div>
													<div class="form-group">
														<label for="inputPassword3" class="col-sm-2 control-label">密码：</label>
														<div class="col-sm-10">
															<input class="form-control" id="inputPassword3"
																type="password" name="upassword" />
														</div>
													</div>
													
													<div class="form-group">
														<div class="col-sm-offset-2 col-sm-10">
															<button type="submit" class="btn btn-group btn-block">注册</button>
														</div>
													</div>
												</form>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>
												<!--<button type="button" class="btn btn-primary">保存</button>-->
											</div>
										</div>

									</div>

								</div></li>

							<li><a rel="nofollow" id="modal-364387"
								href="#modal-container-364387" role="button" class="btn"
								data-toggle="modal"> 用户登录 </a>

								<div class="modal fade" id="modal-container-364387"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">×</button>
												<h4 class="modal-title" id="myModalLabel">用户登录</h4>
											</div>
											<div class="modal-body">
													<form class="form-horizontal" role="form"
													action="/user/login" method="post">
													
													<div class="form-group">
														<label for="inputEmail3" class="col-sm-2 control-label">邮箱：</label>
														<div class="col-sm-10">
															<input class="form-control" id="inputEmail3" type="text"
																name="uemail" />
														</div>
													</div>
													<div class="form-group">
														<label for="inputPassword3" class="col-sm-2 control-label">密码：</label>
														<div class="col-sm-10">
															<input class="form-control" id="inputPassword3"
																type="password" name="upassword" />
														</div>
													</div>
													
													<div class="form-group">
														<div class="col-sm-offset-2 col-sm-10">
															<button type="submit" class="btn btn-group btn-block">登录</button>
														</div>
													</div>
												</form>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>

											</div>
										</div>

									</div>

								</div></li>

						</ul>

					</c:if>
				</div>

			</nav>
		</div>
	</div>
</div>
