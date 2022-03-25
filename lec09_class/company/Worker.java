package lec09_class.company;

import lec09_class.UtilClass;

public class Worker {
	// 캡슐화
	private int id;						// 사원 번호
	private String name;				// 이름
	private int age;					// 나이
	private int exp;					// 경력
	private int salary;					// 연봉 (단위: 만)
	private String position;			// 직급
	
	// 사원 번호가 자동으로 적용되는 생성자
	public Worker(String name, int age, int exp, int salary, String position) {
		Company company = Company.getInstance();
		this.id = company.workerList.size() + 1;
		this.name = name;
		this.age = age;
		this.exp = exp;
		this.salary = salary;
		this.position = position;
	}
	
	// 사원번호, 경력 = 0, 연봉 = 3000, 직급 = 사원 기본값
	// 적용되는 생성자
//	public Worker(String name, int age) {
//		Company company = Company.getInstance();
//		this.id = company.workerList.size() + 1;
//		this.name = name;
//		this.age = age;
//		this.exp = 0;
//		this.salary = 3000;
//		this.position = "사원"; 
//	}
	
	// 사원번호, 경력 = 0, 연봉 = 3000, 직급 = 사원 기본값
	// 적용되는 생성자
	public Worker(String name, int age) {
		this(name, age, 0, 3000, "사원");
	}
	
	// 경력이 year 만큼 증가 
	public void addExp(int year) {
		this.age += year;
		this.exp += year;
		this.salary += 300*year;
		
		if(this.position.equals("사장") || 
				this.position.equals("이사")) {
			return;
		}
		
		if(this.exp > 20) {
			this.position = "이사";
		}else if(this.exp > 15) {
			this.position = "부장";
		}else if(this.exp > 8) {
			this.position = "과장";
		}else if(this.exp > 3) {
			this.position = "대리";
		}
	}
	

	@Override
	public String toString() {
		return "-------------------------------\n사원번호: " 
				+ id + "\n이름: " + name + "\n나이: " + age 
				+ "\n경력: " + exp + "\n연봉: " + UtilClass.formatSalary(salary)
				+ "\n직급: " + position + "\n-------------------------------";
	}
	
	// 사표 쓰기
	public void quitCompany() {
		System.out.println(this.position + " " + name 
				+ "이(가) 사직서를 제출하고 회사를 나갔습니다.");
		
		Company company = Company.getInstance();
		company.workerList.remove(this);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	// 단축키 [Alt + Shift + S] 혹은 [마우스 우클릭 - Source]
	// Generate Getters and Setters
	
	
}
