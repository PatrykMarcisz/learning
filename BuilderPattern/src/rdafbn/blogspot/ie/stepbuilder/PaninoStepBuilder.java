package rdafbn.blogspot.ie.stepbuilder;

import java.util.ArrayList;
import java.util.List;

import rdafbn.blogspot.ie.builder.Panino;

public class PaninoStepBuilder {

	public static FirstNameStep newBuilder(){
		return new Steps();
	}
	
	public static interface FirstNameStep{
		BreadTypeStep paninoCalled(String name);
	}
	
	public static interface BreadTypeStep{
		MainFillingStep breadType(String breadType);
	}
	
	public static interface MainFillingStep{
		CheeseStep meat(String meat);
		VegetableStep fish(String fish);
	}

	public static interface CheeseStep{
		VegetableStep noCheesePlease();
		VegetableStep withCheese(String cheese);
	}

	
	public static interface VegetableStep {
        BuildStep noMoreVegetablesPlease();

        BuildStep noVegetablesPlease();

        VegetableStep addVegetable(String vegetable);
	}
	
	public static interface BuildStep {
		Panino build();
	}
	
	private static class Steps implements
		FirstNameStep, BreadTypeStep, MainFillingStep, CheeseStep, VegetableStep, BuildStep{

        private String name;
        private String breadType;
        private String meat;
        private String fish;
        private String cheese;
        private final List<String> vegetables = new ArrayList<String>();

        public BreadTypeStep paninoCalled(String name) {
                this.name = name;
                return this;
        }

        public MainFillingStep breadType(String breadType) {
                this.breadType = breadType;
                return this;
        }

        public CheeseStep meat(String meat) {
                this.meat = meat;
                return this;
        }

        public VegetableStep fish(String fish) {
                this.fish = fish;
                return this;
        }

        public BuildStep noMoreVegetablesPlease() {
                return this;
        }

        public BuildStep noVegetablesPlease() {
                return this;
        }

        public VegetableStep addVegetable(String vegetable) {
                this.vegetables.add(vegetable);
                return this;
        }

        public VegetableStep noCheesePlease() {
                return this;
        }

        public VegetableStep withCheese(String cheese) {
                this.cheese = cheese;
                return this;
        }

        public Panino build() {
                Panino panino = new Panino(name);
                panino.setBreadType(breadType);
                if (fish != null) {
                        panino.setFish(fish);
                } else {
                        panino.setMeat(meat);
                }
                if (cheese != null) {
                        panino.setCheese(cheese);
                }
                if (!vegetables.isEmpty()) {
                        panino.setVegetables(vegetables);
                }
                return panino;
        }
		
	}
	
}
