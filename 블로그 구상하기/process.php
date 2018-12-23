<?php
$conn = mysqli_connect("localhost", "root", tkdrms030);
mysqli_select_db($conn, "blog");
$sql = "INSERT INTO blogdata (title,description,author,created) VALUES('".$_POST['title']."', '".$_POST['description']."', '".$_POST['author']."', now())";
$result = mysqli_query($conn, $sql);
header('Location: blog.php');
?>