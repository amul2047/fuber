<%@include file="../layout/header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           Food Cart
            <small>List of Food To order</small>
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
			<!--  <h3 class="box-title">Add Product Backlog</h3>-->
		</div>
		<!-- /.box-header -->
		<div class="box-body">
			<tr>
			<!--	<button class="pure-button pure-button-primary btn btn-primary"
					onclick="addProductBacklog()">
					<i class="fa fa-plus"></i> Add
				</button>
			-->
			</tr>
			<div id="example2_wrapper"
				class="dataTables_wrapper form-inline dt-bootstrap">
				<div class="row">
					<div class="col-sm-6"></div>
					<div class="col-sm-6"></div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<table id="example2"
							class="table table-bordered table-hover dataTable" role="grid"
							aria-describedby="example2_info">
							<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1" aria-sort="ascending"
										aria-label="Rendering engine: activate to sort column descending">ID
										</th>
									<th class="sorting_asc" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1" aria-sort="ascending"
										aria-label="Rendering engine: activate to sort column descending">Name
									</th>
									<th class="sorting" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1"
										aria-label="Browser: activate to sort column ascending">Allergens</th>
									<th class="sorting" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1"
										aria-label="Browser: activate to sort column ascending">Price</th>
								</tr>
							</thead>
							<tbody>
							
								<tr role="row" class="odd">
								</tr>
								<tr role="row" class="odd">
									<td>1</td>
									<td><c:out value="${Food.name}" /></a></td>
									<td><c:out value="${Food.allergenInfo}" /></td>
									<td><c:out value="${Food.price}" /></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-5">
						<div class="dataTables_info" id="example2_info" role="status"
							aria-live="polite"></div>
					</div>
					<div class="col-sm-7">
						<div class="dataTables_paginate paging_simple_numbers"
							id="example2_paginate">
							<ul class="pagination">
								<li class="paginate_button previous disabled"
									id="example2_previous"><a href="#"
									aria-controls="example2" data-dt-idx="0" tabindex="0">Previous</a></li>
								<li class="paginate_button active"><a href="#"
									aria-controls="example2" data-dt-idx="1" tabindex="0">1</a></li>
								<li class="paginate_button "><a href="#"
									aria-controls="example2" data-dt-idx="2" tabindex="0">2</a></li>
								<li class="paginate_button "><a href="#"
									aria-controls="example2" data-dt-idx="3" tabindex="0">3</a></li>
								<li class="paginate_button "><a href="#"
									aria-controls="example2" data-dt-idx="4" tabindex="0">4</a></li>
								<li class="paginate_button "><a href="#"
									aria-controls="example2" data-dt-idx="5" tabindex="0">5</a></li>
								<li class="paginate_button "><a href="#"
									aria-controls="example2" data-dt-idx="6" tabindex="0">6</a></li>
								<li class="paginate_button next" id="example2_next"><a
									href="#" aria-controls="example2" data-dt-idx="7" tabindex="0">Next</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /.box-body -->
	</div>

</section>
<!-- /.content -->
</div>

<!-- /.content-wrapper -->
<script type="text/javascript">

	$(document).ready(function() 
	{
		
	
	}); //document.getReady Ends
	
</script>

<%@include file="../layout/footer.jsp"%>
