package com.in28minutes.learnspringframework.game;

public class ContraGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("up");
    }
    @Override
    public void down(){
        System.out.println("down");
    }
    @Override
    public void right(){
        System.out.println("right");
    }
    @Override
    public void left(){
        System.out.println("left");
    }
}
