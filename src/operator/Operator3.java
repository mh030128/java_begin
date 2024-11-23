package operator;

public class Operator3 {
    public static void main(String[] args) {

        /*
        연산자 우선순위
         */

        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;     // 괄호가 우선순위 높음
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
