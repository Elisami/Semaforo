public class Trayectos
{
    
      private int contador=60;
  
   public synchronized void mostrarTrayecto()
    {
        
        
        while(contador >0)
        {   System.out.printf("%s"," \n\t\t\007 \007 Rojo para ( Oeste <- Este ) y ( Oeste -> Este )  \n\n\n");
            System.out.printf(" Verde para ( Sur -> Norte ) y ( Sur <- Norte ) \n\n");
            
            while( contador >35)
            {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
            }
            contador--;
        }
        try{
        System.out.printf(" \007   Amarillo para ( Sur -> Norte ) y ( Sur <- Norte ) \n\n"); 
        Thread.sleep(5000);
        contador=30;
    }catch(InterruptedException z)
    {
    }
    
   
     trayecto2();

}
}

public synchronized void trayecto2()
{

     while(contador >0)
    {
        System.out.printf(" \n\t\t\007 \007 Rojo para ( Sur -> Norte ) y ( Sur <- Norte ) \n\n");
        System.out.printf(" Verde para ( Oeste <- Este ) y ( Oeste -> Este ) \n\n");
        while( contador >5)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException d)
            {
            }
            contador--;
        }
        try{
            System.out.printf(" \007   Amarillo para ( Oeste <- Este ) y ( Oeste -> Este ) \n\n");
            Thread.sleep(5000);
            contador=0;        
        }catch(InterruptedException h)
        {}
        
    }
        reponerEstado();
    }
    

        
   public void reponerEstado()
        {
            contador=60;
        }
    
        
}
    
    
        
        
        
        
        
        
        
        
        
        
       