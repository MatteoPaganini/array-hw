

public class Library {

    public String owner = "Matteo Paganini";
    public Book[] allBooks;
    public double total;
    public double average;
    public static void main(String[] args) {
        //TODO: Make an instance of the main class
        Library Beloved = new Library();

    }

    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        //TODO: Give the array allReviews a size of 10
        allBooks = new Book[20];

        //TODO: Fill the array allReviews with reviews with random ratings from 0 to 10 inclusive
        Book Beloved = new Book((int)(Math.random()*10));

        for(int x = 0; x < allBooks.length; x++) {
            allBooks[x]=new Book((int)(Math.random()*10));
        }

        for(int x = 0; x < allBooks.length; x++) {
            allBooks[x].print();
            System.out.println("**********");
        }


        //TODO: print all the ratings in the array allReviews
        
        //TODO: Call the method averageRating
        averageRating();
    }

    public void averageRating(){
        //TODO: calculate the average rating from the array allReviews and print it
        for(int x = 0; x < allBooks.length; x++) {
            total = total + allBooks[x].rating;
        }

        System.out.println("total equals = " + total);
        average = total/10;
        System.out.println("Average equals = " + average);


        }
}
