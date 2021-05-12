package absfactory.website;

import absfactory.Developer;
import absfactory.ProjectManager;
import absfactory.ProjectTeamFactory;
import absfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDev();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PMWebsite();
    }
}
