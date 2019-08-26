package javaclasssheji;

public class SKL{
    public SKL(String name, int rank, int cost, double attack_pow) {
		super();
		this.name = name;
		this.rank = rank;
		this.cost = cost;
		this.attack_pow = attack_pow;
	}
	String name;
    int rank, cost;
    double attack_pow;
    public boolean judge(Man a) {
    	if(a.mp > cost) {
    		return true;
    	}
    	return false;
    }
    public int solve(Man a){
        int x = (int) (a.att * this.attack_pow);
        return x;        
    }
}