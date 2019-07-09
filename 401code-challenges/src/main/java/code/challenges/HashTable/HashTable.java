package code.challenges.HashTable;

public class HashTable {

    HashNode[] buckets;

    public HashTable(){
        this.buckets = new HashNode[1024];
    }

    public HashTable(int num){
        this.buckets = new HashNode[num];
    }


    public void add(String key, String value){
        int hashedKey = hash(key);
        HashNode node = new HashNode(key, value);
        if (buckets[hashedKey] == null){
            buckets[hashedKey] = node;
        } else {
            node.setNext(buckets[hashedKey]);
            buckets[hashedKey] = node;
        }
    }


    public String get(String key){
        int i = hash(key);
        if (buckets[i] == null) return null;
        else if (buckets[i].getNext() == null) return buckets[i].getValue();
        else {
            HashNode cur = buckets[i];
            while (cur != null){
                if (cur.getKey() == key){
                    return cur.getValue();
                }
                cur = cur.getNext();
            }
        }
        return null;
    }

    public Boolean contains(String key){
        if ( this.get(key) != null) return true;
        return false;
    }

    public int hash(String key){
        return (key.hashCode() * 599 ) % buckets.length;
    }

}
