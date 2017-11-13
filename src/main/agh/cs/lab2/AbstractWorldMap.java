package agh.cs.lab2;

import java.util.ArrayList;

public abstract class AbstractWorldMap implements IWorldMap{

    //FIELDS
    ArrayList<Car> cars = new ArrayList<>();
    MapVisualizer visualizer = new MapVisualizer();
    ArrayList<HayStack> hayStacks = new ArrayList<>();

    //METHODS
    @Override
    public boolean canMoveTo(Position position) {
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPosition().equals(position))
                return false;
        }
        for(int i = 0; i < hayStacks.size(); i++){
            if(hayStacks.get(i).getPosition().equals(position))
                return false;
        }
        return true;
    }

    @Override
    public Object objectAt(Position position) {
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPosition().equals(position))
                return cars.get(i);
        }
        for(int i = 0; i < hayStacks.size(); i++){
            if(hayStacks.get(i).getPosition().equals(position))
                return hayStacks.get(i);
        }
        return null;
    }
}
