package code.challenges.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void test_enqueue_cat() {
        AnimalShelter testShelter = new AnimalShelter();
        Animal fluffy = new Animal("cat", "Tiberius");
        testShelter.enqueue(fluffy);
        assertTrue(testShelter.cats.peek().name.equals("Tiberius"));
    }

    @Test
    public void test_enqueue_dog() {
        AnimalShelter testShelter = new AnimalShelter();
        Animal rover = new Animal("dog", "Ghost");
        testShelter.enqueue(rover);
        assertTrue(testShelter.dogs.peek().name.equals("Ghost"));
    }

    @Test
    public void test_dequeue() {
        AnimalShelter testShelter = new AnimalShelter();
        Animal rover = new Animal("dog", "Ghost");
        testShelter.enqueue(rover);
        Animal fluffy = new Animal("cat", "Tiberius");
        testShelter.enqueue(fluffy);
        Animal nott = new Animal("dog", "Nott");
        testShelter.enqueue(nott);
        assertEquals("Dequeued dog should be Rover", rover, testShelter.dequeue("dog"));
        assertEquals("Second deque of dog should be Nott", nott, testShelter.dequeue("dog"));
        assertEquals("Dequeue of cat should be Tiberius", fluffy, testShelter.dequeue("cat"));
    }

    @Test
    public void test_dequeue_no_pref() {
        AnimalShelter testShelter = new AnimalShelter();
        Animal rover = new Animal("dog", "Ghost");
        testShelter.enqueue(rover);
        Animal fluffy = new Animal("cat", "Tiberius");
        testShelter.enqueue(fluffy);
        Animal nott = new Animal("dog", "Nott");
        testShelter.enqueue(nott);
        assertEquals("Dequeue with no pref will give first animal put in", rover, testShelter.dequeue());
    }

    @Test
    public void test_wrong_type_returns_null(){
        AnimalShelter testShelter = new AnimalShelter();
        assertNull(testShelter.dequeue("kangaroo"));
    }
}