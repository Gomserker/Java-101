//ID와 PW를 입력받는 로그인 시스템을 구현하시오.
//임의로 생성한 ID와 PW는 다음과 같다.
//ID : gom
//PW : 13579
//ID가 틀리면 "id error"를 출력
//PW가 틀리면 "pw error"를 출력
//둘 다 맞으면 "Log in"을 출력

//Test Case 1
//ID 입력 : asdf
//id error

//Test Case 2
//ID 입력 : gom
//PW 입력 : 123
//pw error

//Test Case 3
//ID 입력 : gom
//PW 입력 : 13579
//Log in

import java.util.Scanner;

public class LoginTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String actualId = "gom";
    String actualPw = "13579";
    
    System.out.print("ID 입력: ");
    String id = input.next();
    
    if (id.equals(actualId)) {
      System.out.print("PW 입력: ");
      String pw = input.next();
      
      if (pw.equals(actualPw)) {
        System.out.print("Log in");
      } else {
        System.out.print("pw error");
      }
    } else {
      System.out.print("id error");
    }
  }
}
    
