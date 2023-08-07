public class ClickGame
{
    private int score;
    private int currentPointValue;
    private int endScore;

    public ClickGame(int score, int pointValue, int end)
    {
        this.score = score;
        setCurrentPointValue(pointValue);
        setEndScore(end);
    }

    public int getScore()
    {
        return score;
    }

    public int getCurrentPointValue()
    {
        return currentPointValue;
    }

    public void setCurrentPointValue(int currentPointValue)
    {
        if (currentPointValue < 1)
            currentPointValue = 1;
        this.currentPointValue = currentPointValue;
    }

    public int getEndScore()
    {
        return endScore;
    }

    public void setEndScore(int endScore)
    {
        if (endScore < 5)
            endScore = 5;
        this.endScore = endScore;
    }

    public void increaseScore()
    {
        score += currentPointValue;
    }

    @Override
    public String toString()
    {
        return "ClickGame{" +
                "score=" + score +
                ", currentPointValue=" + currentPointValue +
                ", endScore=" + endScore +
                '}';
    }
}
