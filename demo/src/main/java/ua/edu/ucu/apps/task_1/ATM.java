package ua.edu.ucu.apps.task_1;

public class ATM {

    Section first;

    public static void main(String[] args) {
    
    }
    public ATM(){
        this.first= new Section_500();

        Section_200 section_200 = new Section_200();
        first.setNext(section_200);
    }
    public void getmonney(int amount) {
        first.process(amount);
    }
}
