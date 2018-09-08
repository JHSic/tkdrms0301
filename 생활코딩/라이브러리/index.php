<?php
	require("config/config.php");
	require("lib/db.php");
	$conn = db_init($config["host"], $config["duser"], $config["dpw"], $config["dname"]);
	$result = mysqli_query($conn, "SELECT * FROM topic");
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<link rel="stylesheet" type="text/css" href="style.css/style.css">
</head>
<body id="target">
	<header>
		<img src="opentutorialspictures.png" alt="생활코딩">
        <h1><a href="index.php">JavaScript</a></h1>
	</header>
	<nav>
		<ol>
		<?php
		while( $row = mysqli_fetch_assoc($result)){
			echo '<li><a href="index.php?id='.$row['id'].'">'.$row['title'].'</a></li>'."\n";
		}
		?>
		</ol>
	</nav>
	<div id="control">
		<input type="button" value="white" onclick="document.getElementById('target').className='white'" />
		<input type="button" value="black" onclick="document.getElementById('target').className='black'" />
		<a href="write.php">쓰기</a>
	</div>
	<article>
		<?php
			if(empty($_GET['id']) === false ) {
				$sql = "select topic.id,title,name,description from topic left join user on topic.author = user.id where topic.id=".$_GET['id'];
				$result = mysqli_query($conn, $sql);
				$row = mysqli_fetch_assoc($result);
				echo '<h2>'.htmlspecialchars($row['title']).'</h2>';
				echo '<p>'.htmlspecialchars($row['name']).'</p>';
				echo strip_tags($row['description'],'<a><h1><h2><h3><h4><h5><ul><ol><li>');
			}
		?>
	</article>
</body>
</html>