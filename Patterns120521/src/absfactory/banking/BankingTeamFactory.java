package absfactory.banking;

import absfactory.Developer;
import absfactory.ProjectManager;
import absfactory.ProjectTeamFactory;
import absfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDev();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
