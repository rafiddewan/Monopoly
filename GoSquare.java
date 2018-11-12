package com.company;

public class GoSquare extends Square
{
    public GoSquare(int number)
    {
        super("Go", number);
    }

    @Override
    public void landOn(Player p) throws Exception {
        p.setLocation(this);
        p.increaseCash(200);
    }
}
