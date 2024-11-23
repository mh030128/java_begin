package operator;

public class Operator1 {
    public static void main(String[] args) {
        
        /*
        산술 연산자
         */
        
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);   // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;    // 정수 / 정수 = 정수 (소수점 이하 표현 안됨) 추후 형변환에서 다룸
        System.out.println("a / b = " + div);

        // 나머지 : 실무와 알고리즘에서 종종 사용하므로 잘 기억해두기
        int mod = a % b;    
        System.out.println("a % b = " + mod);
        
        /*
        숫자는 0으로 나눌 수 없음. 수학에서는 허용하지 않으므로 실행했을 때 오류 발생ㅖ
         */
    }
}
