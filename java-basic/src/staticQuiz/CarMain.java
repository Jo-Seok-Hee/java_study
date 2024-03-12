package staticQuiz;

public class CarMain {

    public static void main(String[] args) {

        new Car("K3");
        new Car("G80");
        new Car("Model Y");

        Car.showTotalCars(); // 구매한 차량수를 출력하는 static 매소드
    }
}
