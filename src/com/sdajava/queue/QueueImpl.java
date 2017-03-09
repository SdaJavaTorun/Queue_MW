package com.sdajava.queue;

/**
 * Created by RENT on 2017-03-09.
 */
public class QueueImpl {

    private String value; //Wartość, którą bedziemy chcieli włożyć do kolejki
    private QueueImpl next; //wskazujemy na na następny element

    public QueueImpl (String value){
        this.value = value;
        this.next = null; //wartość następnego elementu ustawiona na null, przy inicjalizacji kolejki
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueueImpl getNext() {
        return next;
    }

    public void setNext(QueueImpl next) {
        this.next = next;
    }



}
