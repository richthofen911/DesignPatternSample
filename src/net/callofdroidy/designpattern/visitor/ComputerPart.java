package net.callofdroidy.designpattern.visitor;

/**
 * Created by admin on 06/09/16.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
