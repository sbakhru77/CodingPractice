package crachCode;

import java.util.ArrayList;

/*
Implement a stack which besides, the usual push, pop and top, has an extra operation. It returns the middle element of the stack in constant time.
see e.g. below for the stack
Stack      State           GetMiddle()
========================================
Push(1)    (1)              1
Push(2)    (2,1)            2
Push(3)    (3,2,1)          2
Push(4)    (4,3,2,1)        3
Push(5)    (5,4,3,2,1)      3
Pop()      (4,3,2,1)        3
Pop()      (3,2,1)          2
Pop()      (2,1)            2
Pop()      (1)              1
Pop()      null             null
*/
                  

public class FindMiddle {
	int a;

	static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static void push(Integer a) {
        arr.add(a);
    }
    
    public static Integer GetMiddle(ArrayList a) {
        if (a == null || a.size() == 0)
            return null;
            
            if (a.size() == 1)
                return (Integer) a.get(0);
                
       int middle = a.size()/2;
            
       return (Integer) a.get(middle);
        
    }

    public static Integer pop(int i) {
        return arr.get(i);
    }

    
    public static void main(String[] args) {
    	push(1); push(2); push(3); push(4);push(5); push(6);
    	pop(3);
    	System.out.println("Middle element of array is --- " + GetMiddle(arr));
    	
    }
    
}