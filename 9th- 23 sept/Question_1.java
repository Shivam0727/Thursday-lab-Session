
class Question_1
{  
    
    public static void main(String[] args) 
    {    
        int [] arr = new int [] {1, 2, 3, 4, 5};           
        System.out.println("Original array: ");  
        System.out.println("");
        for (int i = 0; i < arr.length; i++) 
        {   
            System.out.print(arr[i] + " ");   
        }   
        int n=arr.length;
        System.out.println("");
        System.out.println("\nArray after right rotation: ");
       while(n!=0) 
       {
    	   for(int i = 0; i < 1; i++)
    	   {  
    		   int j, last;   
    		   last = arr[arr.length-1];  
    		   for(j = arr.length-1; j > 0; j--)
    		   {            
    			   arr[j] = arr[j-1];  
    		   }  
    		   arr[0] = last;  
    	   }  
    	   System.out.println();  
    	   for(int i = 0; i< arr.length; i++)
    	   {  
    		   System.out.print(arr[i] + " ");  
    	   } 
    	   n=n-1;
       	}
    }  
}  