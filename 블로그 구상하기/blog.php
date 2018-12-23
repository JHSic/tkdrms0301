<?php
	$conn = mysqli_connect("localhost", "root", "tkdrms030");
	mysqli_select_db($conn, "blog");
	$result = mysqli_query($conn, "SELECT * FROM blogdata");
?>
<!DOCTYPE html>
<html>
	<head>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="blog.css">
	</head>
	<body>
        <header>
            <a href="blog.php">BLOG</a>
        </header>
        <nav>
        <ul>
        <?php
			while($row = mysqli_fetch_assoc($result)){
                echo '<li><a href="blog.php?id='.$row['id'].'">'.htmlspecialchars($row['title']).'</a></li>'."\n";
            }
		?>
        </ul>
        </nav>
        <div id="write">
        <a href="blogwrite.php">쓰기</a>
        </div>
        <article>
		<?php
            if(empty($_GET['id']) === false ) {
            $sql = 'SELECT * FROM blogdata WHERE id='.$_GET['id'];
            $result = mysqli_query($conn, $sql);
            $row = mysqli_fetch_assoc($result);
            echo '<h2>'.htmlspecialchars($row['title']).'</h2>';
            echo htmlspecialchars($row['description']);
        }
		?>
        </article>
	</body>
</html>