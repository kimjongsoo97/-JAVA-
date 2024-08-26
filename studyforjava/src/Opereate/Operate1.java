package Opereate;

public class Operate1 {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int sum=a+b;
        System.out.println("a+b="+sum);//a+b=7
    //뺼셈

        int diff=a-b;
        System.out.println("a-b="+diff);

//곱셉
        int multi=a*b;
        System.out.println("a*b="+multi);

//        나눗셈
        int div=a/b;
        System.out.println("a/b="+div);

        //나머지
        int mod=a%b;
        System.out.println("a%b="+mod);

//        int z=10/0; 0으로 나누는 것은 수학에서 허용하지 않아 오류가 난다.
    }
}
