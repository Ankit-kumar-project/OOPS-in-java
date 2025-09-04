//Create PeriodicSequence inherit Sequence class
public class PeriodicSequence extends Sequence{
    private int Period; //Number of rows
    private int columns; //Number of Columns

    //Constructor to initialize member for of both parent and children class
    public PeriodicSequence(int Period, int columns , char[] rowData){
        //Calls super to initialize parent 
        super(Period * columns ,makeData(Period,columns,rowData));//call makeData
        //Initialize children 
        this.Period = Period;
        this.columns = columns;
    }

    //Static function to return a char array of length (Period * columns)
    private static char[] makeData(int period,int columns , char[] rowData){
        char[] charArray = new char[period*columns];
        for(int i=0;i<period;i++){
           for(int j=0;j<columns;j++){
            charArray[i*columns +j ] = rowData[j]; // To avoid overring 1st row
           }
        }
        return charArray;
    }

    //Overriding Flat print function with default number of columns function
    @Override
    public void print(){
        super.print(columns);
        System.out.println("Repeat for Period = " + Period);
    }  
}
