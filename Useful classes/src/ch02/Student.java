package ch02;
/*
 1. equals() 메소드
 == 연산자는 항상 주소값만 비교한다. 
 
 2. hashCode() 메소드
 주소값을 hashcode라고 하는데, 자바에서 메모리를 관리하는 방식이 hash 방식이라고 한다.
 키값이 있고, 키값에 대해 오브젝트를 어디에 저장할지 주소값을 지정하는 방식이다.
 따라서 키값을 알게되면 index를 알 수 있다.
 hash 함수에 hash 키를 넣으면 저장된 값의 index를 알 수 있게 되는 것.
 equals가 오버라이딩 되면 hashCode 메소드도 오버라이딩 되는게 맞다.
 
 */
public class Student implements Cloneable{

    private int studentNum;
    private String studentName;
    
    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }
    
    public void setStudentName(String name) {
        this.studentName = name;
    }
    @Override
    public String toString() {
        return studentNum + "," + studentName;
    }

    /*
     논리적으로 학번이 같으면 true를 반환하기로 오버라이딩 했기 때문에,
     hashCode() 메소드에서는 그 학번을 반환하기만 하면 된다.
     */
    @Override
    public int hashCode() {
        
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj instanceof Student) {
            Student std = (Student)obj;
            if(this.studentNum == std.studentNum) {
                return true;
            } else return false;
        }
        
        /*
         instanceof로 확인한 다음에 
         (instanceof와 다운캐스팅 정의 다시 공부할것)
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
    
}
