import java.util.Scanner;

public class olawaleGradeScore{
    
    public static void main(String[] args){

//        int[] score = new int[100]; 
//        int[] quiz = new int[3];
//
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudent = userInput.nextInt();

        System.out.print("Enter number of quizzes: "); 
        int numberOfQuiz = userInput.nextInt();

        
    for(int count = 1; count <= numberOfStudent; count++){

        System.out.println("===== Student " + count + " =====");
    
    for(int index = 1; index <= numberOfQuiz; index++){
   
        System.out.print("Score for quiz " + index +": ");
        int quizScore = userInput.nextInt();

//    while(quizScore )
//     int scoreAverage = quizScore / 3;
//
//    int averageScore = 100;

//    while(score == 100 || score)

    System.out.println("Average score is: " + scoreAverage);
}   
   

}
        
       
    
}
  
 }
