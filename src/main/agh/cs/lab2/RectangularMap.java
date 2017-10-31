package agh.cs.lab2;

import java.util.ArrayList;

public class RectangularMap implements IWorldMap {

    //FIELDS
    int width;
    int height;
    ArrayList<Car> cars = new ArrayList<>();
    MapVisualizer visualizer = new MapVisualizer();

    //CONSTRUCTORS
    public RectangularMap(int width, int height){
        this.width = width;
        this.height = height;
    }

    //METHODS
    @Override
    public boolean canMoveTo(Position position) {
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPosition().equals(position))
                return false;
        }
        return true;
    }

    /*@Override
    public boolean place(Car car){
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPosition().equals(car.getPosition()))
            return false;
        }
        cars.add(car);
        return true;
    }*/
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
    public Object objectAt(Position position) {
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPosition().equals(position))
                return cars.get(i);
        }
        return null;
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
