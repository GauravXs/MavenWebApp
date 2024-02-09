package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {
	private static List<ToDo> todos = new ArrayList<ToDo>();
	static {
		todos.add(new ToDo("Learn Web Application Development", "Study"));
		todos.add(new ToDo("Learn Spring MVC", "Study"));
		todos.add(new ToDo("Learn Spring Rest Services", "Study"));
	}

	public List<ToDo> retrieveTodos() {
		return todos;
	}

	public void addTodo(ToDo todo) {
		todos.add(todo);
	}

	public void deleteTodo(ToDo todo) {
		todos.remove(todo);
	}

}