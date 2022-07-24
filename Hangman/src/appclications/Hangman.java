package appclications;
import java.util.Scanner;

/*
 * 전체 행맨 게임을 실행하는 클래스
 */
public class Hangman {
	
	private boolean running = true;
	// private RandomWord word = new RandomWord(); //선생님 
	// private RandomWord2 word2 = new RandomWord2();// 혼자해보기
	private RandomWord3 word3 = new RandomWord3(); //출력보고 다시해본거1
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		do {
			displayWord();      //화면에 단어표시(완료)
			getUserInput();	    //입력받음 (스캐너 필요 )
			checkUserInput();	//맞는지 체크 => 맞을시 running=false			
		} while (running);
	}
 
	
	//메서드 , RandomWord2 
	public void displayWord() {	 
	//언더바 
		System.out.println("word.toString()언더바 :" + word3.toString()); //랜덤으로 선택된 단어		
	}
	
	//사용자가 입력한 걸 받기
	public void getUserInput() {
       
		System.out.print("한 문자 입력: ");
		String guess = scanner.nextLine();
	    // 문자열에서 빼낸 한 문자를 랜덤워드 메서드 addGuess에 입력
		// 스캐너에입력한 글자, 첫번째 글자만 보여짐 
		word3.addGuess(guess.charAt(0));
		System.out.println("유저가 입력한 글자 보여주기 :" + guess.charAt(0));
		//사용자가 입력한거 보여줌
	}

	
//체크하기
	public void checkUserInput() {
		if(word3.isComplete()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : " + word3.toString());
			running = false; //반복문 종료
		}
	}
	
	public void close() {
		scanner.close(); //게임 종료시 스캐너 닫기
	}

}