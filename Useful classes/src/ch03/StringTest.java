package ch03;

/*
 1. String 클래스 사용 방법
 String str1 = new String("abc"); <- 힙에 잡히는 것
 String str2 = "abc"; <- 상수풀에 잡히는 것
 
 Heap 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수풀의 문자열은 모두 같은 주소 값을 가진다.
 - 한 번 생성된 String은 불변이다. 따라서, String을 연결하면 기존의 String에 연결되는게 아니라,
 두개가 합쳐진 새로운 문자열이 생성되기 때문에 메모리 낭비가 발생할 수 있다.
 */
public class StringTest {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        
        System.out.println(str1 == str2);
        
        String str3 = "abc";
        String str4 = "abc";
        
        System.out.println(str3 == str4);
    }
}
