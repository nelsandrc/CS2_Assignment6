import java.io.*;
import java.util.Scanner;

public class Robot {
    private Task[] tasks;

    public Robot(int FileLength) throws FileNotFoundException{
            File file = new File("logfile.txt");    //Opens text file with tasks
            Scanner input = new Scanner(file);

            tasks = new Task[FileLength];
            int index = 0;

            while (input.hasNext()) {
                String currentDescription = input.nextLine();       //Loads up a new set of info for a task
                String currentTime = input.nextLine();
                String currentDate = input.nextLine();
                double currentDurration = input.nextDouble();
                input.nextLine();
                int currentPriority = input.nextInt();
                input.nextLine();
                //Create new task for the robot to do
                tasks[index] = new Task(currentDescription, currentTime, currentDate, currentDurration, currentPriority);
            }

            input.close();
    }

    public String toString(){
        String str = "";
        for (Task currentTask:tasks){
           str += "--------------------------------\n" + currentTask;
        }

        return str;
    }

    public void sort(){
        for(int i = 0; i < tasks.length; ++i){
            for(int j = 0; j < tasks.length; ++j){
                if(tasks[j].getPriority() > tasks[j+1].getPriority()){
                    Task temp = tasks[j+1];
                    tasks[j+1] = tasks[j];
                    tasks[j] = temp;
                }
            }
        }
    }

}
