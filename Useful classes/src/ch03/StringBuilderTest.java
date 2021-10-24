package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");
        
        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android);
/*
StringBuilder(Buffer)�� ����Ϸ��� new �����ڸ� �̿��� ���ο� ��ü�� �����ؾ��Ѵ�.

StringBuilder(Buffer) Ŭ������ append �޼ҵ�.
���� ���ڿ��� ���ʿ� ���ڿ��� �߰��ϴ� ������Ѵ�.
 
*/
        System.out.println(System.identityHashCode(buffer));
/*
���ڿ��� ������ javaandroid�� ��µ�����, hash ���� ������ �ʾҴ�.
������ �ν��Ͻ���� ��.

 */
        java = buffer.toString();
        System.out.println(java);
}
}
