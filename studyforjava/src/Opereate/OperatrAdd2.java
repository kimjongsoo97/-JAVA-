package Opereate;

public class OperatrAdd2 {
    public static void main(String[] args) {
        int a=1;
        int b=0;

        b=++a;// a의값을 먼저 증가시키고, 그결과를 b에대입
        System.out.println("a="+a+",b = " + b);

        //후위 증감연산자
        a=1;
        b=0;
        b=a++; //a의 현재값을 b에 먼저 대입하고, 그 후a 값을증가시킴
        System.out.println("a="+a+",b = " + b);

        
    }
}
