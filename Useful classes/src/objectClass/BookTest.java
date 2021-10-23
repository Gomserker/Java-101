package objectClass;
/*
��� class�� �ֻ��� Ŭ����

1. java.lang ��Ű��
���� ����ϴ� �⺻ Ŭ�������� ���� ��Ű����, �ڵ����� import �ȴ�.
String�̳� System Ŭ���� ����Ҷ� import �ؼ� ����?


2. ��� Ŭ������ Object Ŭ������ ��ӹ޴´�.

java.lang.Object Ŭ����.
���� ��� Student��� Ŭ������ �����Ѵٰ� ������,
class Student -> class Student extends Object.
extends Object�� �߰����� �ʾƵ� �����Ϸ��� �ڵ����� �߰��Ѵ�.
final ������ �ȵ� �޼ҵ�� �������̵� �ؼ� ����� �� �ִ�.

3. toString() �޼ҵ�
��ü�� ������ String���� �ٲ㼭 ����Ҷ� ����.
final�� �ƴϹǷ� �������̵� �ؼ� ��밡��.
*/
class Book{
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ","+ author;
    }
    
    
}

public class BookTest {
    public static void main(String[] args) {
        
        Book book = new Book("Demian", "Herman Hesse");
        
        System.out.println(book);
/*
 objectClass.Book@1175e2db
 ��Ű���� ������ Ŭ������ Ǯ����@Heap�� ����� ���� �ּ�   
 */
        
        String str = new String("test");
        System.out.println(str);
/*
 �� ��쿣 str ���������� �ּҰ��� �����°� �ƴ϶� test�� ��µȴ�.
 ������, str�� str.toString()���� �������̵� �Ȱ�.
 ����, ���� BookŬ������ book ���������� ���ڿ� ���� ����Ϸ��� toString() �޼ҵ带 �������̵� �ϸ�ȴ�.
 */
    }
}
