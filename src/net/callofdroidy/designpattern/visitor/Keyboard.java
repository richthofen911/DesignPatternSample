package net.callofdroidy.designpattern.visitor;

/**
 * Created by admin on 06/09/16.
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        computerPartVisitor.visit(this);
    }
}
