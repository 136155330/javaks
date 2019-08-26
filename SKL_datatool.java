package javaclasssheji;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SKL_datatool {
	database_tool a = new database_tool();
	public void insert(SKL num, Man a2) throws SQLException, ClassNotFoundException {///≤Â»Îººƒ‹
		a.start();
		String sql = "insert into skill values(?, ?, ?, ?, ?)";
		PreparedStatement prt = a.link().prepareStatement(sql);
		prt.setString(1, a2.name);
		prt.setString(2, num.name);
		prt.setInt(3, num.cost);
		prt.setInt(4, num.rank);
		prt.setDouble(5, num.attack_pow);
		prt.execute();
	}
	public void delete(SKL num, Man x) throws SQLException, ClassNotFoundException {
		a.start();
		String sql = "delete from skill where name = ?";
		PreparedStatement prt = a.link().prepareStatement(sql);
		prt.setString(1, x.name);
		prt.execute();
	}
	public void update(SKL num, Man x) throws SQLException, ClassNotFoundException {
		a.start();
		String sql = "update skill set bl = ?, cost = ?, rank = ? where name = ?";
		PreparedStatement prt = a.link().prepareStatement(sql);
		prt.setDouble(1, num.attack_pow);
		prt.setInt(2, num.cost);
		prt.setInt(3, num.rank);
		prt.setString(4, x.name);
		prt.execute();
	}
	public static void main(String arge[]) throws SQLException, ClassNotFoundException {
		
	}
}
