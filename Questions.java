import java.util.Scanner;
public class Questions {
    //Initialize
    Scanner sc = new Scanner(System.in);
    
    //Ask question function should ask a Java based question and return true if it was correct and false if it was wrong.
    public boolean askQuestion(){
    //Sets accepted input as false so that the code expectedly reruns the while statements else section endlessley when the user inputs an answer other than yes or no.
    boolean acceptedInput = false;
    //rolls randomly for one of the 10 questions asks it grabs an answer from the user then returns true if the users answer was correct and false if it was incorrect.
    int questionChoice = (int) (Math.random()*10);
    boolean answer = false;
    if(questionChoice == 0){
    System.out.println("Hello World is followed by an exclamation point.");
    String x = sc.nextLine();
    while(acceptedInput==false){
    if (x.equals("yes")||x.equals("Yes")){
        answer = true;
        acceptedInput=true;
    } else if (x.equals("no")||x.equals("No")){
        answer = false;
        acceptedInput=true;
    } else{
        System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
    }}} else if (questionChoice == 1){
        System.out.println("Every line ends with a colon.");
        String x = sc.nextLine();
        while(acceptedInput==false){
        if (x.equals("yes")||x.equals("Yes")){
            answer = false;
            acceptedInput=true;
        } else if (x.equals("no")||x.equals("No")){
            answer = true;
            acceptedInput=true;
        } else{
            System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");  
        }}} else if (questionChoice==2){
            System.out.println("Java is the objectively best language. (The fortune teller leans in and their eyes narrow.)");
            String x = sc.nextLine();
            while(acceptedInput==false){
            if (x.equals("yes")||x.equals("Yes")){
                answer = true;
                acceptedInput=true;
                System.out.println("(They lean back with a grin, satisfied.)");
            } else if (x.equals("no")||x.equals("No")){
                answer = false;
                acceptedInput=true;
                System.out.println("(The fortune teller holds your gaze for a moment before leaning back with a frown)");
            } else{
                System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
            }}} else if (questionChoice==3){
                System.out.println("Strings are primitive data types.");
                String x = sc.nextLine();
                while(acceptedInput==false){
                if (x.equals("yes")||x.equals("Yes")){
                    answer = false;
                    acceptedInput=true;
                } else if (x.equals("no")||x.equals("No")){
                    answer = true;
                    acceptedInput=true;
                } else{
                    System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
                }}} else if (questionChoice==4){
                    System.out.println("GUI is pronounced \"Gooey\"");
                    String x = sc.nextLine();
                    while(acceptedInput==false){
                    if (x.equals("yes")||x.equals("Yes")){
                        answer = true;
                        acceptedInput=true;
                    } else if (x.equals("no")||x.equals("No")){
                        answer = false;
                        acceptedInput=true;
                    } else{
                        System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
                    }}} else if(questionChoice==5){
                        System.out.println("When you initialize a variable you must assign a value.");
                        String x = sc.nextLine();
                        while(acceptedInput==false){
                        if (x.equals("yes")||x.equals("Yes")){
                            answer = false;
                            acceptedInput=true;
                        } else if (x.equals("no")||x.equals("No")){
                            answer = true;
                            acceptedInput=true;
                        } else{
                            System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
                        }}} else if (questionChoice==6){
                            System.out.println("Edward is the best midle name of all time.");
                            String x = sc.nextLine();
                            while(acceptedInput==false){
                            if (x.equals("yes")||x.equals("Yes")){
                                answer = true;
                                acceptedInput=true;
                                System.out.println("CORRECT! Oh sorry I'm not supposed to say that yet. My B.");
                            } else if (x.equals("no")||x.equals("No")){
                                answer = false;
                                acceptedInput=true;
                                System.out.println("We can't be friends you and I.");
                            } else{
                                System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
                            }}} else if(questionChoice==7){
                                System.out.println("Adding \\n at the end of your print statement is the same as using a println statement.");
                                String x = sc.nextLine();
                                while(acceptedInput==false){
                                if (x.equals("yes")||x.equals("Yes")){
                                    answer = true;
                                    acceptedInput=true;
                                } else if (x.equals("no")||x.equals("No")){
                                    answer = false;
                                    acceptedInput=true;
                                } else{
                                    System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
                                }}} else if (questionChoice==8){
                                    System.out.println("C++ more like C-- amirite?");
                                    String x = sc.nextLine();
                                    while(acceptedInput==false){
                                    if (x.equals("yes")||x.equals("Yes")){
                                        answer = true;
                                        acceptedInput=true;
                                        System.out.println("That's what I'm sayin!");
                                    } else if (x.equals("no")||x.equals("No")){
                                        answer = false;
                                        acceptedInput=true;
                                        System.out.println("Your lack of humor is agregious.");
                                    } else{
                                        System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
                                    }}} else if (questionChoice==9){
                                        System.out.println("Intergers are immutable");
                                        String x = sc.nextLine();
                                        while(acceptedInput==false){
                                        if (x.equals("yes")||x.equals("Yes")){
                                            answer = false;
                                            acceptedInput=true;
                                        } else if (x.equals("no")||x.equals("No")){
                                            answer = true;
                                            acceptedInput=true;
                                        } else{
                                            System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");
                                        }}}
return answer;
}

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
    //Quiz should run the question method three times and return the number of times it was true
    
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
