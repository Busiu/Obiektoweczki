package agh.cs.lab2;

public class Position {

    //FIELDS
    public int x;
    public int y;


    //CONSTRUCTOR
    public Position(int x, int y){

        this.x = x;
        this.y = y;
    }


    //METHODS
    public int getx(){ return x; }
    public int gety(){ return y; }

    public String toString(){

        return "(" + this.x + "," + this.y + ")";
    }

    public boolean smaller(Position Other){

        if(Other.x >= this.x && Other.y >= this.y)
            return true;

        return false;
    }

    public boolean larger(Position Other){

        if(Other.x <= this.x && Other.y <= this.y)
            return true;

        return false;
    }

    public Position add(Position Other){

        return new Position(this.x + Other.x, this.y + Other.y);
    }

    public boolean equals(Position Other){

        if(Other.x == this.x && Other.y == this.y)
            return true;

        return false;
    }
}
