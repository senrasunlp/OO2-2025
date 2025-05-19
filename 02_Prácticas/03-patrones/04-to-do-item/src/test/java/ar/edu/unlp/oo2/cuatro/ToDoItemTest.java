package ar.edu.unlp.oo2.cuatro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoItemTest {

    ToDoItem studyItem;
    RuntimeException exception;

    @Test
    void testPendingItem(){
        studyItem = new ToDoItem("Study OOP for 1 hour");
        assertTrue(studyItem.getState() instanceof Pending);
        exception = assertThrows(RuntimeException.class, () -> {
            studyItem.togglePause();
        });
        assertEquals("El objeto ToDoItem no se encuentra en estado Paused o In-Progress.", exception.getMessage());
        exception = assertThrows(RuntimeException.class, () -> {
            studyItem.workedTime();
        });
        assertEquals("El objeto ToDoItem no fue iniciado.", exception.getMessage());
        studyItem.addComment("Pending Item");
        assertEquals(1, studyItem.getComments().size());
        studyItem.start();
        assertTrue(studyItem.getState() instanceof InProgress);
    }

    @Test
    void testInProgressItem(){
        studyItem = new ToDoItem("Study OOP for 1 hour");
        studyItem.start();
        assertTrue(studyItem.getState() instanceof InProgress);
        studyItem.togglePause();
        assertTrue(studyItem.getState() instanceof Paused);
        assertTrue(studyItem.workedTime() instanceof Duration);
        studyItem.addComment("InProgress Item");
        assertEquals(1, studyItem.getComments().size());
        studyItem.finish();
        assertTrue(studyItem.getState() instanceof Finished);
    }

    @Test
    void testPausedItem(){
        studyItem = new ToDoItem("Study OOP for 1 hour");
        studyItem.start();
        studyItem.togglePause();
        assertTrue(studyItem.getState() instanceof Paused);
        studyItem.togglePause();
        assertTrue(studyItem.getState() instanceof InProgress);
        assertTrue(studyItem.workedTime() instanceof Duration);
        studyItem.addComment("Paused Item");
        assertEquals(1, studyItem.getComments().size());
        studyItem.finish();
        assertTrue(studyItem.getState() instanceof Finished);
    }

    @Test
    void testFinishedItem(){
        studyItem = new ToDoItem("Study OOP for 1 hour");
        studyItem.start();
        studyItem.finish();
        assertTrue(studyItem.getState() instanceof Finished);
        assertTrue(studyItem.workedTime() instanceof Duration);
        studyItem.addComment("Finished Item");
        assertEquals(0, studyItem.getComments().size());
        exception = assertThrows(RuntimeException.class, () -> {
            studyItem.togglePause();
        });
        assertEquals("El objeto ToDoItem no se encuentra en estado Paused o In-Progress.", exception.getMessage());
    }



}
