package agh.cs.lab2;

public class HayStack implements IWorldElement{

    //FIELDS
    private Position position;

    //CONSTRUCTOR
    public HayStack(Position position){
        this.position = position;
    }

    //METHODS
    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "S";
    }
}
