public class ArrayThirdLrgest {
    
	
        public static void main(String[] args) {
            
            int a[] = {1,2,3,4,5,6};
            int b;
            for (int i = 0; i < a.length; i++) {
                
                for (int j = i+1; j < a.length; j++) {
                    
                    if (a[i]>a[j]) {
                        
                        b = a[i];
                        a[i]=a[j];
                        a[j]=b;
                        
                    }}}
            
                
            
                System.out.println("Third largest: "+(a.length-2));
        
        
        
        
    }  }
}
