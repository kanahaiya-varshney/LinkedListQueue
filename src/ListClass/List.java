package ListClass;

import LinkClass.Link;

public class List {
    private Link first;
    private Link last;
    public List(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insert(int data){
        Link newlink= new Link();
        newlink.setData(data);
        if(first==null){
            first=newlink;
        }
        else{
            last.setNext(newlink);
        }
        last=newlink;
    }
    public void deleteFirst(){
        if(first==null) System.out.println("No Link");
        else{
            System.out.println(first.getData());
            first=first.getNext();
        }
    }
    public void display(){
        Link temp=first;
        while(temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }
}
