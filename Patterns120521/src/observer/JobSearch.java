package observer;

import absfactory.banking.JavaDev;

public class JobSearch {
    public static void main(String[] args) {
        Publisher jobSite = new Publisher();
        jobSite.addVacancy("Java Dev");
        jobSite.addVacancy("PR Manager");
        jobSite.addVacancy("Tester");

        Observer firstSub = new Subscriber("Kamalov Konstantin");
        Observer secSub = new Subscriber("Kamalova Ekaterina");

        jobSite.addObserver(firstSub);
        jobSite.addObserver(secSub);
        jobSite.addObserver(new Subscriber("Anton Toriev"));

        jobSite.addVacancy("Python Dev");
        jobSite.addObserver(new Subscriber("Petr Stolov"));
        jobSite.removeVacancy("Python Dev");
    }
}
