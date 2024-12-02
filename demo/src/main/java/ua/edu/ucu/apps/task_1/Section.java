package ua.edu.ucu.apps.task_1;

public abstract class Section {
    private int denomination;
    private Section next;

    public Section(int denomination){
        this.denomination=denomination;
    }

    public void setNext(Section next) {
        this.next=next;
    }

    private boolean hasNext(){
        return next!=null;
    }
    public void process(int amount){
        int o=0;
       int left = amount % denomination;
       if (left!=0){
            if (hasNext()){
                next.process(left);
            } else {
                o=1;
                System.out.println("Cant give you enough cash pls input another sum");
            }
       }
       if (o==0){
        System.out.println("Denomination: " + denomination+ " Quantity: " + amount/denomination);
       }
    }
}
