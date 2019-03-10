package Main;

import QueuePack.Queue;

public class Main {
    public static void main(String[] args) {
        Queue obj=new Queue();

        obj.insert(452);
        obj.insert(453);
        obj.insert(454);
        obj.insert(455);
        obj.insert(456);
        obj.insert(457);
        obj.display();
        obj.remove();
        obj.remove();
        obj.display();


    }
}
