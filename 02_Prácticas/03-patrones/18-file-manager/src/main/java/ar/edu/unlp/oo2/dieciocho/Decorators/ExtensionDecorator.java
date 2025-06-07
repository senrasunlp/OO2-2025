package ar.edu.unlp.oo2.dieciocho.Decorators;

import ar.edu.unlp.oo2.dieciocho.FileComponent;

public class ExtensionDecorator extends BaseDecorator {

    public ExtensionDecorator(FileComponent wrapee) {
        super(wrapee);
    }

    @Override
    public String prettyPrint() {
        return this.getWrapee().getExtension()+" "+ this.getWrapee().prettyPrint();
    }
}
