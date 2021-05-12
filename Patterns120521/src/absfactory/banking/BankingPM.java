package absfactory.banking;

import absfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void managePrj() {
        System.out.println("Banking PM manager banking project!");
    }
}
