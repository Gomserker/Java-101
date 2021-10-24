/*
Generic(�Ϲ�ȭ) Programming.

1. Generic Data type?

Ŭ�������� ����ϴ� ������ �ڷ����� �������� ���ɼ��� �ְ�,
method�� ������ ���, Ŭ������ �ڷ����� Ư������ �ʰ�
���� �ش� Ŭ������ ����� �� ������ �� �ֵ��� ����.
�ڷ����� ��ȯ�� �����Ϸ��� �����ϹǷ� �������̴�.
�Ʒ� ���õ��� Generic Ÿ���� ������� �������� ����.
 */


//��ᰡ Powder�϶�,

class ThreeDPrinter1 {
    private Powder material;
    
    public void setMaterial(Powder material) {
        this.material = material;
    }
    
    public Powder getMaterial() {
        return material;
    }
}

// ��ᰡ Plastic�϶�,
class ThreeDPrinter2{
    private Plastic material;
    
    public void setMaterial(Plastic material) {
        this.material = material;
    }
    
    public Plastic getMaterial() {
        return material;
    }
    
}


 class ThreeDPrinter3 {
    private Object material;
    
    public void setMaterial(Object material) {
        this.material = material;
    }
    
    public Object getMaterial() {
        return material;
    }
    
    ThreeDPrinter printer = new ThreeDPrinter();
    
    Powder powder = new Powder();
    
    
//    Powder p = (Powder)printer.getMaterial();
}
 
 
 public class ThreeDPrinterTest{
     public static void main(String[] args) {
         
         Powder powder = new Powder();
         ThreeDPrinter3 printer = new ThreeDPrinter3();
//       �����Ϳ� ��Ḧ ����
         printer.setMaterial(powder);
         
//       printer.getMaterial�� ��µǴ� ���� Object Ŭ������ ���̹Ƿ�,
//       Powder�� ��� Powder Ŭ������ �ٿ�ĳ������ ������Ѵ�.
//       Generic�� ���� ������ ������ �����ϰ� ��ƴ�.
         
         Powder p = (Powder)printer.getMaterial();
     }
 }
 
