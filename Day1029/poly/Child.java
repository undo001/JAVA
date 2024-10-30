package poly;

class Child extends Parent {
    @Override
    void show() {
        System.out.println("아이 show()");
    }
    
    void childMethod() {
        System.out.println("Child specific method");
    }
}