package hashTable.structure;

import hashTable.data.HashNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class HashMap<K,V> {
    private ArrayList<HashNode<K,V>> bucketArray;
    private int buckets;
    private int size;
    private final HashSet<K> KeysArray = new HashSet<>();


    public HashMap(){
        bucketArray = new ArrayList<>();
        buckets = 10;

        for(int index = 0 ; index <buckets;index++){
            bucketArray.add(null);
        }
    }

    public int getBuckets(){
        return buckets;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    private int hashCode(K key){
        return Objects.hashCode(key);
    }

    public V get(K key){
        int bucketIndex = getHashed(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null){
            if(head.getKey().equals(key) && head.getHashCode() == hashCode)
                return head.getValue();
            head = head.getNext();
        }
        return null;
    }

    public int getHashed(K key){
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        arrayIndex = arrayIndex<0?arrayIndex* -1:arrayIndex;
        return arrayIndex;
    }

    public void set (K key, V value){
        int index = getHashed(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);
        HashNode<K, V> newNode =new HashNode<>(key,value,hashcode);

        if(head == null){
            bucketArray.set(index, newNode);
            KeysArray.add(key);
            size++;
        }else {

            if(KeysArray.contains(key)){
                head.setValue(value);
                return;
            }
            KeysArray.add(key);
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
//            bucketArray.set(index,newNode);
//            head.setNext(newNode);
//            size++;
        }

        if((1.0* size)/ buckets >= 0.7){
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size=0;

            for (int i = 0; i <buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode: temp){
                while (headNode != null){
                    set(headNode.getKey(),headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

    public boolean contain(K key){
       return KeysArray.contains(key);
    }

    public HashSet<K> keys(){
        return KeysArray;
    }

    public List<List<String>> leftJoin(HashMap<String, String> right,List<List<String>> result){
        List<String> list = new ArrayList<>();
        for(int i = 0; i <buckets;i++){
            HashNode<K, V> head = bucketArray.get(i);
            while (head !=null){
                list = new ArrayList<>();
                list.add(head.getKey().toString());
                list.add(head.getValue().toString());
                if (right.contain(head.getKey().toString())){
                    list.add(right.get(head.getKey().toString()));
                }else{
                    list.add(null);
                }
                result.add(list);
                head = head.getNext();
            }
        }
        return result;
    }

}
