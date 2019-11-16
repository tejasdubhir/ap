package sample;

import javafx.scene.image.Image;


public abstract class Plant extends Character{

    private int y;

    public Plant(int x,int y, Image im)
    {
        super(x,im);
    }

    public int getY() {
        return y;
    }
}