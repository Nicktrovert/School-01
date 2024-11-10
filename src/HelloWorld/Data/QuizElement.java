package HelloWorld.Data;

public class QuizElement {
    public String Question;
    public String[] Answers;
    public String CorrectAnswer;

    public boolean CheckAnswer(int answer){
        return Answers[answer-1].equals(CorrectAnswer);
    }

    public QuizElement(String question, String[] answers, int correctAnswer){
        Question = question;
        Answers = answers;
        CorrectAnswer = Answers[correctAnswer-1];
    }
}
