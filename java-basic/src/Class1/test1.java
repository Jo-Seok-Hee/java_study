package Class1;

public class test1 {

    public static void main(String[] args) {

        Student s1 = new Student();


        Student s2 = s1;

        s1.name = "쉣?";
        s2.name = "ㅂㅂ";

        System.out.println(s1.name);


    }



}
