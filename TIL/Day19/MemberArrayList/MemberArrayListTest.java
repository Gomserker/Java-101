package ch10;

public class MemberArrayListTest {

    public static void main(String[] args) {
        
        MemberArrayList memberArrayList = new MemberArrayList();
        
        Member memberLee = new Member(1001, "�̹μ�");
        Member memberKim = new Member(1002, "���ȣ");
        Member memberKang = new Member(1003, "������");
        Member memberHong = new Member(1004, "ȫ����");
        
        
        
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);
        
        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKim.getMemberId());
        memberArrayList.showAllMember();
       
    }
}
