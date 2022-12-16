public class Main {
    public static void main (String[]args){
        int result;
        Questions q = new Questions();
        FortuneTeller x = new FortuneTeller();
        int introEnding = x.introScript1();
        if(introEnding==1){
result = q.quiz();
            
        } else if (introEnding==2){
            System.out.println("Leave then.");
        }
        
    }
}