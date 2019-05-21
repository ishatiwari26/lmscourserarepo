<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap-4.3.1-dist/css/bootstrap.min.css">
<script src="bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
</head>
<body>
	<header>
		<div class="container-fluid">
			<a href="" class="logo"><img
				src="https://2s1ggb3gowpckiyy-zippykid.netdna-ssl.com/wp-content/themes/Coursera-Enterprise/images/c4b-905-x-100.png"
				alt=""></a>
		</div>
	</header>
	<section class="main-sec">
		<div class="subHeading">
			<h3>Client Information</h3>
			<p>Description to be disscued</p>
		</div>
		<div class="tableSection">
			<div class="container">
				<table class="table table-hover">
					 <thead>
                        <th>Client Org Id </th>
                        <th>Client Org Name</th>
                        <th>E-mail </th>
                        <th>Phone Number</th>
                        <th>Actions</th>
                    </thead>
					 <tbody>
                       <c:forEach items="${listOfClientConfig}" var="clientVar">
                       <tr>
                        <td>${clientVar.clientOrgId}</td>
                        <td>${clientVar.clientOrgName}</td>
                        <td>${clientVar.email}</td>
                        <td>${clientVar.phone}</td>
                        <td>
                            <a class="btn btn-info" href="/update-person?id=${clientVar.clientOrgId}">Update</a>
                            <a class="btn btn-danger" onclick="return confirm('Are you sure you want to delete?')" href="/delete-person?id=${clientVar.clientOrgId}">Delete</a>
                        </td>
                    </tr>
                       </c:forEach>
                    </tbody>
				</table>
			</div>
		</div>
	</section>
</body>
</html>