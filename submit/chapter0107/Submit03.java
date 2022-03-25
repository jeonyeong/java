package submit;

public class Submit03 {
	public static void main(String[] args) {
		// 주어진 문자열을 이용하여, 명함을 만들어보세요.
		String info = "정찬웅, 010-7398-7332, akow283@gmail.com";
		
		String[] strArray = info.split(", ");
		System.out.println("=========================");
		System.out.println("이름 : " + strArray[0]);
		System.out.println("연락처 : " + strArray[1]);
		System.out.println("이메일 : " + strArray[2]);
		System.out.println("=========================");
		
	}
}
