

public class Quiz
{

  Question[] questions = new Question[3];
  Player player = new Player ();

    String[] questionsdata =
  {
  "World Tourism Day is celebrated on?", "Telescope was invented by?",
      "The world smallest country is?"};
  String[]a =
  {
  "September 12", "Galileo", "Fiji"};
  String[]b =
  {
  "September 27", "Newton", "Sri Lanka"};
  String[]c =
  {
  "September 15", "Marie curie", "Brazil"};
  String[]d =
  {
  "September 23", "Kepler", "Vatican city"};
  int[] answers = { 2, 1, 4 };


  public void Game ()
  {

    for (int i = 0; i < 3; i++)
      {
	questions[i] = new Question ();
      }


    for (int i = 0; i < 3; i++)
      {

	questions[i].question = questionsdata[i];
	questions[i].a1 = a[i];
	questions[i].b2 = b[i];
	questions[i].c3 = c[i];
	questions[i].d4 = d[i];
	questions[i].correct = answers[i];
      }


  }
  public void play ()
  {

    player.getDetails ();
    for (int i = 0; i < 3; i++)
      {
	boolean check = questions[i].askQuestion ();
	if (check == true)
	  {
	    player.score = player.score + 1;
	  }
	else
	  {

	    player.score = player.score - 1;
	  }
      }
    System.out.println ("Well played!!");
    System.out.println (player.name + " your score is " + player.score);

  }

}
