package example;

public class _07AccountTest {


//		  public static void main(String[] args) {
//		    // 객체 생성
//		    Account a = new Account("123-45", 10000);
//		    Account b = new Account("567-89", 10000);
//		    
//		    // 송금: 3천원씩 a 계좌에서 -> b계좌로!
//		    boolean result = true;
//		    while (result) {
//		      result = a.transfer(b, 3000);
//		    }
//		    
//		    // 결과 출력
//		    System.out.println(a.toString());
//		    System.out.println(b.toString());
//		    
//		  }
//		}
//
//		class Account {
//		  String num;  // 계좌번호
//		  int balance; // 잔액
//		  
//		  public Account(String str, int i) {
//		    num = str; //String
//		    balance = i;
//		  }
//		  
//		  public String toString() {
//		    return String.format("Account { num: %s, balance: %d }", num, balance);
//		  }
//		  
//		  public boolean transfer(Account target, int amount) {
//		    if (amount < 0) {
//		      return false;
//		    }
//		    
//		    else {
//		    /* 2. 현재 잔액에서 송금액을 이체대상 계좌로 전달하세요. */
//		    //balance -= ??
//		    // target.balance += ??;
//		    return true;
//		    }
//		  }
//		}
	
	public static void main(String[] args) {
        // 객체 생성
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);

        // 송금: 3천원씩 a 계좌에서 -> b계좌로!
        boolean result = true;
        while (result) {
            result = a.transfer(b, 3000);
        }

        // 결과 출력
        System.out.println(a.toString());
        System.out.println(b.toString());

    }
}

class Account {
    String num;  // 계좌번호
    int balance; // 잔액

    public Account(String str, int i) {
        num = str; //String
        balance = i;
    }

    public String toString() {
        return String.format("Account { num: %s, balance: %d }", num, balance);
    }

    public boolean transfer(Account target, int amount) {
        if (amount < 0) {
            return false;
        } else {
            /* 2. 현재 잔액에서 송금액을 이체대상 계좌로 전달하세요. */
            //balance -= ??
            // target.balance += ??;
            if(balance >= amount){
                balance -= amount;
                target.balance += amount;
                return true;
            } else {
                return false;
            }
        }
    }
}

	
		  