package lec10_extends_interface.lol;

// 인터페이스를 구현(implement) 하기 위해서는 extends가 아닌
// implements 를 사용한다.
// 자바에서는 기본적으로 다중 상속이 불가능하다
// (extends 뒤에 한 개의 클래스만 허용)
// 인터페이스는 다중 구현이 가능하다
// (implements 뒤에 여러 개의 클래스 허용)
public class Shen extends Champion implements LolInterface, VoiceInterface {

	public Shen(String name, int hp, int damage) {
		super(name, hp, damage);
	}

	@Override
	public void skillQ() {
		System.out.println("평타 세대 강화");
	}

	@Override
	public void skillW() {
		System.out.println("보호막 활성화");
	}

	@Override
	public void skillE() {
		System.out.println("도발");
	}

	@Override
	public void skillR() {
		System.out.println("팀원 보호막 주기");
	}

	@Override
	public void speak() {
		System.out.println("넌 이미 죽어있다. 단지 아직 깨닫지 못했을뿐");
	}

}
