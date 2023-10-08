package task_manager;

public class Task {
    private String taskName;
    private String taskDescription;
    private String dueDate;
    private TaskPriority priority;
    private TaskStatus status;

    public Task(String taskName, String taskDescription, String dueDate, TaskPriority priority, TaskStatus status) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getDueDate() {
        return dueDate;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public TaskStatus getStatus() {
        return status;
    }
    // В данном случае сеттер нам не нужен, поэтому реализововать смысла не вижу!
    // C toString() поиграюсь :)
    @Override
    public String toString() {
        return String.format("Задача: %s\nОписание: %s\nСрок выполнения: %s\nПриоритетность: %s\nСтатус: %s\n",
                taskName, taskDescription, dueDate, priority, status);
    }
    public void markStatus(String mark){
        switch (mark){
            case "активный":
                status = TaskStatus.АКТИВНЫЙ;
            case "в процессе":
                status = TaskStatus.В_ПРОЦЕССЕ;
            case "завершенный":
                status = TaskStatus.ЗАВЕРШЕННЫЙ;
            case "отложено":
                status = TaskStatus.ОТЛОЖЕНО;
        }
    }
}
