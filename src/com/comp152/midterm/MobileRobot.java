package com.comp152.midterm;
import java.util.Scanner;

public class MobileRobot extends Robot implements DemoMode {
    public Scanner scan = new Scanner(System.in);
    private String LocomotionType;
    private String name;

    public MobileRobot(String RobotName, String type){
       super(100);
       name = RobotName;
       LocomotionType = type;
    }

    public void move(float distance){
        System.out.println("Moving " + distance);
        powerLevel -= (int) distance / 5;
    }

        @Override
    public void interactWithWorld(){
        super.interfaceWithWorld();
        Scanner reader = new Scanner(System.in);
        System.out.println("How far would you like to move?");
        var distance = reader.nextFloat();
        move(distance);
    }

    public void performDemo(){
        recharge(100);
        interactWithWorld();

    }

    public void move(){
        var distance = 10f;
        System.out.println("Moving " + distance);
        powerLevel -= (int) distance / 5;
    }
}
