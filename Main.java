public class Main 
{
    public static void main(String[] args)     
    {
     //creating singly link for L and M. 
     SinglyLinkedList<Integer> L = new SinglyLinkedList<>(); 
     SinglyLinkedList<Integer> M = new SinglyLinkedList<>();
     
     //adding input for L link
     L.addFirst(3);
     L.addFirst(6);
     L.addFirst(5);
     
    //adding input for M link
     M.addFirst(7);
     M.addFirst(5);
     M.addFirst(4);
     M.addFirst(2);
     
     //print out
     System.out.println("This is L linkly: ");
     System.out.println(L);
     
     System.out.println("This is M linkly: ");
     System.out.println(M);
     
     L.concatenate(M);
     
     System.out.println(L);
     
     
     System.out.println(L.last());
     System.out.println(L.first());
     System.out.println(M.last());
     System.out.println(M.first());
     
    }
    
}
