package lec10_extends_interface.starcraft;

public class ProtossUnit extends StarUnit {
	private int shield;

	public ProtossUnit(String name, int damage, int hp, int attackRange, double attackSpeed, int mineral, int gas,
			int shield) {
		super(name, damage, hp, attackRange, attackSpeed, mineral, gas);
		this.shield = shield;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}
	
	
}
