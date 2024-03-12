package access;

public class SpeakerMain {

    public static void main(String[] args) {


    }
    class Parent {
        void show() {
            System.out.println("parent");
        }
    }

    class Child extends Parent {
        void show() {
            System.out.println("child");
        }
    }


}
