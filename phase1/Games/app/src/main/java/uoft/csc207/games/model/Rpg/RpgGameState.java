package uoft.csc207.games.model.Rpg;

import java.util.ArrayList;

import uoft.csc207.games.model.Achievement;
import uoft.csc207.games.model.Game;
import uoft.csc207.games.model.IGameID;
import uoft.csc207.games.model.PlayerProfile;

/**
 * Contains the relevant stats of the Rpg game
 */
public class RpgGameState extends Game {
    public final static String FONT_TYPE_MONOSPACE = "monospace";
    public final static String FONT_TYPE_SANS_SERIF = "sans-serif";
    public final static String FONT_COLOR_BLACK = "black";
    public final static String FONT_COLOR_WHITE = "white";
    public final static String FONT_COLOR_RED = "red";

    public RpgGameState(){
        super();
        id = IGameID.RPG;
        //updateCurrency(1);
        initializeAchievements();
    }

    public String getId(){
        return id;
    }
    public void updateScore(Integer i){
        gameScore += 50;
    }
    public void updateCurrency(Integer i){
        gameCurrency++;
    }
    public void restart(){

    }
    public void chooseCharacter(String character){
        this.character = character;
    }
    public void chooseFont(String font){
        this.textFont = font;
    }
    public void chooseColor(String color){
        this.color = color;
    }

    public void initializeAchievements(){
        Achievement temp;
        temp = new Achievement("Adventurer", "Achieved score of 100 in the Rpg",
                100, 0, true, false);
        availableAchievements.add(temp);
        temp = new Achievement("Moving up in the world", "Increased your money above 0",
                0, 1, false, true);
        availableAchievements.add(temp);
    }
}
