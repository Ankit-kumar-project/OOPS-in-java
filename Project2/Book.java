
//Create book class and perform basic OOPS logic
public class Book{
    //Data member
    private int ID;
    private int ISBN;
    private char Category;
    private String name;

    //Static data member
    private static int lastID=0;

    //Constructor to initialize Book object
    public Book(int ISBN, char Category, String name){
        this.ID = ++lastID;
        this.ISBN = ISBN;
        this.Category = Category;
        this.name = name;
    }

    //Getter to get ID
    public int getID(){
        return this.ID;
    }
    //Setter to set Name
    public void setName(String Name){
        this.name = Name;
    }

    //Override toString function
    @Override
    public String toString(){
        return ("ID:\t" + ID +
                "\nISBN:\t" + ISBN +
                "\nCAT:\t" + Category +
                "\nName:\t" + name +"\n");
    }

    //Method to return String dump of a input field
    public String dumpString(){
        return (ID + "$$" + ISBN + "$$" + Category + "$$" +name +"\n");
    }

    //Static function to create a new Book Object by input dumpString
    public static Book createBook(String dump){
        String[] part = dump.split("\\$\\$");
        int isbn = Integer.parseInt(part[1]);

        char category = part[2].charAt(0);
        String name = part[3];
        return new Book(isbn,category,name);
    }
    //Main function start
    public static void main(String[] args){
        //Create objects
        Book b1 = new Book(1234,'F',"Book1");
        Book b2 = new Book(2345,'T',"Book2");
        Book b3 = new Book(3456,'C',"Book3");

        //Print all Books in requires formate
        System.out.println("Books:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        //Create and print Dump string of b1
        String dump = b1.dumpString();
        System.out.print("String Dump of B1 separated by ($$) :");
        System.out.println(dump);

        //Pass b1 dumpString to create new object and also print it
        System.out.println("Created Object:");
        Book newBook =Book.createBook(dump);
        System.out.println(newBook);

        //Change newBook name  and show newBook
        newBook.setName("Book4");
        System.out.println("After change name of newBook");
        System.out.println(newBook);
    }
}