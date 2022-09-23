<%@page import="product.ProductDBBean"%>
<%@page import="product.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	ProductDBBean updb = ProductDBBean.getInstance();
	
	ArrayList<ProductBean> productList = updb.productList("1");
	int product_number[] = new int[productList.size()];
	String product_name[] = new String[productList.size()];
	int product_price[] = new int[productList.size()];
	String stored_file_name [] = new String[productList.size()];
	String product_desc[] = new String[productList.size()];
	for(int i=0;i<productList.size();i++) {
		ProductBean upbd = productList.get(i);
		
		product_number[i] = upbd.getProduct_number();
		product_name[i] = upbd.getProduct_name().toString();
		product_price[i] = upbd.getProduct_price();
		product_desc[i] = updb.getproduct(product_number[i], false).getProduct_desc();
		stored_file_name[i] = updb.getImg(product_number[i]).getStored_file_name();
		
	}
	System.out.println(product_number);
	System.out.println(product_name);
	System.out.println(product_price);
	System.out.println(stored_file_name);
%>
<html lang="kr">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>Amado - Furniture Ecommerce Template | Home</title>

    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Core Style CSS -->
    <!--  <link rel="stylesheet" href="css/core-style.css">-->
    <link rel="stylesheet" href="style.css">
	
	<style type="text/css">
.testt:nth-of-type(2) {
	position: absolute;
	right: 500px;
}
        
</style>
</head>

<body>
        <!-- Product Catagories Area Start -->
        <div class="products-catagories-area clearfix">
            <div class="amado-pro-catagory clearfix">

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[0]%>" class="img_wh">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <!-- &#8361; 원 특수문자 표시 -->
                            <p>&#8361; <%= product_price[0] %></p>
                            <h4><%= product_name[0] %></h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[1]%>" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>&#8361; <%= product_price[1] %></p>
                            <h4><%= product_name[1] %> <br></h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[2]%>" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>&#8361; <%= product_price[2] %></p>
                            <h4><%= product_name[2] %></h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[3]%>" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>&#8361; <%= product_price[3] %></p>
                            <h4><%= product_name[3] %></h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[4]%>" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>&#8361; <%= product_price[4] %></p>
                            <h4><%= product_name[4] %></h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[5]%>" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>&#8361; <%= product_price[5] %></p>
                            <h4><%= product_name[5] %></h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[6]%>" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>&#8361; <%= product_price[6] %></p>
                            <h4><%= product_name[6] %></h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[7]%>" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>&#8361; <%= product_price[7] %></p>
                            <h4><%= product_name[7] %></h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="${pageContext.request.contextPath}/img/<%=stored_file_name[8]%>" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>&#8361; <%= product_price[8] %></p>
                            <h4><%= product_name[8] %></h4>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    
    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="js/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>

</body>

</html>