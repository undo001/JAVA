
public class WhileTest01 {

	public static void main(String[] args) {
		int fs = 720;
		int dl = 0;
		
		while(dl < fs) {
			dl += 120;
			System.out.println(dl + "K 다운로드중....");
		}
		
//		for(dl = 0; dl <= fs; dl += 120) {
//			System.out.println(dl + "K 다운로드중....");
//		}
		System.out.println("다운로드 완료");
		
	}

}
