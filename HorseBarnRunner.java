/*
 * Activity 3.7.3
 */
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    //Initialize instances and variables
    HorseBarn riverside = new HorseBarn();
    System.out.println(riverside.getSpaces());
    RandomPermutation perm = new RandomPermutation();
    System.out.println(perm.next(8));
  }
} 