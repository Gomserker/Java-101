import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CMain4 {
    public static void main(String[] args) {
        
        //set 계열 : 가변사이즈, 중복 자동제거, 순서랜덤
        
    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(10);
    hs.add(20);
    hs.add(30);
    
    //사용하려면 Set -> List로 바꿔서 사용
    ArrayList<Integer> al = new ArrayList<Integer>(hs);
    
    System.out.println(hs.size());
    System.out.println("-------------");
    for(Integer i : hs) {
        System.out.println(i);
    }
    System.out.println(al.get(0));
    
    HashSet<Student> students = new HashSet<Student>();
    students.add(new Student("민우", 20, 10, 10, 10));
    students.add(new Student("솔리", 30, 20, 20, 20));
    students.add(new Student("솔리", 30, 20, 20, 20));
    //데이터만 같고 둘은 전혀 다른 사람(동명이인)
    
    System.out.println(students.size());
    
    Student s = new Student("혜수", 20, 30, 50, 80);
    
    System.out.println("--------------------------");
    //로또
    Random r = new Random();
    HashSet<Integer> lotto = new HashSet<Integer>();
    
    //hashset은 중복되는 자료를 자동으로 제거해주기 때문에 만약 중복된 숫자가 나오면 제거하고 계속 반복문이 돌아간다.
    //hashset 사이즈가 6개가 되면 반복문을 빠져나온다.
    while(true) {
        lotto.add(r.nextInt(45) + 1);
        if(lotto.size() == 6) {
            break;
        }
    }
    
    //위에 로또를 바꿔서 어레이리스트로
    ArrayList<Integer> lotto2 = new ArrayList<Integer>(lotto);
    for (Integer i : lotto2) {
        System.out.print(i + " ");
    }
    }
}
