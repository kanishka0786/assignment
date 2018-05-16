 
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Game
{
    // instance variables - replace the example below with your own
    private int x;
        private ArrayList<Team> TeamList;

    ;
        /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        TeamList = new ArrayList<>();

    }
    public void addfile(String teamName, int ranking, String player1, String player2) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\data.txt"));
        ArrayList<String> listS = new ArrayList<String>();
        ArrayList<Integer> listI = new ArrayList<Integer>();
        while(input.hasNextLine())
            listS.add(input.nextLine());
            listI.add(input.nextInt());
            
            System.out.println(listS);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void menuDisplay()
    {
    }// put your code here
        
            
            private void gamePlay()
            {
                
            }

            private void displayGameResult()
            {

            }

            private void playPenaltyShootOut()
            {

            }
        }
        
