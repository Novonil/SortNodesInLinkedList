public class SinglyLinkedList 
{
    //Head of the Linked List
    Node head;
                
    /// Inserts a new node at the end with the value as passed in data
    public void insertNodeAtEnd(int data)
    {
        Node temp = head;

        // If the Linked List is empty insert the first element and set head
        if (head == null)
        {
            head = new Node(data);
            return;
        }
        // If the Linked List is not empty insert the elements at the end
        else
        {
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Node(data);
        }
    }

    /// Traverses through the Linked List
    public void traverseLinkedList()
    {
        //If Linked List doesnot exist
        if (head == null)
            return;

        //If Linked List exists run through the elements and print them
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /// Sorts the Linked List using Selection Sorting
    public void selectionSortForLinkedList()
    {
        if (head == null)
            return;

        Node temp, minNode;
        Node currentNode = head;

        //Selection Sort
        while (currentNode.next != null)
        {
            minNode = currentNode;
            temp = currentNode.next;
            while (temp != null)
            {
                if (minNode.data > temp.data)
                {
                    minNode = temp;
                }
                temp = temp.next;
            }
            swapNodes(minNode, currentNode);
            currentNode = minNode.next;
        }
    }

    /// Swaps Nodes in a Linked List
    public void swapNodes(Node minimumNode, Node currentNode)
    {
        if (minimumNode == currentNode)
        {
            return;
        }

        Node NodeBeforeMinimumNode = null, NodeBeforeCurrentNode = null, temp = head;

        //Find out the node previous to the first node to be swapped
        while (temp != null && temp != minimumNode)
        {
            NodeBeforeMinimumNode = temp;
            temp = temp.next;
        }

        temp = head;

        //Find out the node previous to the second node to be swapped.
        while (temp != null && temp != currentNode)
        {
            NodeBeforeCurrentNode = temp;
            temp = temp.next;
        }

        //Updating the previous nodes of the nodes to be swapped
        //If the first node to be swapped is not the head node
        if (NodeBeforeMinimumNode != null)
            NodeBeforeMinimumNode.next = currentNode;
        //If the first node to be swapped is the head node
        else
            head = currentNode;

        //If the second node to be swapped is not the head node
        if (NodeBeforeCurrentNode != null)
            NodeBeforeCurrentNode.next = minimumNode;

        //If the secomd node to be swapped is the head node
        else
            head = minimumNode;

        //Updating the next nodes of the nodes to be swapped
        temp = minimumNode.next;
        minimumNode.next = currentNode.next;
        currentNode.next = temp;
    }
    
}