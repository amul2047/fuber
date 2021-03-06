<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fuber</title>
<title>Fuber</title>
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport'>
<!-- Bootstrap 3.3.4 -->
<link rel="stylesheet"
	href='<c:url value="/web-resources/bootstrap/css/bootstrap.min.css"/>'>

<!-- Font Awesome Icons -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css"
	rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link rel="stylesheet" type="text/css"
	href='<c:url value="/web-resources/dist/css/AdminLTE.min.css"/>'>

<!-- AdminLTE Skins. Choose a skin from the css/skins 
         folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" type="text/css"
	href='<c:url value="/web-resources/dist/css/skins/_all-skins.min.css"/>'>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript"
	src='<c:url value="/web-resources/plugins/jQuery/jQuery-2.1.4.min.js"/>'></script>
</head>
<!-- ADD THE CLASS fixed TO GET A FIXED HEADER AND SIDEBAR LAYOUT -->
<!-- the fixed layout is not compatible with sidebar-mini -->
<body class="skin-blue fixed sidebar-mini">
	<!-- Site wrapper -->
	<div class="wrapper">
		<header class="main-header">
			<!-- Logo -->
			<a href="/fuber/dashboard" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>FU</b>BER</span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>Fuber</b></span>
			</a>
			<!-- Header Navbar: style can be found in header.less -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> <span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
				</a>
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">

						<li class="dropdown user user-menu"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"> <span
								class="hidden-xs"><c:out value="${role}" /></span>
						</a>
							<ul class="dropdown-menu">
								<!-- User image -->
								<li class="user-header">
									<p>
										<c:out value="${username}" />
										<small>Member since Nov. 2012</small>
									</p>
								</li>
								<li class="user-footer">
									<div class="pull-left">
										<a href="#" class="btn btn-default btn-flat">Profile</a>
									</div>
									<div class="pull-right">
										<a onClick="formSubmit()"
											class="btn btn-default btn-flat">Sign out</a>
									</div>
								</li>
							</ul></li>
					</ul>
				</div>
			</nav>
		</header>

		<!-- =============================================== -->

		<!-- Left side column. contains the sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<!-- Sidebar user panel -->


				<!-- sidebar menu: : style can be found in sidebar.less -->
				<ul class="sidebar-menu">

		<c:if test = "${role == '[hungry]'}">
						<li class="header">Hungry</li>
						<li class="treeview"><a href="<c:url value="/dashboard/"/>">
								<i class="fa fa-dashboard"></i> <span>Dashboard</span>
						</a></li>
						<li><a href="<c:url value="/hungry/feeder/"/>"> <i
								class="fa fa-th"></i> <span>Nearest Feeders</span>
						</a></li>
						<li><a
							href="<c:url value="/hungry/profile/${sessionScope.USER_ID}"/>">
								<i class="fa fa-th"></i> <span>Profile</span>
						</a></li>
						<li><a href="<c:url value="/hungry/viewOrders/${sessionScope.USER_ID}"/>"> <i
								class="fa fa-th"></i> <span>Order History</span>
						</a></li>

		</c:if>
			
		<c:if test = "${role == '[feeder]'}">
						<li class="header">Feeder</li>
	
						<li><a
							href="<c:url value="/feeder/viewOrders/${sessionScope.USER_ID}"/>">
								<i class="fa fa-th"></i> <span>View Orders</span>
						</a></li>
	
						<li><a
							href="<c:url value="/feeder/profile/${sessionScope.USER_ID}"/>">
								<i class="fa fa-th"></i> <span>My Profile</span>
						</a></li>

		</c:if>
		<c:if test = "${role == '[admin]'}">
						<li class="header">Admin</li>
	
						<li><a
							href="<c:url value="/feeder/add"/>">
								<i class="fa fa-th"></i> <span>Add Feeder</span>
						</a></li>
						<li><a
							href="<c:url value="/report/show"/>">
								<i class="fa fa-th"></i> <span>Sale Report</span>
						</a></li>
						<li><a
							href="<c:url value="/report/hungry"/>">
								<i class="fa fa-th"></i> <span>Manage Hungry Data</span>
						</a></li>
						<li><a
							href="<c:url value="/report/feeder"/>">
								<i class="fa fa-th"></i> <span>Manage Feeder Data</span>
						</a></li>
						<li><a
							href="<c:url value="/report/schedule"/>">
								<i class="fa fa-th"></i> <span>Scheduling</span>
						</a></li>
	</c:if>
				</ul>

			</section>
			<!-- /.sidebar -->
		</aside>
		<!-- =============================================== -->
<c:url var="logoutUrl" value="/logout" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>