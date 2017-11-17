package agh.cs.lab2;

import java.util.ArrayList;

public class UnboundedMap extends AbstractWorldMap{

    //FIELDS
    //

    //CONSTRUCTORS
    public UnboundedMap(ArrayList<HayStack> hayStacks){
        this.hayStacks = hayStacks;
    }

    //METHODS
    @Override
    public String toString(){
        HayStack north = new HayStack(new Position(Integer.MIN_VALUE, Integer.MIN_VALUE));
        HayStack east = new HayStack(new Position(Integer.MIN_VALUE, Integer.MIN_VALUE));
        HayStack south = new HayStack(new Position(Integer.MAX_VALUE, Integer.MAX_VALUE));
        HayStack west = new HayStack(new Position(Integer.MAX_VALUE, Integer.MAX_VALUE));

        for(HayStack hay : hayStacks){
            if(hay.getPosition().gety() > north.getPosition().gety()){
                north = hay;
            }
            if(hay.getPosition().getx() > east.getPosition().getx()){
                east = hay;
            }
            if(hay.getPosition().gety() < south.getPosition().gety()){
                south = hay;
            }
            if(hay.getPosition().gety() < west.getPosition().gety()){
                west = hay;
            }
        }

        return visualizer.dump(this, new Position(west.getPosition().getx(), south.getPosition().gety()),
                                            new Position(east.getPosition().getx(), north.getPosition().gety()));
    }

    @Override
    public boolean place(Car car) {
        cars.add(car);
        return true;
    }

    @Override
    public void run(ArrayList<MoveDirection> directions) {
        for(int i = 0; i < directions.size(); i++) {
            cars.get(i%cars.size()).move(directions.get(i));
            System.out.println(cars.get(i%cars.size()));
        }
    }

    @Override
    public boolean isOccupied(Position position) {
        if(objectAt(position) == null)
            return false;
        return true;
    }

}
