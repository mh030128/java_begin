package loop;

public class Break2 {
    public static void main(String[] args) {

        int sum = 0;
        int i =1;

        for(; ;) {
            sum += i;
            if(sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }

        // for문의 조건식을 보면 조건식이 없는 것을 볼 수 있음. 조건이 없으면 무한 반복함.
    }
}
