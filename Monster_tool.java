package javaclasssheji;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Monster_tool {
	public void insert(monster a) throws ClassNotFoundException, SQLException {
		database_tool b = new database_tool();
		b.start();
		String sql = "insert into monster values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement prt = b.link().prepareStatement(sql);
		prt.setString(1, a.name);
		prt.setInt(2, a.hp);
		prt.setInt(3, a.mp);
		prt.setInt(4, a.att);
		prt.setInt(5, a.def);
		prt.setInt(6, a.bat);
		prt.setInt(7, a.rank);
		prt.execute();
	}
	 public void update(monster num) throws ClassNotFoundException, SQLException {///数据库更新
		 database_tool b = new database_tool();
		 Statement s = b.start();
		 String sql = "update monster set name = ?, hp = ?, mp = ?, att = ?, def = ?, bat = ?, rank = ? where name = ?";
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
	 public void delete(monster num) throws ClassNotFoundException, SQLException {///删除一个存档
		 database_tool b = new database_tool();
		 Statement s = b.start();
		 String sql = "delete from monster where name = ?";
		 PreparedStatement prt = b.link().prepareStatement(sql);
		 prt.setString(1,num.name);
		 prt.execute();
	 }
	 public static void main(String arge[]) throws ClassNotFoundException, SQLException {
		 
	 }
}
