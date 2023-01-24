public class Board {
    
    /* Class Concepts:
     * A Board is a 2D array of tiles, accessible via index.
     * A Board will be a part of a game, and players will take actions that will impact the board
     * A Board will also have some form of visualization, at the moment print out from the console.
     */

    
    private Tile[][] tiles; // tiles of the array

    // Constructor with the dimensions
    public Board(int height, int width)
    {
        this.tiles = new Tile[height][width];
        // generate blank tiles (to avoid null issues, the tiles arent "real" yet)
        for(int y = 0; y < tiles.length; y++)
        {
            for(int x = 0; x < tiles[0].length; x++)
            {
                tiles[y][x] = new Tile(y, x);
            }
        }
    }

    // Constructor with tiles array already
    public Board(Tile[][] tiles)
    {
        this.tiles = tiles;
    }

    // Getters
    public Tile[][] getTiles()
    {
        return tiles;
    }

    // Print
    
    @Override
    public String toString()
    {
        String retString = "";
        // loop through the tiles
        for(int y = 0; y < tiles.length; y++)
        {
            for(int x = 0; x < tiles[0].length; x++)
            {
                // grab symbols
                retString += tiles[y][x].getSymbol();
                // add space if not the last in the row
                if(x != tiles[0].length - 1)
                {
                    retString += "  ";
                }
            }
            // don't add another new line at the end
            if(y != tiles.length - 1)
            {
                retString += '\n';
            }
        }

        return retString;
    }

}
