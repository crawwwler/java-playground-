
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Grade classX = new Grade();

        UI xx = new UI(scan, classX);
        xx.start();
    }
}
