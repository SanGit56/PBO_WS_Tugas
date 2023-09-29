package exceptionhandling;

public class Phone
{
  public String Phone(String name, String serialNumber)
  throws ValidationException
  {
    if (name == "" || serialNumber == "") {
      throw new ValidationException("Jangan kosong");
    }
    else if (serialNumber.length() != 16) {
    	throw new ValidationException("Tidak 16");
    }
    else {
      return name + " " + serialNumber;
    }
  }
}