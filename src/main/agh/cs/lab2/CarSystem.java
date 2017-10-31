package agh.cs.lab2;

import java.util.ArrayList;

public class CarSystem {

    public static void main(String args[]) {

        /*Position position1 = new Position(1,2);
        System.out.println(position1);
        Position position2 = new Position(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));

        MapDirection mapArgs [] = new MapDirection[4];
        mapArgs[0] = North;
        mapArgs[1] = East;
        mapArgs[2] = South;
        mapArgs[3] = West;

        for(int i = 0; i < mapArgs.length; i++){
            //System.out.println(mapArgs[i]);
            //System.out.println(mapArgs[i].next());
            //System.out.println(mapArgs[i].previous());
        }

        Car car = new Car();

        OptionParser optionparser = new OptionParser();
        ArrayList<MoveDirection> movedirection;
        movedirection = optionparser.parse(args);
        for(int i = 0; i < movedirection.size(); i++){
            car.move(movedirection.get(i));
        }
        System.out.println(car);
    }*/

        ArrayList<MoveDirection> directions = new OptionParser().parse(args);
        IWorldMap map = new RectangularMap(10, 5);
        map.place(new Car(map));
        map.place(new Car(map, 3, 4));
        map.place(new Car(map, 5, 5));
        map.place(new Car(map, 8, 3));
        //map.run(directions);
        System.out.println(map);
    }
}