import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CMain4 {
    public static void main(String[] args) {
        
        //set �迭 : ����������, �ߺ� �ڵ�����, ��������
        
    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(10);
    hs.add(20);
    hs.add(30);
    
    //����Ϸ��� Set -> List�� �ٲ㼭 ���
    ArrayList<Integer> al = new ArrayList<Integer>(hs);
    
    System.out.println(hs.size());
    System.out.println("-------------");
    for(Integer i : hs) {
        System.out.println(i);
    }
    System.out.println(al.get(0));
    
    HashSet<Student> students = new HashSet<Student>();
    students.add(new Student("�ο�", 20, 10, 10, 10));
    students.add(new Student("�ָ�", 30, 20, 20, 20));
    students.add(new Student("�ָ�", 30, 20, 20, 20));
    //�����͸� ���� ���� ���� �ٸ� ���(��������)
    
    System.out.println(students.size());
    
    Student s = new Student("����", 20, 30, 50, 80);
    
    System.out.println("--------------------------");
    //�ζ�
    Random r = new Random();
    HashSet<Integer> lotto = new HashSet<Integer>();
    
    //hashset�� �ߺ��Ǵ� �ڷḦ �ڵ����� �������ֱ� ������ ���� �ߺ��� ���ڰ� ������ �����ϰ� ��� �ݺ����� ���ư���.
    //hashset ����� 6���� �Ǹ� �ݺ����� �������´�.
    while(true) {
        lotto.add(r.nextInt(45) + 1);
        if(lotto.size() == 6) {
            break;
        }
    }
    
    //���� �ζǸ� �ٲ㼭 ��̸���Ʈ��
    ArrayList<Integer> lotto2 = new ArrayList<Integer>(lotto);
    for (Integer i : lotto2) {
        System.out.print(i + " ");
    }
    }
}
