package Class1;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder order1 = new ProductOrder();
        ProductOrder order2 = new ProductOrder();
        ProductOrder order3 = new ProductOrder();

        ProductOrder[] orders = {order1,order2,order3};

        order1.production = "LG 그램";
        order1.price = 1500000;
        order1.quantity = 1;

        order2.production = "에어팟";
        order2.price = 300000;
        order2.quantity = 2;

        order3.production = "아이폰 케이스";
        order3.price = 12000;
        order3.quantity = 10;

        int totalPrice = 0;

        for (int i = 0; i < orders.length; i++) {

            System.out.println("상품 "+i+"의 제품명 : "+orders[i].production+", 가격 :"+orders[i].price+", 수량 : "+orders[i].quantity+"개");
            totalPrice = totalPrice + orders[i].quantity * orders[i].price;
        }

        System.out.println("총액 : "+totalPrice);
    }

}
