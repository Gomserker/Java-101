package ch02;
/*
 1. equals() �޼ҵ�
 == �����ڴ� �׻� �ּҰ��� ���Ѵ�. 
 
 2. hashCode() �޼ҵ�
 �ּҰ��� hashcode��� �ϴµ�, �ڹٿ��� �޸𸮸� �����ϴ� ����� hash ����̶�� �Ѵ�.
 Ű���� �ְ�, Ű���� ���� ������Ʈ�� ��� �������� �ּҰ��� �����ϴ� ����̴�.
 ���� Ű���� �˰ԵǸ� index�� �� �� �ִ�.
 hash �Լ��� hash Ű�� ������ ����� ���� index�� �� �� �ְ� �Ǵ� ��.
 equals�� �������̵� �Ǹ� hashCode �޼ҵ嵵 �������̵� �Ǵ°� �´�.
 
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
     �������� �й��� ������ true�� ��ȯ�ϱ�� �������̵� �߱� ������,
     hashCode() �޼ҵ忡���� �� �й��� ��ȯ�ϱ⸸ �ϸ� �ȴ�.
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
         instanceof�� Ȯ���� ������ 
         (instanceof�� �ٿ�ĳ���� ���� �ٽ� �����Ұ�)
         */
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
    
}
