<%@page import="java.io.File"%>
<%@page import="semiProject.uploadProduct.ProductBean"%>
<%@page import="semiProject.uploadProduct.ProductDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String pageNum = request.getParameter("pageNum");

	int product_number = Integer.parseInt(request.getParameter("product_number"));
	System.out.println("num===============>"+product_number);
	ProductDBBean updb = ProductDBBean.getInstance();
	ProductBean upbd = updb.getImg(product_number);
	
	String fname = upbd.getStored_file_name();
	System.out.println(fname);
	
	String path = request.getSession().getServletContext().getRealPath("\\img");
	
	//String file_folder = "C:\\jsp_project\\semiProject\\WebContent\\img";
	System.out.println("path======>"+path);
	
	int re = updb.deleteProduct(product_number);
	System.out.print("re ======= >"+re);
	
	if(re == 1) {
		if(fname != null) {//���ε� ���� ����
			File file = new File(path+"\\"+fname);  //������ �Ű�����: �������+�����̸�
			file.delete();//���� �����ϴ� �ڵ�
		}
	%>
		<script type="text/javascript">
			alert("�����ƽ��ϴ�.");
		</script>
	<%		
		response.sendRedirect("adminIndex.jsp?pages=../product/productList&pageNum="+"pageNum");
	}
%>