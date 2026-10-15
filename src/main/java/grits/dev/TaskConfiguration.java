package grits.dev;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class TaskConfiguration {

    @Bean("main-task")
    public Task task(){
        return new Task();
    }

    @Bean
    public TaskManager taskManager(Task task){
        return new TaskManager(task);
    }
}
