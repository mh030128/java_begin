package variable;

public class Var8 {
    public static void main(String[] args) {

        // 정수
        byte b = 127;   // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647
        long l = 9223372036854775807L;  // -9,223,372,.36,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        /* float보다는 double이 더 큰 범위 표현 가능(정밀도 높음)
         * 실수 리터럴은 기본이 double형 사용.
         */

        float f = 10.0f;
        double d = 10.0;

    }
}
