package scope;

public class Scope3_1 {
    public static void main(String[] args) {

        int m = 10;
        int temp = 0;

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

        /*
        비효율적인 메모리 사용.
            - temp는 if코드 블록에서만 필요로 하는데 main() 코드 블록이 종료될 때까지 메모리 유지.
        코드 복잡성 증가.
            - scope가 불필요하게 넓은 것.
            - if코드 블록이 끝나도 temp 변수 계속 신경써야 함.
         */
    }
}
