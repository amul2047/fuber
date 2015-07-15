<%@include file="../layout/header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           Feeder Profile
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
            <h4>User Details</h4>
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
            	 <div style="width: 900px; height: 500px">

                  <div class="box-body">
                    <div class="form-group">
						<form:form action="/fuber/feeder/profile/edit" method="POST" commandName="feeder">
							<table>
								<tr>
									<td><form:hidden path="id"  /></td>
								</tr>						
								<tr>
									<td>Business Name</td>
									<td><form:input path="businessName" /></td>
								</tr>
								<tr>
									<td>First name</td>
									<td><form:input path="contactFirstName" /></td>
								</tr>
								<tr>
									<td>Last name</td>
									<td><form:input path="contactLastName"  /></td>
								</tr>
								<tr>
									<td>Phone Number</td>
									<td><form:input path="contactNumber" /></td>
								</tr>
								<tr>
									<td>Email</td>
									<td><form:input path="contactEmail" /></td>
								</tr>								
								<tr>
									<td colspan="2">
										<input type="submit" name="action" value="Save" />
										 <input  type="button" name="Cancel" value ="Cancel" onclick="goBack()"/> 
									</td>
								</tr>
								 
							</table>
						</form:form>
                    </div>  	                    
                  </div><!-- /.box-body -->

            	 </div>
            </div><!-- /.box-body -->
           
          </div><!-- /.box -->
		</div>
		<!-- /.box-body -->
	</div>
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<script type="text/javascript">
 	function cancel(id)
	{	
		window.location.href ="/fuber/feeder/profile/" + id;

	}
 	function goBack()
 	{
 		window.history.back();
 	}
 </script>

<%@include file="../layout/footer.jsp"%>