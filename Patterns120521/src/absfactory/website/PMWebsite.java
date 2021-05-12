package absfactory.website;

import absfactory.ProjectManager;

public class PMWebsite implements ProjectManager {
    @Override
    public void managePrj() {
        System.out.println("PRManager managed website");
    }
}
