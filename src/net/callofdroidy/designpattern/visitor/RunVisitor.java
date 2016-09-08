package net.callofdroidy.designpattern.visitor;

/**
 * Created by admin on 06/09/16.
 */
public class RunVisitor {
    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new Visitor());
    }
}
