public class Player
{
    // instance variables Fields for Player is being declared
    private String name;
    private int numberOfGoals;

    /**
     * Default Constructor for objects of class Player
     * name is intialize to null
     * score is initialize to zero
     * guess is initialize to zero
     */
    public Player()
    {
        // initialise instance variables
        name = "";
        numberOfGoals = 0;
    }

    /**
     * Parameterized Constructor for objects of class Player
     * name is intialize to playerName
     * score is initialize to playerScore
     * guess is initialize to playerGuess
     */
    public Player(String playerName, int playerNumberOfGoals)
    {
        name = playerName;
        numberOfGoals = playerNumberOfGoals;

    }

    /**
     * The getGuess method is used for getting guess details.
     * @return guess details to user
     */
    public int getNumberOfGoals()
    {
        return numberOfGoals;
    }

    /**
     * The getName method is used for getting the name details.
     * @return name details to user
     */
    public String getName()
    {    
        return name;
    }

    /**
     * The setGuess method is used for setting player guess.
     * @param playerGuesses in int data type
     * @return setGuesses to get guess details of user
     */public void setNumberOfGoals(int playerNumberOfGoals)
    {
        numberOfGoals = playerNumberOfGoals;
        System.out.println(numberOfGoals);
    }

    /**
     * The setName method is used for setting player name.
     * @param playerName in String data type
     * @return  set playerName to name details to user
     */
    public void setName(String playerName)
    {
        name = playerName;
    }
}