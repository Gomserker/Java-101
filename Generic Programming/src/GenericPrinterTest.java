
public class GenericPrinterTest {
    public static void main(String[] args) {
        
        
        Powder powder = new Powder();
//      ���⼭ � �ڷ����� ���� �Է��ؾ� �Ѵ�.
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);
        
//      ����ȯ�� ���� �ʾƵ� �Ǵ� ������, GenericPrinter.java
//      �� �ִ� T�� �����Ϸ��� �ڵ����� T�� Powder�� �ٲ��ش�.
        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());
    }
}
