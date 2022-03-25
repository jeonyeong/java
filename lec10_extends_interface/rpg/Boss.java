package lec10_extends_interface.rpg;

public class Boss extends Enemy {

	public Boss(String name, int damage, int hp) {
		super(name, damage, hp);
		talk();
	}

	@Override
	public void talk() {
		System.out.println("여기까지 오다니 건방지구나");
	}

}
