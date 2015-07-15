<%@include file="../layout/header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           Hungry Profile
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
            <h4>Order Details</h4>
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
                      <label for="exampleInputEmail1">Customer Name:</label> <td>${TheOrder.hungry.firstName}  ${TheOrder.hungry.lastName} </td><br/>
                      <label for="exampleInputEmail1">Order Date and Time:</label> <td>${TheOrder.orderDateTime} </td><br/>
				<div class="row">
					<div class="col-sm-12">
						<table id="example2"
							class="table table-bordered table-hover dataTable" role="grid"
							aria-describedby="example2_info">
							<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1" aria-sort="ascending"
										aria-label="Rendering engine: activate to sort column descending">
										</th>
									<th class="sorting" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1"
										aria-label="Browser: activate to sort column ascending">Food</th>
									<th class="sorting" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1"
										aria-label="CSS grade: activate to sort column ascending">Quantity</th>
									<th class="sorting" tabindex="0" aria-controls="example2"
										rowspan="1" colspan="1"
										aria-label="CSS grade: activate to sort column ascending">Price</th>										
								</tr>
							</thead>
							<tbody>	
							
							<c:forEach items="${OrderItems}" var="OrderItem" varStatus="loopCounter">
								<tr role="row" class="odd" id="row-${loopCounter}">
								</tr>
								<tr role="row" class="odd">
									<td class="sorting_1"><c:out value="${loopCounter.count}" /></td>
									<td><c:out value="${OrderItem.food.name}" /></td>
									<td><c:out value="${OrderItem.quantity}" /></td>
									<td><c:out value="${OrderItem.price}" /></td>																		
									<!-- <td>
										<button class="btn btn-success" onclick="addToBag(${Food.id});">
											<i class="fa fa-pencil"></i> Add to Bag
										</button>	
									</td> -->
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
					
                      <label for="exampleInputEmail1">Total:</label> <td>${Total} </td><br/>
				
								<button class="btn btn-success" onclick="approve(${TheOrder.id});">
									<i class="fa fa-pencil"></i> Approve
								</button>	
								<button class="btn btn-success" onclick="cancelOrder(${TheOrder.id});">
									<i class="fa fa-pencil"></i> Cancel Order
								</button>									
                    
                    
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
 	function approve(id)
	{

	}
	
	function cancelOrder(id)
	{
		

	}
</script>
 
<%@include file="../layout/footer.jsp"%>