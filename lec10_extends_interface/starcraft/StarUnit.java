package lec10_extends_interface.starcraft;

public class StarUnit {
	private String name;
	private int damage;
	private int hp;
	private int attackRange;
	private double attackSpeed;
	private int mineral;
	private int gas;
	
	public StarUnit(String name, int damage, int hp, int attackRange, double attackSpeed, int mineral, int gas) {
		super();
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		this.attackRange = attackRange;
		this.attackSpeed = attackSpeed;
		this.mineral = mineral;
		this.gas = gas;
	}
	
	public void move(int x, int y) {
		System.out.println(name + "이(가) " + x + ", " + y 
				+ "로 이동합니다.");
	}
	
	@Override
	public String toString() {
		return "StarUnit [name=" + name + ", damage=" + damage + ", hp=" + hp + ", attackRange=" + attackRange
				+ ", attackSpeed=" + attackSpeed + ", mineral=" + mineral + ", gas=" + gas + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackRange() {
		return attackRange;
	}
	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	public double getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	public int getMineral() {
		return mineral;
	}
	public void setMineral(int mineral) {
		this.mineral = mineral;
	}
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	
}
