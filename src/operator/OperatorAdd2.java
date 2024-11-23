package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        /*
        증감 연산자는 피연산자 앞에 두거나 뒤에 둘 수 있으며, 연산자의 위치에 따라 연산이 수행되는 시점이 달라짐.
        - ++a : 전위(Prefix) 증감 연산자
        - a++ : 후위(Postfix) 증감 연산자
         */
        
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a;    // a의 값을 먼저 증가시키고 그 결과를 b에 대입.
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1;  // 값을 다시 1로 저장.
        b = 0;  // 값을 다시 0으로 저장.

        b = a++;    // a의 현재 값을 b에 대입하고, 그 후 a 값을 증가시킴.
        System.out.println("a = " + a + ", b = " + b);  // 결과 : a = 2, b = 1

    }
}
