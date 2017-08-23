<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container">

	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="tabbable tabs-left" id="tabs-304719">
				<ul class="nav nav-tabs ">
					
						<li><a href="#panel-${catelist.pcategoryid}">推荐内容</a>
						</li>
					
					<!-- <li class="active"><a href="#panel-1" data-toggle="tab">未来科技</a>
					</li>
					<li><a href="#panel-749179" data-toggle="tab">人文艺术</a></li> -->
				</ul>


				<div class="tab-content">

					<div class="tab-pane active" id="panel-${catelist.pcategoryid}">

						<div class="row clearfix">
							<div class="col-md-12 column">
								<div class="row">





									<c:forEach var="recommendlist"
										items="${requestScope.recommendlist }">


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
																	
																		${recommendlist.pblurb } 天
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

						<!-- <div>

							<ul class="pagination center-block">
								<li><a href="#">Prev</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#">Next</a></li>
							</ul>

						</div> -->



					</div>

					<div class="tab-pane" id="panel-749179">
						<p>Howdy, I'm in Section 2.</p>
					</div>
				</div>
			</div>

		</div>
	</div>
</div>

