import java.util.ArrayList;

public class CMain2 {
    public static void main(String[] args) {

//    List�迭 : ���� ������ �迭 - ���� ���� ���
        ArrayList al = new ArrayList();

        al.add(1);
        al.add(2);
        al.add(33.1);
        al.add("��"); // �ڷ��� ��� �� ���� ������ �׷��� ������ �ʴ´�.

        System.out.println(al.size());
        System.out.println("-----------------------");

//       <Ŭ������> : generic -> �ڷ��� Ÿ���� �����ϴ� �� ex) <String> ��Ʈ�� Ÿ�Ը� ���� �� �ִ�. <int> int Ÿ�Ը� ���� �� �ִ�.
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("1asdf");
        al2.add("abc");
        al2.add("abcd");
        al2.add("abcde");
        al2.add("abcdef");
        al2.add("abcdefg");

        System.out.println(al2.size());
        // al2.length
        System.out.println(al2.get(1)); // ArrayList�� ȣ���
        // a12[1]

        for (String s : al2) {
            System.out.println(s);
        }

        System.out.println("------------------");

        al2.add("��"); // ���� ��𼭳� �߰� ����
        al2.add(0, "�����ֱ�"); // ��ġ ���� ����
        al2.set(1, "�ٽ� �����ֱ�"); // ��ü ����(Ư�� ��ġ�� �ڷ� ���� ����)
        al2.remove(3); // Ư�� ��ġ�� �ִ°� ������ ����
//        for (int i = 0; i < al2.length; i++) {
//        	
//        }
//        ArrayList�� Array�� �޼ҵ� ���� ���ݾ� �ٸ���.
        for (int i = 0; i < al2.size(); i++) {
            System.out.println(al2.get(i));
        }
        System.out.println("-----------------------");
        // al3 ���� 10, 20�� �ְ� �� ���
        // insert "Dimensions" to complete reference type(���� Ÿ��)
        // generic �ȿ��� �⺻�� Ÿ���� �ü� ����(int, double ��)
        ArrayList<Integer> al3 = new ArrayList<Integer>();

        al3.add(10);
        al3.add(20);

        for (Integer ii : al3) {
            System.out.println(ii);
        }
    }
}
