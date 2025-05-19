package ar.edu.unlp.oo2.cuatro;
import java.time.Duration;

public abstract class State {

    public void start(ToDoItem toDoItem) {
        //No hace nada salvo en estado Pending
    }

    public void togglePause(ToDoItem toDoItem) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en estado Paused o In-Progress.");
    }

    public void finish(ToDoItem toDoItem) {
        //No hace nada salvo en estado Paused o InProgress
    }

    public abstract Duration workedTime(ToDoItem toDoItem);

    public void addComment(ToDoItem toDoItem, String comment) {
        //Agrega un comentario salvo en estado Finished, que no hace nada
        toDoItem.addCommentToList(comment);
    }
}
