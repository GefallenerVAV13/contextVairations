package grits.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 вариант создания контекста  через сканирование бинов в директории
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext("grits.dev");

        //2 вариант создания контекста с помощью конфигурационного класса
        // AnnotationConfigApplicationContext context
        // new AnnotationConfigApplicationContext(TaskConfiguration.class);

        //3 вариант создания конфигурации бинов с помощью xml
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Task task = context.getBean("task", Task.class); //получение бина по классу
        Task task1 = (Task) context.getBean("task"); //получение бина по имени


        System.out.println(task);
        System.out.println(task1);
        System.out.println(task == task1);

        TaskManager taskManager = context.getBean("task-manager",TaskManager.class);
        taskManager.printTask();

    }
}
