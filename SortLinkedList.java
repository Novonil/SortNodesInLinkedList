public class SortLinkedList
{
    public static void main(String[] args)
    {
        SinglyLinkedList ob = new SinglyLinkedList();

            ob.insertNodeAtEnd(10);
            ob.insertNodeAtEnd(7);
            ob.insertNodeAtEnd(29);
            ob.insertNodeAtEnd(73);
            ob.insertNodeAtEnd(16);
            ob.insertNodeAtEnd(5);
            ob.insertNodeAtEnd(44);
            ob.insertNodeAtEnd(31);
            ob.insertNodeAtEnd(19);
            ob.insertNodeAtEnd(2);
            ob.insertNodeAtEnd(27);
            ob.insertNodeAtEnd(16);
            ob.insertNodeAtEnd(1);
            ob.insertNodeAtEnd(6);
            ob.insertNodeAtEnd(3);
            ob.insertNodeAtEnd(46);
            ob.insertNodeAtEnd(91);
            ob.insertNodeAtEnd(11);
            ob.insertNodeAtEnd(84);

            System.out.println("Before Sorting");
            ob.traverseLinkedList();
            ob.selectionSortForLinkedList();
            System.out.println();
            System.out.println("After Sorting");
            ob.traverseLinkedList(); 
    }
    
}