
import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<Pairs<K, V>>[] array;
    private int firstFreeIndex;

    public HashMap() {
        this.array = new ArrayList[32];
        this.firstFreeIndex = 0;
    }

    //method to retrieve value;
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.array.length);
        if (this.array[hashValue] == null) {
            return null;
        }
        ArrayList<Pairs<K, V>> nList = this.array[hashValue];

        for (int i = 0; i < nList.size(); i++) {
            if (nList.get(i).getKey().equals(key)) {
                return nList.get(i).getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        ArrayList<Pairs<K, V>> nList = getTheList(key);
        int indexOf = getTheIndex(nList, key);

        if (indexOf < 0) {
            nList.add(new Pairs<>(key, value));
            this.firstFreeIndex++;
        } else {
            nList.get(indexOf).setValue(value);
        }
        if (1.0 * this.firstFreeIndex / this.array.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        ArrayList<Pairs<K, V>> nList = getTheList(key);
        if (nList.isEmpty()) {
            return null;
        }

        int i = getTheIndex(nList, key);
        if (i < 0) {
            return null;
        }
        Pairs<K, V> pair = nList.get(i);
        nList.remove(i);
        return pair.getValue();
    }

    private ArrayList<Pairs<K, V>> getTheList(K key) {
        int hashValue = Math.abs(key.hashCode() % this.array.length);
        if (this.array[hashValue] == null) {
            this.array[hashValue] = new ArrayList<>();
        }
        return this.array[hashValue];
    }

    private int getTheIndex(ArrayList<Pairs<K, V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        ArrayList<Pairs<K, V>>[] nArray = new ArrayList[this.array.length * 2];

        for (int i = 0; i < this.array.length; i++) {
            copy(nArray, i);
        }
        this.array = nArray;
    }

    private void copy(ArrayList<Pairs<K, V>>[] nArray, int index) {
        for (int i = 0; i < this.array[index].size(); i++) {
            Pairs<K, V> nP = this.array[index].get(i);

            int hashValue = Math.abs(nP.getKey().hashCode() % nArray.length);
            if (nArray[hashValue] == null) {
                nArray[hashValue] = new ArrayList<>();
            }
            nArray[hashValue].add(nP);
        }
    }

}
