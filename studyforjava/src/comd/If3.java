package comd;

public class If3 {
    public static void main(String[] args) {
        //불필요한 조건검사함
        //중복체크 하게 되는 코드
        int age=14;
        if (age <= 7) {
            System.out.println("미취학");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");

        }
        if (age >= 20) {
            System.out.println("성인입니다");
        }
    }
}
