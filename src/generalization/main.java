package generalization;

public class main {

public static void main(String[] args) {
	
  amazonHelper amazonHelper =new amazonHelper();
  amazonHelper.dispproduct(new mobile());
  System.out.println("_______________________");
  
  amazonHelper.dispproduct(new sunglass());
  System.out.println("_______________________");
  
  amazonHelper.dispproduct(new laptop());
  System.out.println("_______________________");
  
  amazonHelper.dispmobile(new mobile());
  System.out.println("_______________________");
  
 
  
}
}
