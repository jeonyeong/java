package sumbmit4.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sumbmit4.model.MemberVO;
import sumbmit4.model.Word;








public class WordChainDao {

	
private static WordChainDao instance = new WordChainDao();
	
	private WordChainDao() {}
	
	public static WordChainDao getInstance() {
		if(instance == null) {
			instance = new WordChainDao();
		}
		return instance;
	}
	
	
	// 회원가입
		public int registMem(Connection conn,String id , String pw) throws SQLException {
			StringBuffer query = new StringBuffer();
			query.append("insert into        	 ");
			query.append("        member(id,pw)  ");
			query.append("values (        	     ");
			query.append("		  ?  			 ");
			query.append("		, ?       		 ");
			query.append("	    )  		         ");

			PreparedStatement ps = conn.prepareStatement(query.toString());
			MemberVO temp = new MemberVO(id, pw);
			
			int idx = 1;
			ps.setString(idx++, temp.getId());
			ps.setString(idx++, temp.getPw());
			
			

			int cnt = ps.executeUpdate();

			if (ps != null)
				ps.close();

			return cnt;
		}
		
		
		public int saveMem(Connection conn, MemberVO mem) throws SQLException {
			

			StringBuffer query = new StringBuffer();
			query.append("update                           ");
			query.append("       member                    ");
			query.append("set                       	   ");
			query.append("     win = ? 		    	       ");
			query.append("    , lose = ?      			   ");
			query.append("where 1=1      			 	   ");
			query.append("  and  id = ?      			   ");
	
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			int idx = 1;
			
			ps.setInt(idx++, mem.getWin());
			ps.setInt(idx++, mem.getLose());
			ps.setString(idx++, mem.getId());
			
			
			int cnt = ps.executeUpdate();
			
			if(ps != null) ps.close();
			return cnt;
			
	
	
	}
		
		
		
		// 회원가입 할 때 , 입력한 아이디에 대한 중복체크
		// 로그인 시 , 입력한 아이디에 대한 패스워드 검사
		// 로그인 성공, 입력한 아이디에 대한 developer 데이터 가져
		
		public MemberVO getMem(Connection conn, String id) throws SQLException {
			StringBuffer query = new StringBuffer();
			
			query.append("SELECT			   			");
			query.append("		 id				        ");
			query.append("		,pw			        	");
			query.append("FROM							");
			query.append("		member					");
			query.append("WHERE 	1=1					");
			query.append("AND		id =  ?				");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			ps.setString(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			ArrayList<MemberVO> result = new ArrayList<MemberVO>();
			
			MemberVO temp = new MemberVO();
			
			while(rs.next()) {
				temp.setId(rs.getString("id"));
				temp.setPw(rs.getString("pw"));
				
				
			}
			
			if(ps!=null)ps.close();
			if(rs!=null)rs.close();
			
			return temp;
	
		}
		
		public ArrayList<Word> getWord(Connection conn) throws SQLException {
			StringBuffer query = new StringBuffer();
			query.append("SELECT			   			");
			query.append("		 word_word			    ");
			query.append("FROM							");
			query.append("		worddictionary			");
			

			PreparedStatement ps = conn.prepareStatement(query.toString());
			ResultSet rs = ps.executeQuery();

			ArrayList<Word> result = new ArrayList<Word>();

			while (rs.next()) {

				Word temp = new Word();

				result.add(temp);

				temp.setWord(rs.getString("word_word"));
				
			}
			if (ps != null)
				ps.close();
			if (rs != null)
				rs.close();

			return result;
			
		}
		
		
		public ArrayList<MemberVO> memList(Connection conn) throws SQLException{
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT    	  			  ");
			query.append("       id	                  ");
			query.append("      ,win 	   			  ");
			query.append("      ,lose			      ");
			query.append("FROM                        ");
			query.append("       member		          ");
			query.append("order by            		  ");
			query.append("       win desc             ");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			ResultSet rs = ps.executeQuery();

			ArrayList<MemberVO> result = new ArrayList<MemberVO>();

			while (rs.next()) {

				MemberVO temp = new MemberVO();

				result.add(temp);

				temp.setId(rs.getString("id"));
				temp.setWin(rs.getInt("win"));
				temp.setLose(rs.getInt("lose"));
				
			}
			if (ps != null)
				ps.close();
			if (rs != null)
				rs.close();

			return result;
			
		}
		
}
