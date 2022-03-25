package submit;

public class Submit07 {
	public static void main(String[] args) {
		// 금액을 입력하면 단위별로 --억, --천, --백, --십 --만원 
		// 으로 변환해주는 함수 textMoney()를 만들어보세요 
		// (천원 이하 단위는 무시)

		// 파라미터는 long 금액, 리턴은 String 이겠죠
		
		System.out.println(textMoney(103050709));
		System.out.println(textMoney(10305070));
		System.out.println(textMoney(1234567));
		System.out.println(textMoney(123456));
		System.out.println(textMoney(12345));

	}
	
	public static String textMoney(long money) {
		String result = "";
		
		if(money >= 100000000) {
			long front = money / 100000000;
			result += front + "억 ";
			money %= 100000000;
		}
		
		if(money >= 10000000) {
			long front = money / 10000000;
			result += front + "천 ";
			money %= 10000000;
		}
		
		if(money >= 1000000) {
			long front = money / 1000000;
			result += front + "백 ";
			money %= 1000000;
		}
		
		if(money >= 100000) {
			long front = money / 100000;
			result += front + "십 ";
			money %= 100000;
		}
		
		long front = money / 10000;
		result += front + "만원";
		
		return result;
	}
}
