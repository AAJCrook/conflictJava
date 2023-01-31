public class Game {

   /* Class Concepts:
   * A Game will be composed of a board and players
   * A Game will store overarching data regarding the game, such as current turn.
   * A Game will manage input from players to impact the game.
   */
   
   private String gameTitle;
   private Board board;
   private Player[] players;
   private int turn;

   /*
      * Constructor for the Game class
      * @param height The height of the game board
      * @param width The width of the game board
      * @param numPlayers The number of players in the game (let's not get too crazy, just 2 to start!)
      */
   public Game(int height, int width, int numPlayers, String gameTitle)
   {
      this.board = new Board(height, width);
      this.turn = 0;
      this.gameTitle = gameTitle;
         
      // we'll name the players for now, maybe pass in prenamed players later.
      this.players = new Player[numPlayers];
      for(int i = 0; i < players.length; i++)
      {
            // TODO: wonder what happens when don't cast to a char here
            players[i] = new Player(Character.toString((char)(i + 65)));
      }
   }

   // getters
   public Board getBoard()
   {
      return board;
   }

   public Player[] getPlayers()
   {
      return players;
   }
   @Override
   public String toString()
   {
      String retString = "";
      retString += gameTitle + '\n';
      retString += "Players: ";
      for(int i = 0; i < players.length; i++)
      {
         retString += players[i].getName() + ' ';
      }
      retString += "\nCurrent turn: " + turn + '\n';
      retString += board.toString();

      return retString;
   }
}
