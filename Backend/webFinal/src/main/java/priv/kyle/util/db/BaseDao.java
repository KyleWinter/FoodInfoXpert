package priv.kyle.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



public class BaseDao {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/food";
	private static final String USERNAME = "root";
	private static final String PWD = "1212";
	
	static {
		try {
			Class.forName(DRIVER);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void open() {
		try {
			this.connection = DriverManager.getConnection(URL,USERNAME,PWD);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createpareStatement(String sql,Object...parem) {
		try {
			this.preparedStatement = this.connection.prepareStatement(sql);
			for(int i=0;i<parem.length;i++) {
				this.preparedStatement.setObject(i+1, parem[i]);
			
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeDQL(String sql,Object...param) {
		try {
			this.createpareStatement(sql, param);
			this.resultSet = this.preparedStatement.executeQuery();
			return resultSet;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int executeDML(String sql,Object...parm) {
		try {
			this.createpareStatement(sql, parm);
			return preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int executeDML(String sql,List<Object> param) {
		try {
			this.preparedStatement = this.connection.prepareStatement(sql);
			for(int i=0;i<param.size();i++) {
				this.preparedStatement.setObject(i+1, param.get(i));
//				System.out.println(param);
			}
			return	preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void close() {
		if(this.resultSet!=null) {
			try {
				resultSet.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				resultSet = null;
			}
		}
		if(this.connection!= null) {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				connection = null;
			}
		}
		
	}
	
}
