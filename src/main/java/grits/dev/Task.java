package grits.dev;

import org.springframework.stereotype.Component;

//@Component //в скобках после component можно указать название бина @Component("main-task")
// по дефолту название класса но с маленькой буквы
public class Task {
    private String name;
    private long duration;

    public Task() {
        this.name = "task";
        this.duration = 60L;
    }

    public String getName() {
        return name;
    }

    public long getDuration() {
        return duration;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
