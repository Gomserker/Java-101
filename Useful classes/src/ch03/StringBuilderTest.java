package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");
        
        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android);
/*
StringBuilder(Buffer)를 사용하려면 new 연산자를 이용해 새로운 객체를 생성해야한다.

StringBuilder(Buffer) 클래스의 append 메소드.
기존 문자열의 뒤쪽에 문자열을 추가하는 기능을한다.
 
*/
        System.out.println(System.identityHashCode(buffer));
/*
문자열이 합쳐진 javaandroid가 출력되지만, hash 값은 변하지 않았다.
동일한 인스턴스라는 뜻.

 */
        java = buffer.toString();
        System.out.println(java);
}
}
