import java.util.ArrayList;

public class BooklibEx{

    public class Book{
        String bookName;
        int bookId;
        String authorName;

        // parameratized consturctor to initialzie  the object
        Book(int bookId, String bookName, String authorName){
            this.bookId = bookId;
            this.bookName= bookName;
            this.authorName = authorName;
        }

    }
    public static void main(String[] args){
       
        ArrayList<Book> bookdetails =new ArrayList<>();

        bookdetails.add(new BooklibEx().new Book(1,"Geeta", "ved vyas"));
        bookdetails.add(new BooklibEx().new Book(2,"Ramcharitmanas", "Tuldi das"));
        bookdetails.add(new BooklibEx().new Book(3,"Rich Dad Poor Dad", "Robert T. Kiyosaki"));
        bookdetails.add(new BooklibEx().new Book(4,"Wings of Fire", "A.P.J. Abdul Kalam"));

          // Display all book details using an enhanced for loop
          System.out.println("ALL book details:");
        for(Book book : bookdetails){
            System.out.println("BookId : "+book.bookId);
            System.out.println("BookName : "+ book.bookName);
            System.out.println("AuthorName : "+ book.authorName);
            System.err.println();
        }


    }


}