package lec10_extends_interface.lol;

public class Champion {
	private String name;
	private int hp;
	private int damage;
	
	public Champion(String name, int hp, int damage) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	@Override
	public String toString() {
		return "Champion [name=" + name + ", hp=" + hp + ", damage=" + damage + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}
