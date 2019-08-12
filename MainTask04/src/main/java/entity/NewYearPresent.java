package entity;

import java.util.ArrayList;

public class NewYearPresent {
    private ArrayList<Candy> present;
    private double weight=0;

    public NewYearPresent(){
        present=new ArrayList<Candy>();
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<Candy> getPresent() {
        return present;
    }

    public void add(Candy candy){
        present.add(candy);
        this.weight+=candy.getWeight();
    }

    public void remove(Candy candy){
        present.remove(candy);
        this.weight-=candy.getWeight();
    }
    
    public void show(){
        for (Candy candy: present
             ) {
            System.out.println(candy.toString());
        }
    }

}
