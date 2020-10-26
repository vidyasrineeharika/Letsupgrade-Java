
import java.util.Scanner;
public class Question
{
  Scanner sc = new Scanner (System.in);
  String question, a1, b2, c3, d4;
  int correct, user;

  public boolean askQuestion ()
  {
    System.out.println (question);
    System.out.println ("1. " + a1);
    System.out.println ("2. " + b2);
    System.out.println ("3. " + c3);
    System.out.println ("4. " + d4);
    System.out.println ("Select an option");
    user = sc.nextInt ();
    if (user == correct)
      {
	return true;
      }
    return false;
  }

}
