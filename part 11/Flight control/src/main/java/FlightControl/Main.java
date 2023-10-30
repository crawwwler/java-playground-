package FlightControl;

import java.util.Scanner;
import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;

public class Main {

    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        FlightControl hh = new FlightControl();

        TextUI x = new TextUI(hh,aa);
        
        x.start();
    }
}
