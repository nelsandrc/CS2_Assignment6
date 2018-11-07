import java.io.*;
import java.util.Scanner;

public class RobotDriver {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("logfile.txt");    //Opens text file with tasks
        Scanner input = new Scanner(file);

        int length = 0;
        while (input.hasNext()){
            length++;
            input.nextLine();
        }
        input.close();

        length /= 5;
        Robot robot = new Robot(length);

        System.out.println(robot);
        robot.sort();
        System.out.println(robot);


    }
}
