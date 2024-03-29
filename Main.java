public class Main {
    // First Main File, lets say hello to conflict!

    public static void main(String args[])
    {
        System.out.println("Hello conflict!");
        
        System.out.println("Let's generate an array of tiles for the board, and then print it out!");

        // tile array (can modify sizes)
        Tile[][] tiles = new Tile[5][5]; 
        // generate blank tiles
        for(int y = 0; y < tiles.length; y++)
        {
            for(int x = 0; x < tiles[0].length; x++)
            {
                tiles[y][x] = new Tile(y, x);
                
            }
        }
        System.out.println("Testing constructor:");
        Board testBoard = new Board(tiles);

        System.out.println("Testing printout:");
        System.out.println(testBoard);

        // what happens if I don't generate blank tiles? It's null!
        /*         
        Tile[][] testTiles = new Tile[10][10];
        Board superTestBoard = new Board(testTiles);
        System.out.println(superTestBoard);
        */

        System.out.println("Let's make a test game");
        Game testGame = new Game(10, 10, 2, "Test Game");
        System.out.println(testGame);
    }
}
