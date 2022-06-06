package tree.intersection.structure;

import tree.intersection.data.HashNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashMap<k,v> {

    private ArrayList<HashNode<k, v>> bucketArray;
    private int buckets;
    private int size ;
    private final HashSet<k> keysArray = new HashSet<>();


    public int getBuckets() {
        return buckets;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public HashMap(){
        bucketArray = new ArrayList<>();
        buckets = 10;
        for(int index = 0; index < buckets; index++){
            bucketArray.add(null);
        }
    }

    private int hashCode(k key){
        return Objects.hashCode(key);
    }

    public int getHashed(k key){
        int hashCode = hashCode(key);
        int arrayIndex = hashCode% buckets;

        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;

        return arrayIndex;
    }

    public void set(k key, v value) {
        int index = getHashed(key);
        int hashcode = hashCode(key);




        HashNode<k, v> head = bucketArray.get(index);


        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashcode) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }

        size++;
        head = bucketArray.get(index);
        HashNode<k, v> newNode = new HashNode<>(key, value, hashcode);
        keysArray.add(key);
        newNode.setNext(head);
        bucketArray.set(index , newNode) ;

        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<k, v> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<k, v> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

    public HashSet<k> keys(){
        return keysArray ;
    }

    public v get(k key)
    {
        int bucketIndex = getHashed(key);
        int hashCode = hashCode(key);

        HashNode<k, v> head = bucketArray.get(bucketIndex);


        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode)
                return head.getValue();
            head = head.getNext();
        }

        return null;
    }

    public boolean contains(k key){
        return keysArray.contains(key);
    }


    public String print(k key) {
        int bucketIndex = getHashed(key);
        HashNode<k, v> pointer = bucketArray.get(bucketIndex);
        String out = "";
        while (pointer != null){
            out +="{ "+ pointer.getKey()+"=>" +pointer.getValue() + " } -> ";
            pointer = pointer.getNext();
        }
        out +="{ NULL }";
        return out;
    }


    public Set<String> findDuplicate(){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < buckets; i++) {
            HashNode<k, v> head = bucketArray.get(i);
            while (head != null) {
                if (!head.getValue().equals(1)){

                    set.add(head.getKey().toString()) ;
                }
                head = head.getNext();
            }

        }

        return set ;

    }

    @Override
    public String toString() {
        return "HashMap{" +
                "bucketArray=" + bucketArray +
                ", buckets=" + buckets +
                ", size=" + size +
                ", keysArray=" + keysArray +
                '}';
    }
}
