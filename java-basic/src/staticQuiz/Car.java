package staticQuiz;

public class Car {

    private static int carCount;
    private String carName;

    Car(String carName) {

        this.carName = carName;
        carCount++;
        System.out.println("차량 구입, 이름 : " + carName);
    }

    static void showTotalCars() {

        System.out.println("구매한 차량 수 : " + carCount);
    }
}
