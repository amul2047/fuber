<%@include file="../layout/header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           Welcome <c:out value="${username}" />
          </h1>
          <ol class="breadcrumb">
           <!-- <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Examples</a></li>
            <li class="active">Blank page</li>
			-->
          </ol>
        </section>
<!-- Main content -->
<section class="content">

	<div class="box">
		<div class="box-header">
			<h3 class="box-title"></h3>
		</div>
		<!-- /.box-header -->
		<div class="box-body">
			  <div class="callout callout-info">
            <h4>About Fuber</h4>
            </div>
          <!-- Default box -->
          <div class="box">
            <div class="box-header with-border">
              <h3 class="box-title"></h3>
              <div class="box-tools pull-right">
                <button class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip" title="Collapse"><i class="fa fa-minus"></i></button>
                <button class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip" title="Remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <div class="box-body">
              Fuber is an iterative and incremental agile software development methodology for managing product development. It defines "a flexible, holistic product development strategy where a development team works as a unit to reach a common goal", challenges assumptions of the "traditional, sequential approach" to product development, and enables teams to self-organize by encouraging physical co-location or close online collaboration of all team members, as well as daily face-to-face communication among all team members and disciplines in the project.
			A key principle of fuber is its recognition that during a project the customers can change their minds about what they want and need (often called "requirements churn"), and that unpredicted challenges cannot be easily addressed in a traditional predictive or planned manner. As such, scrum adopts an empirical approach—accepting that the problem cannot be fully understood or defined, focusing instead on maximizing the team's ability to deliver quickly and respond to emerging requirements.
            </div><!-- /.box-body -->
           
          </div><!-- /.box -->
		</div>
		<!-- /.box-body -->
	</div>
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

 

<%@include file="../layout/footer.jsp"%>
