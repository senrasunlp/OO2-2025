package ar.edu.unlp.oo2.cuatro;
import java.time.Duration;

public class Pending extends State {

    @Override
    public void start(ToDoItem toDoItem) {
        toDoItem.changeState(new InProgress());
    }

    @Override
    public Duration workedTime(ToDoItem toDoItem) {
        throw new RuntimeException("El objeto ToDoItem no fue iniciado.");
    }
}
