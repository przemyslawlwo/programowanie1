package com.company;

public class MyArray {
    private int size = 10;
    private int[] arr = new int[this.size];

    MyArray(){
        for (int elem : this.arr) { elem = 0; }
    }
    MyArray(int[] inputArr){
//        this.arr = inputArr;
        this.arr = new int[inputArr.length];
        int l = inputArr.length;
        for (int i = 0; i < l; i++) {
            this.arr[i] = inputArr[i];
        }
        this.size = inputArr.length;
    }
    public int length() {
        return this.arr.length;

    //vghmv
    }
    public void print(){
        for (int i = 0; i < this.length(); i++) {
            System.out.print(this.arr[i] + ", ");
        }
        System.out.println();
    }
    // find(int toFind) - zwraca indeks podanej jako parametr liczby, / -1
    public int find(int toFind){
        for (int i = 0; i < this.length(); i++) {
            if (this.arr[i] == toFind) return i;
        }
        return -1;
    }
    // pick(int i) - zwraca liczbę z tablicy stojącą na podanym indeksie
    public int pick(int i){
        if (i < 0 || i > this.length()) {
            throw new ArrayIndexOutOfBoundsException(
                    "Nieprawidłowy indeks (>0, <" + this.length()
            );
        } else {
            return this.arr[i];
        }
    }
    // public void push(int toPush)
    public void push(int toPush) {
        if (this.length() == this.size ) {
            int[] newArr = new int[2*this.length()];
            for (int i = 0; i < newArr.length; i++) {
                if(i < this.length()) newArr[i] = this.arr[i];
            }
            newArr[this.size] = toPush;
            this.arr = newArr;
            this.size++;
            return;
        } else {
            this.arr[this.size] = toPush;
            this.size++;
            return;
        }
    }

}
