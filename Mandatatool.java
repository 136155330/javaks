package javaclasssheji;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Mandatatool {
	public void insert(Man num) throws ClassNotFoundException, SQLException {//新建存档
		 database_tool b = new database_tool();
		 Statement s = b.start();
		 String sql = "insert into person values(?, ?, ?, ?, ?, ?, ?)";
		 PreparedStatement prt = b.link().prepareStatement(sql);
		 prt.setString(1, num.name);
		 prt.setInt(2, num.hp);
		 prt.setInt(3, num.mp);
		 prt.setInt(4, num.att);
		 prt.setInt(5, num.def);
		 prt.setInt(6, num.bat);
		 prt.setInt(7, num.rank);
		 prt.execute();
	 }
	 public void update(Man num) throws ClassNotFoundException, SQLException {///数据库更新
		 database_tool b = new database_tool();
		 Statement s = b.start();
		 String sql = "update person set name = ?, hp = ?, mp = ?, att = ?, def = ?, bat = ?, rank = ? where name = ?";
		 PreparedStatement prt = b.link().prepareStatement(sql);
		 prt.setString(1, num.name);
		 prt.setInt(2, num.hp);
		 prt.setInt(3, num.mp);
		 prt.setInt(4, num.att);
		 prt.setInt(5, num.def);
		 prt.setInt(6, num.bat);
		 prt.setInt(7, num.rank);
		 prt.setString(8, num.name);
		 prt.execute();
	 }
	 public void delete(Man num) throws ClassNotFoundException, SQLException {///删除一个存档
		 database_tool b = new database_tool();
		 Statement s = b.start();
		 String sql = "delete from person where name = ?";
		 PreparedStatement prt = b.link().prepareStatement(sql);
		 prt.setString(1, num.name);
		 prt.execute();
	 }
	 public static void main(String arge[]) throws ClassNotFoundException, SQLException {
		 
	 }
}
