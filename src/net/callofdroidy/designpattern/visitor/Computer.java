package net.callofdroidy.designpattern.visitor;

/**
 * Created by admin on 06/09/16.
 */
public class Computer implements ComputerPart{
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        for(ComputerPart part : parts)
            part.accept(computerPartVisitor);

        computerPartVisitor.visit(this);
    }
}