
public class Semaforo extends Thread
{   
private Trayectos trayectos=new Trayectos();

    
    public void run()
    {
        while(true)
        {
              trayectos.mostrarTrayecto();
     
        }
        
    }
}