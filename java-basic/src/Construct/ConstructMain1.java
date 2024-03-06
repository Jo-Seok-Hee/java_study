package Construct;

public class ConstructMain1 {

    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("조석희",31,90);
        MemberConstruct member2 = new MemberConstruct("장윤호",31,50);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {

            System.out.println("이름 : " + member.name + " 나이 :" + member.age + ", 성적 : " + member.grade);
        }
    }
}


