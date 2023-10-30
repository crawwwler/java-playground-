
public class List<T> {

    private T[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    //with this method were able to add elements to list;
    public void add(T value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    // this method will help us to dynamicly increase the array size(list size);
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newArray[i] = this.values[i];
        }
        this.values = newArray;
    }

    //method for checking the existense of a value 
    //because contains would have the same implementation 
    //like the indexOfValue , we use that to reduce code
    public boolean contains(T value) {
        return this.indexOfValue(value) >= 0;
    }

    //this method will help us to remove elements from list;
    //with the help of two other methods.
    public void remove(T value) {
        int i = indexOfValue(value);
        if (i < 0) {
            return; // no element found;
        }
        moveToTheLeft(i);
        this.firstFreeIndex--;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1; //if value not found we return this;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = 0; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public T value(int index) {
        if (index < 0 || index > this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }
}
