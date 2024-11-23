package operator;

public class Operator2 {
    public static void main(String[] args) {

        /*
        문자열 더하기
        자바는 문자열에도 + 연산자를 사용할 수 있음.
        + 연산자 사용하면 두 문자 열결 가능.
         */

        // 문자열가 문자열 더하기01
        String result1  = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기02 (변수 사용)
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기01 -> 숫자를 문자로 변경한 다음에 서로 더함
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열과 숫자 더하기02
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
