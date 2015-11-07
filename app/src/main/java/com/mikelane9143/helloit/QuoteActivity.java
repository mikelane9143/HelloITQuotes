package com.mikelane9143.helloit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class QuoteActivity extends AppCompatActivity {

    public static final String TAG = QuoteActivity.class.getSimpleName();

    private ITCrowd_Quotes mQuoteBook = new ITCrowd_Quotes();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        // Declare our view variables
        final TextView factLabel = (TextView) findViewById(R.id.quote_Text);
        final TextView speakerLabel = (TextView) findViewById(R.id.speakerLabel);
        final Button showFactButton = (Button) findViewById(R.id.next_Quote_Button);
        final Button showSpeakerButton = (Button) findViewById(R.id.showSpeakerButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakerLabel.setVisibility(View.GONE);
                QuoteAndSpeaker mQuoteAndSpeaker = mQuoteBook.getFact();
                String quote = mQuoteAndSpeaker.getQuote();
                String speaker = mQuoteAndSpeaker.getSpeaker();
                // Update display with new quote
                factLabel.setText(quote);
                speakerLabel.setText(speaker);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

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
