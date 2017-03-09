package com.sdajava.queue;

/**
 * Created by RENT on 2017-03-09.
 */
public class QueueElements {

    private QueueImpl first;
    private QueueImpl last;

    public QueueElements(){
        first = last = null;
    }

    public QueueImpl getFirst() {
        return first;
    }

    public void setFirst(QueueImpl first) {
        this.first = first;
    }

    public QueueImpl getLast() {
        return last;
    }

    public void setLast(QueueImpl last) {
        this.last = last;
    }

    //Implementujemy metodę dodającą element do kolejki

    // jeżeli kolejka jest pusta to element przychodzący jest pierwszy i ostatni

    public void add(String value){

        QueueImpl queue = new QueueImpl(value);
        if (first == null){
            first = last = queue;
        }else {
            //jezeli kolejka nie jest pusta
            //to element przychodzacy jest ustawioany jako ostatni

            last.setNext(queue);
            last = queue;
        }

    }

    public void show(){
        if (first != null){

            QueueImpl element = first;

            while (element != null){
                System.out.println(element.getValue());
                element = element.getNext();
            }
        }
    }
}
