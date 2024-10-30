package array;

public class aaa {
    public static void main(String[] args) {
        int[] wallet = {30, 15};
        int[] bill = {26, 17};
        
        int result = solution(wallet, bill);
        System.out.println(result);
    }
    
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // wallet의 작은 값과 큰 값 계산
        int minw = Math.min(wallet[0], wallet[1]);
        int maxw = Math.max(wallet[0], wallet[1]);
        
        // bill의 작은 값과 큰 값 계산
        int minb = Math.min(bill[0], bill[1]);
        int maxb = Math.max(bill[0], bill[1]);
        
        // 반복문을 돌면서 bill이 wallet보다 작아질 때까지 접기
        while (minb > minw || maxb > maxw) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            // bill의 새로운 최소값과 최대값 계산
            minb = Math.min(bill[0], bill[1]);
            maxb = Math.max(bill[0], bill[1]);
            // 접은 횟수 증가
            answer++;
        }
        
        return answer;
    }
}
