package test;

public class LinkedList<E> {

    private Node<E> fist = new Node<E>();
    private Node<E> last = new Node<E>();
    private static class Node<E>{
        Node<E> prev;
        Node<E> next;
        E e;
    }


    //插入
    public boolean add(E e){
        return true;
    }

    //删除
    public boolean remove(E e){

        return true;
    }

    //长度
    public int size(){

        return 0;
    }

    //包含
    public boolean content(E e){
        return true;
    }





}
