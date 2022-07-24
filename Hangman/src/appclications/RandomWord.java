package appclications;

import java.util.Random;

/* 랜덤 단어 만드는 사이트
 * https://randomwordgenerator.com/
 * https://www.browserling.com/tools/newlines-to-spaces
 */
/*
 * 랜덤 단어를 생성해주는 클래스
 */
public class RandomWord {

	private String books = "politics priority cigarette comparison obligation supermarket homework collection marriage girlfriend contribution significance committee activity departure relationship attention medicine presentation importance inspection ambition resolution assistance preparation competition conversation independence secretary baseball";
	private String[] words = books.split(" "); // 스페이스로 단어들을 분리해서 배열
	private Random random = new Random();
	private String selectWord; //랜덤으로 선택된 단어 
	private char[] characters;
	
	

	
	/* 생성자로 생성시 단어가 선택됨 */
	// 클래스이름이 RandomWord
	public RandomWord() {
		selectWord = words[random.nextInt(words.length)];//단어
		characters = new char[selectWord.length()]; //단어길이
		
	}


	/* 단어배열 words에 있는 모든 단어 출력 */
//	public void getWords() {
//		for (String word : words) {
//			System.out.println(word);
//		}
//	}

	/* 선택된 한개의 단어 리턴 */
	public String toString() {
		String text = "";
		for (char c : characters) {
			text += (c == '\u0000') ? '_' : c;//공백이면 _ 를 보여주고, 아니면 c =characters
			text += ' ';
		}
		System.out.println(selectWord); //임시로 단어를 보여줌
		return text;
	}
	

	/* 입력된 문자와 같은 문자가 있는지 확인해서 문자배열 characters에 입력 */
	public void addGuess(char c) {
		// 선택된 문자열 전체를 확인,문자길이
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}

	public boolean isComplete() {
		// 만약에 전체 characters에서 공백'\u0000'이 없으면 종료
		for(char c: characters) {
			if(c == '\u0000') {
				return false; //아직 맞출 문자 있음
			}
		}
		//공백이 하나도 없으면 내려옴
		return true; //전부 체크해서 완료
	}

}