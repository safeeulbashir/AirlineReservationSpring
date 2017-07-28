<!DOCTYPE html>
<html lang="en">
<head>
  <title>AWS-Airline Reservation</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.1/jquery.min.js"></script>

  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
  <script type="text/javascript">
  $(".add").click(function() {
    $(".frm > div:first-child").clone(true).insertBefore(".frm > div:last-child");
    return false;
});
        
$(".remove").click(function() {
    $(this).parent().remove();
});
</script>
</head>
<body>

<div class="jumbotron">
  <div class="container text-center">
    <h1>Airline Reservation System</h1>      
    <p>Book Cheap tickets right here...</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="#">Home</a></li>
        <li><a href="#">Search Flights</a></li>
        <li><a href="#">My Reservations</a></li>
        <li><a href="#">Add/Update Card</a></li>
        <li><a href="#">Help</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"> Account Settings</a></li>
        <li><a href="#"> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>



<div class="container">    
  <div class="container">
    <h1 class="well">Update Reservation</h1>
	<div class="row">
		<form>
			<div class="col-sm-3 form-group">
			Ticket ID : <input type="text" placeholder="Ticket ID number" class="form-control" disabled></h3>
			</div>
				<div class="col-sm-3 form-group">
				Quantity : <input type="text" placeholder="no. of Tickets" class="form-control"></h3>
				</div>
					<div class="col-sm-3 form-group">
					Ticket Price : <input type="text" placeholder="Total Price" class="form-control" disabled></h3>
					</div>
						<div class="col-sm-3 form-group">
						Total Price : <input type="text" placeholder="Total Price" class="form-control" disabled></h3>
						</div>
				</div>
				<div class="col-lg-12 well">
				<div class="row">
				
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>First Name</label>
								<input type="text" placeholder="Default First Name from User Account" class="form-control">
							</div>
							<div class="col-sm-6 form-group">
								<label>Last Name</label>
								<input type="text" placeholder="Default Last Name from User Account" class="form-control">
							</div>
						</div>					
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Phone Number</label>
						<input type="text" placeholder="Enter Phone Number Here.." class="form-control">
							</div>		
							<div class="col-sm-6 form-group">
								<label>Email Address</label>
						<input type="text" placeholder="Enter Email Address Here.." class="form-control">
							</div>	
						</div>						
					
					
					
					</div>
					
				</div>
				
	</div>
	
					<button type="button" class="btn btn-lg btn-info">Submit</button>					
				</form> 
	</div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Airline Reservation System, done by IMCS JAVA May 2017 Batch</p>  
  
</footer>

</body>
</html>
