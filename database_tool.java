package javaclasssheji;
import java.sql.*;
import java.util.*;
public class database_tool {
	 private static final String Class_Name = "org.sqlite.JDBC";
	 private static final String url = "jdbc:sqlite:C:\\Users\\user\\Desktop\\javadatabase\\game.db";
	 public void Init() throws ClassNotFoundException {
		 Class.forName(Class_Name);
	 }
	 public Connection link() throws SQLException {
		 Connection connet = DriverManager.getConnection(url);
		 return connet;
	 }
	 public Statement start() throws ClassNotFoundException, SQLException {
		 database_tool a = new database_tool();
		 a.Init();
		 Connection cnt = a.link();
		 Statement sta = cnt.createStatement();
		 return sta;
	 }
}
