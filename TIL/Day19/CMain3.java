import java.util.ArrayList;
import java.util.Comparator;

public class CMain3 {
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("asd");
        
        ArrayList<Student> students = new ArrayList<Student>();
//      Student 클래스로 만들어진 객체를 ArrayList 안에 넣겠다.
        
        Student s1 = new Student();
        s1.setName("Mark");
        s1.setAge(30);
        s1.setEng(27);
        s1.setKor(43);
        s1.setJp(100);
        students.add(s1);
        
       students.add(new Student("Jake", 27, 50, 60, 90));
       students.add(new Student("Anna", 24, 53, 73, 90));
       students.add(new Student("Mary", 22, 51, 63, 84));
       students.add(new Student("Elizabeth", 28, 100, 100, 100));
       students.add(new Student("Elias", 11, 34, 48, 52));
       students.add(new Student("Matt", 19, 94, 86, 77));
       
       //학생 수를 구해달라
       System.out.println(students.size());
       
       //2번째 학생의 국어점수
       System.out.println(students.get(1).getKor());
       System.out.println("---------------------");
       //3번째 학생의 이름
       System.out.println(students.get(2).getName());
       //7번째 학생의 일본어점수
       System.out.println(students.get(6).getJp());
       //5번째 학생의 이름과 나이
       System.out.println(students.get(5).getName() + "," + students.get(5).getAge());
       //6번째 학생의 영,국,일 평균
       int avg = ((students.get(5).getEng()+students.get(5).getKor()+students.get(5).getJp()) / 3);
       System.out.println(avg);
       System.out.println("-------------------");
       
//     이름 가나다순 정렬 
       
       Comparator<Student> compare = new Comparator<Student>() {
           
           @Override
           public int compare(Student o1, Student o2) {
               String o1Name = o1.getName();
               String o2Name = o2.getName();
               return o1Name.compareTo(o2Name);
           }
    };
    
    students.sort(compare);
    for (Student s:students) {
        s.info();
        System.out.println("=======================");
    }
    
//    나이순 정렬
    
//    기본형 int를 참조형 Interger로 바꿔야 메소드 사용 가능
    Comparator<Student> d = new Comparator<Student>() {
      
        @Override
        public int compare(Student o1, Student o2) {
            Integer o1Age = o1.getAge();
            Integer o2Age = o2.getAge();
            return o1Age.compareTo(o2Age);
        }
    };
    
    students.sort(d);
    for (Student s:students) {
        s.info();
        System.out.println("-----------------");
    }
       
    //.reversed() 거꾸로 정렬하는 메소드   
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    
    Comparator<Student> e = new Comparator<Student>() {
      
        @Override
        public int compare(Student o1, Student o2) {
            Double o1Avg = (o1.getEng() + o1.getKor() + o1.getJp()) / 3.0;
            Double o2Avg = (o2.getEng() + o2.getKor() + o2.getJp()) / 3.0;
            return o2Avg.compareTo(o1Avg);
        }  
    };
    
      students.sort(e); 
//    students.sort(e.reversed());
    for (Student s : students) {
        s.info();
        System.out.println("/////////////////////////////////");
    }
       System.out.println("==============1등과 꼴등만 내놔라============");
       
       //1등 학생의 전체 정보 출력
       System.out.println("1등 학생의 정보");
       students.get(0).info();
       
       System.out.println("----------------------");
//     students.get(6).info(); 마지막은 이렇게 인덱스 번호로 접근하면 안된다. 사람이 추가되면 어떡하려고?
       students.get(students.size()-1).info();
    }
}
