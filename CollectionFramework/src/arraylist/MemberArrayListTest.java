package arraylist;

public class MemberArrayListTest {

    public static void main(String[] args) {
        
        MemberArrayList memberArrayList = new MemberArrayList();
        
//      Member�� ��� ��ü ����
        Member memberLuke = new Member(1001, "luke");
        Member memberMike = new Member(1002, "Mike");
        Member memberJake = new Member(1003, "Jake");
        Member memberTina = new Member(1004, "Tina");
//      memberArrayList�� ��� ��ü �߰�
        memberArrayList.addMember(memberLuke);
        memberArrayList.addMember(memberMike);
        memberArrayList.addMember(memberJake);
        memberArrayList.addMember(memberTina);
        
        memberArrayList.showAllMember();
        
        memberArrayList.removeMember(memberJake.getMemberId());
        System.out.println("--------------------");
        memberArrayList.showAllMember();
    }
}
