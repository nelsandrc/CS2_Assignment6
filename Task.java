public class Task {

    private String description;
    private  String time;
    private String date;
    private double duration;
    private int priority;

    public Task(String description, String time, String date, double duration, int priority){
        this.description = description;
        this.time = time;
        this.date = date;
        this.duration = duration;
        this.priority = priority;
    }

    public Task(){
        description = "Default Task";
        time = "00:00AM";
        date = "01/01/1970";
        duration = 0.0;
        priority = -1;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public double getDuration() {
        return duration;
    }

    public int getPriority() {
        return priority;
    }

    public String toString(){
        return "Description: " + description + "\nTime: " + time + "\nDuration: " + duration + " Minutes\nDate: " + date + "\nPriority: " + priority + "\n";
    }
}
