package com.mikelane9143.helloit;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HelloIt extends AppCompatActivity {

    public static final String TAG = HelloIt.class.getSimpleName();
    private static final String KEY_QUOTE = "KEY_QUOTE";
    private static final String KEY_SPEAKER = "KEY_SPEAKER";
    private static final String KEY_VISIBILITY = "KEY_VISIBILITY";
    private static final String KEY_COLOUR = "KEY_COLOUR";

    private ITCrowd_Quotes mQuoteBook = new ITCrowd_Quotes();
    private ColorWheel mColorWheel = new ColorWheel();
    private String mQuote = "";
    private String mSpeaker = "";
    private TextView factLabel;
    private TextView speakerLabel;
    private RelativeLayout relativeLayout;
    private Button showFactButton;
    private Button showSpeakerButton;
    private int mSpeakerVis = View.GONE;
    private int mColor = Color.parseColor(mColorWheel.mColors[8]);

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(KEY_QUOTE, mQuote);
        outState.putString(KEY_SPEAKER, mSpeaker);
        mSpeakerVis = speakerLabel.getVisibility();
        outState.putInt(KEY_VISIBILITY, mSpeakerVis);
        outState.putInt(KEY_COLOUR, mColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mQuote = savedInstanceState.getString(KEY_QUOTE);
        factLabel.setText(mQuote);
        mSpeaker = savedInstanceState.getString(KEY_SPEAKER);
        speakerLabel.setText(mSpeaker);
        mSpeakerVis = savedInstanceState.getInt(KEY_VISIBILITY);
        if (mSpeakerVis == View.GONE) {
            speakerLabel.setVisibility(View.GONE);
        } else {
            speakerLabel.setVisibility(View.VISIBLE);
        }
        mColor = savedInstanceState.getInt(KEY_COLOUR);
        relativeLayout.setBackgroundColor(mColor);
        showFactButton.setTextColor(mColor);
        showSpeakerButton.setTextColor(mColor);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        // Declare our view variables
        factLabel = (TextView) findViewById(R.id.quote_Text);
        speakerLabel = (TextView) findViewById(R.id.speakerLabel);
        showFactButton = (Button) findViewById(R.id.next_Quote_Button);
        showSpeakerButton = (Button) findViewById(R.id.showSpeakerButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakerLabel.setVisibility(View.GONE);
                QuoteAndSpeaker mQuoteAndSpeaker = mQuoteBook.getFact();
                mQuote = mQuoteAndSpeaker.getQuote();
                mSpeaker = mQuoteAndSpeaker.getSpeaker();
                // Update display with new quote
                factLabel.setText(mQuote);
                speakerLabel.setText(mSpeaker);

                mColor = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(mColor);
                showFactButton.setTextColor(mColor);
                showSpeakerButton.setTextColor(mColor);
            }
        };
        showFactButton.setOnClickListener(listener);
        View.OnClickListener answerListener = new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                speakerLabel.setVisibility(View.VISIBLE);
            }
        };
        showSpeakerButton.setOnClickListener(answerListener);

        // Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate method");
    }

}
