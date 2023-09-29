package baitap1;

public interface MyList<E> {
    void add(E e);
    void add(int index,E e);
    void clear();
    boolean contains(E e);
    E get(int index);
    int indexOf(E e);
    boolean isEmpty();
    int lastIndexOf(E e);
    boolean remove(E e);
    E remove(int index);
    int size();
    E set(int index,E e);
}
