public class Main {
    public static void main (String[]args){

        //Initialize

        int result;
        Questions q = new Questions();
        FortuneTeller x = new FortuneTeller();

        //Play intro script and hold ending

        int introEnding = x.introScript1();

        //If the player got into ending 1 run the quiz.

        if(introEnding==1){
            System.out.println("Alrighty then let's see here...\nAha here's my question sheet!\n\n----------------------------------------------------\n");
            result = q.quiz();
            //Based on their quiz result grab their sub ending.
            q.questionsP2(result);
            //Return ending as 1 followed by however many questions they got right.
            System.out.print("You got ending 1."+result+"!");

        //If they player got intro ending 2 or 3 end the game
        
        } else if (introEnding==2){
            System.out.println("Leave then.");
            System.out.println("You got ending 2!");
        } else if (introEnding==3){
            System.out.println("You got ending 3! Try harder!");
        }
        
    }
}