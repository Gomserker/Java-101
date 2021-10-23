package objectClass;
/*
모든 class의 최상위 클래스

1. java.lang 패키지
많이 사용하는 기본 클래스들이 속한 패키지로, 자동으로 import 된다.
String이나 System 클래스 사용할때 import 해서 쓰던?


2. 모든 클래스는 Object 클래스를 상속받는다.

java.lang.Object 클래스.
예를 들어 Student라는 클래스를 생성한다고 했을때,
class Student -> class Student extends Object.
extends Object를 추가하지 않아도 컴파일러가 자동으로 추가한다.
final 선언이 안된 메소드는 오버라이딩 해서 사용할 수 있다.

3. toString() 메소드
객체의 정보를 String으로 바꿔서 사용할때 쓰임.
final이 아니므로 오버라이딩 해서 사용가능.
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
 패키지를 포함한 클래스의 풀네임@Heap에 저장된 값의 주소   
 */
        
        String str = new String("test");
        System.out.println(str);
/*
 이 경우엔 str 참조변수의 주소값이 나오는게 아니라 test가 출력된다.
 이유는, str에 str.toString()으로 오버라이딩 된것.
 따라서, 위의 Book클래스의 book 참조변수도 문자열 값을 출력하려면 toString() 메소드를 오버라이딩 하면된다.
 */
    }
}
