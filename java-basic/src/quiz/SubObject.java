package quiz;

public class SubObject extends SuperObject{

    public void paint() {

        super.draw();
    }

    public void draw() {

        System.out.println("Sub Object");
    }
}
