package lec14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		// 1. 드라이버 로딩 (딱 한번만 로딩해주면 된다)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
			System.exit(0);		// 프로그램 종료
		}
		
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			stmt = conn.createStatement();
			
			StringBuffer query = new StringBuffer();
			query.append("UPDATE				");
			query.append("		students		");
			query.append("SET stu_name = '은지'	");
			query.append("WHERE 	1=1			");
			query.append("  AND stu_id = 3		");
			
			int cnt = stmt.executeUpdate(query.toString());
			
			if(cnt > 0) {
				System.out.println(cnt + "행 수정 되었습니다.");
			}else {
				System.out.println("업데이트가 잘 안되었습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) try {stmt.close();}catch(SQLException e) {}
			if(conn != null) try {conn.close();}catch(SQLException e) {}
		}
		
		
	}

}
