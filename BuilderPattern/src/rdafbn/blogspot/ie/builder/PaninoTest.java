package rdafbn.blogspot.ie.builder;

public class PaninoTest {
	public static void main(String args[]){
		Panino marcoPanino = new PaninoBuilder()
				.paninoCalled("marcoPanino")
				.breadType("baguette")
				.withCheese("gorgonzola")
				.withMeat("ham")
				.withVegetable("tomatos").build();
		System.out.println(marcoPanino);
	}
}
