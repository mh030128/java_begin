package loop;

public class For2 {
    public static void main(String[] args) {

        int sum = 0;
        int endNum = 3;

        for(int i = 1; i <= endNum; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        /*
        While2_3(while문)보다 for문이 더 깔끔한 이유는
        for문은 규칙적으로 한 줄에 모두 들어있어 코드를 이해하기 더 쉬움.
         */
    }
}
