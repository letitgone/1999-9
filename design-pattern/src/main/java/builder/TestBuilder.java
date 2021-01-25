package builder;

/**
 * @Author ZhangGJ
 * @Date 2021/01/25 08:01
 */
public class TestBuilder {

	public static void main(String[] args) {
		NutritionFacts cocaCola =
				new NutritionFacts.Builder(240, 8).calories(1000).sodium(35).carbohydrate(27)
						.build();
		System.out.println(cocaCola.toString());
	}
}
