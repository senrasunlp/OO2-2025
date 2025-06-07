package ar.edu.unlp.oo2.dieciocho.Decorators;

import ar.edu.unlp.oo2.dieciocho.FileComponent;

public class NameDecorator extends BaseDecorator {

    public NameDecorator(FileComponent wrapee) {
        super(wrapee);
    }

    @Override
    public String prettyPrint() {
        return this.getWrapee().getName()+" "+ this.getWrapee().prettyPrint();
    }
}
