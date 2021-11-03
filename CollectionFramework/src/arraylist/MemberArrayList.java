package arraylist;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList; //arraylist 선언
    
    public MemberArrayList() {
        arrayList = new ArrayList<Member>(); //멤버로 선언한 ArrayList 생성
    }
    
    public void addMember(Member member) { //ArrayList에 멤버 추가
        arrayList.add(member);
    }
    
    public boolean removeMember(int memberId) { //멤버 id를 파라미터로 받아서 삭제 여부를 반환
        
        for(int i=0; i<arrayList.size(); i++) { //해당 id를 가진 멤버를 arrayList에서 찾음
            Member member = arrayList.get(i);
            int tempId = member.getMemberId(); //Member에서 member아이디를 불러와서 tempId로 호출
            if(tempId == memberId) { //입력한 멤버 id가 불러온 memberID와 일치한다면
                arrayList.remove(i); //arrayList에서 삭제
                return true;
            }
        }
        
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }
    
    public void showAllMember() { //arrayList의 목록 확인
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
