package ch03;

/*
 1. String Ŭ���� ��� ���
 String str1 = new String("abc"); <- ���� ������ ��
 String str2 = "abc"; <- ���Ǯ�� ������ ��
 
 Heap �޸𸮴� �����ɶ����� �ٸ� �ּ� ���� ��������, ���Ǯ�� ���ڿ��� ��� ���� �ּ� ���� ������.
 - �� �� ������ String�� �Һ��̴�. ����, String�� �����ϸ� ������ String�� ����Ǵ°� �ƴ϶�,
 �ΰ��� ������ ���ο� ���ڿ��� �����Ǳ� ������ �޸� ���� �߻��� �� �ִ�.
 */
public class StringTest {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        
        System.out.println(str1 == str2);
        
        String str3 = "abc";
        String str4 = "abc";
        
        System.out.println(str3 == str4);
    }
}
