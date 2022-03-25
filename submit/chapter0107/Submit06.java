package submit;

public class Submit06 {
	public static void main(String[] args) {
		// 여러분들의 명단을 문자열 배열로 만들어보았습니다.
		
		// for문을 이용하여 "이"씨 성을 가진 사람이 몇명인지
		// 출력해주세요.
		
		String[] nameList = {"강욱근", "오현철", "최지혜", "김남규", "황햇빛나", "이가은", "김범석", "조서준", "이민우", "전영", "김지훈", "이용석", "박상우", "이유진", "박재훈", "이주석", "소은지", "이철현", "신예반", "이원태"};
		
		int countLee = 0;
		for(int i = 0; i < nameList.length; i++) {
			if(nameList[i].substring(0, 1).equals("이")) {
				countLee++;
			}
		}
		
		System.out.println("이씨 성을 가진 동기분이 총 " + countLee + "명 있습니다.");
		
	}
}
