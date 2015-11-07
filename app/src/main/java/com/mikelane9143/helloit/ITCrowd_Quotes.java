package com.mikelane9143.helloit;

import java.util.Random;

/**
 * Created by Michael on 4/04/2015.
 */
public class ITCrowd_Quotes {

    // Member variables
    public String[] mQuotes = {
            "Hello, IT. Have you tried turning it off and on again?",
            "Don't Google the question, Moss.",
            "If you can't work as a team, you're all fired.",
            "I'm declaring war on stress. Anyone still experiencing stress at the of the day, will be fired!",
            "Macs? No, I just work with Windows.",
            "0118 999 881 999 119 7253",
            "Just a second... I'm late for golf!",
            "Now get in there, and do some work, to do with compu-ters.",
            "You don't want to end up in the middle of invalid memory.",
            "I would say we're on a bi-weekly beating.",
            "I don't know if it's the loss of blood, or smoke from the monitor, but I feel fine.",
            "Please, please dress as my sexy, dead wife.",
            "What does IT stand for?",
            "You do know how a button works, don't you?",
            "Excuse me. Are you from the past?",
            "You don't want the rainforest to die do you?",
            "Conrad Black - the first rich person to go to prison in 300 years.",
            "I can't hear you. Can't you see we're having an iPod party.",
            "Well,  if it's okay  with the Hawk, then I guess it's okay.",
            "You'll not be fired by me at this precise moment.",
            "Hello IT. Yaha. Have you tried forcing an unexpected reboot?",
            "Yes. Yesterday's jam. That's what we are to them.",
            "Why are you giving me the secret signal to shut up?",
            "So, what can we do you for?",
            "Would you mind closing the door for me. From the other side.",
            "A plan? Let me put on my slightly larger glasses.",
            "Would you like us to access the data supplier and connect you to the matrix.",
            "Chairman Wow!",
            "It's off. That means I turn it on, and just walk away.",
            "Ohh! Four! I mean Five! I mean Fire!",
            "Didn't know what a stress machine was this morning, and now we have two of them.",
            "I don't think I'd thrive in a prison environment, Roy.",
            "Did somebody email us about a fire?",
            "Do you remember the Internet at this speed?  Up all night and you'd see eight women.",
            "Haven't you got it yet? That's what I do. I lie. I lie. And I lie. And I lie.",
            "It's just a boring old storeroom.  It's just a storeroom where we keep the snippets.",
            "I know the place looks like a bit of a mess, but it's actually a very delicate ecosystem.",
            "Richmond's out of his room. He's not in his room.  He's supposed to be in his room.  Why is he out of his room?",
            "Goths are people too.",
            "I'm still talking, aren't I?",
            "How could I talk about all that computer stuff, all that computer gobbledy-gook, without talking about, the lawyers?",
            "Do we have PMT?!",
            "Oh, come on.  No one would use that sort of information against us. Oh wait a second, they would wouldn't they. Oh no!",
            "You know how suggestible and easily swayed IT people are.",
            "How do I erase files? Like this one here, marked Pensions.",
            "I know, egg, and my face, were in alignment.",
            "Buying the same sort of cheese.  You made a 20-minute story out of it.  Have you thought about adapting it into a film?",
            "It's my home. It's my special place.  I can't let you nut jobs into my special place.",
            "If you type 'Google', into Google, you can break the Internet.",
            "What's going on down in Middle-Earth?",
            "A ladder to help moths escape from the bath.  How is that useful?",
            "Enough of the jiber-jaber.",
            "Damn that sorcerer. 20 gold pieces, and I'm wankered on Rohypnol.",
            "I don't think I've ever looked in this drawer.  Wow! A gun!",
            "Ok, sweetcheeks, here comes the pain!",
            "You there, computer-man, fix my pants.",
            "I'm in my happy place.  I'm in my happy place.",
            "Well I'm the boss, head honcho, el numero uno, Mr Big, the Godfather, Lord of the Rings, the Bourne Identity, er... Taxi Driver, Jaws.",
            "Oh, please.  No flash photography.  You'll harm the Internet.",
            "We own everything you put on Friendface - it says so in the terms and agreements." };

    // Methods
    public String getFact(){

        // the button was clicked to update the fact label with a new fact
        String fact = "";
        // randomly choose a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mQuotes.length);

        fact = mQuotes[randomNumber];

        return fact;
    }
}
