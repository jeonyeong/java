package sumbmit4;

import java.util.ArrayList;
import java.util.Scanner;

import sumbmit4.model.MemberVO;
import sumbmit4.model.Word;
import sumbmit4.service.WordChainService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import lec09_class.school.Student;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class WordChainMain {

	public static void main(String[] args) {
		
		WordChainService service = WordChainService.getInstance();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("즐거운 끝말잇기 반갑습니다.");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
			System.out.print(">>> ");

			int select = 0;

			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}

			if (select == 1) {

				System.out.println("아이디를 입력해주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();

				MemberVO mem = service.getMem(id);
				ArrayList<Word> wordList = service.getWord();
				ArrayList<String> indexWordList = new ArrayList<String>();
				for (int i = 0; i < wordList.size(); i++) {
					indexWordList.add(wordList.get(i).getWord());

				}
				while (true) {
					if (mem.getPw().equals(pw)) {

						System.out.println(mem.getId() + "님으로 접속했습니다.");
						System.out.println("=============================");

						System.out.println("1. 끝말잇기 | 2. 랭킹 | 3. 로그아웃");
						System.out.print(">>> ");
						select = 0;
						select = Integer.parseInt(sc.nextLine());
						if (select == 3) {

							break;

						} else if (select == 1) {

							// TODO 1. 쿵쿵따 2. 랭킹 3. 로그아웃
							// 1. 쿵쿵따면 아래 로직 실행
							// 2. 랭킹이면 회원 목록가져와서, 승률순으로 정렬해서 보여줌
							// 3. 로그아웃시, 해당 mem 객체 정보 DB에 업데이트

							System.out.println("제시어 입니다.");
							int randomWord = (int) (Math.random() * wordList.size());
							System.out.println(">>> " + wordList.get(randomWord).getWord());
							String word = wordList.get(randomWord).getWord();

							while (true) {

								System.out.println("세글자 단어를 입력해주세요.");
								System.out.print(">>> ");
								String word2 = sc.nextLine();

								// 세글자 체크
								if (word2.length() != 3) {
									System.out.println("패배하셨습니다.");
									service.lose(mem);
									service.saveMem(mem);
									break;
								}

								String word2First = word2.substring(0, 1);
								String word2End = word2.substring(2, 3);
								String wordEnd = word.substring(2, 3);

								ArrayList<String> wordList2 = new ArrayList<String>();

								if (wordEnd.equals(word2First) && indexWordList.contains(word2)) {

									for (int i = 0; i < wordList.size(); i++) {
										String wordFirst = wordList.get(i).getWord().substring(0, 1);
										if (word2End.equals(wordFirst)) {
											wordList2.add(wordList.get(i).getWord());
										}
									}
									if (wordList2.size() == 0) {
										System.out.println("승리입니다");
										service.win(mem);
										service.saveMem(mem);
										break;
									}
									// TODO wordList2 의 size 확인 -> 0보다 커야 -> 0이면 사용자 승리로 끝을 냄
									// 사용자 승리
									// 사용자 승리, 패배시에 사용자 필드 변수에 승리, 패배 카운팅

									int randomWord2 = (int) (Math.random() * wordList2.size());
									System.out.println(">>> " + wordList2.get(randomWord2));
									word = wordList2.get(randomWord2);

								} else {
									// 사용자 패배
									System.out.println("끝이요");
									service.lose(mem);
									service.saveMem(mem);

									break;
								}
							}
						} else if (select == 2) {
							// TODO 랭킹

							// 버블 정렬
							ArrayList<MemberVO> mList = service.memList();
							for (int i = 0; i < mList.size(); i++) {
								boolean swapped = false;

								for (int j = 0; j < mList.size() - 1 - i; j++) {
									// 정렬 순서 바꾸기
									// 아래 if문 부등호만 바꾸면 끝
									int intRate = Integer.parseInt(mList.get(j).rate());
									int intRate2 = Integer.parseInt(mList.get(j + 1).rate());

									if (intRate < intRate2) {
										MemberVO temp = mList.get(j);
										mList.set(j, mList.get(j + 1));
										mList.set(j + 1, temp);
										swapped = true;
									}
								}

								if (swapped == false) {

									break;
								}

							}

							for (int i = 0; i < mList.size(); i++) {
								System.out.println(mList.get(i));
							}

						}

					}
				}
			} else if (select == 2) {
				// 회원가입
				System.out.println("아이디를 입력해주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();

				MemberVO mem = service.getMem(id);

				if (mem.getId() != null) {
					System.out.println("중복된 아이디 입니다.");
				} else {
					int resultCnt = service.registMem(id, pw);

					if (resultCnt > 0) {
						System.out.println("회원가입 완료");
					} else {
						System.out.println("오류가 발생했습니다.");
					}
				}

			} else if (select == 3) {
				System.out.println("종료합니다.");
				break;
			}
		}

	}
}
