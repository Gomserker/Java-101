package ch03;

public class StringTest2 {
    public static void main(String[] args) {
        
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));
        
        java = java.concat(android);
        
/*
 String Ŭ������ concat �޼ҵ�.
 �� ���ڿ��� ��ġ�� �޼ҵ�.
 concat�� ����ϱ����� java�� ȣ���ϸ� java�� ��µ�����
 java.concat(android)�� �Է��ϰ� �ٽ� ����ϸ�
 javaandroid�� ��µȴ�.
 �� ��쿡 java�� android�� ��ģ ���ڿ��� �ν��Ͻ��� ���� �����Ѵ�.
 System.identifyHashCode�� ������� �� ������ Hash Ű ���� �ٸ��ٴ� �κп��� �̸� Ȯ���� �� �ִ�.
 �� ��쿣 �޸� ���� �߻��� �� �ֱ� ������, ���ڿ��� ������ �����ϰų� �����Ҷ���
 StringBuilder(���� ������)�� StringBuffer(��Ƽ������) Ŭ������ ����Ѵ�.
 */
        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }
}
