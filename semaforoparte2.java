import java.lang.*;

public class semaforoparte2{
   public static void main(String[] args){
   
     System.out.println();
     System.out.println(" Semaforos ");
	 System.out.println();
	 
	    Sem1 N1 = new Sem1();
		Sem1 N2 = new Sem1();
		
		N1.setName("semaforos al Norte y al Sur ");
		N2.setName("semaforos al Este y al Oeste ");
		
		N1.EstadoVerde = true;
		N2.EstadoVerde = false;
		
		N1.Anexo = N2;
		N2.Anexo = N1;
		
				
        N1.start();
	    N2.start();

      }
}
	 	 
   class Sem1 extends Thread {
	public boolean EstadoVerde;
	 public Sem1 Anexo = null;
	   public void run(){//semaforoparte2.class
		
			while (true) {
				while (EstadoVerde==false){
	     			System.out.println( "Los "+ getName() + " han cambiado a ROJO ");
		    		synchronized(this) {
						try { wait(); } 
						catch (Exception e) {;}
						EstadoVerde=true;
					}
				}
				for(int t = 30; t > 5; t--){
					System.out.println("Los "+ getName() + " han cambiado a VERDE " + t);
					try { sleep(1000);
					} catch( InterruptedException e ) {;}
				}
				System.out.println();
				for(int f1 = 5; f1 > 0; f1--){
					System.out.println("Los "+ getName() + " han cambiado a AMARILLO " + f1);
					try { sleep(1000); } 
					catch( InterruptedException e ) { ; }
				}
				System.out.println();
				EstadoVerde=false;
				synchronized(this.Anexo){
					Anexo.notify();
				}
			}
	    
	}     
}	
	
	
	