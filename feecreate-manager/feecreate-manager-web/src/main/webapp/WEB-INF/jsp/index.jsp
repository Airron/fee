<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta charset="UTF-8">
		<title>Bootstrap 模板</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- 引入 Bootstrap -->
		<link rel="stylesheet" href="css/index.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />

		<!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
		<!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
		<!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
	</head>

	<body>

		<div class="container">
			<form class="form-horizontal"  action="/upload" method = "post" enctype="multipart/form-data">
				<div class="form-group">
					<label for="inputfile">文件输入</label>
					<input type="file" id="inputfile" name="file">
					<p></p>
					<input type="submit" value="转换：EXCEL"/>
					<!--<p class="help-block">这里是块级帮助文本的实例。</p>-->
				</div>
			</form>

		</div>

		<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
		<script src="https://code.jquery.com/jquery.js"></script>
		<!-- 包括所有已编译的插件 -->
		<script src="js/bootstrap.min.js"></script>

	</body>

</html>