import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CMain5 {
    public static void main(String[] args) {
        //Map �迭 : ����������, �����ý���x, Ű-���� ������ �̷�� ����
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        
        hashmap.put("ź��ȭ��", 50);
        hashmap.put("�ܹ���", 500);
        hashmap.put("����", 5000);
        
        System.out.println(hashmap.get("�ܹ���"));
        System.out.println("-----------------------");
        
        // ã�� �л� �̸� �ϳ��� ���� ������ �� �� �ְ�
        
        //�л��� ���� ã�� ���ΰ�?
        //�л��� ��ȣ�� ã���� ArrayList�� ����
        //�̸����� ã���� HashMap�� ����
        
        //�ַ��� ArrayList ������ ����ó�� Ư���� �����϶� Map�� ���
        
        HashMap<String, Student> students = new HashMap<String, Student>();
        
        students.put("�ؼ�", new Student("�ؼ�", 20, 10, 20, 30));
        students.put("��ȣ", new Student("��ȣ", 30, 30, 30, 30));
        
        System.out.println(students.get("�ؼ�").getName());
        System.out.println("--------------------------");
        //���� ��°� ������ ���� �ִ����� ���� �ʹ�.
        //Ű ���� ����. ���� �ִ��� Ȯ�ο�
        
        Set<String> sNames = students.keySet();
        ArrayList<String> sNames2 = new ArrayList<String>(sNames);
        
        for (String s : sNames2) {
            System.out.println(s);
        }
        System.out.println("--------------------------");
        
        Scanner input = new Scanner(System.in);
        System.out.println("���� : ");
        String name = input.next();
        
        System.out.println(students.get(name));
        students.get(name).info();
    }
}
