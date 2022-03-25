package lec09_class.company;

public class CompanyMain {
	public static void main(String[] args) {
		Company company = Company.getInstance();
		
		Worker minwoo = new Worker("민우", 32, 0, 7000, "사장");
		company.workerList.add(minwoo);
		
		
		Worker sangwoo = new Worker("상우", 31, 0, 5000, "이사");
		company.workerList.add(sangwoo);
		
		Worker chanung = new Worker("찬웅", 30);
		company.workerList.add(chanung);
				
//		for(int i = 0; i < company.workerList.size(); i++) {
//			System.out.println(company.workerList.get(i));
//		}
		
		company.showList();
		
		company.addHistory(15);
		company.showList();
		
		company.fireWorker(chanung);
		company.showList();
		
		sangwoo.quitCompany();
		company.showList();
		
		
		
	}
}
