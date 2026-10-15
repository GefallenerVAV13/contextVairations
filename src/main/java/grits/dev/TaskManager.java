package grits.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class TaskManager {

    private Task task;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskManager() {
    }

    //    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    public void printTask() {
        System.out.println("Current task: " + task.toString());
    }
}
