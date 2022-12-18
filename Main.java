public class Main {
    public static void main (String[]args){
        int result;
        Questions q = new Questions();
        FortuneTeller x = new FortuneTeller();
        int introEnding = x.introScript1();
        if(introEnding==1){
result = q.quiz();
            q.questionsP2(result);
            System.out.print("You got ending 1."+result+"!");
        } else if (introEnding==2){
            System.out.println("Leave then.");
            System.out.println("You got ending 2!");
        } else if (introEnding==3){
            System.out.println("You got ending 3! Try harder!");
        }
        
    }
}