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
        System.out.println("WHAT ABOUT YES OR NO DIDN'T YOU UNDERSTAND");

    }
}
return answer;
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
