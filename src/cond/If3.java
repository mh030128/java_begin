package cond;

public class If3 {
    public static void main(String[] args) {

        /*
        else if문
        - else if문을 사용하지 않고, if문을 반복해서 사용하면 불필요한 조건도 검사하고, 코드 효율성도 떨어짐.
         */

        int age = 14;
        if(age <= 7) { //~7: 미취학
            System.out.println("미취학");
        }
        if(age >= 8 && age <= 13) { //8~13: 초등학생
            System.out.println("초등학생");
        }
        if(age >= 14 && age <= 16) { //14~16: 중학생
            System.out.println("중학생");
        }
        if(age >= 17 && age <= 19) { //17~19: 고등학생
            System.out.println("고등학생");
        }
        if(age >= 20) { //20~: 성인
            System.out.println("성인");
        }
    }
}