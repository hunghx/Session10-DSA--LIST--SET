package baitap1;

public abstract class MyAbstractList<E> {
    private int size;

    public MyAbstractList() {
    }
    public MyAbstractList(E[] objects) {
    }

     public abstract void add (E e);

    public boolean isEmpty(){
        return size==0;
    };

    public int size(){
        return size;
    }
    public abstract boolean remove(E e);
    public void setSize(int size){
        this.size = size;
    }
}
