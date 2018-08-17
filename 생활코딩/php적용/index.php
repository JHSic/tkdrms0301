<?php
	$conn = mysqli_connect("localhost", "root", "tkdrms030");
	mysqli_select_db($conn, "opentutorials");
	$result = mysqli_query($conn, "SELECT * FROM topic");
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<link rel="stylesheet" type="text/css" href="http://localhost/style.css/style.css">
</head>
<body id="target">
	<header>
		<img src="https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/course/94.png" alt="생활코딩">
        <h1><a href="http://localhost/index.php">JavaScript</a></h1>
	</header>
	<nav>
		<ol>
		<?php
		while( $row = mysqli_fetch_assoc($result)){
			echo '<li><a href="http://localhost/index.php?id='.$row['id'].'">'.$row['title'].'</a></li>'."\n";
		}
		?>
		</ol>
	</nav>
	<div id="control">
		<input type="button" value="white" onclick="document.getElementById('target').className='white'" />
		<input type="button" value="black" onclick="document.getElementById('target').className='black'" />
		<a href="http://localhost/write.php">쓰기</a>
	</div>
	<article>
		<?php
			if(empty($_GET['id']) === false ) {
				$sql = 'SELECT * FROM topic WHERE id='.$_GET['id'];
				$result = mysqli_query($conn, $sql);
				$row = mysqli_fetch_assoc($result);
				echo '<h2>'.$row['title'].'</h2>';
				echo $row['description'];
			}
		?>
	</article>
</body>
</html>