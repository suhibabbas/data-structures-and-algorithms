package hashTable.data;

public class HashNode<K,V> {

    private  K key;
    private  V value;
    private  Integer hashCode;
    private HashNode<K,V> next;

    public HashNode(K key, V value, Integer hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;

    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    public Integer getHashCode() {
        return hashCode;
    }

    public HashNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setHashCode(Integer hashCode) {
        this.hashCode = hashCode;
    }
}
