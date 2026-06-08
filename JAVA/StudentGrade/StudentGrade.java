import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args){
    System.out.println(getStudentList());

    System.out.println("====================================================================");
    System.out.println("STUDENT        SUB1      SUB2        SUB3     TOT      AVE     POS");
    System.out.println("====================================================================");


}
   public static int getStudentList(){
  
  Scanner userInput = new Scanner(System.in);
   // int[][] score = new int[listOfStudent][listOfSubject];

    System.out.println("How many students do you have? ");
     int listOfStudent = userInput.nextInt();

    System.out.println("How many subject do they offer? ");
     int listOfSubject = userInput.nextInt();

    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Saved succesfully");
    System.out.println("");

    for(int count = 1; count <= listOfStudent; count++){
   System.out.println("Entering score for student " + count);  

    for(int index = 1; index <= listOfSubject; index++){
        System.out.println("Enter score for subject " + index);
    int score = userInput.nextInt();

    while(score < 0 || score > 100){
    System.out.println("Score must be between 0-100");
    System.out.println("Entering score for student " + count);
    System.out.println("Enter score for subject " + index);
    score = userInput.nextInt();
     System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Saved succesfully");
    System.out.println("");

}
    
   double average = score/index;
   System.out.println("Average: " + average);
}
 
} 
      return listOfStudent;
}
  }  

