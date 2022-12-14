import java.util.Scanner;
public class FortuneTeller {
    
    Scanner sc = new Scanner(System.in);
    String answer;
    public int introScript1(){
        System.out.println("\n\n\n--------------------------------------------------------------------------------\nHello weary traveler! Please take some time to rest your head. Allow me to read into your future...\n(Enter to continue)");
        answer = sc.nextLine();
        System.out.println("Alright traveler, I have a proposition to make. Just so that I can get as accurate a fortune for you as possible. I'll ask you quesitons and you respond. Depending on your response I'll be able to give you the best read possible. Is that fine?");
        answer = sc.nextLine();
        System.out.println("Yeah just like that! I mean " + answer + " was a bit of a strange response... But at least you get how it works now. Go for yes or no in the future. And if the question is a true or false sort yes is true and no is false. My patience is waning this late in my carrer, and I don't really want to deal with any silliness, so just follow the rules.");
        answer = sc.nextLine();
        System.out.println("Look I'll be honest. The money isn't great for this job anymore so I've had to pick up a bit of a side job.");
        answer = sc.nextLine();
        System.out.println("I'm a shill for §bIGjAVAcORP§™. I'm not proud of it, but I'll have to ask some Java related questions. ok?");
        answer = sc.nextLine();
        if(answer.equals("yes")||answer.equals("Yes")){
            return 1;
        }else
        if(answer.equals("no")||answer.equals("No")){
            return 2;
        }else{
            System.out.print("Look. I'll be honest this wasn't supposed to be that hard. You were just supposed to say yes or no. I don't know how you've even managed to fail this. I don't need to be a fortune teller to tell you that you ain't goin far chief.");
            return 3;
        }
    }
    public int midScript1(){
        int correctTotal = 0;
        System.out.println("Great! Let's get started right away. Suppose you wanted to print something. The statement you would use is System.out.print() correct?");
        answer = sc.nextLine();
        if(answer.equals("yes")||answer.equals("Yes")){
            correctTotal++;
        }
        return correctTotal;
    }

}
