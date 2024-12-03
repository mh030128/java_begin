package loop;

public class While2_2 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        sum += i;
        System.out.println("i = " + i + ", sum = " + sum);
        i++;

        sum += i;
        System.out.println("i = " + i + ", sum = " + sum);
        i++;

        sum += i;
        System.out.println("i = " + i + ", sum = " + sum);

        // 변수를 선언함으로써 코드가 변경하기 쉬운 코드로 변경.
    }
}
