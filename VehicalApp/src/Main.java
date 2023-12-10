public class Main
{
    public static void main(String[] args)
    {
     Suv fortuner=new Suv("fortuner",6,false);
     fortuner.move(40,0);
     fortuner.accelerate(20);
     //fortuner.accelerate(-60);
System.out.println("Current Gear :"+ fortuner.getCurrentGear());
        System.out.println("Current Speed :"+ fortuner.getCurrentSpeed());
    }
}