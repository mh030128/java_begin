package casting;

public class Casting1 {
    public static void main(String[] args) {

        /*
        자동 형변환(= 묵시적 형변환)
        - 작은 범위 숫자 타입에서 큰 범위 숫자 타입으로의 대입은 개발자가 이렇게 직접 형변환 하지 않아도 됨.
          이런 과정이 자동으로 일어나기 때문.
         */

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;   // int → long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int → double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;  // long → double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
