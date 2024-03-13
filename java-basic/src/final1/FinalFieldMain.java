package final1;

public class FinalFieldMain {

    public static void main(String[] args) {

        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit cons1 = new ConstructInit(10);
        ConstructInit cons2 = new ConstructInit(20);
        System.out.println(cons1.value);
        System.out.println(cons2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
    }
}
