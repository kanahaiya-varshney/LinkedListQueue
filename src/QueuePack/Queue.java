package QueuePack;

import ListClass.List;

public class Queue {
    private List obj;
    int length=0;
    public Queue(){
        obj=new List();
    }
    public void insert(int data){
        obj.insert(data);
        length++;
    }
    public void remove(){
        obj.deleteFirst();
        length--;
    }
    public boolean isEmpty(){
        return (length==0) ;
    }
    public int getLength(){
        return length;
    }
    public void display(){
        obj.display();
    }
}
