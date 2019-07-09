package code.challenges.HashTable;

import static java.lang.StrictMath.abs;

public class HashTable<V> {

    HashNode<V>[] buckets;

    public HashTable(){
        this.buckets = new HashNode[1024];
    }

    public HashTable(int num){
        this.buckets = new HashNode[num];
    }


    public void add(String key, V value){
        int hashedKey = hash(key);
        HashNode node = new HashNode(key, value);
        if (buckets[hashedKey] == null){
            buckets[hashedKey] = node;
        } else {
            node.setNext(buckets[hashedKey]);
            buckets[hashedKey] = node;
        }
    }

    public Object get(String key){
        int i = hash(key);
        if (buckets[i] == null) return null;
        else if (buckets[i].next == null) return buckets[i].value;
        else {
            HashNode cur = buckets[i];
            while (cur != null){
                if (cur.key == key){
                    return cur.value;
                }
                cur = cur.next;
            }
        }
        return null;
    }

    public Boolean contains(String key){
        if ( this.get(key) != null) return true;
        return false;
    }

    protected int hash(String key){
        return abs((key.hashCode() * 599 ) % buckets.length);
    }
}
