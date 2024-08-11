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

    public final void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(String answer) {
        this.answer = answer;
    }
}
