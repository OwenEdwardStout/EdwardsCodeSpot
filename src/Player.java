public class Player {
    private int score = 0;
    private String name;

    //DO NOT CHANGE
    public Player(String name){

        this.name = name;
        System.out.println("-----------------------------");
    }

    //TO DO - DONE
    public int getScore(){
        return score;
    }
    //TO DO - DONE
    public String getName(){
        return name;
    }

    public void adjustScore(int x){
        score +=x;
    }
}
