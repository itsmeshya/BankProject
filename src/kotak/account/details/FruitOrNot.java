package kotak.account.details;
public class FruitOrNot {
    String fruit="Apple";
    
    public void fruitornot() {
    	switch (fruit) {
    	case "Orange":
    		System.out.println(fruit + " is a fruit");
    		break;
    	case "Banana":
    		System.out.println(fruit + " is a fruit");
    		break;
    	case "Tomato":
    		System.out.println(fruit + " is a fruit");
    		break;
	case "Brinjal":
    		System.out.println(fruit + " is a fruit");
    		break;		
    	default:
    		System.out.println("Not sure about this fruit");
    	}
    }
      public static void main(String[] args) {
		FruitOrNot fon = new FruitOrNot();
		fon.fruitornot();
	}

}
