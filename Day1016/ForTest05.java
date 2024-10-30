public class ForTest05 {
    public static void main(String[] args) {
        // 1부터 더해가다가 합이 100을 넘기 직전의 값을 구함
        int sum = 0;
        int i;
        
        for (i = 1; sum <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(i - 1);
        System.out.println(sum - i + 1);
    }
}