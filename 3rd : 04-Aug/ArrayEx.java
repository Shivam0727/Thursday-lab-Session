 class ArrayEx
 {    
    public static void main(String[] args) 
	{        
    
        int [] Array = new int [] {52,45,32,64,12,87,78,98,23,7};     
        int temp = 0;

   
           // for Ascending order
       System.out.println("Original array: ");    
       for (int i = 0; i <Array.length; i++) 
		{     
         		  System.out.print(Array[i] + " ");    
      	        }    
         
        for (int i = 0; i <Array.length; i++) 
	{     
         	 for (int j = i+1; j <Array.length; j++) 
			{     
             			 if(Array[i] >Array[j])
				 {     
               				   temp = Array[i];    
                			   Array[i] = Array[j];    
              				   Array[j] = temp;    
             		         }     	
			}     
        }    
           
        System.out.println("\nArray sorted in ascending order: ");  
  
        for (int i = 0; i <Array.length; i++)
		 {     
          		  System.out.print(Array[i] + " ");    
      	         } 



		// for Decending

	  
         
        for (int i = 0; i <Array.length; i++) 
	{     
         	 for (int j = i+1; j <Array.length; j++) 
			{     
             			 if(Array[i] <Array[j])
				 {     
               				   temp = Array[i];    
                			   Array[i] = Array[j];    
              				   Array[j] = temp;    
             		         }     	
			}     
        }    
           
        System.out.println("\nArray sorted in Decending order: ");    
        for (int i = 0; i <Array.length; i++)
		 {     
          		  System.out.print(Array[i] + " ");    
      	         }   
        }    
 }    