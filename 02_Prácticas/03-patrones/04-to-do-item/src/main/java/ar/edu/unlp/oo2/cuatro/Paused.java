package ar.edu.unlp.oo2.cuatro;
import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State{

    public void togglePause(ToDoItem toDoItem) {
        toDoItem.changeState(new InProgress());
    }

    public void finish(ToDoItem toDoItem){
        toDoItem.changeState(new Finished());
    }

    public Duration workedTime(ToDoItem toDoItem) {
        return Duration.between(toDoItem.getStartDate(), LocalDateTime.now());
    }
}
