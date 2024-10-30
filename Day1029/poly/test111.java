package poly;

public class test111 {
    public static void main(String[] args) {
        Parent p = new Child();  // 업 캐스팅
        p.show();  // "Child's show()" 출력
        // p.childMethod();  // 오류: Parent 타입에서는 childMethod를 호출할 수 없음
//        p.childMethod();
    }
}
