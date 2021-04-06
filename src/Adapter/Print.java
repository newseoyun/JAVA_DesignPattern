package Adapter;

public interface Print {
    public abstract void printWeak();
    public abstract void printStrong();
}

// 얘를 abstract class 로 생성해서
// printBanner 에서 Banner 는 주입하고 extends Print 해서 사용할 수도 있음.