import java.sql.SQLOutput;

public class Book {

    public int rating;
    public String title;
    public String author;
    
    public Book(int pRating){
        title = "Beloved";
        author = "Toni Morrison";
        // TODO: set the instance variable to the parameter
        rating = pRating;


    }

    public void print(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        //TODO: use System.out to print the values of the
        //      instance varibles so the user can see the review

        System.out.println(rating);

    }

    
}