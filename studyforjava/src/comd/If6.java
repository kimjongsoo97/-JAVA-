package comd;

public class If6 {
    public static void main(String[] args) {
        //중괄호를 사용하는 이유 수정할때 오류를 덜내게된다.
        int price=10000;
        int age=10;
        int discount=0;

        if (price >= 10000) {
            discount=discount+1000;
            System.out.println("10000원이상시 구매 1000원할인");
        }else if (age <= 10) {
            discount=discount+1000;
            System.out.println("어린이 1000원할인");
        }else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액+"+discount+"원");

        if (true)
            System.out.println("if문에서 실행됨");

    }
    }
