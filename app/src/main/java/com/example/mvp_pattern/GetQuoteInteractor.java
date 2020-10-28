package com.example.mvp_pattern;

public interface GetQuoteInteractor {


    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
