package submit.chapter0809;

import java.util.ArrayList;
import java.util.Collections;

public class Submit01 {

	public static void main(String[] args) {
		// 1. 정수를 담을 수 있는 ArrayList 객체를 생성하고
		// 10부터 20 사이의 랜덤 숫자를 10개 담으시오
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int randInt = (int)(Math.random()*11) + 10;
			intList.add(randInt);
		}
		
		// 2. 해당 정수형 리스트를 한줄로 출력 하시오.
		for(int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
		System.out.println();
		
		// 3. 해당 정수형 리스트에서 중복된 숫자들을 제거한 후 출력하시오.
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		for(int i = 0; i < intList.size(); i++) {
			if(intArray.indexOf(intList.get(i)) == -1) {
				intArray.add(intList.get(i));
			}
		}
		
		for(int i = 0; i < intArray.size(); i++) {
			System.out.print(intArray.get(i) + " ");
		}
		System.out.println();
		
		// 4. 중복을 제거한 정수형 리스트를 오름차순으로 정렬하여 출력하시오.
		Collections.sort(intArray);
		for(int i = 0; i < intArray.size(); i++) {
			System.out.print(intArray.get(i) + " ");
		}
		System.out.println();
		
		// 5. 중복을 제거한 정수형 리스트를 내림차순으로 정렬하여 출력하시오.
		Collections.sort(intArray, Collections.reverseOrder());
		for(int i = 0; i < intArray.size(); i++) {
			System.out.print(intArray.get(i) + " ");
		}
		System.out.println();

	}

}
