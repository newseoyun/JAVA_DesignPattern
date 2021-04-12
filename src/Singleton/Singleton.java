package Singleton;

public class Singleton {

    // static method 생성
    private static Singleton singleton = new Singleton();

    private Singleton() { // 생성자를 private으로 만들어서 외부에서 new로 생성 못하게
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
