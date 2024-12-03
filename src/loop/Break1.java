package loop;

public class Break1 {
    public static void main(String[] args) {

        /*
        break문 : 반복문 즉시 종료하고 나감.
        continue : 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용.
         */

        int sum = 0;
        int i = 1;

        while(true) {
            sum += i;
            if(sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }
    }
}
