import java.util.Scanner;
public class FortuneTeller {

    //Initialize
    Scanner sc = new Scanner(System.in);
    String answer;

    //Intro script - Gives player premise and allows them to pace their reading by requiring input to continue after a few lines.
    public int introScript1(){
        System.out.println("\n--------------------------------------------------------------------------------\nHello weary traveler! Please take some time to rest your head. Allow me to read into your future...\n(Enter to continue)");
        answer = sc.nextLine();
        System.out.println("Alright traveler, I have a proposition to make. Just so that I can get as accurate a fortune for you as possible\n I'll ask you quesitons and you respond. Depending on your response I'll be able to give you the best read possible.\nIs that fine?");
        answer = sc.nextLine();
        System.out.println("Yeah just like that! I mean " + answer + " was a bit of a strange response... But at least you get how it works now.\nGo for yes or no in the future. All questions are true or false but I want them answered with yes or no.\nDon't look at me like that! It's because I said so!\nMy patience is waning this late in my carrer, and I don't really want to deal with any silliness, so just follow the rules.");
        answer = sc.nextLine();
        System.out.println("Look I'll be honest. The money isn't great for this job anymore so I've had to pick up a bit of a side job.");
        answer = sc.nextLine();
        System.out.println("I'm a shill for §bIGjAVAcORP§™. I'm not proud of it, but I'll have to ask some Java related questions. ok?");
        answer = sc.nextLine();

        //Resturns ending to introduction based on users response to the question. 1 is the answer "yes" or "Yes" and continues the game, "no" or "No" end it, and any other response gets an ending where the fortune teller calls you a dingus for failing to answer yes or no.

        if(answer.equals("yes")||answer.equals("Yes")){
            return 1;
        }else
        if(answer.equals("no")||answer.equals("No")){
            return 2;
        }else{
            System.out.println("Look. I'll be honest this wasn't supposed to be that hard. You were just supposed to say yes or no.\nIt was even a yes or no question. I know I said all questions were true or false but c'mon that was a gimmie.\n\nI don't know how you've even managed to fail this.\n\nI don't need to be a fortune teller to tell you that you ain't goin far chief.");
            return 3;
        }
    }
}
