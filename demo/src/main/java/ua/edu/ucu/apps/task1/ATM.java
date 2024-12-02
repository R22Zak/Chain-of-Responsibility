package ua.edu.ucu.apps.task1;

public class ATM {

    private final Section first;


    public ATM() {
        this.first = new Section_500();
        Section_200 section200 = new Section_200();
        first.setNext(section200);
        Section_100 section100 = new Section_100();
        section200.setNext(section100);
        Section_50 section50 = new Section_50();
        section100.setNext(section50);
        Section20 section20 = new Section20();
        section50.setNext(section20);
    }

    public static void main(String[] args) {
    }
    public void getmonney(int amount) {
        first.process(amount);
    }
}
