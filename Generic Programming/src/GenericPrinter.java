/*
�ڷ��� �Ű����� T(Type Parameter)

�� Ŭ������ ����ϴ� ������ ���� ����� �ڷ����� �����Ѵ�. 
but, static ������ ����� �� ����.
(E : Element, K : key, V : Value �� �پ��ϰ� ��밡��)
*/

/*
<> �ȿ��ٰ� ������ ����� �ڷ����� ������ �ȴ�.
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