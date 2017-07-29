package rdafbn.blogspot.ie.stepbuilder;

import rdafbn.blogspot.ie.builder.Panino;

public class PaninoStepBuilderTest {

 public static void main(String[] args) {
  Panino solePanino = PaninoStepBuilder.newBuilder()
        .paninoCalled("sole panino")
        .breadType("baguette")
        .fish("sole")
        .addVegetable("tomato")
        .addVegetable("lettece")
        .noMoreVegetablesPlease()
        .build();

  Panino myPanino = PaninoStepBuilder.newBuilder().paninoCalled("Moje").breadType("Ciemne").meat("wolowe").withCheese("parmezan")
		  .addVegetable("tomato").addVegetable("cucumber").noMoreVegetablesPlease().build();
  System.out.println(solePanino);
  System.out.println(myPanino);
 }
}