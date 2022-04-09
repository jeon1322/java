package formatTest;

import java.sql.*;

public class ScottJDBC {

	public ScottJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("#### 드라이버 로딩 실패 ####");
		}
	}
	public Connection getCON() {
		Connection con = null;
		
		String url = "jdbc:orale:thin:@localhost:1521:xe";
		String user = "scott";
		String pw	= "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {}
		return con;
	}
	
	// 명령 전달 도구를 요구하면 준비해서 반환해주는 함수
	public Statement getSTMT(Connection con, String sql) {
		Statement stmt = null;
		
		try {
			stmt = con.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			
		}
		return stmt;
	}
}
