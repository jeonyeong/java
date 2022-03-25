package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiDate {
	public static void main(String[] args) throws ParseException {
		// 현재 시간
		// 1. Date 클래스 사용
		Date dateToday = new Date();
		// Date 객체가 생성되는 순간
		// 해당 Date 객체 내부에 그 때의 시간이 세팅된다.
		System.out.println(dateToday);
		
		// 날짜 포멧 설정
		SimpleDateFormat dateFormat 
			= new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
		String strToday = dateFormat.format(dateToday);
		System.out.println(strToday);
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(dateToday);
//		Date newDate = new Date();
//		System.out.println(newDate);
		
		// 2. Calendar 클래스 사용
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday);
		System.out.println(calToday.getTime());
		
		// 날짜 포멧 적용
		strToday = dateFormat.format(calToday.getTime());
		System.out.println(strToday);
		
		
		// 3. System 클래스 사용
		// 1970년 1월 1일부터 현재까지의 경과된 시간을 
		// 밀리초 단위로 리턴
		System.out.println(System.currentTimeMillis());
		strToday = dateFormat.format(System.currentTimeMillis());
		System.out.println(strToday);
		
		// .format() 안에 long 타입 정수를 입력하면
		// 1970년 1월 1일 기준으로 해당 millSec가 지난 날짜로 인식 
		strToday = dateFormat.format(1647493941095L);
		System.out.println(strToday);
		
		System.out.println("\n==============================\n");
		
		// 다양한 날짜 타입 만들기
		// ApiQuestion 에서 함..
		
		System.out.println("\n==============================\n");
		
		// 날짜(타입) <-> 문자열(타입) 바꾸기
		String strTomorrow = "2022-03-18 14:23:22";
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// .parse 문자열을 Date 타입으로 변환
		Date dateTomorrow = sdf.parse(strTomorrow);
		// 해당 문자열 날짜로 세팅된 Date 객체 생성
		System.out.println(dateTomorrow);
		
		String strTime = "11:20:33";
		sdf = new SimpleDateFormat("HH:mm:ss");
		Date dateTime = sdf.parse(strTime);
		System.out.println(dateTime);
		// 문자열에 포함되어 있지 않은 연,월,일은
		// 기본값인 1970년 1월 1일로 되어있다.
		
		String strYear = "2022.03.17";
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date dateYear = sdf.parse(strYear);
		System.out.println(dateYear);
		// 문자열에 포함되어 있지 않은 시,분,초,밀리초는
		// 기본값인 0으로 되어있다.
		
		System.out.println("\n==============================\n");
		
		// 날짜 세팅하기
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		// 월(Month)의 경우 1월이 0, 2월이 1 , ... 으로 되어있다.
		cal.set(2021, 2, 14, 12, 30, 21);
		String printCal = sdf.format(cal.getTime());
		System.out.println(printCal);
		
		// Date 타입을 Calendar로 변환
		Date temp = new Date();
		cal.setTime(temp);
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println("\n================================\n");
		
		// 날짜 연산
		long diffMillSec = dateTime.getTime() - dateYear.getTime();
		System.out.println(diffMillSec);
		
		long diffSec = diffMillSec / 1000;
		System.out.println(diffSec);
		
		long diffMin = diffSec / 60;
		System.out.println(diffMin);
		
		long diffHour = diffMin / 60;
		System.out.println(diffHour);
		
		long diffDay = diffHour / 24;
		System.out.println(diffDay);
		
		long diffYear = diffDay / 365;
		System.out.println(diffYear);
		
		long diff = diffMillSec / (1000 * 60 * 60 * 24);
		System.out.println(diff);
		
		// Calendar 사용
		// 한 날짜를 기준으로 날짜를 더하거나 뺄 때 유용
		
		// Calendar 현재 날짜+시간으로 초기화 
		cal.setTime(new Date());
		System.out.println(sdf.format(cal.getTime()));
		
		// 3일 뒤
		cal.add(Calendar.DATE, 3);
		System.out.println(sdf.format(cal.getTime()));
		
		// 11달 뒤
		cal.add(Calendar.MONTH, 11);
		System.out.println(sdf.format(cal.getTime()));
		
		// 7일 전
		cal.add(Calendar.DATE, -7);
		System.out.println(sdf.format(cal.getTime()));
		
		// Calendar를 Date로 변환
		Date dateCal = cal.getTime();
		System.out.println(sdf.format(dateCal));
		
		System.out.println("\n===============================\n");
	
		// Calendar의 getInstance()는 싱글톤이 아니라
		// 새로운 Calendar 객체를 생성한다. ㅎㄷㄷ
		Calendar calTest = Calendar.getInstance();
		// new Date() 처럼 실행될 당시의 시간이 세팅된 객체가 생성됨
		System.out.println(sdf.format(calTest.getTime()));
		
		calTest.add(Calendar.DATE, 1);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// 요약: Window - Preferences - Java - Code Style 
		// - Code Templates - Code - Method body 에서 
		// Edit 후 주석 부분 제거. 
		// 바로 아래 Constructor body와 Catch block body도 똑같이
		
		System.out.println(sdf.format(calTest.getTime()));
		Calendar calTest2 = Calendar.getInstance();
		System.out.println(sdf.format(calTest2.getTime()));
		System.out.println(calTest.hashCode());
		System.out.println(calTest2.hashCode());
		
		System.out.println("\n=================================\n");
		
		// 달력 만들기
		int year = 2022;
		int month = 4;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		System.out.println(sdf.format(calendar.getTime()));
		
		// 해당 달의 마지막 일(DATE)을 리턴합니다.
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		// 해당 달의 시작 요일 (1: 일요일, 2: 월요일, ... 7: 토요일)
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);
		
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int currentDay = 1;
		
		for(int i = 1; i <= 42; i++) {
			if(i >= startDay) {
				System.out.printf("%2d\t", currentDay);
				currentDay++;
				
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
		
	}
}
