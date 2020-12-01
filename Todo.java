public class Todo {

  /*** INSTANCE VARIABLES ***/
  private String task;
  private int priority;
  private long ID;
  private Boolean completed = false;

  /*** CONSTRUCTOR METHODS ***/
  /**
   * Default constructor, builds default Todo item with an ID
   */
  public Todo() {
    ID = System.currentTimeMillis();
  }

  public Todo(String task) {
    this.task = task;
    ID = System.currentTimeMillis();
  }

  /**
   * Sets task
   * 
   * @param task String representing Task
   * @return Boolean
   */
  public Boolean setTask(String task) {
    boolean isValid = task.length() > 0;
    if (isValid) {
      this.task = task;
    }

    return isValid;
  }

  /**
   * sets priority value between 1-3
   * 
   * @param priority int
   * @return bool
   */
  public Boolean setPriority(int priority) {
    boolean isValid = priority > 0 || priority <= 3;
    if (isValid) {
      this.priority = priority;
    }
    return isValid;
  }

  /**
   * Swaps between true and false
   * 
   * @return completed
   */
  public boolean setCompleted() {
    if (completed == true) {
      completed = false;
    } else {
      completed = true;
    }
    return completed;
  }

  public String getTask() {
    return task;
  }

  public int getPriority() {
    return priority;
  }

  public long getID() {
    return ID;
  }

  public boolean getCompleted() {
    return completed;
  }
}