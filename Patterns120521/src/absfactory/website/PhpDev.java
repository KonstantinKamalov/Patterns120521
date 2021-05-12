package absfactory.website;

import absfactory.Developer;

public class PhpDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP разраб пишет php код!");
    }
}
