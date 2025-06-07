package ar.edu.unlp.oo2.dieciocho;

import java.time.LocalDate;
import java.util.List;

public interface FileComponent {

    public String getName();

    public String getExtension();

    public double getSize();

    public LocalDate getCreationDate();

    public LocalDate getUpdateDate();

    public String getPermissions();

    public String prettyPrint();
}
