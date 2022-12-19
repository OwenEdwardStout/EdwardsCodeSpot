package Incomplete;
import java.util.Scanner;
public class Questions {
    //Initialize
    Scanner sc = new Scanner(System.in);
    
    //Ask question function should ask a Java based question and return true if it was correct and false if it was wrong.
    public boolean askQuestion(){
    //Sets accepted input as false so that the code expectedly reruns the while statements else section endlessley when the user inputs an answer other than yes or no.
    boolean acceptedInput = false;
    //rolls randomly for one of a few java questions asks it grabs an answer from the user then returns true if the users answer was correct and false if it was incorrect.
    int questionChoice = (int) (Math.random()*/*Your number of questions*/);
    boolean answer = false;

    //TO DO - Write questions taking into account random number for the choice. Set accepted input to true if the user answers yes or no. If they don't print something spooky.
    //Returs answer (true if correct and false if wrong)
    /*Your code here*/

//questionsP2 should give one of 3 random fortunes based on the number of correct answers given durring the quiz.
public void questionsP2(int x){
    //answer is only used for the last ending to interupt the fortune teller
    String answer;
    int fortune = (int) (Math.random()*3);
    if(x==0){
        System.out.println("You didn't get a single question right... That's... huh. Well let's take a look at your fortune.");
        if (fortune==0){
            System.out.println("In the years to come you'll find yourself down on your luck. Broke. Alone. But there will be a light at the end of the tunnel. It's a train. Things don't look good.");
        } else if (fortune==1){
            System.out.println("Things are looking up! Right up stink creek that is. You seem to be on the road to loosing your house... uh oh...");
        } else if (fortune==2){
            System.out.println("Uh oh. I don't see much. How good is your life insurance? I'd make sure you get it up to snuff soon.");
        }
    } else if(x==1){
        System.out.println("You got one. That's uhhhhh... That's not many. But hey lets take a look at that fortune!");
        if (fortune==0){
            System.out.println("A modest life seems to be ahead of you. Small quaint house, nice people, decent job. Nothing in the big city of course, but hey enjoy it.");
        } else if (fortune==1){
            System.out.println("Well it could be better. You seem to have a bit of a problem with some unsavory types. I wouldn't recomend taking out any loans from men in suits that seem a little too nice.");
        } else if (fortune==2){
            System.out.println("Well... you become succesfull in a way I suppose... #1 most paid beggar in NYC! That's not too bad right?");
        }
    } else if(x==2){
        System.out.println("You got 2. Not great not bad. Well let's see what your future holds.");
        if (fortune==0){
            System.out.println("Not bad! A job at a small computer firm. I can't tell how far you climb position wise, but looks like the money and hours aren't terrible.");
        } else if (fortune==1){
            System.out.println("Huh. I didn't think you'd be the type. Seems like showbuisness is on the horizon. Don't forget where you came from!");
        } else if (fortune==2){
            System.out.println("Oh you hate to see it. Things looked so good at first but your major investments fall flat. Trust me when I tell you it's not going to the moon bud.");
        }
    } else if(x==3){
        System.out.println("Hey you got 100% 3/3 the big hundo! Not too shabby. I'll give you a choice. Come work for me and I won't ruin your life.");
        answer = sc.nextLine();
        System.out.println("Don't interrupt me mortal! I'm not done speaking yet. You think I'm simply a fortune teller subject to the whims of my wealth? §bIGjAVAcORP§™ doesn't own me, I own §bIGjAVAcORP§™! I am a god! You are nothing! You will follow me as my acolyte! Dilligently pounding away at your keyboard while I laugh! Class after class object after object you will pledge yourself to me as I build my eternal hegemony! Bow to me! None can stop the march of progress! HAHAHAHAHAHAHAHAHHAHAHAHAHAHAHAHAHAHAHHAHAHAHAHAHHAHAHAHAHHAHAHAHAHHAHAHAHAHAHAHHAHAAHAHAHAHHAHAHAHAHAHAHHAHAHAHAHHAHAHAHAHHAHAHAHAHHAHAHAHAHHAHAAHAHHA*cough*HAHA");
    }
}

    //Quiz runs the question 3 times and returns the number of correct answers
    
    public int quiz(){
        int correctTotal = 0;
        for(int x = 0; x < 3; x++){
           if(askQuestion()==true){
           correctTotal++;
        }
    }
    return correctTotal;
}
}
