  public class Main {
    public static void main(String[] args) {
        Questionservice questionService = new Questionservice();
        questionService.displayQuestions();
         int result = questionService.printscore();
         System.out.println("Your score is: " + result);
        System.out.println("Quiz completed.");
    }
}
