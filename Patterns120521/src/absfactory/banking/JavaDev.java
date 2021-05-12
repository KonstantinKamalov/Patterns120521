package absfactory.banking;

import absfactory.Developer;

public class JavaDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java разраб пишет java код!");
    }
}
