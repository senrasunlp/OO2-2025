package ar.edu.unlp.oo2.cuatro;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private List<String> comments;
    private State state;
    private LocalDateTime startDate;
    private LocalDateTime finishDate;

    public ToDoItem (String name){
        this.name = name;
        this.comments = new ArrayList<String>();
        this.state = new Pending();
    }
    public void changeState(State newState){
        this.state = newState;
    }
    public void start(){
        this.state.start(this);
        this.startDate = LocalDateTime.now();
    }

    public void togglePause(){
        this.state.togglePause(this);
    }

    public void finish(){
        this.state.finish(this);
        this.finishDate = LocalDateTime.now();
    }

    public Duration workedTime(){
        return this.state.workedTime(this);
    }

    public void addComment(String comment){
        comments.add(comment);
    }

    public LocalDateTime getStartDate(){
        return this.startDate;
    }

    public LocalDateTime getFinishDate(){
        return this.finishDate;
    }

    public State getState(){
        return this.state;
    }
}
