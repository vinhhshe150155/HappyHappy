<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en" dir="ltr">


<!-- Mirrored from learnplus.demo.frontendmatter.com/guest-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Signup</title>

    <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
    <meta name="robots" content="noindex">

    <!-- Custom Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap" rel="stylesheet">

    <!-- Perfect Scrollbar -->
    <link type="text/css" href="user/assets/vendor/perfect-scrollbar.css" rel="stylesheet">

    <!-- Material Design Icons -->
    <link type="text/css" href="user/assets/css/material-icons.css" rel="stylesheet">

    <!-- Font Awesome Icons -->
    <link type="text/css" href="user/assets/css/fontawesome.css" rel="stylesheet">

    <!-- Preloader -->
    <link type="text/css" href="user/assets/vendor/spinkit.css" rel="stylesheet">

    <!-- App CSS -->
    <link type="text/css" href="user/assets/css/app.css" rel="stylesheet">
    <style>
        .next {
            padding-left: 46%;
            padding-right: 46%;
            padding-top: 9px;
            padding-bottom: 9px;
            background-color: #2295F5;
            border: #2295F5;
            color: #FFFFFF;
        }

            .next:hover {
                background-color: #0C83E2;
                color: #FFFFFF;
            }

        .form-group .next {
            margin-top: 15px;
            border-radius: 4px;
        }
    </style>
</head>

<body class="login">
    <div class="d-flex align-items-center" style="min-height: 100vh">
        <div class="col-sm-8 col-md-6 col-lg-4 mx-auto" style="min-width: 300px;">
            <div class="text-center mt-5 mb-1">
                <div class="avatar avatar-lg">
                    <img src="user/assets/images/logo/primary.svg" class="avatar-img rounded-circle" alt="LearnPlus" />
                </div>
            </div>
            <div class="d-flex justify-content-center mb-5 navbar-light">
                <a href="student-dashboard.html" class="navbar-brand m-0">HappyHappy</a>
            </div>
            <% 
                if(request.getAttribute("error")!=null){
            %>
                <p style="color: yellow; background: red;margin: 0;font-size: x-large;" align="center" ><%= request.getAttribute("error")%></p>
            <%
                }
            %>
            <div class="card navbar-shadow">
                <div class="card-header text-center">
                    <h4 class="card-title">Sign Up</h4>
                    <p class="card-subtitle">Create a new account</p>
                </div>
                <div class="card-body">

                    <form action="signup2" method="post">
                        <!-- page 2 -->
                        <div id="test2">
                                <div class="form-group">
                                    <label class="form-label" for="email">ENTER THE VERIFICATION::</label>
                                    <div class="input-group input-group-merge">
                                        <input id="email" type="text" required="" class="form-control form-control-prepended" placeholder="Enter the code sent in gmail">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">
                                                <span class="far fa-envelope"></span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <button type="submit " class="btn btn-primary btn-block mb-3 ">Submit</button>
                                <div class="form-group text-center mb-0 ">
<!--                                    <div class="custom-control custom-checkbox ">
                                        <input id="terms " type="checkbox " class="custom-control-input " checked required=" ">
                                        <label for="terms " class="custom-control-label text-black-70 ">
                                            I agree to the <a href="# "
                                                              class="text-black-70 "
                                                              style="text-decoration: underline; ">Terms of Use</a>
                                        </label>
                                    </div>-->
                                </div>
                        </div>
                    </form>                  
                </div>
                <div class="card-footer text-center text-black-50 ">Already signed up? <a href="signin">Login</a></div>
            </div>
        </div>
    </div>


    <!-- jQuery -->
    <script src="user/assets/vendor/jquery.min.js "></script>

    <!-- Bootstrap -->
    <script src="user/assets/vendor/popper.min.js "></script>
    <script src="user/assets/vendor/bootstrap.min.js "></script>

    <!-- Perfect Scrollbar -->
    <script src="user/assets/vendor/perfect-scrollbar.min.js "></script>

    <!-- MDK -->
    <script src="user/assets/vendor/dom-factory.js "></script>
    <script src="user/assets/vendor/material-design-kit.js "></script>

    <!-- App JS -->
    <script src="user/assets/js/app.js "></script>

    <!-- Highlight.js -->
    <script src="user/assets/js/hljs.js "></script>

    <!-- App Settings (safe to remove) -->
    <script src="user/assets/js/app-settings.js "></script>

    <script type="text/javascript" src="user/js/yourCode.js"></script>
    <script src="user/script.js"></script>
</body>


<!-- Mirrored from learnplus.demo.frontendmatter.com/guest-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->

</html>