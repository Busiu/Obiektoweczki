package agh.cs.lab2;

import static agh.cs.lab2.MapDirection.*;

public class Car {

    //FIELDS
    private Position position;
    private MapDirection mapdirection;

    //CONSTRUCTOR
    private Car(){
        this.position = new Position(2,2);
        mapdirection = North;
    }

    //FUNCTIONS
    @Override
    public String toString(){
        return position.toString() + " " + mapdirection.toString();
    }

    private void move(MoveDirection direction){
        switch(direction){
            case Left:
                this.mapdirection = this.mapdirection.previous();
                break;
            case Right:
                this.mapdirection = this.mapdirection.next();
                break;
            case Forward:{
                switch(this.mapdirection){
                    case North:{
                        if(this.position.y < 4)
                            this.position = this.position.add(new Position(0, 1));
                        break;
                    }
                    case East:{
                        if(this.position.x < 4)
                            this.position = this.position.add(new Position(1, 0));
                        break;
                    }
                    case South:{
                        if(this.position.y > 0)
                            this.position = this.position.add(new Position(0, -1));
                        break;
                    }
                    case West:{
                        if(this.position.x > 0)
                            this.position = this.position.add(new Position(-1, 0));
                        break;
                    }
                    //default: null;
                }
                break;
            }
            case Backward:{
                switch(this.mapdirection){
                    case North:{
                        if(this.position.y > 0)
                            this.position = this.position.add(new Position(0, -1));
                        break;
                    }
                    case East:{
                        if(this.position.x > 0)
                            this.position = this.position.add(new Position(-1, 0));
                        break;
                    }
                    case South:{
                        if(this.position.y < 4)
                            this.position = this.position.add(new Position(0, 1));
                        break;
                    }
                    case West:{
                        if(this.position.x < 4)
                            this.position = this.position.add(new Position(1, 0));
                        break;
                    }
                    //default: null;
                }
                break;
            }
            //default: null;
        }
    }


}
