package ar.edu.unlp.oo2.dieciocho.Decorators;

import ar.edu.unlp.oo2.dieciocho.FileComponent;

public class CreationDateDecorator extends BaseDecorator {

    public CreationDateDecorator(FileComponent wrapee) {
        super(wrapee);
    }

    @Override
    public String prettyPrint() {
        return this.getWrapee().getCreationDate()+" "+ this.getWrapee().prettyPrint();
    }
}
