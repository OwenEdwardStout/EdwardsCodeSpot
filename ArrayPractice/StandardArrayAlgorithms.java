package ArrayPractice;

/*
 * Activity 3.6.4
 */
public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    //MAX
    int max = goals[0];
    for(int f : goals){
        if(goals[f]>max){
            
        }
    }

    //SUM
    int sum = 0;
    for (int i = 0; i < goals.length; i++)
      sum += goals[i];

    System.out.println("All goals: " + sum);

    //MEAN
    double mean = (double)sum/(goals.length+1);
    System.out.println("Mean;" + mean);
    }

}