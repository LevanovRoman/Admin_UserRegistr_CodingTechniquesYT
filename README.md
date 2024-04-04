Admin and User Registration and Login Application with Spring Data JPA and MySQL Database

Admin and User Registration and Login Application

Learn how to build a secure Spring Security Registration and Login Application with User and Admin Pages in this step-by-step tutorial. This video covers the implementation of user registration with User and Admin by implementating AuthenticationSuccessHandler interface, and has authourity method to distribute permission across users, login functionality, and password encryption using Spring Security. Whether you're a beginner or an experienced developer, this tutorial will guide you through the entire process, providing valuable insights and best practices for creating a robust authentication system.

source code link: https://github.com/aliyusahaboadam/Ad...

🚀 Timestamps:

    00:00 Introduction
    00:15 What You will Learn
    01:08 User and Admin Registration Channel
    01:54 Application Architecture
    02:20 What you will build 
    05:31 Creating new Spring starter Project 
    07:00 Adding Dependencies 
    07:54 Checking the initialized Project
    09:13 Configuring MySQL Database
    11:32 Creating JPA Entity (Model Class) 
    16:56 Back-end Implementation for Registration
    17:17 Testing MySQL Database Config
    19:59 Creating repository 
    21:49 Creating UserSerive Interface
    23:21 Creating User Dto
    25:07 Adding Dto to UserService interface 
    25:55 Implementing UserService Interface 
    30:38 Creating User Controller 
    31:07 creating endpoint for registration 
    36:45 front-end implementation for registration  
    53:14 Testing the registrion page 
    54:21 Spring Security Configuration 
    54:37 Creating CustomUserDetails  
    55:36 Implementing UserDetails interface
    58:31 Creating CustomUserDetailsService 
    59:44 Implementing loadByUsername method
    1:05:43 Encoding User Password
    1:07:06 Creating Security Configuration Class 
    1:08:31 Adding BCrypt Password Encoder Bean 
    1:09:52 Configuring Endpoint
    1:20:39 Registering Password Encoder and UserDetailService  
    1:23:38 Login method handler in Controller 
    1:24:50 Front-end for login 
    1:28:23 Testing the login implementation 
    1:31:59 Creating Custom Success Handler  
    1:36:15 Adding Custom Success Handler to Security Config
    1:37:19 Giving Access Permission
    1:38:13 Creating Admin and User Dashboard
    1:46:57 Testing the project

What you will learn 
1. how to build spring MVC application using spring
2. how to configure spring security and implementation of AuthenticationSuccessHandler
3. spring security authentication with user details and userdetailsservice
4. how to develop login and registration for Admin and User
5. spring logout features
6. how to configure MySQL database in spring boot
7. how to display authenticated user information using user details and principal interface
8. implementing Authentication Success handler to redirect User and Admin to different URL (pages)
9. Using hasAuthority Method for access permission to User and Admin Pages

