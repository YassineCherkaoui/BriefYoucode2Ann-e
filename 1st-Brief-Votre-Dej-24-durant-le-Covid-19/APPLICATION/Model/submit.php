<?php
include('../Controller/connection.php');
$msg="";
if(isset($_POST['name']) && isset($_POST['email']) && isset($_POST['phone']) && isset($_POST['addrss'])){
	$name=mysqli_real_escape_string($con,$_POST['name']);
	$email=mysqli_real_escape_string($con,$_POST['email']);
	$phone=mysqli_real_escape_string($con,$_POST['phone']);
	$addrss=mysqli_real_escape_string($con,$_POST['addrss']);
	$p_name=mysqli_real_escape_string($con,$_POST['p_name']);
	
	
	mysqli_query($con,"INSERT into buyer(name,email,phone,addrss,p_name) values('$name','$email','$phone','$addrss','$p_name')");
	$msg="(Beseh Uraha)";
	
	$html="<table><tr><td>Name</td><td>$name</td></tr><tr><td>Email</td><td>$email</td></tr><tr><td>Phone</td><td>$phone</td></tr><tr><td>addrss</td><td>$addrss</td></tr><tr><td>Name of plat</td><td>$p_name</td></tr></table>";
	
	include('smtp/PHPMailerAutoload.php');
	$mail=new PHPMailer(true);
	$mail->isSMTP();
	$mail->Host="smtp.gmail.com";
	$mail->Port=587;
	$mail->SMTPSecure="tls";
	$mail->SMTPAuth=true;
	$mail->Username="";//email here
	$mail->Password="";//Password here
	$mail->SetFrom("");//email here
	$mail->addAddress("");//email here
	$mail->IsHTML(true);
	$mail->Subject="NEW ORDER";
	$mail->Body=$html;
	$mail->SMTPOptions=array('ssl'=>array(
		'verify_peer'=>false,
		'verify_peer_name'=>false,
		'allow_self_signed'=>false
	));
	if($mail->send()){
		echo "Mail send";
	}else{
		echo "3endek chi mochkil(Try again)";
	}
	echo $msg;
}
?>