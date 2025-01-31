<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="css/style.css" rel="stylesheet" />
    <title>Add Notes</title>
    
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;
        }
        .card {
            max-width: 400px; /* Reduced width */
            margin: 50px auto; /* Centered card */
            padding: 15px; /* Reduced padding */
            border-radius: 8px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            background-color: #fff;
        }
        h1 {
            text-align: center;
            font-weight: bold;
            font-size: 1.5rem; /* Smaller font size */
            margin-bottom: 15px;
            color: #6f42c1;
        }
        .btn-custom {
            width: 100%;
            font-size: 16px; /* Smaller font size */
            padding: 10px; /* Reduced padding */
            background-color: #6f42c1;
            border-color: #6f42c1;
        }
        .btn-custom:hover {
            background-color: #563d7c;
            border-color: #563d7c;
        }
        .form-control:focus {
            border-color: #6f42c1;
            box-shadow: 0 0 0 0.2rem rgba(111, 66, 193, 0.25);
        }
        .form-label {
            font-weight: bold;
            font-size: 0.9rem; /* Reduced label font size */
        }
        .mb-3 {
            margin-bottom: 15px; /* Reduced spacing between form elements */
        }
        @media (max-width: 768px) {
            .card {
                padding: 10px;
            }
            h1 {
                font-size: 1.25rem;
            }
        }
    </style>
</head>
<body>

    <div class="container text-center mt-4 mb-4">
        <%@ include file="navbar.jsp" %>
    </div>

    <div class="card">
        <h1>Add a New Note</h1>

        <form action="note" method="post">
            <div class="mb-3">
                <label for="title" class="form-label">Note Title</label>
                <input type="text" class="form-control" id="title" name="title" required>
            </div>

            <div class="mb-3">
                <label for="content" class="form-label">Note Content</label>
                <textarea class="form-control" id="content" name="content" required style="height: 150px;"></textarea> <!-- Reduced height -->
            </div>

            <button type="submit" class="btn btn-custom">Add Note</button>
        </form>
    </div>

    <!-- Optional JavaScript -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+po0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7Yd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>
</html>
