package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("hihi hello hello"));
        bookShelf.appendBook(new Book("신데렐라"));
        bookShelf.appendBook(new Book("백설공주"));
        bookShelf.appendBook(new Book("Java 언어로 배우는 디자인 패턴 입문"));

        Iterator iter = bookShelf.iterator();
        while (iter.hasNext()) {
            Book book = (Book)iter.next();
            System.out.println(book.getName());
        }
    }
}
