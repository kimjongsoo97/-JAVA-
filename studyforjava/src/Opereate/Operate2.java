package Opereate;

public class Operate2 {
    public static void main(String[] args) {
        //문자열과 문자열+
        String result1="hello"+"world";
        System.out.println(result1);

        String s1="string1";
        String s2="string2";
        String result2=s1+s2;
        System.out.println(result2);

        String result3="a+"+"b="+10;//자바가 10을 문자열로 바꾸어서 해결함
        System.out.println(result3);

//        문자열에서 숫자를 더하면 문자열로 바꿔버린다
        int num=20;
        String str="a+b=";
        String result4="a+b="+20;
        System.out.println(result4);
//          문자열에

    }
}
