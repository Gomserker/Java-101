package ch10;

public class MemberArrayListTest {

    public static void main(String[] args) {
        
        MemberArrayList memberArrayList = new MemberArrayList();
        
        Member memberLee = new Member(1001, "ÀÌ¹Î¼ö");
        Member memberKim = new Member(1002, "±è°æÈ£");
        Member memberKang = new Member(1003, "°­¹ÎÇõ");
        Member memberHong = new Member(1004, "È«¼º¼ö");
        
        
        
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);
        
        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKim.getMemberId());
        memberArrayList.showAllMember();
       
    }
}
