public interface interfaceQueue<E> {
    boolean isEmpty();
    int size();
    E first();
    void  enqueue(E e);
    E dequeue();


    sLinkedQueue<E> append(sLinkedQueue<E> L, sLinkedQueue<E> M);
}
