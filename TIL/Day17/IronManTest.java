
public class IronManTest {
    public static void main(String[] args) {
        IronMan ironman1 = IronMan.getIm();
        IronMan ironman2 = IronMan.getIm();
        
        ironman1.info();
        ironman2.info();
        
        System.out.println(ironman1);
        System.out.println(ironman2);
    }
	
}
