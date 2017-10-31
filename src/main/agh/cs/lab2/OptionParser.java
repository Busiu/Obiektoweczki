package agh.cs.lab2;

import java.util.ArrayList;

import static agh.cs.lab2.MoveDirection.Backward;
import static agh.cs.lab2.MoveDirection.Forward;


public class OptionParser {

    public ArrayList<MoveDirection> parse(String string[]){
        ArrayList <MoveDirection> result;
        result = new ArrayList<MoveDirection>();
        for(int i = 0; i < string.length; i++){
            switch(string[i]){
                case "f":{
                    result.add(Forward);
                    break;
                }
                case "forward":{
                    result.add(Forward);
                    break;
                }
                case "b":{
                    result.add(Backward);
                    break;
                }
                case "backward":{
                    result.add(Backward);
                    break;
                }
                default: continue;
            }
        }

        return result;
    }



}
