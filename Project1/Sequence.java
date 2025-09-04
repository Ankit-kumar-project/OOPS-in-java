//Create Parent class Sequence 
public class Sequence {
    //Data Members
    private int count;  //Size of string
    private char[] data; //String

    //Constructor for only input count data member
    public Sequence(int count){
        this.count = count;
        this.data = new char[count];
    }

    //Constructor to input both count and Array of Char 
    public Sequence(int count , char[] data){
        this.count = count;
        this.data = new char[count];
        setData(data); //Call to copy parameter array content into member data array 
    }

    //Member function to copy parameter array content into member data array
    protected void setData(char[] data){
        for(int i=0;i<this.count;i++){
            this.data[i]=data[i];
        }
    }
  
    // Print string into count number of columns 
    public void print(int count){
        for(int i=0;i<this.count;i++){
            System.out.print(data[i]);
            if((i+1)%count == 0){
                System.out.println();
            }
        }
    }
    
    //Print flat string
    public void print(){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
    
    //Main function start here
    public static void main(String[] args){
        //Create parent Sequence Object seq
        char[] charArray = {'a','b','c','b','d','a','b','d','e'};
        Sequence seq = new Sequence(charArray.length,charArray);


        //Created child PeriodicSequence Object pseq
        char[] preArray = {'a','b','c','b','a'};
        PeriodicSequence pseq = new PeriodicSequence(4,5,preArray);

        //Print Flat String for parent object
        System.out.println("Flat Print: ");
        seq.print();

        //Print String having 3 element in a row for parent object
        System.out.println("Print with 3 columns: ");
        seq.print(3);
        
        //Print String having 5 element in a row for parent object
        System.out.println("Print with 5 columns: ");
        seq.print(5);

        //Print string of default columns size for children object
        System.out.println("\n\nPeriodic Sequence ");
        System.out.println("Default Print()");
        pseq.print();

        //Print string having 3 element in a row for children object
        System.out.println("\nPrint(3) it show rows having 3 column:");
        pseq.print(3);
    }
}