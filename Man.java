package javaclasssheji;


import java.util.*;

public class Man{
    String name;
    int hp, mp, att, def, bat, rank;
    public void Print(){
        System.out.println(name + " " + hp + " " + mp);
    }
    public int solve(Man a){
        if(a.bat > this.bat){
            return 1;///代表a比较快
        }
        else{
            return 0;///代表a比较慢
        }
    }
    public void attacked(Man a){
        if(a.att > this.def){
            this.hp = this.hp - (a.att - this.def);
        }
    }
    public boolean judge_HP(){
        if(this.hp > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean judge_MP(){
        if(this.mp > 0){
            return true;
        }
        else{
            return false;
        }
    }
	public Man(String name, int hp, int mp, int att, int def, int bat, int rank) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
		this.bat = bat;
		this.rank = rank;
	}
    public static void main(String arge[]){
    	
    }
}