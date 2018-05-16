 public class Team
{
    private String teamName;
    private int yellowCardScore;
    private int redCardScore;
    private int fairPlayScore;
    private Player player1;
    private Player player2;
    private int teamRanking;
    private int numberOfPointsScored;
    
    

    /**
     * Constructor for objects of class Team
     */
     public Team()
     {
       teamName = "";
        yellowCardScore = 0;
        redCardScore = 0;        
        teamRanking = 0;
        numberOfPointsScored = 0;
     }
    public Team(String nameOfCountry ,int numberOfyellowCard,int numberOfredCard,int teamRank,int noOfPointsScored)
    {
        nameOfCountry = teamName;
        yellowCardScore = numberOfyellowCard;
        redCardScore = numberOfredCard;        
        teamRanking = teamRank;
        numberOfPointsScored = noOfPointsScored;
        }

    
    public int fairPlayScore()
    {
        fairPlayScore = yellowCardScore + redCardScore;
        return fairPlayScore;
    }
    
    public String getteamName()
    {
        return teamName;
    }
    
    public int getyellowCardScore()
    {
        return yellowCardScore;
    }
    
    public int getredCardScore()
    {
        return redCardScore;
    }
    
    public int getnumberOfPointsScored()
    {
        return numberOfPointsScored;
    }
    
    public int getteamRanking()
    {
        return teamRanking;
    }
    
    public void setteamName(String name)
    {
        teamName = name;
    }
    
    public void setyellowCardScore(int  yellowScore)
    {
        yellowCardScore = yellowScore;
    }
    public void setredCardScore(int  redScore)
    {
        redCardScore = redScore;
    }
    public void setteamRanking(int teamRank)
    {
        teamRanking = teamRank;
    }
    
    public void numberOfPointsScored(int PointsScored)
    {
        numberOfPointsScored = PointsScored;
    }
    
 }
