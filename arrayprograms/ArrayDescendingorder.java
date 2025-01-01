
package org.programs;

    public class ArrayDescendingorder {
    
        public static void main(String[] args) {
    
            int a[] =new int[] {10,40,50,20,30,100};
            int b;
         
            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    if (a[i]<a[j]) {
                        
                        b = a[i];
                        a[i] = a[j];
                        a[j] = b;
                        
                    }
                }
                
            }
        for (int i : a) {
            System.out.println(i);
        }
        }
    }
     
}
