package ref;

public class ProductOrderMain_ref {

    public static void main(String[] args) {

        ProductOrder order1 = createOrder("LG그램", 1500000, 1);
        ProductOrder order2 = createOrder("에어팟", 300000, 2);
        ProductOrder order3 = createOrder("아이폰 케이스", 12000, 10);

        ProductOrder[] orders = {order1, order2, order3};

        printOrders(orders);
        int totalPrice = getTotalAmount(orders);
        System.out.println("총액 : "+totalPrice);

    }
    public static int getTotalAmount(ProductOrder[] orders) {

        int totalPrice = 0;

        for (int i = 0; i < orders.length; i++) {

            totalPrice = totalPrice + orders[i].price * orders[i].quantity;
        }

        return totalPrice;
    }

    public static ProductOrder createOrder(String production, int price, int quantity) {

        ProductOrder order = new ProductOrder();
        order.production = production;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    public static void printOrders(ProductOrder[] orders) {

        for (int i = 0; i < orders.length; i++) {

            System.out.println(orders[i].production+"=="+orders[i].price+"=="+orders[i].quantity);
        }
    }
}