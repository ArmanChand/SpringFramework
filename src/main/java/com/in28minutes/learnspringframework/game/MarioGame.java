package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("up at the top");
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
