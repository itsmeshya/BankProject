package kotak.account.details;

public class LuckyFlower {
   String flower = "jasmine";

public void flowername()
{
	if (flower.equals("rose")){
		System.out.println("My lucky flower is "+ flower);
	}else if
	(flower.equalsIgnoreCase("Jasmine")){
		System.out.println("My lucky flower is "+ flower);
	}else {
		System.out.println("I don't know it");
	}
		
}
public static void  main (String[] args) {
	LuckyFlower Lucky = new LuckyFlower();
	Lucky.flowername();
}
}
