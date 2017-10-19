package agh.cs.lab2;

public enum MapDirection {

    North,
    South,
    West,
    East;

    //FUNCTIONS
    public String toString(){
        switch(this){
            case North: return "Północ";
            case South: return "Południe";
            case West: return "Zachód";
            case East: return "Wschód";
            default: return null;
        }
    }

    public MapDirection next(){
        switch(this){
            case North: return East;
            case South: return West;
            case West: return North;
            case East: return South;
            default: return null;
        }
    }

    public MapDirection previous(){
        switch(this){
            case North: return West;
            case South: return East;
            case West: return South;
            case East: return North;
            default: return null;
        }
    }
}
