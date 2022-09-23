package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import semiProject.MemberBean;

public class LikeDBBean {
	private static LikeDBBean instance = new LikeDBBean();

	public static LikeDBBean getInstance() {
		// 값을 입력받는 메소드
		return instance; // BoardDBBean의 객체를 입력받음.

	}

	public static Connection getConnection() throws Exception {
		// 쿼리작업 사용할 Connection객체 리턴하는 메소드
		// 따로만든 이유 -> 여러번 사용하기 위해서

		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection();
	}
	
	public ArrayList<LikeBean> likeList(String id) throws Exception{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<LikeBean> likeList = new ArrayList<LikeBean>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql2 = "select * from user_like where user_id =";
			String sql3 = "and product_like = 1";
			String sql = sql2+"'"+id+"' "+sql3;
			System.out.println("sql==================="+sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				LikeBean like = new LikeBean();
				
				like.setUser_id(rs.getString(1));
				like.setProduct_number(rs.getInt(2));
				like.setProduct_like(rs.getString(3));
				like.setProduct_name(rs.getString(4));
				like.setProduct_price(rs.getInt(5));
				like.setFile_number(rs.getInt(6));
				likeList.add(like);
				
			}

		}catch(SQLException ex){
			System.out.println("연결 실패");
			ex.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return likeList;
	}
	
	public LikeBean likeList(String id, String like) throws Exception{
		//아이디가 일치하는 멤버의 정보를 얻어오는 메소드
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from user_like where user_id = ? and product_like = ?";
		LikeBean likelist = null;
		
		try {	
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, like);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			 likelist = new LikeBean();
			
			likelist.setUser_id(rs.getString("user_id"));
			likelist.setProduct_number(rs.getInt("product_number"));
			likelist.setProduct_like(rs.getString("product_like"));
			likelist.setProduct_name(rs.getString("product_name"));
			likelist.setProduct_price(rs.getInt("product_price"));
			likelist.setFile_number(rs.getInt("file_number"));
		}
		rs.close();
		pstmt.close();
		con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return likelist;
	}
}
