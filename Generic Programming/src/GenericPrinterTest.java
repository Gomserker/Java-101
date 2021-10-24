
public class GenericPrinterTest {
    public static void main(String[] args) {
        
        
        Powder powder = new Powder();
//      여기서 어떤 자료형을 쓸지 입력해야 한다.
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);
        
//      형변환을 하지 않아도 되는 이유는, GenericPrinter.java
//      에 있는 T를 컴파일러가 자동으로 T를 Powder로 바꿔준다.
        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());
    }
}
