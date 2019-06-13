package code.challenges.fifoAnimalShelter;

public class Animal {
    String type;
    String name;
    int order;

    public Animal(String type, String name){

        this.type = type;
        this.name = name;
        this.order = -1;
    }

    public String getType(){
        return this.type;
    }

    public void setOrder(int seq){
        this.order = seq;
    }

    public int getOrder(){
        return this.order;
    }
}
