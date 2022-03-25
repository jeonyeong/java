package lec10_extends_interface.rpg;

public class Magician extends Character {
	private Jobs job;
	

	public Magician(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp);
		this.job = job;
	}

	@Override
	public void skill(Enemy enemy) {
		switch(job) {
		case FIRE:
			System.out.println("메테오!!");
			enemy.setHp(enemy.getHp() - 300);
			
			if(enemy.getHp() <= 0) {
				enemy.die();
			}
			break;
		
		case ICE:
			System.out.println("얼음 화살!!");
			enemy.setHp(enemy.getHp() - 200);
			
			if(enemy.getHp() <= 0) {
				enemy.die();
			}
			break;
		
		default:
			System.out.println("직업이 없습니다.");
			break;
	}
	}
	
	enum Jobs{
		FIRE,
		ICE
	}

}
