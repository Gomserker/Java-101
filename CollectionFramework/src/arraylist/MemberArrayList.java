package arraylist;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList; //arraylist ����
    
    public MemberArrayList() {
        arrayList = new ArrayList<Member>(); //����� ������ ArrayList ����
    }
    
    public void addMember(Member member) { //ArrayList�� ��� �߰�
        arrayList.add(member);
    }
    
    public boolean removeMember(int memberId) { //��� id�� �Ķ���ͷ� �޾Ƽ� ���� ���θ� ��ȯ
        
        for(int i=0; i<arrayList.size(); i++) { //�ش� id�� ���� ����� arrayList���� ã��
            Member member = arrayList.get(i);
            int tempId = member.getMemberId(); //Member���� member���̵� �ҷ��ͼ� tempId�� ȣ��
            if(tempId == memberId) { //�Է��� ��� id�� �ҷ��� memberID�� ��ġ�Ѵٸ�
                arrayList.remove(i); //arrayList���� ����
                return true;
            }
        }
        
        System.out.println(memberId + "�� �������� �ʽ��ϴ�");
        return false;
    }
    
    public void showAllMember() { //arrayList�� ��� Ȯ��
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
