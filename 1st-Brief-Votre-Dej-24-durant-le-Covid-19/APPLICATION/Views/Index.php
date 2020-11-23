<?php 
//conection database
    require_once('../Controller/connection.php'); 
?>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../public/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../public/css/dist/style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
      <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
      <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
      <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <title>Restaurant</title>
  </head>
  <body>
    <!-- Header -->
    <header class="YASSINE">
      <div class="container-fluid h-100">
        <div class="row h-100 align-items-center justify-content-center text-center text-white" style="background-color: rgba(0, 0, 0, 0.2);">
          <div class="col-lg-8">
            <h1 class="display-1 font-weight-bold">Restau <span class="font-weight-light">Beldi</span></h1>
            <hr class="bg-white my-5" />
            <p class="font-weight-light">
                Everything you need, delivered now Just with 20MAD
            </p>
            <a href="#plat" class="btn btn-primary btn-lg mt-3">Find Out More</a>
          </div>
        </div>
      </div>
    <div class="blink"></div>
<H1 class="text-center">Plat of the jour</H1>
<div class="blink"></div>


<!-- affichage de plat par jour -->
<?php
  //la requette 
  $result = $con->query(
    "SELECT * FROM plates WHERE DATE(jour) = CURDATE() order by rand() limit 1 ");
    while($row = mysqli_fetch_array($result)){
      echo"<img src='../public/images/platList/".$row['images']."' class='rounded mx-auto d-block' id='plat' alt='Responsive image'>";
      echo"<div class='blink'></div>";
      echo"<blockquote class='blockquote text-center disc'>";
      echo"<p class='mb-0'>".$row['nom']."</p>";
      echo"<footer class='blockquote-footer'>".$row['disc']."</footer>";
      echo"</blockquote>";
    }
    ?>
<h1 class="font-weight-light text-center">Everything <span class=" display-1 font-weight-bold prix">20MAD</span></h1>
<h1 class="font-weight-light text-center">Make Your Commande Here</h1>

<div class="blink" style="margin-top: 3%;"></div>
      <div class="blink"></div>
    <div class="col-md-9">
               <form method="post" id="frmContactus">
					<div class="contact-form">
            <div class="form-group">
            
<!-- send name plate to admin -->
            <?php
  //la requette 
  $result = $con->query(
    "SELECT * FROM plates WHERE DATE(jour) = CURDATE() order by rand() limit 1 ");
    while($row = mysqli_fetch_array($result)){
      echo"<input type='hidden' id='p_name' name='p_name' value=".$row['nom'].">";
    }
    ?>


						 <label class="control-label col-sm-2" for="name">Full Name:</label>
						 <div class="col-sm-10">          
							<input type="text" class="form-control" id="name" placeholder="Enter name" name="name" required>
						 </div>
					  </div>
					  <div class="form-group">
						 <label class="control-label col-sm-2" for="email">Email Address:</label>
						 <div class="col-sm-10">
							<input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
						 </div>
					  </div>
					  <div class="form-group">
						 <label class="control-label col-sm-2" for="phone">Phone:</label>
						 <div class="col-sm-10">
							<input type="text" class="form-control" id="phone" placeholder="Enter phone" name="phone" required>
						 </div>
					  </div>
					  
					  <div class="form-group">
						 <label class="control-label col-sm-2" for="addrss">Address:</label>
						 <div class="col-sm-10">
							<textarea class="form-control" rows="5" id="addrss" name="addrss"></textarea>
						 </div>
            </div>
					  <div class="form-group">
						 <div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default" name="submit" id="submit">Submit</button>
							<span style="color:green;" id="msg"></span>
						 </div>
					  </div>
				   </div>
         </form>
         
            </div>
	  <script>
	  jQuery('#frmContactus').on('submit',function(e){
		jQuery('#msg').html('');
		jQuery('#submit').html('Please wait');
		jQuery('#submit').attr('disabled',true);
		jQuery.ajax({
			url:'../Model/submit.php',
			type:'post',
			data:jQuery('#frmContactus').serialize(),
			success:function(result){
				jQuery('#msg').html(result);
				jQuery('#submit').html('Submit');
				jQuery('#submit').attr('disabled',false);
				jQuery('#frmContactus')[0].reset();
			}
		});
		e.preventDefault();
	  });
	  </script>


    <div class="blink"></div>
    <!-- footer -->
    <div class="footer">
      <div class="container">
          <div class="row">
              <div class="col-12">
                  <div class="second2">
                      <a href="#" target="_blank"> <i class="fab fa-codepen fa-2x margin"></i></a>
                      <a href="#" target="_blank"> <i class="fab fa-github fa-2x margin"></i></a>
                      <a href="#" target="_blank"> <i class="fab fa-linkedin fa-2x margin"></i></a>
                      <a href="#" target="_blank"><i class="fab fa-youtube fa-2x margin" ></i></a>

                  </div>

              </div>
          </div>
          </div>
 




  </body>
</html>