/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author acer
 */
public class PBTHappinessQuestion {
    private String questionId;
    private String question;
    private String minAge;
    private String maxAge;

    public PBTHappinessQuestion(String questionId, String question, String minAge, String maxAge) {
        this.questionId = questionId;
        this.question = question;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }
    
    
}
