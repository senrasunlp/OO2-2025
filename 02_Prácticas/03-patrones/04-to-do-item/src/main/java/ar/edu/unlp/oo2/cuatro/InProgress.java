package ar.edu.unlp.oo2.cuatro;
import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends State {

    @Override
    public void togglePause(ToDoItem toDoItem) {
        toDoItem.changeState(new Paused());
    }

    @Override
    public void finish(ToDoItem toDoItem){
        toDoItem.changeState(new Finished());
    }

    public Duration workedTime(ToDoItem toDoItem) {
        return Duration.between(toDoItem.getStartDate(), LocalDateTime.now());
    }
}
