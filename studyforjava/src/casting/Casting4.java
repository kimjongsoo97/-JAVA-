package casting;

public class Casting4 {
    public static void main(String[] args) {


        int div1=3/2;
        System.out.println("div1 = "+ div1);//1 인트끼리 나눳기 때문에 결과도 인트

        double div2=3/2; //int /int
        System.out.println("div2="+div2);// 1.0 int 이므로 int 타입으로 결과가 나온다 소수점을 뽑을라면 (double)을 붙혀야댐

        double div3=3.0/2;
        System.out.println("div3 = "+div3);//1.5 앞에 3.0이 double 형이기에 자동으로 큰걸로 형변환이 일어나 int가 dobule로 바뀜

        double div4=(double) 3/2;
        System.out.println("div4="+div4);//1.5 (double)로 형변환을 해주어서 인트타입이 더블로 바뀌어서 나오게댐

        //자바에서 대원칙 같은타입끼리에 계산은 같은타입의 결과를 낸다
        //자바에서 작은값 이랑 큰값을 계싼하게 되면 큰값으로 자동 형변환을 하게 되어서 결과값이 도출된다.

        int a=3;
        int b=2;
        double result=(double) a/b;
        System.out.println("result="+result); //1.5
    }


}
