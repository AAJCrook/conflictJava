public class Piece {
    

    // Coordinates of the Piece on the Board.
    private int y;
    private int x;

    // symbol representation on the Board for printouts, default = +;
    private char symbol;

    public Piece(int y, int x)
    {
        this.y = y;
        this.x = x;
        symbol = '+';

    }

    // overload with symbol included
    public Piece(int y, int x, char symbol)
    {
        this.y = y;
        this.x = x;
        this.symbol = symbol;

    }

    public int getY()
    {
        return y;
    }

    public int getX()
    {
        return x;
    }

    public char getSymbol()
    {
        return symbol;
    }

}
