<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript" src="/js/bootstrap.js"></script>
<script type="text/javascript" src="/js/ajaxfileupload.js"></script>
<link rel="stylesheet" href="/css/bootstrap.css" />

<title></title>




</head>
<body>

	<%@include file="navigate.jsp"%>



	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form name="serForm" action="/newproject/imgupload" method="post" enctype="multipart/form-data">
					<div class="col-md-8 column">

						<!-- 文件上传部分 -->

						<input id="files" type="file" name="file"
							onchange="previewImage(this,'prvid')" multiple="multiple" /> <input
							type="hidden" name="pimage" id="setpimage" />


						<div id="prvid">预览容器</div>
						<!-- <button id="subimg" class="btn-block btn-warning"
							style="margin-top: 16px; padding-bottom: 5px;">
							<h3>上传</h3>
						</button> -->



					</div>


					<div class="col-md-4 column">

						<h3>项目标题</h3>
						<input class="form-control" name="pname"> <input
							type="hidden" name="user" value="${sessionScope.user.uname }">
						<h3>项目标题</h3>
						<select name="pcategoryid" onchange="setPcategoryid()">
							<option value="1">未来科技</option>
							<option value="2">人文艺术</option>
							<option value="3">未解之谜</option>
							<option value="4">创意家居</option>
							<option value="5">服装饰品</option>
						</select>
						<p>目标金额</p>
						<input class="form-control" name="pgoal" />
						<p>众筹时长:天</p>
						<input class="form-control" name="penddate" />




						<!-- <a href="#panel-816926" data-toggle="tab"><button
											class="btn-info btn-block"
											style="margin-top: 20px; margin-bottom: 20px;">
											<h4>上一步</h4>
										</button></a> -->
						<button class="btn-block btn-warning"
							style="margin-top: 16px; padding-bottom: 5px;">
							<h3>提交</h3>
						</button>

					</div>
				</form>

				<div class="col-md-1 column"></div>
				<div class="col-md-2 column"></div>
				<div class="col-md-1 column"></div>
				</form>
			</div>
		</div>
	</div>


	<%-- <div class="tabbable" id="tabs-46926">

		<!--<ul class="nav nav-tabs">
				<li class="active">
					<a href="#panel-816926" data-toggle="tab">基本信息</a>
				</li>
				<li>
					<a href="#panel-102282" data-toggle="tab">图片上传</a>
				</li>
			</ul>-->

		<div class="tab-content">

			<div class="tab-pane active" id="panel-816926">
				<div class="container">
					<div class="row clearfix">

						<div class="col-md-12 column"></div>
						<form action="/newproject/start" method="post"
							enctype="multipart/form-data">
							<div class="col-md-1 column"></div>
							<div class="col-md-4 column">

								<h3>项目标题</h3>
								<input class="form-control" name="pname"> <input
									type="hidden" name="user" value="${sessionScope.user.uname }">
								<h3>项目标题</h3>
								<select name="pcategoryid" onchange="setPcategoryid()">
									<option value="1">未来科技</option>
									<option value="2">人文艺术</option>
									<option value="3">未解之谜</option>
									<option value="4">创意家居</option>
									<option value="5">服装饰品</option>
								</select>
								<p>目标金额</p>
								<input class="form-control" name="pgoal" />
								<p>众筹时长</p>
								<input class="form-control" name="penddate" />



								</button>
								<a href="#panel-102282" data-toggle="tab"><button
										class="btn-info">
										<h4>下一步</h4>
									</button></a>

							</div>
							<div class="col-md-1 column"></div>
							<div class="col-md-6 column">

								<h4>项目简介</h4>
								<textarea class="form-control" name="pblurb"></textarea>
							</div>

						</form>
					</div>

				</div>
			</div>

			<div class="tab-pane" id="panel-102282">
				<div class="photos-upload-view">
					<div class="container">
						<div class="row clearfix">
							<div class="col-md-12 column">

								<div class="col-md-8 column">

									<!-- 文件上传部分 -->
									<form name="serForm" method="post"
										enctype="multipart/form-data">
										<input id="files" type="file" name="file"
											onchange="previewImage(this,'prvid')" multiple="multiple" />
										<input type="hidden" name="pimage" id="setpimage" />


										<div id="prvid">预览容器</div>
										<button id="subimg" class="btn-block btn-warning"
											style="margin-top: 16px; padding-bottom: 5px;">
											<h3>上传</h3>
										</button>
									</form>


								</div>


								<div class="col-md-4 column">

									<h3>项目标题</h3>
									<input class="form-control" name="pname"> <input
										type="hidden" name="user" value="${sessionScope.user.uname }">
									<h3>项目标题</h3>
									<select name="pcategoryid" onchange="setPcategoryid()">
										<option value="1">未来科技</option>
										<option value="2">人文艺术</option>
										<option value="3">未解之谜</option>
										<option value="4">创意家居</option>
										<option value="5">服装饰品</option>
									</select>
									<p>目标金额</p>
									<input class="form-control" name="pgoal" />
									<p>众筹时长</p>
									<input class="form-control" name="penddate" />



									
									<a href="#panel-816926" data-toggle="tab"><button
											class="btn-info btn-block"
											style="margin-top: 20px; margin-bottom: 20px;">
											<h4>上一步</h4>
										</button></a>
									<button class="btn-block btn-warning"
										style="margin-top: 16px; padding-bottom: 5px;">
										<h3>提交</h3>
									</button>
									
								</div>
								
								
								<div class="col-md-1 column"></div>
								<div class="col-md-2 column">
									
								</div>
								<div class="col-md-1 column"></div>
								</form>
							</div>
						</div>
					</div>

				</div>
			</div>

		</div>
	</div> --%>



	<script type="text/javascript" src="js/jquery-1.8.3.min.js"
		charset="UTF-8"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/bootstrap-datetimepicker.js"
		charset="UTF-8"></script>
	<script type="text/javascript" src="js/bootstrap-datetimepicker.fr.js"
		charset="UTF-8"></script>

	<script type="text/javascript">
		$(function(){
			$('#subimg').click(function(){
				//要提交的form表单id
				$.ajax({
					url:"/newproject/imgupload",
					data:$('#serForm').serialize(),
					type:"post",
					success:function(data){
						
					}
				})
			})
		})
		</script>
	<script type="text/javascript">
	
		function setfilename(){
			var file = $("#file").val();
			var fileName = getFileName(file);
			var setname = document.getElementById('setpimage')
			setname.addAttribute('value',fileName);
			function getFileName(o){
 			    var pos=o.lastIndexOf("\\");
			    return o.substring(pos+1);  
			}
		}
	</script>

	<script type="text/javascript">
	
	
		$('.form_datetime').datetimepicker({
			//language:  'fr',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			forceParse : 0,
			showMeridian : 1
		});
		$('.form_date').datetimepicker({
			language : 'fr',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
		$('.form_time').datetimepicker({
			language : 'fr',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 1,
			minView : 0,
			maxView : 1,
			forceParse : 0
		});
	</script>



	<script type="text/javascript">
		function previewImage(file, prvid) {
			/* file：file控件
			 * prvid: 图片预览容器
			 */
			var tip = "Expect jpg or png or gif!"; // 设定提示信息
			var filters = {
				"jpeg" : "/9j/4",
				"gif" : "R0lGOD",
				"png" : "iVBORw"
			}
			var prvbox = document.getElementById(prvid);
			prvbox.innerHTML = "";
			if (window.FileReader) { // html5方案
				for (var i = 0, f; f = file.files[i]; i++) {
					var fr = new FileReader();
					fr.onload = function(e) {
						var src = e.target.result;
						if (!validateImg(src)) {
							alert(tip)
						} else {
							showPrvImg(src);
						}
					}
					fr.readAsDataURL(f);
				}
			} else { // 降级处理
				if (!/\.jpg$|\.png$|\.gif$/i.test(file.value)) {
					alert(tip);
				} else {
					showPrvImg(file.value);
				}
			}
			function validateImg(data) {
				var pos = data.indexOf(",") + 1;
				for ( var e in filters) {
					if (data.indexOf(filters[e]) === pos) {
						return e;
					}
				}
				return null;
			}
			function showPrvImg(src) {
				var img = document.createElement("img");
				img.src = src;
				img.setAttribute('class', 'img-responsive')
				img.setAttribute('name', 'pimage')
				prvbox.appendChild(img);
			}
		}
	</script>
</body>
</html>