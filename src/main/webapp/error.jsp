<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" >
    <link href="css/custom.css" rel="stylesheet">
    <title>Error</title>
</head>
<body class="container">

<main class="container ml-auto mr-auto">
    <form action="request-save" method="get">

        <div class="form-floating mb-3">
            <input type="name" class="form-control" name="name" id="name" placeholder="name">
            <label for="name">Name</label>
        </div>
        <div class="form-floating mb-3">
        <textarea type="text" class="form-control" name="request" id="request" rows="3"
                  placeholder="Request"></textarea>
            <label for="request">Request</label>
        </div>
        <div class="mb-3">
            <input type="submit" value="Submit">
        </div>
    </form>
</main>

<div class="container  alert alert-warning" role="alert">
    Fill in your name and request
</div>


</body>
<script src="js/bootstrap.min.js"></script>
</html>
