package task_manager;

import java.util.List;

public class TaskManagerAPP {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Task task1 = new Task("Подготовить презентацию", "Подготовить презентацию для встречи", "2023-09-15", TaskPriority.СРЕДНЯЯ, TaskStatus.В_ПРОЦЕССЕ);
        Task task2 = new Task("Сделать покупки", "Купить продукты и молоко", "2023-09-10", TaskPriority.ВЫСОКАЯ, TaskStatus.АКТИВНЫЙ);
        Task task3 = new Task("Выучить Java", "Изучить Java программирование", "2023-09-20", TaskPriority.НИЗКАЯ, TaskStatus.ЗАВЕРШЕННЫЙ);

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);


        List<Task> allTask = manager.getAllTasks();
        for (Task task : allTask) {
            System.out.println(task);
        }
        List<Task> activeTasks = manager.getActiveTasks();
        for (Task task : activeTasks) {
            System.out.println(task);
        }
        List<Task> completedTasks = manager.getCompletedTasks();
        for (Task task : completedTasks) {
            System.out.println(task);
        }
        manager.completeTask("Подготовить презентацию");

        manager.sortTasksByDueDate();
        for (Task task : allTask) {
            System.out.println(task);
        }
        manager.sortTasksByPriority();
        for (Task task : allTask) {
            System.out.println(task);
        }
    }
}
