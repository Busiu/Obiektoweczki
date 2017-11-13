package agh.cs.lab2;

import java.util.ArrayList;

public class RectangularMap extends AbstractWorldMap{

    //FIELDS
    int width;
    int height;

    //CONSTRUCTORS
    public RectangularMap(int width, int height){
        this.width = width;
        this.height = height;
    }

    //METHODS
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

    @Override
    public String toString() {
        return visualizer.dump(this, new Position(0, 0), new Position(width, height));
    }
}
