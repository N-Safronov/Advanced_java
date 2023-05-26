package org.example.OneTask;

public class ArrayIterator<T> {
    private final T[] array;
    private int currentIndex;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    public Integer lengthArray(){
        return array.length;
    }

    public boolean hasNext() {
        return currentIndex < array.length;
    }

    public T next() {
        return array[currentIndex++];
    }

}

