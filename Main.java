public class Main {
  public static void main(String[] args) {
    TodoList active = new TodoList();
    TodoList archive = new TodoList();
    active.add(new Todo("Wash Dishes"));
    try {
      // thread to sleep for 1000 milliseconds
      Thread.sleep(1);
    } catch (Exception e) {
      System.out.println(e);
    }
    active.add(new Todo("Fold Clothes"));

    active.getTaskList().forEach((task) -> System.out.println(((Todo) task).getID()));
  }
}