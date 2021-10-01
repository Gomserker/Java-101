import java.util.ArrayList;

public class CMain2 {
    public static void main(String[] args) {

//    List계열 : 가변 사이즈 배열 - 가장 많이 사용
        ArrayList al = new ArrayList();

        al.add(1);
        al.add(2);
        al.add(33.1);
        al.add("ㅋ"); // 자료형 섞어서 쓸 수도 있지만 그렇게 쓰지는 않는다.

        System.out.println(al.size());
        System.out.println("-----------------------");

//       <클래스명> : generic -> 자료형 타입을 강제하는 것 ex) <String> 스트링 타입만 넣을 수 있다. <int> int 타입만 넣을 수 있다.
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("1asdf");
        al2.add("abc");
        al2.add("abcd");
        al2.add("abcde");
        al2.add("abcdef");
        al2.add("abcdefg");

        System.out.println(al2.size());
        // al2.length
        System.out.println(al2.get(1)); // ArrayList의 호출법
        // a12[1]

        for (String s : al2) {
            System.out.println(s);
        }

        System.out.println("------------------");

        al2.add("ㅎ"); // 언제 어디서나 추가 가능
        al2.add(0, "끼워넣기"); // 위치 지정 가능
        al2.set(1, "다시 끼워넣기"); // 대체 가능(특정 위치의 자료 변경 가능)
        al2.remove(3); // 특정 위치에 있는걸 삭제도 가능
//        for (int i = 0; i < al2.length; i++) {
//        	
//        }
//        ArrayList는 Array와 메소드 명이 조금씩 다르다.
        for (int i = 0; i < al2.size(); i++) {
            System.out.println(al2.get(i));
        }
        System.out.println("-----------------------");
        // al3 만들어서 10, 20을 넣고 다 출력
        // insert "Dimensions" to complete reference type(참조 타입)
        // generic 안에는 기본형 타입이 올수 없다(int, double 등)
        ArrayList<Integer> al3 = new ArrayList<Integer>();

        al3.add(10);
        al3.add(20);

        for (Integer ii : al3) {
            System.out.println(ii);
        }
    }
}
