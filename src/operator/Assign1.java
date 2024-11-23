package operator;

public class Assign1 {
    public static void main(String[] args) {

        /*
        대입연산자
        - 대입연산자(=)는 값을 변수에 할당하는 연산자.

        축약(복합) 대입연산자
        - 산술연산자와 대입연산자를 한번에 축약해서 사용하는 연산자.
        ex) i = i + 3 -> i += 3
         */

        int a = 5;
        a += 3; // 8 (5 + 3) : a = a + 3
        a -= 2; // 6 (8 - 2) : a = a - 2
        a *= 4; // 24 (6 * 4) : a = a * 4
        a /= 3; // 8 (24 / 3) : a = a / 3
        a %= 5; // 3 (8 % 5) : a = a % 5
        System.out.println("a = " + a);
    }
}
