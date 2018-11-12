package com.company;

public class GoToJailSquare extends Square
{
    private Square jailSquare;
    public GoToJailSquare(int number, Square jailSquare)
    {
        super("Jail Square", number);
        this.jailSquare = jailSquare;
    }
    @Override
    public void landOn(Player p) throws Exception
    {
        p.setLocation(jailSquare);
    }
}
