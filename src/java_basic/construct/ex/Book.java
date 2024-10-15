package java_basic.construct.ex;

public class Book {
    String title;
    String author;
    int page;




    Book() {
        this("","");
    }

    Book(String title, String author) {
        this(title,author,50);

    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;

    }
    void disPlayInfo(){
        System.out.println("타이틀 : " + title + " 저자 : " + author + " 페이지 수 : " + page);
    }
}
