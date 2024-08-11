package hexlet.code.model;

public class Question {

    private String questionText;
    private String answer;

    public Question(String question, String actualAnswer) {
        this.questionText = question;
        this.answer = actualAnswer;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final void setQuestionText(String question) {
        this.questionText = question;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(String actualAnswer) {
        this.answer = actualAnswer;
    }
}
