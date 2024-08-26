package comd;

public class If5 {
    public static void main(String[] args) {
        //다른조건이기때문에 따로 운용
        //else if를 사용하게되면 나머지 조건을 놓쳐버려 할인이 안들어감
        int price=10000;
        int age=10;
        int discount=0;

        if (price >= 10000) {
            discount=discount+1000;
            System.out.println("10000원이상시 구매 1000원할인");
        }

        if (age <= 10) {
            discount=discount+1000;
            System.out.println("어린이 1000원할인");
        }
        System.out.println("총 할인 금액+"+discount+"원");
    }
}
