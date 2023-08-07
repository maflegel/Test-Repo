public class ClickGame
{
    private int score;
    private int currentPointValue;
    private int endScore;

    private boolean isOver;

    public ClickGame(int score, int pointValue, int end)
    {
        this.score = score;
        isOver = false;
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

    public boolean isOver()
    {
        return isOver;
    }

    public void setEndScore(int endScore)
    {
        if (endScore < 5)
            endScore = 5;
        this.endScore = endScore;
    }

    public void increaseScore()
    {
        if (score < endScore)
            score += currentPointValue;
        else
            isOver = true;
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
