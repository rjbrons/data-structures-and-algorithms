package code.challenges.HashTable;

public class HashNode<V> {
    HashNode next;
    String key;
    V value;

    public HashNode(){}

    public HashNode(String key, V value){
        this.key = key;
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
