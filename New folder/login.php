<?php

$name = $_POST["a"];
$email = $_POST["b"];
$type = $_POST["c"];
$pass = $_POST["d"];

$connection = new mysqli["localhost","root","","user","3306"];
$co = $connection->quary(""SELECT * FROM user WHERE UserName = '".$name."' AND Email = '".$email."' AND UserType = '".$type."' AND password = '".$pass."');

$x = $co->num_rows;

if ($x>0) {
    header(Locarion:home.html);
} else {
    header(Location:error.html);
}
