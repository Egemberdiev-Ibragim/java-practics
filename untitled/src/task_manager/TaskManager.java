package task_manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    private List<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public List<Task> getAllTasks() {
        System.out.println("Список всех задач: ");
        return taskList;
    }

    public List<Task> getActiveTasks(){
        System.out.println("\nСписок активных задач: ");
        List<Task> activeList = new ArrayList<>();
        for (Task task : taskList){
            if (task.getStatus() == TaskStatus.АКТИВНЫЙ){
                activeList.add(task);
            }
        }return activeList;
    }
    public List<Task> getCompletedTasks(){
        System.out.println("\nСписок завершенных задач: ");
        List<Task> completedList = new ArrayList<>();
        for (Task task : taskList){
            if (task.getStatus() == TaskStatus.ЗАВЕРШЕННЫЙ){
                completedList.add(task);
            }
        }return completedList;
    }
    public void sortTasksByDueDate(){
        System.out.println("\nСортировка задач по сроку выполнения: ");
        Collections.sort(taskList, Comparator.comparing(Task::getDueDate));
    }
    public void sortTasksByPriority(){
        System.out.println("\nСортировка задач по приоритету:");
        Collections.sort(taskList, Comparator.comparing(Task::getPriority).reversed());
    }
    public List<Task> searchTaskForName(String name){
        System.out.println("\nПоиск задачи по имени: ");
        List<Task> machingList = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getTaskName().equals(name)){
                machingList.add(task);
            }
        }
        return machingList;
    }
    //
    public void completeTask(String taskName){
        for (Task task : taskList){
            if (task.getTaskName().equalsIgnoreCase(taskName)){
                task.markStatus("активный");
                System.out.println("Задача \"" + task.getTaskName() + "\" помечена как: " + TaskStatus.АКТИВНЫЙ);
                return;
            }
        }System.out.println("Задача с именем \"" + taskName + "\" не найдена.");
    }
}