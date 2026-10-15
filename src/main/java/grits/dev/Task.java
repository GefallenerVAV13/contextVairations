package grits.dev;

import org.springframework.stereotype.Component;

//@Component //в скобках после component можно указать название бина @Component("main-task")
// по дефолту название класса но с маленькой буквы
public class Task {
    private final String name;
    private final long duration;

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

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
