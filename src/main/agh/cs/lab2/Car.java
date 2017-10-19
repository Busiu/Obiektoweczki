package agh.cs.lab2;

import static agh.cs.lab2.MapDirection.*;

public class Car {

    //FIELDS
    public Position position;
    public MapDirection mapdirection;

    //CONSTRUCTOR
    public Car(){
        this.position = new Position(2,2);
        mapdirection = North;
    }

    //FUNCTIONS
    @Override
    public String toString(){
        return position.toString() + " " + mapdirection.toString();
    }

    public void move(MoveDirection direction){
        switch(direction){
            case Left:
                this.mapdirection.next();
            case Right:
                this.mapdirection.previous();
            case Forward:{
                switch(this.mapdirection){
                    case North:{
                        if(this.position.y < 4)
                            this.position.add(new Position(0, 1));
                    }
                    case East:{
                        if(this.position.x < 4)
                            this.position.add(new Position(1, 0));
                    }
                    case South:{
                        if(this.position.y > 0)
                            this.position.add(new Position(0, -1));
                    }
                    case West:{
                        if(this.position.x > 0)
                            this.position.add(new Position(-1, 0));
                    }
                    //default: null;
                }
            }
            case Backward:{
                switch(this.mapdirection){
                    case North:{
                        if(this.position.y > 0)
                            this.position.add(new Position(0, -1));
                    }
                    case East:{
                        if(this.position.x > 0)
                            this.position.add(new Position(-1, 0));
                    }
                    case South:{
                        if(this.position.y < 4)
                            this.position.add(new Position(0, 1));
                    }
                    case West:{
                        if(this.position.x < 4)
                            this.position.add(new Position(1, 0));
                    }
                    //default: null;
                }
            }
            //default: null;
        }
    }


}
