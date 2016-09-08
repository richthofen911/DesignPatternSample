package net.callofdroidy.designpattern.visitor;

/**
 * Created by admin on 06/09/16.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
}
