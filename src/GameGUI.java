public class GameGUI
{
    public static void main(String[] args)
    {
        ClickGame game = new ClickGame(0, 1, 10);
        System.out.println(game);
        while (!game.isOver())
        {
            game.increaseScore();
            System.out.println(game);
        }
        System.out.println("Game over");
    }
}
