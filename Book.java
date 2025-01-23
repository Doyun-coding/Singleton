@CreationType(type = ObjectType.PROTOTYPE)
public class Book extends DataBean {
    private int bookNo;
    private String name;
    private String author;

    public Book() {
    }

    public int getBookNo() {
        return this.bookNo;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

}
