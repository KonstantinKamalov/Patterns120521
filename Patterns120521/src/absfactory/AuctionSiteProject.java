package absfactory;

import absfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getProjectManager();

        System.out.println("Creating site...");
        developer.writeCode();
        tester.testCode();
        manager.managePrj();
    }
}
