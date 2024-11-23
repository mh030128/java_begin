package operator;

public class Comp1 {
    public static void main(String[] args) {

        /*
        비교 연산자 : 두 값을 비교하는데 사용. 조건문과 함께 사용.

        == : 동등성
        != : 불일치
        > : 크다
        < : 작다
        >= : 크거나 같다
        <= : 작거나 같다

        = : 대입연산자, 변수에 값을 대입.
        == : 동등한지 확인하는 비교 연산자.
         */

        int a = 2;
        int b = 3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 결과를 boolean 변수에 담을 수 있음.
        boolean result = a == b;
        System.out.println(result);

    }
}
