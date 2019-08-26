package javaclasssheji;

public class Hero extends Man{
	public Hero(String name, int hp, int mp, int att, int def, int bat, int rank, int experience, int arms_att, String arms_name) {
		super(name, hp, mp, att, def, bat, rank);
		// TODO Auto-generated constructor stub
		this.arms_att = arms_att;
		this.arms_name = arms_name;
		this.experience = experience;
	}
	int experience, arms_att;
	String arms_name;
}
