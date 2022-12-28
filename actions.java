

class Node{
    int data;
    Node next;
    }
    
    
    
    
    public class actions {
        Node head;
        Node prev;
        
        
        
        public void insert(int number) {
        Node newnode= new Node();
        newnode.data=number;
            if (head==null) {
                head=newnode;
            } else {
                Node pointer=head;
                while (pointer!=null) {
                  
                    pointer=pointer.next;
    
                    
                }
                pointer=newnode;
            }
        }
        public void show() {
        Node pointer=head;
        while (pointer!=null) {
          
            System.out.println(pointer.data);
             pointer=pointer.next; 
        }
        
        }
    
    }
    