package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Student std1 = new Student(100, "lee");
        Student std2 = new Student(100, "lee");
//      Student std3 = std1;
        
        System.out.println(std1 == std2);
        /*
         equals() �޼ҵ带 �������ϱ� ���� �����
         std1 == std2��
         �翬�� false�� ���´�. �ּ� ���� �ٸ��� ������
         ������ std3�� std1�� �ּҰ��� �����ϰ�
         std1 == std3�� ����ϸ� true�� ��µȴ�.
         */
        
        
        /*
         Student Ŭ�������� �������� ���ٸ� true�� ��ȯ�ϵ��� equals() �޼ҵ带 ������ �߱� ������ 
         �Ʒ� equals() ���� ����� true�� ��µȴ�.
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
