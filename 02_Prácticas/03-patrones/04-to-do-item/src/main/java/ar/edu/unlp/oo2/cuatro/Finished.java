package ar.edu.unlp.oo2.cuatro;
import java.time.Duration;

public class Finished extends State{

    public Duration workedTime(ToDoItem toDoItem) {
        return Duration.between(toDoItem.getStartDate(), toDoItem.getFinishDate());
    }

    public void addComment(ToDoItem toDoItem, String comment) {
        //No hace nada
    }
}
