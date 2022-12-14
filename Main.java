public class Main {
    public static void main (String[]args){
        Questions q = new Questions();
        FortuneTeller x = new FortuneTeller();
        int introEnding = x.introScript1();
        if(introEnding==1){
            System.out.println("You got " +q.quiz());
        } else if (introEnding==1){
            System.out.println("Leave then.");
        }
        
    }
}
