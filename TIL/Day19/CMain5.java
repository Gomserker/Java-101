import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CMain5 {
    public static void main(String[] args) {
        //Map 계열 : 가변사이즈, 순서시스템x, 키-값을 쌍으로 이루는 형태
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        
        hashmap.put("탄수화물", 50);
        hashmap.put("단백질", 500);
        hashmap.put("지방", 5000);
        
        System.out.println(hashmap.get("단백질"));
        System.out.println("-----------------------");
        
        // 찾을 학생 이름 하나만 쓰면 내용을 볼 수 있게
        
        //학생을 뭘로 찾을 것인가?
        //학생을 번호로 찾으면 ArrayList가 적절
        //이름으로 찾으면 HashMap이 적절
        
        //주력은 ArrayList 하지만 지금처럼 특수한 목적일때 Map을 사용
        
        HashMap<String, Student> students = new HashMap<String, Student>();
        
        students.put("준석", new Student("준석", 20, 10, 20, 30));
        students.put("지호", new Student("지호", 30, 30, 30, 30));
        
        System.out.println(students.get("준석").getName());
        System.out.println("--------------------------");
        //누구 찍는건 좋은데 누가 있는지를 보고 싶다.
        //키 값만 빼기. 누가 있는지 확인용
        
        Set<String> sNames = students.keySet();
        ArrayList<String> sNames2 = new ArrayList<String>(sNames);
        
        for (String s : sNames2) {
            System.out.println(s);
        }
        System.out.println("--------------------------");
        
        Scanner input = new Scanner(System.in);
        System.out.println("누구 : ");
        String name = input.next();
        
        System.out.println(students.get(name));
        students.get(name).info();
    }
}
