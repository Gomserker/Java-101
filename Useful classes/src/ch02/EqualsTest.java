package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Student std1 = new Student(100, "lee");
        Student std2 = new Student(100, "lee");
//      Student std3 = std1;
        
        System.out.println(std1 == std2);
        /*
         equals() 메소드를 재정의하기 전의 결과는
         std1 == std2는
         당연히 false로 나온다. 주소 값이 다르기 때문에
         하지만 std3에 std1의 주소값을 대입하고
         std1 == std3를 출력하면 true가 출력된다.
         */
        
        
        /*
         Student 클래스에서 논리적으로 같다면 true를 반환하도록 equals() 메소드를 재정의 했기 때문에 
         아래 equals() 문의 결과로 true가 출력된다.
         */
        System.out.println(std1.equals(std2));
        System.out.println("-------------------------");
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
        
//        String str1 = new String("abc");
//        String str2 = new String("abc");
        System.out.println("-------------------------");
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));
//        System.out.println("-------------------------");
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//        System.out.println("-------------------------");
//        Integer i = 100;
//        System.out.println(i.hashCode());
        
        std1.setStudentName("Kim");
        Student copyStudent = (Student)std1.clone();
        
        System.out.println(copyStudent);
    }
}
