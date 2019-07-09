package code.challenges.HashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void testAdd() {
        HashTable<String> test = new HashTable<>();
        test.add("name", "joe");

    }

    @Test
    public void testGet() {
        HashTable<String> testTable = new HashTable<>();
        testTable.add("name", "sam");
        String result = (String)testTable.get("name");
        assertTrue(result.equals("sam"));
    }

    @Test
    public void testGetOnEmpty(){
        HashTable<String> testTable = new HashTable<>();
        assertEquals(null, testTable.get("sam"));
    }

    @Test
    public void testGetNotInTable(){
        HashTable<String> testTable = new HashTable<>();
        testTable.add("name", "sam");
        assertEquals(null, testTable.get("adrian"));
    }

    @Test
    public void testContains() {
        HashTable<String> testTable = new HashTable<>();
        testTable.add("name", "sam");
        assertTrue(testTable.contains("name"));
    }

    @Test
    public void testHash() {
        HashTable<String> test = new HashTable<>();
        assertTrue(test.hash("billy") < 1024);
        assertTrue(test.hash("The quick brown fox jumps over the lazy dog") < 1024);
    }
}