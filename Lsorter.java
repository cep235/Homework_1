/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lsorter;

/**
 *
 * @author amit
 */
public class LSorter {
    public LNode sortList(LNode head){
    // Your code goes in here...
        
        //1st get the length 
        int size = 0;
        for(LNode n = head; n.next != null; n = n.next)// O(n)
            size++; 
        // Now we've got the length
        
        // Do merge sort
        
        //Break up into 2 lists
        int middle = size/2;
        LNode Left = head;
        LNode Right = null;
        LNode n2  = null;
        int size2 = 0;
        
        while(n2.next != null)// O(n)
            size2++; 
            LNode next = n2.next;

            if (size2 == middle) {
                    n2.next = null;
                    Right = next;
            }
            n2 = next;
        
        
        //End of method
    	return head;
    }

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
   //     // TODO code application logic here
   // }
    
    public class LNode{
    int val;
    LNode next;
    LNode(int x){
    val = x;
    next = null;
        }
    }
    

    
}
