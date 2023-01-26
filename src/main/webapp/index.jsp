<!DOCTYPE HTML>

<html>
<head>
<title>P-DRASTI</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main.css" />
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	padding-top: 100px; /* Location of the box */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
	background-color: #fefefe;
	margin: auto;
	padding: 20px;
	border: 1px solid #888;
	width: 500px;
	height: 500px;
}

/* The Close Button */
.close {
	color: #aaaaaa;
	float: right;
	font-size: 28px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: #000;
	text-decoration: none;
	cursor: pointer;
}
</style>
</head>

<body>



	<!-- Header -->
	<header id="header">
		<div class="inner">

			<nav id="nav">
				<a href="">Home</a> <a href="#three">Service</a>
				<!-- Trigger/Open The Modal -->
				<a id="myBtn" href="#mymodal">Format</a>

				<!-- The Modal -->
				<div id="myModal" class="modal">

					<!-- Modal content -->
					<div class="modal-content">
						<span class="close">&times;</span>
						<!-- <p>Some text in the Modal..</p> -->
						<img src="Format.jpg" height="470px" width="400px">
					</div>

				</div>

				<script>
					// Get the modal
					var modal = document.getElementById('myModal');

					// Get the button that opens the modal
					var btn = document.getElementById("myBtn");

					// Get the <span> element that closes the modal
					var span = document.getElementsByClassName("close")[0];

					// When the user clicks the button, open the modal 
					btn.onclick = function() {
						modal.style.display = "block";
					}

					// When the user clicks on <span> (x), close the modal
					span.onclick = function() {
						modal.style.display = "none";
					}

					// When the user clicks anywhere outside of the modal, close it
					window.onclick = function(event) {
						if (event.target == modal) {
							modal.style.display = "none";
						}
					}
				</script>

				<a href="#footer">Contact Us</a>
			</nav>
			<a href="#navPanel" class="navPanelToggle"><span
				class="fa fa-bars"></span></a>
		</div>
	</header>

	<!-- Banner -->
	<section id="banner">
		<h1 style="color: white;">Welcome</h1>
		<div class="inner">
			<header>
				<img src="59859.png" height="250" width="500">
			</header>

			<div class="flex ">

				<div>
					<span class="fas fa-file-image" id="font"></span>
					<h3>Step-1</h3>
					<p>Select Image</p>
				</div>

				<div>
					<span class="fas fa-file-upload" id="font"></span>
					<h3>Step-2</h3>
					<p>Upload Image</p>
				</div>

				<div>
					<span class="far fa-thumbs-up" id="font"></span>
					<h3>Step-3</h3>
					<p>Get Result</p>
				</div>

			</div>

			<footer>
				<a href="#upload" class="button">Get Started</a>
			</footer>
		</div>
	</section>

	<section id="upload">

		<div id="upload">
			<div></div>
			<script class="jsbin" src="jquery.min.js"></script>
			<script>
				function readURL(input) {
					if (input.files && input.files[0]) {

						var reader = new FileReader();

						reader.onload = function(e) {
							$('.image-upload-wrap').hide();

							$('.file-upload-image')
									.attr('src', e.target.result);
							$('.file-upload-content').show();

							$('.image-title').html(input.files[0].name);
						};

						reader.readAsDataURL(input.files[0]);

					} else {
						removeUpload();
					}
				}

				function removeUpload() {
					$('.file-upload-input').replaceWith(
							$('.file-upload-input').clone());
					$('.file-upload-content').hide();
					$('.image-upload-wrap').show();
				}
				$('.image-upload-wrap').bind('dragover', function() {
					$('.image-upload-wrap').addClass('image-dropping');
				});
				$('.image-upload-wrap').bind('dragleave', function() {
					$('.image-upload-wrap').removeClass('image-dropping');
				});
			</script>
			<div class="file-upload">
				<form action="UploadController" method="post" enctype="multipart/form-data">

					<button class="file-upload-btn" type="button"
						onclick="$('.file-upload-input').trigger( 'click' )">Add
						Image</button>

					<div class="image-upload-wrap">

						<input class="file-upload-input" type='file' name="file"
							onchange="readURL(this);" accept="image/*" />
						<div class="drag-text">
							<h3>Drag and drop a file or select add Image</h3>
						</div>

					</div>
					<div class="file-upload-content">
						<img class="file-upload-image" src="#" alt="your image" />
						<div class="image-title-wrap">
							<button type="button" onclick="removeUpload()"
								class="remove-image">
								Remove <span class="image-title">Uploaded Image</span>
							</button>
						</div>
					</div>
					<br> <input type="submit" class="file-submit-btn" onclick=""
						value="Submit Your File">
				</form>
			</div>
		</div>
	</section>

	<!-- Three -->
	<section id="three" class="wrapper align-center">
		<div class="inner">
			<div class="flex flex-2">
				<article>
					<div class="image round">
						<h2>
							<i class="fas fa-star"></i>
						</h2>
					</div>
					<header>
						<h3>OCR function</h3>
					</header>
					<p>
						We have integrated OCR technology in our tool, so with this
						function we have the best way <br /> to extract a text from
						scanned <br>image files.
					</p>

				</article>

				<article>
					<div class="image round">
						<h2>
							<i class="fas fa-lock"></i>
							</h3>
					</div>
					<header>
						<h3>Privacy!</h3>
					</header>
					<p>
						Don't worry about your files, all uploaded <br />and generated
						files will be removed <br />from our server.
					</p>

				</article>

				<article>
					<div class="image round">
						<h2>
							<i class="far fa-images"></i>
						</h2>
					</div>
					<header>
						<h3>JPG, PNG, BMP, SVG...</h3>
					</header>
					<p>
						Our Application supports multiple format like JPEG,PNG, BMP, SVG,
						ICO <br />and many other are supported.
					</p>

				</article>

			</div>
		</div>
	</section>



	<footer id="footer">
		<div class="inner">

			<h3>Get in touch</h3>

			<form action="#" method="post">

				<div class="field half first">
					<label for="name">Name</label> <input name="name" id="name"
						type="text" placeholder="Name">
				</div>
				<div class="field half">
					<label for="email">Email</label> <input name="email" id="email"
						type="email" placeholder="Email">
				</div>
				<div class="field">
					<label for="message">Message</label>
					<textarea name="message" id="message" rows="6"
						placeholder="Message"></textarea>
				</div>
				<ul class="actions">
					<li><input value="Send Message" class="button alt"
						type="submit"></li>
				</ul>
			</form>

			<div class="copyright">
				<b>&copy;OnlineCasteCertificateVerification</b>
			</div>

		</div>
	</footer>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>