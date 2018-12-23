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
                echo '<li><a herf="blog/blog.php?id='.$row['id'].'">'.$row['title'].'</a></li>'."\n";
            }
		?>
        </ul>
        </nav>
        <article id = "SubmitBody">
        <div>
		<form action="process.php" method="post">
            <p><label for="title" class = "label">title</label></p>
            <p><input type="text" name="title" placeholder="title..."></p>

            <p><label for="author" class = "label">author</label></p>
            <p><input type="text" name="author" placeholder="author..."></p>

            <p><label for="description" class = "label">description</label></p>
            <p><input type="text" name="description" placeholder="description..."></textarea></p>

            <input type="submit" name="name" value="submit">
        </form>
        </div>
        </article>
	</body>
</html>