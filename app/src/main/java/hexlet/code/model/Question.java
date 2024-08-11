package hexlet.code.model;

public class Question {

    private String questionText;
    private String answer;

    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public final String getQuestionText() {
        return questionText;
    }

    public final void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public final String getAnswer() {
        return answer;
    }

    public final void setAnswer(String answer) {
        this.answer = answer;
    }
}
