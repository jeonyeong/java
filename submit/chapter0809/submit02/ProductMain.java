package submit.chapter0809.submit02;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		// 1. 하이마트에 놀러갔더니 전자제품들이 정말 많이 있군요. 전자제품들은 각각 제품명과 가격이 함께 전시되어있습니다. 
		// 이를 코드로 구현하기 위해, 필드 변수에 제품명과 가격을 포함하는 전자제품 클래스(Product)를 만들어보세요.
		// (당연히 제품명과 가격을 입력받는 생성자를 포함하며, 필드 변수들은 캡슐화를 해야 겠죠?)

		
		// 2. Product 클래스를 이용하여
		// 제품명: 냉장고, 가격: 2000000
		// 제품명: TV, 가격: 1000000
		// 제품명: 에어컨, 가격: 800000
		// 제품명: 컴퓨터, 가격: 1300000
		// 제품명: 선풍기, 가격: 100000
		// 객체들을 만들어주세요.

		Product ref = new Product("냉장고", 2000000);
		Product tv = new Product("TV", 1000000);
		Product air = new Product("에어컨", 800000);
		Product com = new Product("컴퓨터", 1300000);
		Product fan = new Product("선풍기", 100000);
		
		// 3. 전자제품들을 ArrayList 객체에 담은 후 가격별로 정렬하여 출력해주세요.
		ArrayList<Product> proList = new ArrayList<Product>();
		proList.add(ref);
		proList.add(tv);
		proList.add(air);
		proList.add(com);
		proList.add(fan);
		
		for(int i = 0; i < proList.size() - 1; i++) {
			for(int j = 0; j < proList.size() -1 -i; j++) {
				if(proList.get(j).getPrice() > proList.get(j+1).getPrice()) {
					Product temp = proList.get(j);
					proList.set(j, proList.get(j+1));
					proList.set(j+1, temp);
				}
			}
		}
		
		for(Product product : proList) {
			System.out.println(product);
		}
		
		
		// 4. 정렬이 완료된 리스트에서 TV가 몇번째 인덱스인지 찾아내어 출력하시오.
		for(int i = 0; i < proList.size(); i++) {
			if(proList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}

	}

}
