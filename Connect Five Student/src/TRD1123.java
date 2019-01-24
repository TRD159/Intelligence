import java.util.Random;

public class TRD1123 extends Player {
    private char letter;
    private String name;
    public TRD1123(char letter)
    {
        super("TRD1123",letter);
    }

    public Move getMove(Board board)
    {
        /*Move m;
        Random rand = new Random();
        do
        {
            m = new Move(rand.nextInt(8),rand.nextInt(8));
        }while(board.isFull(m));
        return m;*/
        Move m;
        boardGrader(board);
        return null;
    }

    public Move boardGrader(Board board) {
        //boardGrader(board);
        return null;
    }



    public Player freshCopy()
    {
        return new TRD1123(letter);
    }
}