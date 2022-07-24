package example;

public class _08HeroTest {
    public static void main(String[] args) {

    	
//    	  // 두 싸움꾼 객체 생성
//        Hero arthas = new Hero("아서스");
//        Hero leona = new Hero("레오나");
//        
//        // 격투 시작
//        Hero.battle(arthas, leona);
//      }
//    }
//
//    class Hero {
//      // 필드
//      String name;
//      int hp;
//      
//      // 생성자
//      public Hero(String str) {
//        name = str;
//        hp = 30;
//      }
//      
//      // 메소드(인스턴스 메소드)
//      public void punch(Hero enemy) {
//        /* 1.(1-10)사이 랜덤 데미지를 입혀 상대의 hp를 줄인다. */
//      }
//      
//      // 메소드(클래스 메소드)
//      public static void battle(Hero a, Hero b) {
//        /* 2. 전투를 시작한다. */
//    		boolean firstAttack = true; //firstAttack이 참이면 a가 펀치를 날린다.
//    		while(/*영웅의 hp가 남아있는 동안*/) {
//    			if(firstAttack) {				
//    				?.punch(?);
//    				System.out.printf("[%s]의 펀치%n", ?);			
//    				System.out.printf("%s: %d/30%n", ?, ?);
//
//    			} else {
//    				
//
//
//    			}
//    			firstAttack = !firstAttack;
//    		}
    		//
    		
    		
    		
    		
        // 두 싸움꾼 객체 생성
        Hero arthas = new Hero("아서스");
        Hero leona = new Hero("레오나");

        // 격투 시작
        Hero.battle(arthas, leona);
    }
}

class Hero {
    // 필드
    String name;
    int hp;

    // 생성자
    public Hero(String str) {
        name = str;
        hp = 30;
    }

    // 메소드(인스턴스 메소드)
    public void punch(Hero enemy) {
        /* 1.(1-10)사이 랜덤 데미지를 입혀 상대의 hp를 줄인다. */
        double ran = Math.random(); // 0이상 1미만
        int damage = (int)(ran*10)+1;
        enemy.hp = enemy.hp < damage ? 0 : enemy.hp - damage;
    }

    // 메소드(클래스 메소드)
    public static void battle(Hero a, Hero b) {
        /* 2. 전투를 시작한다. */

        boolean firstAttack = true; //firstAttack이 참이면 a가 펀치를 날린다.
        while(a.hp > 0 && b.hp > 0) {
            if(firstAttack) {
                a.punch(b);
                System.out.printf("%s의 남은 체력 %d \n",b.name, b.hp);
            } else {
                b.punch(a);
                System.out.printf("%s의 남은 체력 %d \n",a.name, a.hp);
            }
            firstAttack = !firstAttack;
        }
        System.out.println("==============================");
        System.out.printf("%s의 남은 체력 %d \n",a.name, a.hp);
        System.out.printf("%s의 남은 체력 %d \n",b.name, b.hp);
    }
}