package agh.cs.lab2;

import static agh.cs.lab2.MapDirection.North;

public class Car implements IWorldElement{

    //FIELDS
    private Position position;
    private MapDirection mapdirection;

    //CONSTRUCTOR
    public Car(IWorldMap map){
        if(map.canMoveTo(new Position(2,2))){
            this.position = new Position(2,2);
            mapdirection = North;
        }
    }

    public Car(IWorldMap map, int x, int y){
        if(map.canMoveTo(new Position(x, y))){
            this.position = new Position(x, y);
            mapdirection = North;
        }
    }

    //FUNCTIONS
    @Override
    public String toString(){
        switch(this.mapdirection){
            case North:{
                return "N";
            }
            case South:{
                return "S";
            }
            case West:{
                return "W";
            }
            case East:{
                return "E";
            }
            default: { return "NO sry, ale nie wbijesz"; }
        }
    }

    public Position getPosition() { return this.position; }

    public void move(MoveDirection direction){
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
                        if(this.position.gety() < 4)
                            this.position = this.position.add(new Position(0, 1));
                        break;
                    }
                    case East:{
                        if(this.position.getx() < 4)
                            this.position = this.position.add(new Position(1, 0));
                        break;
                    }
                    case South:{
                        if(this.position.gety() > 0)
                            this.position = this.position.add(new Position(0, -1));
                        break;
                    }
                    case West:{
                        if(this.position.getx() > 0)
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
                        if(this.position.gety() > 0)
                            this.position = this.position.add(new Position(0, -1));
                        break;
                    }
                    case East:{
                        if(this.position.getx() > 0)
                            this.position = this.position.add(new Position(-1, 0));
                        break;
                    }
                    case South:{
                        if(this.position.gety() < 4)
                            this.position = this.position.add(new Position(0, 1));
                        break;
                    }
                    case West:{
                        if(this.position.getx() < 4)
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
