package uoft.csc207.games.model;

public class Achievement {
    private String achievementName;
    private String description;
    private int scoreThreshold;
    private int goldThreshold;
    private boolean checkGold;
    private boolean checkScore;

    public Achievement(String name, String description, int scoreThreshold, int goldThreshold, boolean checkScore, boolean checkGold){
        achievementName = name;
        this.description = description;
        this.scoreThreshold = scoreThreshold;
        this.goldThreshold = goldThreshold;
        this.checkGold = checkGold;
        this.checkScore = checkScore;
    }

    public String getAchievementName(){
        return achievementName;
    }
    public String getDescription(){
        return description;
    }

    public boolean isAchieved(int score, int gold){
        boolean achieved = false;
        if (checkScore && !checkGold){
            achieved = (score >= scoreThreshold);
        } else if (checkGold && !checkScore){
            achieved = (gold >= goldThreshold);
        } else if (checkGold && checkScore){
            achieved = (score >= scoreThreshold) && (gold >= goldThreshold);
        }
        return achieved;
    }
}
