package observer;

import java.util.List;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(
                "Ув. "
                + this.name
                + "\nУ нас есть некоторые изменения в вакансиях:"
                + vacancies
                + "\n=============================================================\n");
    }
}
