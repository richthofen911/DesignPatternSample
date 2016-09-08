package net.callofdroidy.designpattern.visitor;

/**
 * Created by admin on 06/09/16.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        computerPartVisitor.visit(this);
    }

    public void clickMe(){
        System.out.println("Click mouse");
    }
}
