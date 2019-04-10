public class SingletonUsignBillPugh  
{ 
  
  private SingletonUsignBillPugh()  
  { 
    // private constructor 
  } 
  
  // Inner class to provide instance of class 
  private static class BillPughSingleton 
  { 
    private static final SingletonUsignBillPugh INSTANCE = new SingletonUsignBillPugh(); 
  } 
  
  public static SingletonUsignBillPugh getInstance()  
  { 
    return BillPughSingleton.INSTANCE; 
  } 
} 
