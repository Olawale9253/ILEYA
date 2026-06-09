import java.util.Scanner;

public class StudentGrades{
    public static void main(String[] args){

//    System.out.println(collectScores(scores, numberOfStudents, numberOfSubjects));

Scanner userInput = new Scanner(System.in);
    System.out.println("How many students do you have? ");
     int numberOfStudents = userInput.nextInt();

    System.out.println("How many subject do they offer? ");
     int numberOfSubjects = userInput.nextInt();

    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Saved succesfully");
    System.out.println("");

     int[][] scores = new int[numberOfStudents][numberOfSubjects];
}
     public static int collectScores(int scores, int numberOfStudents, int numberOfSubjects){
    Scanner userInput = new Scanner(System.in);
   
    for(int student = 0; student < numberOfStudents; student++){
    System.out.println("Entering scores for student " + (student + 1));
    
    for(int subject = 0; subject < numberOfSubjects; subject++){
        System.out.println("Enter score for subject " + (subject + 1));

    int score;
    while(score < 0 || score > 100){

    System.out.println("Score must be between 0-100");
    System.out.println("Entering score for student ");
    score = userInput.nextInt();    
}
    scores[student][subject] = score;
}
}

 }   
}

 
