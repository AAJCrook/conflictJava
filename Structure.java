public abstract class Structure {
    // a structure in the game.
    // a structure will be placed upon a tile
    Tile location;
    // a structure should (generally) not move.
    // a structure could be a player's headquarters, a neutral or aligned city, or constructed fortifications. (null = neutral)
    // most structures will bear allegiance to a player, except for unclaimed ones at game start will be neutral.
    Player owner;
    // a structure will provide or expend resources from a player if it bears allegiance.

    // pass null to player if you want it to be neutral
    public Structure(Tile location, Player owner)
    {
        this.location = location;
        this.owner = owner;
    }
    public Tile getLocation()
    {
        return location;
    }
    public Player getOwner()
    {
        return owner;
    }
}
