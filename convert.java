import java.io.*;
public class convert 
{
   public static void main(String args[])throws IOException
   {
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader buf=new BufferedReader(in);
    Double a,b;
    a=Double.parseDouble(buf.readLine());
    b=(a*9/5)+32;
    System.out.println(b);
   } 
}
