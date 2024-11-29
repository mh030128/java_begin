package cond;

public class If4 {
    public static void main(String[] args) {

        /*
        else if
        - if문을 하나씩 사용하는 것보다 중복조건을 피할 수 있고, 간단하게 작성 할 수 있음.
        - 문법 :
            if (condition1) {
                // 조건1이 참일 때 실행되는 코드
            } else if (condition2) {
                // 조건1이 거짓이고, 조건2가 참일 때 실행되는 코드
            } else if (condition3) {
                // 조건2가 거짓이고, 조건3이 참일 때 실행되는 코드
            } else {
                // 모든 조건이 거짓일 때 실행되는 코드
            }

        - 참고로 else는 생략 가능.
         */
        int age = 14;

        if(age <= 7) { //~7: 미취학
            System.out.println("미취학");
        } else if(age <= 13) { //8~13: 초등학생
            System.out.println("초등학생");
        } else if(age <= 16) { //14~16: 중학생
            System.out.println("중학생");
        } else if(age <= 19) { //17~19: 고등학생
            System.out.println("고등학생");
        } else { //20~: 성인
            System.out.println("성인");
        }
    }
}
