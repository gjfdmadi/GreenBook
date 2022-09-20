/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-20 06:39:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Upload_005fProduct;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import semiProject.uploadProduct.ProductDBBean;
import semiProject.uploadProduct.ProductBean;

public final class uploadProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("semiProject.uploadProduct.ProductBean");
    _jspx_imports_classes.add("semiProject.uploadProduct.ProductDBBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

	int product_number = 0;
	String pageNum = request.getParameter("pageNum");
	String product_name = "";
	
	if(request.getParameter("product_number") != null) {
		product_number = Integer.parseInt(request.getParameter("product_number"));
	}
	
	ProductDBBean updb = ProductDBBean.getInstance();
	ProductBean upbd = updb.getproduct(product_number, false);
	
	if(upbd != null) {
		product_name = upbd.getProduct_name();
	}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script language=\"JavaScript\" src=\"uploadProduct.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	header ul li{\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<ul class=\"headMenu\">\r\n");
      out.write("			<li><a href=\"mainPage.jsp\">Home</a></li>\r\n");
      out.write("			<li><a href=\"myPage.jsp\">MY PAGE</a></li>\r\n");
      out.write("			<li><a href=\"cart.jsp\">CART</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<center>	\r\n");
      out.write("			<div class=\"pageTitle\">\r\n");
      out.write("				<h1>상품 등록</h1>\r\n");
      out.write("			</div>\r\n");
      out.write("		<center>\r\n");
      out.write("	</header>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<center>\r\n");
      out.write("			<table>\r\n");
      out.write("				<form name=\"up_prodc\" action=\"uploadProduct_ok.jsp\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("					<input type=\"hidden\" name=\"product_number\" value=\"");
      out.print( product_number );
      out.write("\">\r\n");
      out.write("					\r\n");
      out.write("					<tr class=\"product_category\">\r\n");
      out.write("					<!--  	<label class=\"gender_label\">성별 카테고리</label>&nbsp;\r\n");
      out.write("						<select name=\"category_code_gender\" >\r\n");
      out.write("						    <option value=\"none\">=== 선택 ===</option>\r\n");
      out.write("						    <option value=\"female\">여성 의류</option>\r\n");
      out.write("						    <option value=\"male\">남성 의류</option>\r\n");
      out.write("						    <option value=\"unisex\">유니 섹스</option>\r\n");
      out.write("						    <option value=\"kids\">아동복</option>\r\n");
      out.write("						 </select>&nbsp;-->\r\n");
      out.write("						<td>\r\n");
      out.write("							<label class=\"dress_label\">옷 카테고리</label>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<select name=\"category_code\" >\r\n");
      out.write("							    <option value=\"none\">=== 선택 ===</option>\r\n");
      out.write("							    <option value=\"t-shirt\">티셔츠</option>\r\n");
      out.write("							    <option value=\"hude-t\">후드티</option>\r\n");
      out.write("							    <option value=\"nite\">니트/스웨터</option>\r\n");
      out.write("							    <option value=\"shirt\">셔츠/남방</option>\r\n");
      out.write("							    <option value=\"pants\">바지</option>\r\n");
      out.write("							    <option value=\"blue-jeans\">청바지</option>\r\n");
      out.write("							 </select>\r\n");
      out.write("						 </td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<br>\r\n");
      out.write("					<tr class=\"product_name\">\r\n");
      out.write("						<td>\r\n");
      out.write("							<label class=\"product_name_label\">상품 이름 </label>&nbsp;\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" name=\"product_name\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<br>\r\n");
      out.write("					<tr class=\"product_price\">\r\n");
      out.write("						<td>\r\n");
      out.write("							<label class=\"product_price_label\">상품 가격</label>&nbsp;\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"number\" name=\"product_price\"> 원\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<br>\r\n");
      out.write("					<tr class=\"product_stock\">\r\n");
      out.write("						<td>\r\n");
      out.write("							<label class=\"product_stock\">재고 수량</label>&nbsp;\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"number\" name=\"product_stock\"> 개 남았습니다.\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<br>\r\n");
      out.write("					<tr class=\"product_desc\">\r\n");
      out.write("						<td>\r\n");
      out.write("							<label class=\"product_desc_label\">상품 설명</label>&nbsp;\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>\r\n");
      out.write("						<textarea rows=\"2\" cols=\"60\" name=\"product_desc\"></textarea>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<br>\r\n");
      out.write("					<tr class=\"product_img\">\r\n");
      out.write("						<td>\r\n");
      out.write("							상품 이미지 등록\r\n");
      out.write("						</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"file\" name=\"product_img\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<br>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"button\" value=\"상품 등록\" onclick=\"check_ok()\">&nbsp;\r\n");
      out.write("							<input type=\"reset\" value=\"다시작성\">\r\n");
      out.write("							<input type=\"button\" value=\"등록한 상품 목록\" \r\n");
      out.write("							onclick=\"location.href='myUploadProduct_List.jsp'\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</form>\r\n");
      out.write("			</table>\r\n");
      out.write("		</center>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}