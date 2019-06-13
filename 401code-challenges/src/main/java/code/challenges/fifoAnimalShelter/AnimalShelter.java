package code.challenges.fifoAnimalShelter;

import code.challenges.stacksandqueues.Queue;

public class AnimalShelter {
    Queue<Animal> cats;
    Queue<Animal> dogs;
    int sequence;

    public AnimalShelter(){
        this.sequence = 0;
        this.cats = new Queue<Animal>();
        this.dogs = new Queue<Animal>();
    }

    public void enqueue(Animal fluffy){
        this.sequence++;
        fluffy.setOrder(this.sequence);
        if (fluffy.getType().equals("cat")){
            cats.enqueue(fluffy);
        } else if (fluffy.getType().equals("dog") ) {
            dogs.enqueue(fluffy);
        }
    }

    public Animal dequeue(String animal){
        if (animal.equals("cat") ){
            return cats.dequeue();
        } else if (animal.equals("dog")){
            return dogs.dequeue();
        } else
            return null;
    }

    public Animal dequeue(){
        return this.cats.peek().getOrder() < this.dogs.peek().getOrder() ? this.dequeue("cat") : this.dequeue("dog");
    }
}
