package sumbmit4.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sumbmit4.dao.WordChainDao;
import sumbmit4.jdbc.ConnectionPool;
import sumbmit4.model.MemberVO;
import sumbmit4.model.Word;



public class WordChainService {

	private WordChainDao dao = WordChainDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	
private static WordChainService instance = new WordChainService();
public static WordChainService getInstance() {
	if (instance == null) {
		instance = new WordChainService();
	}
	return instance;
}


public int registMem(String id, String pw) {
	Connection conn = cp.getConnection();

	try {
		return dao.registMem(conn, id, pw);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		if (conn != null)
			cp.releaseConnection(conn);
	}

	return 0;
}

public int saveMem(MemberVO mem) {
	Connection conn = cp.getConnection();

	try {
		return dao.saveMem(conn, mem);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		if (conn != null)
			cp.releaseConnection(conn);
	}

	return 0;
}


//파라미터 id에 대한 Developer 데이터 리턴
	public MemberVO getMem(String id) {
		Connection conn = cp.getConnection();

		try {
			return dao.getMem(conn, id);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return new MemberVO();
	}

	
	public ArrayList<Word> getWord() {
		Connection conn = cp.getConnection();

		try {
			return dao.getWord(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return new ArrayList<Word>();
	}

	public ArrayList<MemberVO> memList() {
		Connection conn = cp.getConnection();

		try {
			return dao.memList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return new ArrayList<MemberVO>();
	}

	public void win(MemberVO mem) {
		mem.setWin(mem.getWin()+1);
	}
	public void lose(MemberVO mem) {
		mem.setLose(mem.getLose()+1);
	}
	
	
}
