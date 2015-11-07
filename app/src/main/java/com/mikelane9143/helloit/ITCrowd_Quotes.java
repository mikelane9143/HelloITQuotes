package com.mikelane9143.helloit;

import android.util.Log;

import java.util.Random;

/**
 * Created by Michael on 4/04/2015.
 */

/**
 * Updated by Michael on 8/11/2015 - Hello IT with Answers
 */

class QuoteAndSpeaker {

    private String mQuote = "";
    private String mSpeaker = "";

    public static final String TAG = QuoteAndSpeaker.class.getSimpleName();

    public QuoteAndSpeaker(){
        mQuote = "";
        mSpeaker = "";
    }

    public void setQuoteAndSpeaker(String quote, String speaker) {
        mQuote = quote;
        mSpeaker = speaker;
    }

    public String getQuote(){
        return mQuote;
    }

    public String getSpeaker(){
        return mSpeaker;
    }
}

public class ITCrowd_Quotes {

    // Member variables
    public String[][] mQuotes = {
            {"Hello, IT. Have you tried turning it off and on again?", "Roy"},
            {"Don't Google the question, Moss.","Roy"},
            {"If you can't work as a team, you're all fired.", "Denholm"},
            {"I'm declaring war on stress. Anyone still experiencing stress at the of the day, will be fired!", "Denholm"},
            {"Macs? No, I just work with Windows.", "Roy"},
            {"0118 999 881 999 119 7253","Moss"},
            {"Just a second... I'm late for golf!", "Denholm"},
            {"Now get in there, and do some work, to do with compu-ters.", "Jen"},
            {"You don't want to end up in the middle of invalid memory.", "Moss"},
            {"I would say we're on a bi-weekly beating.", "Moss"},
            {"I don't know if it's the loss of blood, or smoke from the monitor, but I feel fine.", "Roy"},
            {"Please, please dress as my sexy, dead wife.", "Douglas"},
            {"What does IT stand for?", "Jen/June"},
            {"You do know how a button works, don't you?", "Roy"},
            {"Excuse me. Are you from the past?", "Roy"},
            {"You don't want the rainforest to die do you?", "Roy"},
            {"Conrad Black - the first rich person to go to prison in 300 years.", "Douglas"},
            {"I can't hear you. Can't you see we're having an iPod party.", "Douglas"},
            {"Well, if it's okay with the Hawk, then I guess it's okay.", "Roy"},
            {"You'll not be fired by me at this precise moment.", "Denholm"},
            {"Hello IT. Yaha. Have you tried forcing an unexpected reboot?", "Moss"},
            {"Yes. Yesterday's jam. That's what we are to them.", "Roy"},
            {"Why are you giving me the secret signal to shut up?", "Moss"},
            {"So, what can we do you for?", "Roy"},
            {"Would you mind closing the door for me. From the other side.", "Jen"},
            {"A plan? Let me put on my slightly larger glasses.", "Moss"},
            {"Would you like us to access the data supplier and connect you to the matrix.", "Roy"},
            {"Chairman Wow!", "Moss"},
            {"It's off. That means I turn it on, and just walk away.", "Moss"},
            {"Ohh! Four! I mean Five! I mean Fire!", "Moss"},
            {"Didn't know what a stress machine was this morning, and now we have two of them.", "Roy"},
            {"I don't think I'd thrive in a prison environment, Roy.", "Moss"},
            {"Did somebody email us about a fire?", "Fireman"},
            {"Do you remember the Internet at this speed?  Up all night and you'd see eight women.", "Roy"},
            {"Haven't you got it yet? That's what I do. I lie. I lie. And I lie. And I lie.", "Jen"},
            {"It's just a boring old storeroom.  It's just a storeroom where we keep the snippets.", "Roy"},
            {"I know the place looks like a bit of a mess, but it's actually a very delicate ecosystem.", "Roy"},
            {"Richmond's out of his room. He's not in his room.  He's supposed to be in his room.  Why is he out of his room?", "Moss"},
            {"Goths are people too.", "Richmond"},
            {"I'm still talking, aren't I?", "Moss"},
            {"How could I talk about all that computer stuff, all that computer gobbledy-gook, without talking about, the lawyers?", "Denholm"},
            {"Do we have PMT?!", "Roy"},
            {"Oh, come on.  No one would use that sort of information against us. Oh wait a second, they would wouldn't they. Oh no!", "Moss"},
            {"You know how suggestible and easily swayed IT people are.", "Richmond"},
            {"How do I erase files? Like this one here, marked Pensions.", "Douglas"},
            {"I know, egg, and my face, were in alignment.", "Moss"},
            {"Buying the same sort of cheese.  You made a 20-minute story out of it.  Have you thought about adapting it into a film?", "Roy"},
            {"It's my home. It's my special place.  I can't let you nut jobs into my special place.", "Jen"},
            {"If you type 'Google', into Google, you can break the Internet.", "Jen"},
            {"What's going on down in Middle-Earth?", "Manager"},
            {"A ladder to help moths escape from the bath.  How is that useful?", "Roy"},
            {"Enough of the jiber-jaber.", "Douglas"},
            {"Damn that sorcerer. 20 gold pieces, and I'm wankered on Rohypnol.", "Douglas"},
            {"I don't think I've ever looked in this drawer.  Wow! A gun!", "Douglas"},
            {"Ok, sweetcheeks, here comes the pain!", "Roy"},
            {"You there, computer-man, fix my pants.", "Douglas"},
            {"I'm in my happy place.  I'm in my happy place.", "Moss"},
            {"Well I'm the boss, head honcho, el numero uno, Mr Big, the Godfather, Lord of the Rings, the Bourne Identity, er... Taxi Driver, Jaws.", "Douglas"},
            {"Oh, please.  No flash photography.  You'll harm the Internet.", "Jen"},
            {"We own everything you put on Friendface - it says so in the terms and agreements.", "Friendface add"} };

    public static final String TAG = ITCrowd_Quotes.class.getSimpleName();

    // Methods
    public QuoteAndSpeaker getFact(){

        // the button was clicked to update the fact label with a new fact
        //String fact = "";
        QuoteAndSpeaker quoteAndSpeaker = new QuoteAndSpeaker();
        // randomly choose a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mQuotes.length);
        Log.d(TAG, "New random number " + randomNumber);
        quoteAndSpeaker.setQuoteAndSpeaker(mQuotes[randomNumber][0], mQuotes[randomNumber][1]);
        Log.d(TAG, "Quote is " + quoteAndSpeaker.getQuote());
        Log.d(TAG, "Answer is " + quoteAndSpeaker.getSpeaker());
        return quoteAndSpeaker;
    }
}
