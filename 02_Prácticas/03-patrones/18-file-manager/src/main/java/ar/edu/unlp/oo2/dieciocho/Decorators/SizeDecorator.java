package ar.edu.unlp.oo2.dieciocho.Decorators;

import ar.edu.unlp.oo2.dieciocho.FileComponent;

public class SizeDecorator extends BaseDecorator {

    public SizeDecorator(FileComponent wrapee) {
        super(wrapee);
    }

    @Override
    public String prettyPrint() {
        return this.getWrapee().getSize()+" "+ this.getWrapee().prettyPrint();
    }
}
