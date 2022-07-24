package appclications;

import java.util.Random;

public class RandomWord3 {

	
	private String books = "politics priority cigarette comparison obligation supermarket homework collection marriage girlfriend contribution significance committee activity departure relationship attention medicine presentation importance inspection ambition resolution assistance preparation competition conversation independence secretary baseball";
	private String[] words = books.split(" ");
	private Random random = new Random();
	private String selectWord;
	private char[] characters; //한개의 문자를 확인하고 사용해야하니까  
	
	//생성자로 생성시 단어가 선택
	public RandomWord3() {
		
    //랜덤으로변수에 넣은 글자를 다 돌린다.
	selectWord = words[random.nextInt(words.length)];
     //글자 하나가 선택되면그 글자의 길이를가져온다.
	characters = new char [selectWord.length()];
    
	System.out.println("selectWord : 이건랜덤으로 나오는 " + selectWord);
    System.out.println("characters : 한글자씩 나중에 확인해야하니까 " + selectWord);
	}
	
	/*단어배열 words에 있는모든 단어 출력 */
//	public void getWords() {
//		//반복문으로돌리기. word2는(랜덤 ) 행맨에서 들고 옴,words는 단어 
//		for(String word2: words) {		
//	    System.out.println("word2 :" + word2);
//		}
//		
//	}
	
	
	/* 선택된 한 개의 단어 리턴  */
	public String toString() {
		String text = "";//	리턴값을 받아야되니까빈값으로
		//String text ="이름" + name + "키 " +height; 
		for(char c : characters) {
			text += (c == '\u0000')? '_' : c;
			text += ' ';
		}
		System.out.println("선택된 한 개의 단어 리턴: 미리보여주는거 " + selectWord);
		return text;
	}
	
	
	/* 입력된 문자와 같은 문자가 있는지 확인  */
    public void addGuess(char c) {
	for(int i = 0; i < selectWord.length(); i++) {
		if( c == selectWord.charAt(i)) {
			characters[i] = c;
		}
		//랜덤으로 나온 문자와 사용자가 입력한 문자가 같은게 있는지 보여지는지 확인하는 메서드
		System.out.println("addGuess 메서드에 있는 매개변수 c: " + characters[i]);
	}
	
}

    
  
public boolean isComplete() {
	//만약에 전체 characters에서 공백 '\u0000'이 없으면 종료
	for(char c : characters) {
		if(c == '\u0000') {
			return false;
		}
	}
	return true;
}
	
	
 }

