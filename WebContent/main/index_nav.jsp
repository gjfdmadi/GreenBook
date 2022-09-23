<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index_nav</title>
</head>
<body>
	<ul class="navbar-nav flex-fill w-100 mb-2">
		 <li class="nav-item w-100">
          <a class="nav-link" href="index.jsp">
            <i class="fe fe-home fe-16"></i>
            <span class="ml-3 item-text">홈</span>
          </a>
        </li>
        <li class="nav-item dropdown">
          <a href="#ui-elements" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle nav-link">
            <i class="fe fe-box fe-16"></i>
            <span class="ml-3 item-text">상품</span>
          </a>
          <ul class="collapse list-unstyled pl-4 w-100" id="ui-elements">
            <li class="nav-item">
              <a class="nav-link pl-3" href="index.jsp?pages=product"><span class="ml-1 item-text">카테고리</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link pl-3" href="adminIndex.jsp?pages=productList"><span class="ml-1 item-text">상품 정보 조회</span></a>
            </li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a href="#profile" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle nav-link">
            <i class="fe fe-user fe-16"></i>
            <span class="ml-3 item-text">고객센터</span>
          </a>
          <ul class="collapse list-unstyled pl-4 w-100" id="profile">
            <a class="nav-link pl-3" href="adminIndex.jsp?pages=qnaList"><span class="ml-1">공지사항</span></a>
            <a class="nav-link pl-3" href="adminIndex.jsp?pages=listNotice"><span class="ml-1">FAQ</span></a>
            <a class="nav-link pl-3" href="adminIndex.jsp?pages=listNotice"><span class="ml-1">1:1 문의 (Q&A)</span></a>
          </ul>
        </li>
    </ul>
    <a href="login/login_index.jsp" class="btn mb-2 btn-primary btn-lg btn-block" role="button"><i class="fe fe-log-in fe-16"></i> 로그인</a>
    <a href="login/register.jsp" class="btn mb-2 btn-secondary btn-lg btn-block" role="button"><i class="fe fe-user-plus fe-16"></i> 회원가입</a>
    
</body>
</html>