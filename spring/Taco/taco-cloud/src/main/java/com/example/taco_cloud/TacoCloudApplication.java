package com.example.taco_cloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.taco_cloud.Ingredient.Type;
import com.example.taco_cloud.data.IngredientRepository;

@SpringBootApplication
public class TacoCloudApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(IngredientRepository repo) {
	  return args -> {
	    repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
	    repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
	    repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
	    repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
	    repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
	    repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
	    repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
	    repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
	    repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
	    repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
	  };
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/login").setViewName("login");
	}

	// @Bean
	// public ApplicationRunner dataLoader(IngredientRepository repo) {
	//   return args -> {
	//     repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
	//     repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
	//     repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
	//     repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
	//     repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
	//     repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
	//     repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
	//     repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
	//     repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
	//     repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
	//   };
	// }

	// public ApplicationRunner dataLoader(IngredientRepository repo) {
	// 	return args -> {
	// 		List<String> version = args.getOptionValues("version");
	//		... 
	// 	}
	// }
}
