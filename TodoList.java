import java.util.ArrayList;

public class TodoList {
  private ArrayList<Todo> taskList;
  private String name;

  /*** CONSTRUCTOR METHODS ***/
  /**
   * Default constructor, builds default Todo item with an ID
   */
  public TodoList() {
    taskList = new ArrayList<>();
  }

  /**
   * Adds a Todo to the list
   * 
   * @param Todo Todo Class
   * @return isValid
   */
  public boolean add(Todo task) {
    boolean isValid;
    if (task instanceof Todo) {
      isValid = true;
      taskList.add(task);
    } else {
      isValid = false;
    }
    return isValid;
  }

  public ArrayList getTaskList() {
    return taskList;
  }

}