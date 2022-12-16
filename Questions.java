import java.util.Scanner;
public class Questions {
    Scanner sc = new Scanner(System.in);
    
    public boolean askQuestion(){
    boolean acceptedInput = false;
    System.out.println("Hello World is followed by an exclamation point");
    String x = sc.nextLine();
    boolean answer = false;
    while(acceptedInput==false){
    if (x.equals("yes")||x.equals("Yes")){
        answer = true;
        acceptedInput=true;
    } else if (x.equals("no")||x.equals("No")){
        answer = false;
        acceptedInput=true;
    } else{
        System.out.print("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND ");

    }
}
return answer;
}
public void questionsP2(int x){
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

    } else if(x==2){

    } else if(x==3){

    }
}
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
