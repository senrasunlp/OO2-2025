package ar.edu.unlp.oo2.dieciocho;

import ar.edu.unlp.oo2.dieciocho.Decorators.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class FileOO2Test {

    FileOO2 file;
    @BeforeEach
    public void setUp() {
        file = new FileOO2("documento", "txt", 12.5,
                LocalDate.of(2024, 1, 10),
                LocalDate.of(2025, 1, 10), "rw-r--r--");
    }

    @Test
    public void fileOO2Test() {
        FileComponent f = new NameDecorator(new ExtensionDecorator(new SizeDecorator(new CreationDateDecorator(new UpdateDateDecorator(new PermissionsDecorator(file))))));
        System.out.println(f.prettyPrint());
    }
}
