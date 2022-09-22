public class Board {
    
    /* Class Concepts:
     * A Board is a 2D array of tiles, accessible via index.
     * A Board will also maintain data about the state of the game that is not player data.
     * A Board will also have some form of visualization, at the moment print out from the console.
     */

    
    private Piece[][] pieces; // pieces of the array


    // Constructor with pieces array already
    public Board(Piece[][] pieces)
    {
        this.pieces = pieces;
    }



    // Getters
    public Piece[][] getPieces()
    {
        return pieces;
    }

    // Print
    
    @Override
    public String toString()
    {
        String retString = "";
        // loop through the pieces
        for(int y = 0; y < pieces.length; y++)
        {
            for(int x = 0; x < pieces[0].length; x++)
            {
                // grab symbols
                retString += pieces[y][x].getSymbol();
                // add space if not the last in the row
                if(x != pieces[0].length - 1)
                {
                    retString += ' ';
                }
            }
            // don't add another new line at the end
            if(y != pieces.length - 1)
            {
                retString += '\n';
            }
        }

        return retString;
    }

}
