package com.threading.concept;

public class Threading extends Thread{

       public void run(){ 
        	 
		//System.out.println("thread is running...");
		
		for(int i=0;i<=100;i++) {
			
			try{
				Thread.sleep(500);
			   }catch(InterruptedException e)
			{
				System.out.println(e);
			}    
		    System.out.println(i);    
		}
		
		} 
	
		public static void main(String args[]){  
			Threading t1=new Threading();  
			Threading t2=new Threading();  
		    t1.start(); 
		    //t2.start();  

		 }  
}
