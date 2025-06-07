package ar.edu.unlp.oo2.dieciocho;

import java.time.LocalDate;
import java.util.List;

//Nombre
//        Extensión
//Tamaño
//Fecha de creación
//Fecha de modificación
//        Permisos
public class FileOO2 implements FileComponent{
    private String name;
    private String extension;
    private double size;
    private LocalDate creationDate;
    private LocalDate updateDate;
    private String permissions;

    public FileOO2(String name, String extension, double size, LocalDate creationDate, LocalDate updateDate, String permissions) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.permissions = permissions;
    }

    public String prettyPrint() {
        return "";
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public double getSize() {
        return size;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public String getPermissions() {
        return permissions;
    }
}
