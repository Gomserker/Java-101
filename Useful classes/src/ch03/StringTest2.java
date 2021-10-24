package ch03;

public class StringTest2 {
    public static void main(String[] args) {
        
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));
        
        java = java.concat(android);
        
/*
 String 클래스의 concat 메소드.
 두 문자열을 합치는 메소드.
 concat을 사용하기전에 java를 호출하면 java가 출력되지만
 java.concat(android)를 입력하고 다시 출력하면
 javaandroid가 출력된다.
 이 경우에 java에 android를 합친 문자열의 인스턴스를 새로 생성한다.
 System.identifyHashCode를 사용했을 때 나오는 Hash 키 값이 다르다는 부분에서 이를 확인할 수 있다.
 이 경우엔 메모리 낭비가 발생할 수 있기 때문에, 문자열을 여러번 연결하거나 변경할때는
 StringBuilder(단일 쓰레드)와 StringBuffer(멀티쓰레드) 클래스를 사용한다.
 */
        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }
}
