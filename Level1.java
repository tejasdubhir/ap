package sample;

import java.util.HashMap;

public class Level1 extends LevelStatus {

    protected Level1(int no, HashMap<Integer,Integer> rem,int time)
    {
        super(no,rem,time);
    }

    public static Level1 getInstance()
    {
        int no=10;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(1,10);
        return new Level1(no,mp,20);
    }
}