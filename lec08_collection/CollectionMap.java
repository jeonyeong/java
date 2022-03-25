package lec08_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
	public static void main(String[] args) {
		// 맵(HashMap)의 선언
		HashMap<String, String> stuMap = new HashMap<String, String>();
		HashMap<String, Integer> stuMap2 = new HashMap<>();
		Map<Integer, String> stuMap3 = new HashMap<Integer, String>();
		
		// .put(Key, Value) 맵에 데이터 추가
		stuMap.put("첫째", "손오공");
		stuMap.put("둘째", "손오반");
		stuMap.put("셋째", "손오천");
		System.out.println(stuMap);
		
		stuMap2.put("비트코인", 7000);
		stuMap2.put("삼성", 5);
		System.out.println(stuMap2);
		
		stuMap3.put(0, "민우");
		stuMap3.put(32123, "유진");
		System.out.println(stuMap3);
		
		stuMap.put("첫째", "베지터");
		System.out.println(stuMap);
		
		System.out.println("\n==========================\n");
		
		// .size() 
		System.out.println(stuMap.size());
		
		// containsKey()
		// 해당 맵에 키가 존재한다면 true 리턴 / 없으면 false
		System.out.println(stuMap.containsKey("둘째"));
		
		// containsValue()
		// 해당 맵에 값이 존재한다면 true 리턴 / 없으면 false
		System.out.println(stuMap.containsValue("손오공"));
		
		// .get(Key)
		// Key에 해당하는 Value를 리턴
		System.out.println(stuMap2.get("비트코인"));
		
		// .remove(Key)
		// Key에 해당하는 데이터를 삭제
		stuMap.remove("첫째");
		System.out.println(stuMap);
		
		System.out.println("\n===========================\n");
		
		// Map 순회
		// 1. KeySet 이용
		Set<String> keySet = stuMap.keySet();
		
		// set으로 만든 뒤 향상된 for문 이용
		for(String key : keySet) {
			System.out.println(stuMap.get(key));
		}
		
		
		// 2. EntrySet 이용
		Set<Entry<String, String>> entrySet = stuMap.entrySet();
		
		for(Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
		// foreach + 람다식
		stuMap.forEach((key, value) -> {
			System.out.println(key + "=" + value);	
		});
		
		
		
	}
}
