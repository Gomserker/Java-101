/*
Generic(일반화) Programming.

1. Generic Data type?

클래스에서 사용하는 변수의 자료형이 여러개일 가능성이 있고,
method는 동일한 경우, 클래스의 자료형을 특정하지 않고
추후 해당 클래스를 사용할 때 지정할 수 있도록 선언.
자료형의 변환은 컴파일러가 검증하므로 안정적이다.
아래 예시들은 Generic 타입을 사용하지 않을때의 예시.
 */


//재료가 Powder일때,

class ThreeDPrinter1 {
    private Powder material;
    
    public void setMaterial(Powder material) {
        this.material = material;
    }
    
    public Powder getMaterial() {
        return material;
    }
}

// 재료가 Plastic일때,
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
//       프린터에 재료를 세팅
         printer.setMaterial(powder);
         
//       printer.getMaterial로 출력되는 것은 Object 클래스의 값이므로,
//       Powder의 경우 Powder 클래스로 다운캐스팅을 해줘야한다.
//       Generic을 쓰지 않을땐 굉장히 복잡하고 어렵다.
         
         Powder p = (Powder)printer.getMaterial();
     }
 }
 
