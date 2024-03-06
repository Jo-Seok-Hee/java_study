package ref;

import java.util.Scanner;

public class ProductOrderTest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 상품주문의 갯수를 입력하세요 : ");
        int orderCount = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[orderCount];

        for (int i = 0; i < orderCount; i++) {

            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String production = sc.next();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();

            orders[i] = inputOrder(production, price, quantity);

        }

        printOrder(orders);

        int totalPrice = totalPrice(orders);
        System.out.println("총액 : "+totalPrice);


    }


    public static ProductOrder inputOrder(String production, int price, int quantity) {

        ProductOrder order = new ProductOrder();
        order.production = production;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    public static void printOrder (ProductOrder[] orders) {

        for (ProductOrder order : orders) {

            System.out.println("상품명 : "+order.production+", 가격 : "+order.price+", 수량 : "+order.quantity);
        }
    }

    public static int totalPrice(ProductOrder[] orders){

        int totalPrice = 0;

        for (ProductOrder order : orders) {

            totalPrice = totalPrice + order.price * order.quantity;
        }

        return totalPrice;
    }
}
