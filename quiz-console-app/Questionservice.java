import java.util.Scanner;

public class Questionservice {
    Questions[] questions= new Questions[5];
    String[] answers= new String[5];
    public Questionservice() {
        questions[0]= new Questions(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1]= new Questions(2, "What is the largest planet in our solar system?", "Earth", "Jupiter", "Mars", "Saturn", "Jupiter");
        questions[2]= new Questions(3, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Hg", "Au");
        questions[3]= new Questions(4, "What is the capital of Japan?", "Beijing", "Tokyo", "Seoul", "Bangkok", "Tokyo");
        questions[4]= new Questions(5, "What is the largest mammal?", "Elephant", "Blue Whale", "Giraffe", "Hippopotamus", "Blue Whale");
       
        // Add more questions as needed
    }
    public void displayQuestions(){
        int i=0;
        Scanner scanner = new Scanner(System.in);
        try {
            for( Questions question : questions){
                System.out.println("Question ID: " + question.getId());
                System.out.println("Question: " + question.getQuestion());
                System.out.println("Options:");
                System.out.println("1. " + question.getOpt1());
                System.out.println("2. " + question.getOpt2());
                System.out.println("3. " + question.getOpt3());
                System.out.println("4. " + question.getOpt4());
                System.out.print("Enter your answer (1-4): ");
                answers[i] = scanner.nextLine();
                i++;
                for(String answer:answers){
                    System.out.println("Your answer: " + answer);
                }
            }
        } finally {
            scanner.close();
        }
    }
    
    public int printscore(){   
        int score=0;
        for(int i=0;i<questions.length;i++){
            if(answers[i].equals(questions[i].getAnswer())){
                score++;
            }
        }
        return score;
    }
}