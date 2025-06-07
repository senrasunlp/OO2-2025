package ar.edu.unlp.oo2.dieciocho.Decorators;

import ar.edu.unlp.oo2.dieciocho.FileComponent;

public class PermissionsDecorator extends BaseDecorator {

    public PermissionsDecorator(FileComponent wrapee) {
        super(wrapee);
    }

    @Override
    public String prettyPrint() {
        return this.getWrapee().getPermissions()+" "+ this.getWrapee().prettyPrint();
    }
}
