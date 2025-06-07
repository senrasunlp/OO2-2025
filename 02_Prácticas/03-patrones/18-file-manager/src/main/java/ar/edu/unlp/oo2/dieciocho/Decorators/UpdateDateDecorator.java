package ar.edu.unlp.oo2.dieciocho.Decorators;

import ar.edu.unlp.oo2.dieciocho.FileComponent;

public class UpdateDateDecorator extends BaseDecorator {

    public UpdateDateDecorator(FileComponent wrapee) {
        super(wrapee);
    }

    @Override
    public String prettyPrint() {
        return this.getWrapee().getUpdateDate()+" "+ this.getWrapee().prettyPrint();
    }
}
