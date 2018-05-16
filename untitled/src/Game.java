import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Game() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Tejas\\Documents\\Kansihka Assigment\\assignment\\untitled\\teams.txt"));
        ArrayList<Team> teams = new ArrayList<>();

        while(br.readLine()!=null){
            teams.add(new Team(br.readLine()));
            teams.get(teams.size()-1).setRanking(Integer.parseInt(br.readLine()));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("A. Play Preliminary Stage\n" +
                "B. Play Final\n" +
                "C. Display Teams\n" +
                "D. Display Players\n" +
                "E. Display Cup Result\n" +
                "X. Close");
        System.out.println("Enter choice: ");
        String choice = sc.next();
        while (choice.equalsIgnoreCase("X")){

        }

        br.close();


    }
}
