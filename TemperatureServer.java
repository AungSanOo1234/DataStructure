import java.rmi.*;
import java.rmi.sever.*;
import java.net.*;
public class TemperatureServer extends UnicastRemoteObject implements TemperatureInterface
{
 public TemperatureSever() throws RemoteException{
 super();
}
 public double FahrenheitToCelsius(double ) throws RemoteException
{
 return (f-32)*5/9);
}
 public static void main(String[] args) throws RemoteException,MalformedULRException{
  TemperatureServer t=new TemperatureServer();
  String url="rmi://localhost:1099/temObj";      
  Naming.rebind(url,t);
  System.out.println("Server is ready!!");
}
}