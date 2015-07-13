<%@include file="../layout/header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           Product Backlog
            <small>Add the name of project and description </small>
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
			<h3 class="box-title">Add Product Backlog</h3>
		</div>
		<!-- /.box-header -->
		<div class="box-body">
			<tr>
				<button class="pure-button pure-button-primary btn btn-primary"
					onclick="addProductBacklog()">
					<i class="fa fa-plus"></i> Add
				</button>
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
										aria-label="Browser: activate to sort column ascending">Description</th>
									<th class="sorting" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1"
										aria-label="CSS grade: activate to sort column ascending">Actions</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach items="${ProductBacklogList}" var="ProductBacklog" varStatus="loopCounter">
								<tr role="row" class="odd">
								</tr>
								<tr role="row" class="odd">
									<td class="sorting_1"><c:out value="${loopCounter.count}" /></td>
									<td><c:out value="${ProductBacklog.name}" /></td>
									<td><c:out value="${ProductBacklog.description}" /></td>
									<td>
										<button class="btn btn-success" onclick="editProductbacklog(${ProductBacklog.id});">
											<i class="fa fa-pencil"></i> Edit
										</button> 
										<a class="btn btn-danger" onclick="return confirm('Are you sure you want to delete this User Story?');"
											href="delete/${ProductBacklog.id}"> <i class="fa fa-times"></i>Delete
										</a>
										<a class="btn btn-info" href="detail/${ProductBacklog.id}"> <i class="fa fa-minus"></i>Detail
										</a>
										
										<a class="btn btn-info" href="releasebacklog/${ProductBacklog.id}"> <i class="fa fa-minus"></i>Manage Release
										</a>
									</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-5">
						<div class="dataTables_info" id="example2_info" role="status"
							aria-live="polite">Showing 1 to 10 of 57 entries</div>
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


	<!-- Modal -->
	<div class="modal fade" id="addProductBacklogModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Add Product BackLog</h4>
				</div>
				<div class="modal-body">
				<c:url var="actionUrl" value="saveProductBacklog" /><br><br>
			
				  <form action="${actionUrl }" commandName="productbacklog" role="form" id="modalForm" method="post">
                  <div class="box-body">
                    <div class="form-group">
                     <label for="exampleInputEmail1">Name</label>
                    <input path ="name" name="name" class="form-control" id="name" placeholder="Enter User Story ">
                      <label for="exampleInputEmail1">Description</label>
                       <textarea path ="description" name="description" class="form-control" id="description" placeholder="Enter User Story Description"> </textarea>
                    </div>
                    <input path="id" id="id" name="id" type="hidden">
                    
                  </div><!-- /.box-body -->

                </form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" id="saveProductBacklog" class="btn btn-primary">Save</button>
				</div>
			</div>
		</div>
	</div>
	<!-- Modal Ends -->
</section>
<!-- /.content -->
</div>

<!-- /.content-wrapper -->
<script type="text/javascript">

	$(document).ready(function() {
		
		$("#saveProductBacklog").on('click',function(){
			
			$("#modalForm").submit();
			
		});
	
	}); //document.getReady Ends
	
	function addProductBacklog()
	{
		$('#modalForm').trigger("reset");
		$("#addProductBacklogModal").modal('show');
	}
	
	function editProductbacklog(id)
	{
		$.get("get/" + id, function(result) {
			
			$("#id").val(result.pb.id);	
			$("#name").val(result.pb.name);
			$("#description").val(result.pb.description);
			$("#addProductBacklogModal").modal('show');
		});
	}
</script>

<%@include file="../layout/footer.jsp"%>
