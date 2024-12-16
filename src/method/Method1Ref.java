package method;

public class Method1Ref {
    public static void main(String[] args) {

        /*
        자바에서는 함수를 메서드(Method)라고 함.
        중복 제거되고, 깔끔한 코드가 됨.
         */

        // 계산 1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력 : " + sum1);

        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력 : " + sum2);

        // 반환값 없이 호출만 하고 싶을 때 작성.
        add(100, 200);
    }

    // add 메서드 (메서드는 선언과 본문으로 나눌 수 있음)
    public static int add(int a, int b) {   // 메서드 선언(메서드 이름, 매개변수(파라미터) 목록 포함)

        // 메서드 본문
        System.out.println(a + " + " + b + " 연산 수행");
        return a + b;
    }

    /*
    해당 함수에 위치하여 Ctrl + B하면 해당 함수로 이동함.
     */
}
