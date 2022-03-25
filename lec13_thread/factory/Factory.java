package lec13_thread.factory;

public class Factory {
	int countRamen = 0;		// 생산된 면 개수
	int countSoup = 0;		// 생산된 스프 개수
	int count = 0;			// 생산된 라면 개수
	
	public EndFactory endFactory;
	
	public synchronized void makeRamen() {
		System.out.println("면을 만들었습니다. 면 수량: " + countRamen);
		countRamen++;
		
		notify();
	}
	
	public synchronized void makeSoup() {
		System.out.println("스프를 만들었습니다. 스프 수량: " + countSoup);
		countSoup += 2;
		
		notify();
	}
	
	public synchronized void packing() {
		if(countRamen > 0 && countSoup > 0) {
			countRamen--;
			countSoup--;
			count++;
			
			System.out.println("라면을 만들었습니다. 전체수량: " + count);
		
			if(count == 10) {
				endFactory.theEnd();
				return;
			}
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		packing();
	}
	
}
