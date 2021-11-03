package arraylist;

public class MemberArrayListTest {

    public static void main(String[] args) {
        
        MemberArrayList memberArrayList = new MemberArrayList();
        
//      Member에 사람 객체 생성
        Member memberLuke = new Member(1001, "luke");
        Member memberMike = new Member(1002, "Mike");
        Member memberJake = new Member(1003, "Jake");
        Member memberTina = new Member(1004, "Tina");
//      memberArrayList에 사람 객체 추가
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
