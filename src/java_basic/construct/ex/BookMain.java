package java_basic.construct.ex;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.disPlayInfo();

        Book book2 = new Book("Hello","Seo");
        book2.disPlayInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim",700);
        book3.disPlayInfo();
    }
}
