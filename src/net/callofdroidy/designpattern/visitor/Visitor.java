package net.callofdroidy.designpattern.visitor;

/**
 * Created by admin on 06/09/16.
 */
public class Visitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer){
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse){
        System.out.println("Displaying Mouse.");

    }

    @Override
    public void visit(Keyboard keyboard){
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor){
        System.out.println("Displaying Monitor.");
    }
}
