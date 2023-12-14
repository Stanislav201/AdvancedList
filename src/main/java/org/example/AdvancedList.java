package org.example;

public class AdvancedList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private int capacity = INITIAL_CAPACITY;
    private T[] array;

    public AdvancedList() {
        this.array = (T[]) new Object[capacity];
    }

    public AdvancedList(int capacity) {
        this.capacity = capacity > 0 ? capacity : INITIAL_CAPACITY;
        this.array = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public T get(int index) {

        if (index >= size || index < 0) {
            return null;
        }
        return array[index];
    }

    public T add(T object) {

        if (size == capacity) {
            capacity += INITIAL_CAPACITY;
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = object;
        size++;
        return object;
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        T toDelete = array[index];

        for (int i = index; i < size - 2; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return toDelete;
    }

    public T[] addAll(T[] arrayToAdd) {
        for (T t : arrayToAdd) {
            add(t);
        }
        return arrayToAdd;
    }


}
