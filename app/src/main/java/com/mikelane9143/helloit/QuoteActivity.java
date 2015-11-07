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
        final Button showFactButton = (Button) findViewById(R.id.next_Quote_Button);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mQuoteBook.getFact();
                // Update display with new fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        // Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate method");
    }

}
