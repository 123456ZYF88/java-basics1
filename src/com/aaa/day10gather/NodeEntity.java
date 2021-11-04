package com.aaa.day10gather;

public class NodeEntity {
    private NodeEntity prev;
    private NodeEntity next;
    private Object data;//当前数据

    public NodeEntity getPrev() {
        return prev;
    }

    public void setPrev(NodeEntity prev) {
        this.prev = prev;
    }

    public NodeEntity getNext() {
        return next;
    }

    public void setNext(NodeEntity next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
