<!DOCTYPE html>
<html lang="en">
<head>
  <title>AWS-Airline Reservation</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
  <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
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
    #eventForm .form-control-feedback {
    top: 0;
    right: -15px;
}
  </style>
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
    <h1 class="well">Search Flights</h1>
	<div class="col-lg-12 well">
	<div class="row">
				<form>
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>From</label>
                <div class="dropdown">
                  <div class="form-group">
                    <select class="form-control">
                        <option value="0" selected>All locations</option>
                        <option value="1">New York</option>
                        <option value="2">Bostan</option>
                        <option value="3">California</option>
                        <option value="4">Dallas</option>
                    </select>
                  </div>
                </div>
							</div>
							<div class="col-sm-6 form-group">
								<label>To</label>
                <div class="dropdown">
                  <div class="form-group">
                    <select class="form-control">
                        <option value="0" selected>All locations</option>
                        <option value="1">Dallas</option>
                        <option value="2">Ohio</option>
                        <option value="3">Oregon</option>
                        <option value="4">Miami</option>
                    </select>
                  </div>
                </div>
							</div>
              <div class="container">
                <div class="form-group">
                    <label class="col-xs-3 control-label">Date</label>
                    <div class="col-xs-5 date">
                        <div class="input-group input-append date" id="datePicker">
                            <input type="text" class="form-control" name="date" />
                            <span class="input-group-addon add-on"><span class="glyphicon glyphicon-calendar"></span></span>
                        </div>
                    </div>
                </div>
             </div>
<script>
$(document).ready(function() {
    $('#datePicker')
        .datepicker({
            format: 'mm/dd/yyyy'
        })
        .on('changeDate', function(e) {
            // Revalidate the date field
            $('#eventForm').formValidation('revalidateField', 'date');
        });

    $('#eventForm').formValidation({
        framework: 'bootstrap',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            name: {
                validators: {
                    notEmpty: {
                        message: 'The name is required'
                    }
                }
            },
            date: {
                validators: {
                    notEmpty: {
                        message: 'The date is required'
                    },
                    date: {
                        format: 'MM/DD/YYYY',
                        message: 'The date is not a valid'
                    }
                }
            }
        }
    });
});
</script>
						</div>
					<button type="button" class="btn btn-lg btn-info">Submit</button>
					</div>
				</form>
				</div>
	</div>
	</div>
</div><br><br>


<footer class="container-fluid text-center">
  <p>Airline Reservation System, done by IMCS JAVA May 2017 Batch</p>

</footer>

</body>
</html>
