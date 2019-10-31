package uoft.csc207.games.model;


public class ScrollerGame extends Game {


    public int HighScore;

    public ScrollerGame(PlayerProfile p){
        super(p);
        initializeAchievements();
        this.id = p.getId() + ": Scroller";
        this.owner = p;
        gameCurrency = p.getCurrency();
        HighScore = 0;
    }


    public String getId(){return this.id;}

    /**
     * Updates score of the Game and the total score of the account
     * @param i The amount to add to the score
     */
    public void updateScore(int i){this.gameScore = i;}

    /**
     * Updates currency of the Game and the total currency of the account
     * @param i The amount to add to the currency
     */
    public void updateCurrency(int i){
        this.gameCurrency = i;
    }


    public int getScore(){
        return this.gameScore;
    }


    /**
     * Clears the game stats
     */
    public void restart(){gameScore = 0;}

    public void chooseCharacter(String character){this.character = character;}

    public void chooseFont(String font){this.textFont = font;}

    public void chooseColor(String color){this.color = color;}

    /**
     * Initialize all the achievements that can be attained in your game
     */
    public void initializeAchievements(){
        for (int i = 50; i < 15000; i = i * 2){
            String name = "Scored: " + i;
            String description = "Player reached this score.";
            gameAchievements.add(new Achievement(name, description, i, 0, true, false));
        }
    }
}
