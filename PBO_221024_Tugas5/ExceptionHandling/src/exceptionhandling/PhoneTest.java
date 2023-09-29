package exceptionhandling;

public class PhoneTest
{
  public static void main(String[] args)
  {
    Phone telepon = new Phone();
    
    try
    {
      //String pesan = telepon.Phone("", "");
      String pesan = telepon.Phone("nama", "angkaSerial");
    }
    catch (ValidationException e)
    {
      e.printStackTrace();
    }
  }
}