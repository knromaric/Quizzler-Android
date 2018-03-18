package com.londonappbrewery.quizzler;

/**
 * Created by k-zero on 3/17/2018.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionID, boolean answer) {
        mQuestionID = questionID;
        mAnswer = answer;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
