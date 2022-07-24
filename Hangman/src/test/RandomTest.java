package test;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		// 랜덤으로 출력,

		Random random = new Random();
		String[] words = { "펭수", "호랑이", "사자", "고양이", "강아지", "하마" };
		
		for(int i = 0; i < words.length; i++) {
			int randomIndex = random.nextInt(words.length);
			System.out.print(words[randomIndex]);
			System.out.print(" ");
		}

	}
}
