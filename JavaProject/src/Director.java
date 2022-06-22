

public class Director
{
    // in charge of everything Directs the other classes and calls them here
    // main game loop here as well!
    static RandomNumber ran = new RandomNumber();
    static UserInput input = new UserInput();

    static TurnOrder turns = new TurnOrder();
    private static boolean isGameRunning = true;
    private static int secretNumber = ran.GetRandom(100);


    public static void StartGame()
    {
        prepareGame();
      while(isGameRunning)
      {
          doUpdates();
      }

    }

    private static void prepareGame()
    {
        turns.addPlayer("Player 2");
        turns.addPlayer("Player 1");
        System.out.println(turns.getTurnOrder());
    }
    // What is updated in the game loop! Logic for winning is here!
    private static void doUpdates()
    {
        int guess = Integer.parseInt(input.userInput());
        if(guess > secretNumber)
        {
            System.out.println("Lower");
            System.out.println("_______________");
            System.out.println(turns.getTurnOrder());
        } else if (guess < secretNumber) {
            System.out.println("Higher");
            System.out.println("_______________");
            System.out.println(turns.getTurnOrder());

        } else if (guess == secretNumber) {
            System.out.println("You Win!!!");
            isGameRunning = false;
        }


    }



}
