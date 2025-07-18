package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccessProxy();
    }

    @Test
    void testGetSearchResults() {
        this.database.login("admin", "admin");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        this.database.login("admin", "admin");
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }

    @Test
    void testNotLoggedIn(){
        assertEquals(0,this.database.insertNewRow(Collections.emptyList()));
        assertEquals(null, this.database.getSearchResults("select * from comics where id=4"));
    }
}