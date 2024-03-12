package static1;

public class DataCountMain1 {

    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B Count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C Count = " + Data3.count);
    }
}
