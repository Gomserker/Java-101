/*
자료형 매개변수 T(Type Parameter)

이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정한다. 
but, static 변수는 사용할 수 없다.
(E : Element, K : key, V : Value 등 다양하게 사용가능)
*/

/*
<> 안에다가 실제로 사용할 자료형을 넣으면 된다.
 */
public class GenericPrinter<T> {
    
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
    
    public String toString() {
        return material.toString();
    }
}