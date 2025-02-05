package com.internal.Archieved.Practise.collection;

import java.util.Arrays;

public class ArrayListClone<E> {

    private Object [] elementData;
    private int size;


    public ArrayListClone(){
        elementData = new Object[10];
    }
    public boolean add(E e){
        ensureCapacity(size+1);
        elementData[size++]=e;
        return true;
    }

    public E remove(int index) {
        rangeCheck(index);
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
        return oldValue;
    }

    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
    }
    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }
    private void ensureCapacity(int miniCapacity){
        if(miniCapacity-elementData.length>0){
            grow(miniCapacity);
        }
    }

    private void grow(int minCapacity){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1); // Grow by 1.5 times
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public static void main(String[] args) {
        ArrayListClone<Integer> arrayListClone =  new ArrayListClone<>();
        for (int i = 0; i <= 10; i++) {
            arrayListClone.add(i);
        }


    }

}
