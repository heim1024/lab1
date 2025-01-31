package Cars;

import java.awt.*;

public abstract class Car implements Movable{
    private int nrDoors; // Number of doors on the Cars.car
    private int enginePower; // Engine power of the Cars.car
    private double currentSpeed; // The current speed of the Cars.car
    private Color color; // Color of the Cars.car
    private String modelName; // The Cars.car model name
    private double x, y; // Position coordinates
    private Direction direction; // Direction the car is facing
    public boolean engineOn = false;

    public boolean turboOn;

    public enum Direction {
        forward, right, left
    }

    public Car(int nrDoors, int enginePower, Color color, String modelName, double startX, double startY, Direction startDir){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.currentSpeed = 0;
        this.x = startX;
        this.y = startY;
        this.direction = startDir;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public int getEnginePower(){
        return enginePower;
    }

    public double getX() {return x;}
    public double getY() {return y;}

    public Direction getDirection() {return direction;}

    public String getModelname(){return modelName;}

    public Color getColor(){return color;}
    public void setColor(Color clr){color = clr;}

    public void startEngine(){
        currentSpeed = 0.1;
        engineOn = true;
    }
    public void stopEngine(){
        currentSpeed = 0;
        engineOn = false;
    }

    public double getCurrentSpeed(){return currentSpeed;}

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount <= 1 && amount >= 0){
            incrementSpeed(amount);
        }
        else{
            System.out.println("input a value between 0 and 1!");
        }
    }
    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount <= 1 && amount >= 0){
            decrementSpeed(amount);
        }
        else{
            System.out.println("input a value between 0 and 1!");
        }
    }

    public double speedFactor(){
        return 0;
    }

    private void incrementSpeed(double amount){
        if(engineOn){
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
        }
        else{
            System.out.println("turn on your engine first");
        }
    }
    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    public void setTurboOn(){
        turboOn = true;
    }
    public void setTurboOff(){
        turboOn = false;
    }

    @Override
    public void move() {
        y += currentSpeed;
        direction = Direction.forward;
    }

    @Override
    public void turnLeft(){
        x -= currentSpeed;
        direction = Direction.left;
    }

    @Override
    public void turnRight(){
        x += currentSpeed;
        direction = Direction.right;
    }

}
