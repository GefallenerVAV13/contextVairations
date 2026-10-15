package grits.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //1 вариант создания контекста  через сканирование бинов в директории
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext("grits.dev");

        //2 вариант создания контекста с помощью конфигурационного класса
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfiguration.class);

        Task task = context.getBean(Task.class); //получение бина по классу
        Task task1 = (Task) context.getBean("main-task"); //получение бина по имени


        System.out.println(task);
        System.out.println(task1);
        System.out.println(task == task1);
        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

    }
}
