package builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author ZhangGJ
 * @Date 2021/01/25 08:24
 */
public abstract class Pizza {

	public enum Topping {
		HAM, MUSHROOM, PEPPER, SAUSAGE
	}


	final Set<Topping> toppings;


	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}

		abstract Pizza build();

		protected abstract T self();
	}

	Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone();
	}
}
