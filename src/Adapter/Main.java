package Adapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        // Print 인터페이스로 받으므로 Main 과 Print 의 수정없이 PrintBanner 내부 메소드의 구현만 수정해서 쓸 수 있음.

        p.printWeak();
        p.printStrong();
    }
}
