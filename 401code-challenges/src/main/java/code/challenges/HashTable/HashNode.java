package code.challenges.HashTable;

public class HashNode<T> {
    HashNode next;
    String key;
    String value;

    public HashNode(){}

    public HashNode(String key, String value){
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
