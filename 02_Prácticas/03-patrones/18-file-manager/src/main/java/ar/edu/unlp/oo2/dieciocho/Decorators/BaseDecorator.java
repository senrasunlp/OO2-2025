package ar.edu.unlp.oo2.dieciocho.Decorators;

import ar.edu.unlp.oo2.dieciocho.FileComponent;

import java.time.LocalDate;

public abstract class BaseDecorator implements FileComponent {
    private FileComponent wrapee;

    public BaseDecorator(FileComponent wrapee) {
        this.wrapee = wrapee;
    }

    protected FileComponent getWrapee() {
        return wrapee;
    }

    public String getName() {
        return wrapee.getName();
    }

    public String getExtension() {
        return wrapee.getExtension();
    }

    public double getSize() {
        return wrapee.getSize();
    }

    public LocalDate getCreationDate() {
        return wrapee.getCreationDate();
    }

    public LocalDate getUpdateDate() {
        return wrapee.getUpdateDate();
    }

    public String getPermissions() {
        return wrapee.getPermissions();
    }

    public abstract String prettyPrint();
}
