package static2;

public class DecoMain1 {

    public static void main(String[] args) {

        String s = "Hello Java";
        String deco = DecoUtil1.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
