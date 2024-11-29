package cond;

public class If1 {
    public static void main(String[] args) {

        /*
        조건문
        - 특정 조건에 따라서 다른 코드를 실행하는 것.
        - 종류 : if문, switch문
        - 문법 :
            if (condigion) {
                // 조건이 참일 때 실행되는 코드
            }
         */

        int age = 20;   // 사용자 나이

        if (age >= 18) {
            System.out.println("성인입니다");
        }
        if (age <= 18) {
            System.out.println("미성년자입니다.");
        }
    }
}
