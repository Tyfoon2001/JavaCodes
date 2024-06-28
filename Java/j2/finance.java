class finance()
{

public static void main()
{

double p = Double.parseDouble(args[0]);
float r = Float.parseFloat(args[1]);
float t= Float.parseFloat(args[2]);

finance f=new finance();
System.out.println("Simple interest is %.2f",f.simethod());

}



}