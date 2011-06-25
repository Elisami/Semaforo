 class semaf{
   public static void main(String[] args){
   
     System.out.println();
     System.out.println("Semaforos ");
	 System.out.println();
	 
	    Sem1 N1 = new Sem1();
        N1.start();
	   
	}
	    }
	 	 
	class Sem1 extends Thread {
	  public void run(){
	    synchronized(semaf.class) {
	  while(true){
	  System.out.println( "Los semaforos en direccion al norte y al sur estan en rojo ");
	  
	  for(int t = 30; t > 5; t--){
	     System.out.println("Los semaforos en direccion al Este y al Oeste estan en verde " + t);
	  
	        try {
              sleep(1000);
                } catch( InterruptedException e ) {
                ;
                   }
	    }
	 
	      System.out.println();
	 
	  for(int f1 = 5; f1 > 0; f1--){
	   System.out.println("Los semaforos en direccion al Este y al Oeste han cambiado a amarillo " + f1);
		
		   try {
               sleep(1000);
                } catch( InterruptedException e ) {
                ;
            }
		
		}
		
		  System.out.println();
		Sem2();
	 		
	   	  }
	 }
	    }
	 
	public static  void Sem2() {

	   
	      
		    System.out.println("Los semaforos en direccion al Este y al Oeste estan en Rojo ");
		     for(int r = 30; r > 5; r--){
		     System.out.println("Los semaforos en direccion al Norte y al Sur estan en verde " + r);
			try {
                sleep(1000) ;
            } catch( InterruptedException e ) {
                ;
                }
		  }
		   System.out.println();
		   
		  for (int r1 = 5; r1 > 0; r1--){
		    System.out.println("Los semaforos en direccion al Norte y al Sur han cambiado a amarillo " + r1);
			
			
			try {
                sleep(1000) ;
            } catch( InterruptedException e ) {
                ;
                }
			}
			 System.out.println();
		
	  
	
	        }
	    
}
	 
	 
	 