public class Tile {
    // A tile is the building block of the board

    // Coordinates of the Tile on the Board.
    private int y;
    private int x;
    
    // array of player indexes where players have vision, for example, if the index 0 = true, then the 0th player has vision over this tile
    private boolean[] playerVision;

    // symbol representation on the Board for printouts, default = +;
    private char symbol;

    public Tile(int y, int x)
    {
        this.y = y;
        this.x = x;
        symbol = '+';

    }

    // overload with symbol included
    public Tile(int y, int x, char symbol)
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
