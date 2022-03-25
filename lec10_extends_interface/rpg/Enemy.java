package lec10_extends_interface.rpg;

public abstract class Enemy {
	private String name;
	private int damage;
	private int hp;
	
	public Battle battle;
	
	public Enemy(String name, int damage, int hp) {
		super();
		this.name = name;
		this.damage = damage;
		this.hp = hp;
	}
	
	// 죽음
	public void die() {
		System.out.println(this.name + "이(가) 사망하였습니다.");
		battle.outOfBattle();
	}
	
	// 대사
	public abstract void talk();
	

	@Override
	public String toString() {
		return "Enemy [name=" + name + ", damage=" + damage + ", hp=" + hp + "]";
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
	
	
}
