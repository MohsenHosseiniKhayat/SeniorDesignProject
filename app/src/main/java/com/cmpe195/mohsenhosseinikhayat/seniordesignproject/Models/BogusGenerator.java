package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Repositories.PantryRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class BogusGenerator
{
    public static ArrayList<Recipe> generateBogusRecipes()
    {
        ArrayList<Recipe> recipes = new ArrayList<>();

        PantryRepository pr = PantryRepository.getInstance();

        LinkedHashMap<Ingredient, Double> hashmap1 = new LinkedHashMap<Ingredient, Double>();
        hashmap1.put(pr.getIngredientWithName("garlic"), 100.0);
        hashmap1.put(pr.getIngredientWithName("lime"), 1.0);
        hashmap1.put(pr.getIngredientWithName("soy"), 2.0);
        hashmap1.put(pr.getIngredientWithName("mayonnaise"), 2.0);
        hashmap1.put(pr.getIngredientWithName("chicken thigh"), 2.0);
        hashmap1.put(pr.getIngredientWithName("salt"), 1.0);
        hashmap1.put(pr.getIngredientWithName("pepper"), 1.0);

        Recipe recipe1 = new Recipe("Rusty Chicken Thighs",
                "incredibly simple and highly effective grilled chicken marinade. It's so perfect and juicy and flavorful. It's an overall gorgeous way to grill chicken.",
        hashmap1,
        new String [] {
            "Mash garlic to a paste with a mortar and pestle. Mix chile pepper sauce, maple syrup, soy sauce, mayonnaise, and rice vinegar into garlic until marinade is thoroughly combined.",
            "Transfer chicken thighs to a large flat container (such as a baking dish) and pour marinade over chicken; stir until chicken is coated. Cover dish with plastic wrap and refrigerate about 3 hours; if preferred, let stand about 30 minutes at room temperature. Unwrap dish and sprinkle with salt.",
            "Preheat charcoal grill to high heat.",
            "Place chicken thighs onto the hot grill with smooth sides down. Cook until chicken shows grill marks, about 3 minutes. Turn chicken over and cook until other side shows grill marks, about 5 minutes. Continue to cook, moving them occasionally and turning over every 2 minutes, until meat is no longer pink inside and the thighs are golden brown, 10 to 12 minutes.",
            "Transfer chicken to a platter, let rest for 5 minutes, and serve garnished with lime wedges."
        },
                8,
                new String [] {},
                MealType.LUNCH,
                194);

        recipes.add(recipe1);


        LinkedHashMap<Ingredient, Double> hashmap2 = new LinkedHashMap<Ingredient, Double>();
        hashmap2.put(pr.getIngredientWithName("chile"), 2.0);
        hashmap2.put(pr.getIngredientWithName("chicken drumstick"), 1.0);
        hashmap2.put(pr.getIngredientWithName("onion"), 2.0);
        hashmap2.put(pr.getIngredientWithName("cilantro"), 2.0);
        hashmap2.put(pr.getIngredientWithName("milk"), 2.0);
        hashmap2.put(pr.getIngredientWithName("tomato"), 1.0);
        hashmap2.put(pr.getIngredientWithName("masala"), 1.0);
        hashmap2.put(pr.getIngredientWithName("water"), 3.0);

        Recipe recipe2 = new Recipe("Indian-Style Chicken and Onions",
                "Amazing Indian recipe that is simple, tasty, and full of flavor. This was the first Indian meal I made, and it has stuck around since all of my friends and family love it! Add more or less chiles depending on your spice preference.",
                hashmap2,
                new String [] {
                        "Puree water, garlic, serrano chile peppers, and ginger together in a blender or food processor until smooth.",
                        "Heat ghee in a 6-quart saucepan over medium heat. Season chicken with salt and pepper. Cook chicken in hot ghee until browned, 3 to 4 minutes per side. Transfer chicken to a plate",
                        "Cook and stir garlic puree in the 6-quart saucepan until golden, 2 to 3 minutes. Add onion; cook and stir until golden, 5 to 7 minutes. Add fenugreek, coriander, garam masala, and turmeric to onion mixture; cook and stir until fragrant, about 1 minute.",
                        "Stir tomatoes into onion mixture; cook and stir until tomatoes are lightly browned, 4 to 6 minutes. Add chicken, milk, and cream; bring to a boil. Reduce heat to medium, cover saucepan, and cook until chicken is no longer pink in the center and tender, 15 to 20 minutes. Transfer chicken to a serving platter using a slotted spoon. Continue cooking sauce until slightly reduced, 5 to 7 more minutes. Stir cilantro into sauce and pour over chicken."
                },
                4,
                new String [] {},
                MealType.LUNCH,
                620);

        recipes.add(recipe2);

        LinkedHashMap<Ingredient, Double> hashmap3 = new LinkedHashMap<Ingredient, Double>();
        hashmap3.put(pr.getIngredientWithName("chile"), 2.0);
        hashmap3.put(pr.getIngredientWithName("chicken drumstick"), 1.0);
        hashmap3.put(pr.getIngredientWithName("onion"), 2.0);
        hashmap3.put(pr.getIngredientWithName("cilantro"), 2.0);
        hashmap3.put(pr.getIngredientWithName("milk"), 2.0);
        hashmap3.put(pr.getIngredientWithName("tomato"), 1.0);
        hashmap3.put(pr.getIngredientWithName("masala"), 1.0);
        hashmap3.put(pr.getIngredientWithName("water"), 3.0);

        Recipe recipe3 = new Recipe("Baked Ziti",
                "",
                hashmap3,
                new String [] {
                        "Bring a large pot of lightly salted water to a boil. Add ziti pasta, and cook until al dente, about 8 minutes; drain.",
                        "In a large skillet, brown onion and ground beef over medium heat. Add spaghetti sauce, and simmer 15 minutes.",
                        "Preheat the oven to 350 degrees F (175 degrees C). Butter a 9x13 inch baking dish. Layer as follows: 1/2 of the ziti, Provolone cheese, sour cream, 1/2 sauce mixture, remaining ziti, mozzarella cheese and remaining sauce mixture. Top with grated Parmesan cheese.",
                        "Bake for 30 minutes in the preheated oven, or until cheeses are melted."
                },
                10,
                new String [] {},
                MealType.LUNCH,
                578);

        recipes.add(recipe3);


        LinkedHashMap<Ingredient, Double> hashmap4 = new LinkedHashMap<Ingredient, Double>();
        hashmap4.put(pr.getIngredientWithName("vegetable oil"), 3.0);
        hashmap4.put(pr.getIngredientWithName("rice"), 1.0);
        hashmap4.put(pr.getIngredientWithName("cumin"), 0.5);
        hashmap4.put(pr.getIngredientWithName("tomato"), 0.5);
        hashmap4.put(pr.getIngredientWithName("onion"), 0.25);

        Recipe recipe4 = new Recipe("Mexican Rice",
                "This is a wonderful side dish for any Mexican dinner.",
                hashmap4,
                new String [] {
                        "Heat oil in a large saucepan over medium heat and add rice. Cook, stirring constantly, until puffed and golden. While rice is cooking, sprinkle with salt and cumin.",
                        "Stir in onions and cook until tender. Stir in tomato sauce and chicken broth; bring to a boil. Reduce heat to low, cover and simmer for 20 to 25 minutes. Fluff with a fork."
                },
                4,
                new String [] {},
                MealType.LUNCH,
                291);

        recipes.add(recipe4);

        LinkedHashMap<Ingredient, Double> hashmap5 = new LinkedHashMap<Ingredient, Double>();
        hashmap5.put(pr.getIngredientWithName("garbanzo bean"), 2.0);
        hashmap5.put(pr.getIngredientWithName("tahini"), 0.5);
        hashmap5.put(pr.getIngredientWithName("lemon juice"), 0.25);
        hashmap5.put(pr.getIngredientWithName("garlic"), 200.0);
        hashmap5.put(pr.getIngredientWithName("parsley"), 1.5);

        Recipe recipe5 = new Recipe("Hummus",
                "Hummus is a pureed garbanzo bean dip with Middle Eastern origins. Serve with pita and an assortment of fresh vegetables. This is the secret combination straight from a Boston restaurant. Tahini, or sesame seed paste, can be found in health food stores, gourmet shops and even many grocery stores.",
                hashmap5,
                new String [] {
                    "Place the garbanzo beans, tahini, lemon juice, salt and garlic in a blender or food processor. Blend until smooth. Transfer mixture to a serving bowl.",
                        "Drizzle olive oil over the garbanzo bean mixture. Sprinkle with paprika and parsley."
                },
                16,
                new String [] {},
                MealType.APPETIZER,
                77);

        recipes.add(recipe5);

        LinkedHashMap<Ingredient, Double> hashmap6 = new LinkedHashMap<Ingredient, Double>();
        hashmap6.put(pr.getIngredientWithName("olive oil"), 0.75);
        hashmap6.put(pr.getIngredientWithName("basil"), 1.0);
        hashmap6.put(pr.getIngredientWithName("pepper"), 1.0);
        hashmap6.put(pr.getIngredientWithName("garlic"), 300.0);
        hashmap6.put(pr.getIngredientWithName("rosemary"), 2.0);

        Recipe recipe6 = new Recipe("Roasted Turkey",
                "This recipe makes your turkey moist and full of flavor. You can also use this recipe for Cornish game hens, chicken breasts or roasting chicken. Select a turkey sized according to the amount of people you will be serving.",
                hashmap6,
                new String [] {
                "Preheat oven to 325 degrees F (165 degrees C).",
                        "In a small bowl, mix the olive oil, garlic, rosemary, basil, Italian seasoning, black pepper and salt. Set aside.",
                        "Wash the turkey inside and out; pat dry. Remove any large fat deposits. Loosen the skin from the breast. This is done by slowly working your fingers between the breast and the skin. Work it loose to the end of the drumstick, being careful not to tear the skin.",
                        "Using your hand, spread a generous amount of the rosemary mixture under the breast skin and down the thigh and leg. Rub the remainder of the rosemary mixture over the outside of the breast. Use toothpicks to seal skin over any exposed breast meat.",
                        "Place the turkey on a rack in a roasting pan. Add about 1/4 inch of water to the bottom of the pan. Roast in the preheated oven 3 to 4 hours, or until the internal temperature of the bird reaches 180 degrees F (80 degrees C)."
                },
                16,
                new String [] {},
                MealType.LUNCH,
                596);

        recipes.add(recipe6);


        LinkedHashMap<Ingredient, Double> hashmap7 = new LinkedHashMap<Ingredient, Double>();
        hashmap7.put(pr.getIngredientWithName("garlic"), 400.0);
        hashmap7.put(pr.getIngredientWithName("salt"), 1.0);
        hashmap7.put(pr.getIngredientWithName("canola oil"), 1.0);
        hashmap7.put(pr.getIngredientWithName("cilantro"), 3.0);
        hashmap7.put(pr.getIngredientWithName("olive oil"), 3.0);
        hashmap7.put(pr.getIngredientWithName("onion"), 1.0);
        hashmap7.put(pr.getIngredientWithName("rosemary"), 2.0);
        hashmap7.put(pr.getIngredientWithName("lime"), 3.0);
        hashmap7.put(pr.getIngredientWithName("beef"), 1.5);

        hashmap7.put(pr.getIngredientWithName("tortilla"), 6.0);

        Recipe recipe7 = new Recipe("Sizzlin Fajitas",
                 "Serve with sour cream, Cheddar cheese or Monterey Jack cheese, and lime wedges.",
                 hashmap7,
                new String [] {
                        "Grind garlic with kosher salt with a mortar and pestle until a paste forms. Whisk garlic paste, lime juice, olive oil, cilantro, chili powder, sugar, paprika, and cayenne pepper together in a bowl; pour marinade into a resealable plastic bag. Add skirt steak strips, coat with the marinade, squeeze out excess air, and seal the bag. Marinate in the refrigerator, 2 hours to overnight.",
                        "Remove steak from marinade and shake off excess; discard remaining marinade.",
                        "Preheat oven to 300 degrees F (150 degrees C). Wrap tortillas tightly in aluminum foil to form a packet and place packet on a baking sheet.",
                        "Bake in the preheated oven until warmed through, about 10 minutes. Keep warm.",
                        "Heat 1 teaspoon canola oil in a large skillet over high heat until oil begins to smoke. Saute onion and bell pepper in hot oil until browned and almost tender, 4 to 5 minutes. Transfer onion and pepper to a plate.",
                            "Heat 1 teaspoon canola oil in the same skillet over high heat until oil starts to smoke. Cook 1/2 of the steak in hot oil until browned on all sides but still pink in the center, 4 to 6 minutes. Transfer cooked steak to the plate with onion and pepper.",
                        "Heat remaining canola oil in the same skillet. Cook remaining steak in hot oil until browned on all sides but still pink in the center, 4 to 6 minutes. Stir cooked steak, onion, bell pepper, and any accumulated juices back into the skillet. Add minced garlic and salt; cook and stir until fragrant and heated through. Remove from heat. Divide steak mixture between warm tortillas."

                },
                4,
                new String [] {},
                MealType.LUNCH,
                453);

        recipes.add(recipe7);

        LinkedHashMap<Ingredient, Double> hashmap8 = new LinkedHashMap<Ingredient, Double>();
        hashmap8.put(pr.getIngredientWithName("yogurt"), 32.0);
        hashmap8.put(pr.getIngredientWithName("cucumber"), 250.0);
        hashmap8.put(pr.getIngredientWithName("garlic"), 100.0);
        hashmap8.put(pr.getIngredientWithName("lemon juice"), 2.0);
        hashmap8.put(pr.getIngredientWithName("olive oil"), 2.0);
        hashmap8.put(pr.getIngredientWithName("dill"), 3.0);
        hashmap8.put(pr.getIngredientWithName("salt"), 2.0);
        hashmap8.put(pr.getIngredientWithName("pepper"), 3.0);
        hashmap8.put(pr.getIngredientWithName("tortilla"), 300.0);

        Recipe recipe8 = new Recipe("Tzatziki",
                "This cool Greek dip only gets better with time. Serve with pita bread, in gyros, on lamb or with whatever you like!",
                hashmap8,
                new String [] {
                        "Grind garlic with kosher salt with a mortar and pestle until a paste forms. Whisk garlic paste, lime juice, olive oil, cilantro, chili powder, sugar, paprika, and cayenne pepper together in a bowl; pour marinade into a resealable plastic bag. Add skirt steak strips, coat with the marinade, squeeze out excess air, and seal the bag. Marinate in the refrigerator, 2 hours to overnight.",
                        "Remove steak from marinade and shake off excess; discard remaining marinade.",
                        "Preheat oven to 300 degrees F (150 degrees C). Wrap tortillas tightly in aluminum foil to form a packet and place packet on a baking sheet.",
                        "Bake in the preheated oven until warmed through, about 10 minutes. Keep warm.",
                        "Heat 1 teaspoon canola oil in a large skillet over high heat until oil begins to smoke. Saute onion and bell pepper in hot oil until browned and almost tender, 4 to 5 minutes. Transfer onion and pepper to a plate.",
                        "Heat 1 teaspoon canola oil in the same skillet over high heat until oil starts to smoke. Cook 1/2 of the steak in hot oil until browned on all sides but still pink in the center, 4 to 6 minutes. Transfer cooked steak to the plate with onion and pepper.",
                        "Heat remaining canola oil in the same skillet. Cook remaining steak in hot oil until browned on all sides but still pink in the center, 4 to 6 minutes. Stir cooked steak, onion, bell pepper, and any accumulated juices back into the skillet. Add minced garlic and salt; cook and stir until fragrant and heated through. Remove from heat. Divide steak mixture between warm tortillas."

                },
                44,
                new String [] {},
                MealType.APPETIZER,
                22);

        recipes.add(recipe8);

        LinkedHashMap<Ingredient, Double> hashmap9 = new LinkedHashMap<Ingredient, Double>();
        hashmap9.put(pr.getIngredientWithName("penne"), 8.0);
        hashmap9.put(pr.getIngredientWithName("basil"), 2.5);
        hashmap9.put(pr.getIngredientWithName("garlic"), 100.0);
        hashmap9.put(pr.getIngredientWithName("parmesan"), 0.25);
        hashmap9.put(pr.getIngredientWithName("black olive"), 2.25);

        Recipe recipe9 = new Recipe("Penne Pesto Pasta Salad",
                "Penne pasta is tossed with basil pesto, mozzarella pearls, cherry tomatoes, Parmesan cheese, and black olives for a colorful and delicious pasta salad.",
                hashmap9,
                new String [] {
                        "Cook pasta in large pot of boiling salted water, just until al dente, about 7 to 9 minutes. Drain.",
                        "Combine pasta and pesto in large bowl. Stir in mozzarella, tomatoes, Parmesan and olives. Chill until ready to serve. Serve garnished with basil sprigs, if desired."

                },
                8,
                new String [] {},
                MealType.DINNER,
                285);

        recipes.add(recipe9);


        LinkedHashMap<Ingredient, Double> hashmap10 = new LinkedHashMap<Ingredient, Double>();
        hashmap10.put(pr.getIngredientWithName("garlic"), 100.0);
        hashmap10.put(pr.getIngredientWithName("beef"), 1.0);
        hashmap10.put(pr.getIngredientWithName("oregano"), 1.0);
        hashmap10.put(pr.getIngredientWithName("salt"), 1.0);
        hashmap10.put(pr.getIngredientWithName("pepper"), 1.0);
        hashmap10.put(pr.getIngredientWithName("parmesan"), 0.5);


        Recipe recipe10 = new Recipe("Classic Lasagna",
                "Whole wheat noodles and lean ground beef make this tasty favorite a little lighter.",
                hashmap10,
                new String [] {
                    "Preheat oven to 350 degrees F (175 degrees C).",
                        "Fill a large pot with lightly salted water and bring to a rolling boil over high heat. Once the water is boiling, add the lasagna noodles a few at a time, and return to a boil. Cook the pasta uncovered, stirring occasionally, until the pasta has cooked through, but is still firm to the bite, about 10 minutes. Remove the noodles to a plate.",
                        "Place the ground beef into a skillet over medium heat, add the garlic, garlic powder, oregano, salt, and black pepper to the skillet. Cook the meat, chopping it into small chunks as it cooks, until no longer pink, about 10 minutes. Drain excess grease.",
                        "In a bowl, mix the cottage cheese, eggs, and Parmesan cheese until thoroughly combined.",
                        "Place 4 noodles side by side into the bottom of a 9x13-inch baking pan; top with a layer of the tomato-basil sauce, a layer of ground beef mixture, and a layer of the cottage cheese mixture. Repeat layers twice more, ending with a layer of sauce; sprinkle top with the mozzarella cheese. Cover the dish with aluminum foil.",
                        "Bake in the preheated oven until the casserole is bubbling and the cheese has melted, about 30 minutes. Remove foil and bake until cheese has begun to brown, about 10 more minutes. Allow to stand at least 10 minutes before serving."
                },
                8,
                new String [] {},
                MealType.LUNCH,
                501);

        recipes.add(recipe10);


        LinkedHashMap<Ingredient, Double> hashmap11 = new LinkedHashMap<Ingredient, Double>();
        hashmap11.put(pr.getIngredientWithName("beef"), 1.0);
        hashmap11.put(pr.getIngredientWithName("onion"), 300.0);
        hashmap11.put(pr.getIngredientWithName("cilantro"), 2.0);
        hashmap11.put(pr.getIngredientWithName("salt"), 1.0);
        hashmap11.put(pr.getIngredientWithName("pepper"), 0.25);
        hashmap11.put(pr.getIngredientWithName("mozzarella"), 1.5);

        Recipe recipe11 = new Recipe("Spicy Turkey Burger",
                "With a chipotle chile pepper, mozzarella cheese and other seasonings, you will absolutely love this spicy, yet flavorful, burger!",
                hashmap11,
                new String [] {"Preheat an outdoor grill for medium-high heat, and lightly oil grate. Place the ground turkey, onion, cilantro, chipotle chile pepper, garlic powder, onion powder, seasoned salt, and black pepper in a mixing bowl; mix well. Form into 4 patties.",
                "Cook the hamburgers on the preheated grill until the turkey is no longer pink in the center, about 4 minutes per side. Place the mozzarella slices on the patties 2 minutes before they are ready. Serve on the toasted buns."},
                4,
                new String [] {},
                MealType.DINNER,
                376);

        recipes.add(recipe11);


        LinkedHashMap<Ingredient, Double> hashmap12 = new LinkedHashMap<Ingredient, Double>();
        hashmap12.put(pr.getIngredientWithName("water"), 1.25);
        hashmap12.put(pr.getIngredientWithName("sugar"), 1.5);
        hashmap12.put(pr.getIngredientWithName("butter"), 2.0);
        hashmap12.put(pr.getIngredientWithName("sausage"), 4.0);
        hashmap12.put(pr.getIngredientWithName("pepper"), 0.25);
        hashmap12.put(pr.getIngredientWithName("mozzarella"), 1.5);
        hashmap12.put(pr.getIngredientWithName("flour"), 1.5);

        Recipe recipe12 = new Recipe("Calzone",
                "This recipe can be split in half for 2 regular calzones. We fill them with anything. They are delicious!",
                hashmap12,
                new String [] {
                "Place water, salt, bread flour, dry milk, sugar, and yeast in the pan of the bread machine in the order suggested by the manufacturer. Select Dough cycle.",
                "After cycle ends, roll out dough on a lightly floured surface; shape into a 16 x 10 inch rectangle. Transfer to a lightly greased cookie sheet. In a small bowl, mix together chopped pepperoni and mozzarella. Spoon pizza sauce in a stripe down the center of dough lengthwise; add sausage and cheese filling. Make diagonal cuts 1 1/2 inches apart down each side, cutting within a 1/2 inch of the filling. Criss cross strips over filling, sealing with water. Brush top with melted butter.",
                        "Bake at 350 degrees F (175 degrees C) for 35 to 45 minutes."
                },
                10,
                new String [] {},
                MealType.LUNCH,
                285);

        recipes.add(recipe12);


        LinkedHashMap<Ingredient, Double> hashmap13 = new LinkedHashMap<Ingredient, Double>();
        hashmap13.put(pr.getIngredientWithName("milk"), 0.75);
        hashmap13.put(pr.getIngredientWithName("vinegar"), 2.0);
        hashmap13.put(pr.getIngredientWithName("sugar"), 2.0);
        hashmap13.put(pr.getIngredientWithName("baking powder"), 1.0);
        hashmap13.put(pr.getIngredientWithName("butter"), 2.0);
        hashmap13.put(pr.getIngredientWithName("salt"), 0.5);
        hashmap13.put(pr.getIngredientWithName("baking soda"), 0.5);
        hashmap13.put(pr.getIngredientWithName("flour"), 1.0);

        Recipe recipe13 = new Recipe("Pancake",
                "Tall and fluffy. These pancakes are just right. Topped with strawberries and whipped cream, they are impossible to resist.",
                hashmap13,
                new String [] {
                        "Combine milk with vinegar in a medium bowl and set aside for 5 minutes to sour",
                        "Combine flour, sugar, baking powder, baking soda, and salt in a large mixing bowl. Whisk egg and butter into milk. Pour the flour mixture into the wet ingredients and whisk until lumps are gone.",
                        "Heat a large skillet over medium heat, and coat with cooking spray. Pour 1/4 cupfuls of batter onto the skillet, and cook until bubbles appear on the surface. Flip with a spatula, and cook until browned on the other side."
                },
                4,
                new String [] {},
                MealType.BREAKFAST,
                230);

        recipes.add(recipe13);

        LinkedHashMap<Ingredient, Double> hashmap14 = new LinkedHashMap<Ingredient, Double>();
        hashmap14.put(pr.getIngredientWithName("milk"), 0.75);
        hashmap14.put(pr.getIngredientWithName("banana"), 1.5);
        hashmap14.put(pr.getIngredientWithName("sugar"), 0.75);
        hashmap14.put(pr.getIngredientWithName("egg"), 1.0);
        hashmap14.put(pr.getIngredientWithName("butter"), 0.5);
        hashmap14.put(pr.getIngredientWithName("salt"), 0.5);
        hashmap14.put(pr.getIngredientWithName("baking soda"), 1.0);
        hashmap14.put(pr.getIngredientWithName("flour"), 1.5);

        Recipe recipe14 = new Recipe("Banana Muffins",
                "These delicious banana muffins are easy for kids to make.",
                hashmap14,
                new String [] {
                        "Preheat oven to 350 degrees F (175 degrees C). Coat muffin pans with non-stick spray, or use paper liners. Sift together the flour, baking powder, baking soda, and salt; set aside.",
                        "Combine bananas, sugar, egg, and melted butter in a large bowl. Fold in flour mixture, and mix until smooth. Scoop into muffin pans.",
                        "Bake in preheated oven. Bake mini muffins for 10 to 15 minutes, and large muffins for 25 to 30 minutes. Muffins will spring back when lightly tapped."
                },
                12,
                new String [] {},
                MealType.SNACK,
                185);

        recipes.add(recipe14);


        LinkedHashMap<Ingredient, Double> hashmap15 = new LinkedHashMap<Ingredient, Double>();
        hashmap15.put(pr.getIngredientWithName("cod fish"), 1.0);
        hashmap15.put(pr.getIngredientWithName("vegetable oil"), 1.0);
        hashmap15.put(pr.getIngredientWithName("sugar"), 0.75);
        hashmap15.put(pr.getIngredientWithName("dill"), 0.5);
        hashmap15.put(pr.getIngredientWithName("pepper"), 0.5);
        hashmap15.put(pr.getIngredientWithName("cabbage"), 0.5);
        hashmap15.put(pr.getIngredientWithName("salt"), 0.5);
        hashmap15.put(pr.getIngredientWithName("mayonnaise"), 0.5);
        hashmap15.put(pr.getIngredientWithName("flour"), 1.5);
        hashmap15.put(pr.getIngredientWithName("jalapeno"), 1.5);

        Recipe recipe15 = new Recipe("Fish Tacos",
                "Serve with homemade pico de gallo, and lime wedges to squeeze on top!",
                hashmap15,
                new String [] {
                "To make beer batter: In a large bowl, combine flour, cornstarch, baking powder, and salt. Blend egg and beer, then quickly stir into the flour mixture (don't worry about a few lumps).",
                        "To make white sauce: In a medium bowl, mix together yogurt and mayonnaise. Gradually stir in fresh lime juice until consistency is slightly runny. Season with jalapeno, capers, oregano, cumin, dill, and cayenne.",
                        "Heat oil in deep-fryer to 375 degrees F (190 degrees C).",
                        "Dust fish pieces lightly with flour. Dip into beer batter, and fry until crisp and golden brown. Drain on paper towels. Lightly fry tortillas; not too crisp. To serve, place fried fish in a tortilla, and top with shredded cabbage, and white sauce."
                },
                12,
                new String [] {},
                MealType.DINNER,
                185);

        recipes.add(recipe15);


        LinkedHashMap<Ingredient, Double> hashmap16 = new LinkedHashMap<Ingredient, Double>();
        hashmap16.put(pr.getIngredientWithName("sausage"), 2.0);
        hashmap16.put(pr.getIngredientWithName("egg"), 12.0);
        hashmap16.put(pr.getIngredientWithName("tortilla"), 12.0);
        hashmap16.put(pr.getIngredientWithName("milk"), 1.0);
        hashmap16.put(pr.getIngredientWithName("flour"), 1.0);

        Recipe recipe16 = new Recipe("Breakfast Burritos",
                "Baked tortillas, packed with sausage, cheese and eggs. Swimming in a hearty sausage gravy.",
                hashmap16,
                new String [] {
                "Place sausage in a large, deep skillet. Cook over medium high heat until evenly brown. Drain, reserving 2 tablespoons drippings; set sausage aside. Preheat oven to 350 degrees F (175 degrees C).",
                        "Add the eggs and green chiles to the skillet; cook, stirring occasionally, until eggs are scrambled and set.",
                        "Lightly grease a 9x13 inch baking pan. Place the tortillas on a counter top or other clean surface. Cover each tortillas with portions on sausage, cheese and eggs. Roll up the tortillas and place them seam side down in the baking dish.",
                        "Heat reserved sausage drippings in the skillet. Sprinkle on the flour and stir. Add milk, stirring constantly, until the gravy begins to thicken. Pour the gravy on top of the tortilla rolls.",
                        "Bake in preheated oven for 10 to 15 minutes, until gravy is bubbly."
                },
                8,
                new String [] {},
                MealType.BREAKFAST,
                754);

        recipes.add(recipe16);

        LinkedHashMap<Ingredient, Double> hashmap17 = new LinkedHashMap<Ingredient, Double>();
        hashmap17.put(pr.getIngredientWithName("sushi rice"), 2.0);
        hashmap17.put(pr.getIngredientWithName("vinegar"), 6.0);
        hashmap17.put(pr.getIngredientWithName("salmon"), 8.0);
        hashmap17.put(pr.getIngredientWithName("wasabi"), 2.0);
        hashmap17.put(pr.getIngredientWithName("avocado"), 1.0);
        hashmap17.put(pr.getIngredientWithName("sea weed"), 6.0);
        hashmap17.put(pr.getIngredientWithName("cucumber"), 300.0);

        Recipe recipe17 = new Recipe("Sushi",
                "A very basic and easy way to make sushi rolls",
                hashmap17,
                new String [] {
                "Soak rice for 4 hours. Drain rice and cook in a rice cooker with 2 cups of water. Rice must be slightly dry as vinegar will be added later.",
                        "Immediately after rice is cooked, mix in 6 tablespoons rice vinegar to the hot rice. Spread rice on a plate until completely cool.",
                        "Place 1 sheet of seaweed on bamboo mat, press a thin layer of cool rice on the seaweed. Leave at least 1/2 inch top and bottom edge of the seaweed uncovered. This is for easier sealing later. Dot some wasabi on the rice. Arrange cucumber, avocado and smoked salmon to the rice. Position them about 1 inch away from the bottom edge of the seaweed.",
                        "Slightly wet the top edge of the seaweed. Roll from bottom to the top edge with the help of the bamboo mat tightly. Cut roll into 8 equal pieces and serve. Repeat for other rolls."
                },
                6,
                new String [] {},
                MealType.DINNER,
                291);

        recipes.add(recipe17);

        LinkedHashMap<Ingredient, Double> hashmap18 = new LinkedHashMap<Ingredient, Double>();
        hashmap18.put(pr.getIngredientWithName("potato"), 1.0);
        hashmap18.put(pr.getIngredientWithName("olive oil"), 1.0);
        hashmap18.put(pr.getIngredientWithName("onion"), 0.5);
        hashmap18.put(pr.getIngredientWithName("paprika"), 0.5);

        Recipe recipe18 = new Recipe("Baked French Fries",
                "This is an easy way to make a great side dish for burgers!",
                hashmap18,
                new String [] {
                        "Preheat oven to 450 degrees F (230 degrees C).",
                "Cut potato into wedges. Mix olive oil, paprika, garlic powder, chili powder and onion powder together. Coat potatoes with oil/spice mixture and place on a baking sheet.",
                "Bake for 45 minutes in preheated oven."},
                1,
                new String [] {},
                MealType.APPETIZER,
                357);

        recipes.add(recipe18);


        LinkedHashMap<Ingredient, Double> hashmap19 = new LinkedHashMap<Ingredient, Double>();
        hashmap19.put(pr.getIngredientWithName("avocado"), 3.0);
        hashmap19.put(pr.getIngredientWithName("lime"), 1.0);
        hashmap19.put(pr.getIngredientWithName("salt"), 1.0);
        hashmap19.put(pr.getIngredientWithName("onion"), 0.5);
        hashmap19.put(pr.getIngredientWithName("garlic"), 1.0);
        hashmap19.put(pr.getIngredientWithName("tomato"), 1.5);
        hashmap19.put(pr.getIngredientWithName("cilantro"), 3.5);

        Recipe recipe19 = new Recipe("Guacamole",
                "You can make this avocado salad smooth or chunky depending on your tastes.",
                hashmap19,
                new String [] {
                        "In a medium bowl, mash together the avocados, lime juice, and salt. Mix in onion, cilantro, tomatoes, and garlic. Stir in cayenne pepper. Refrigerate 1 hour for best flavor, or serve immediately."},
                4,
                new String [] {},
                MealType.APPETIZER,
                262);

        recipes.add(recipe19);

        LinkedHashMap<Ingredient, Double> hashmap20 = new LinkedHashMap<Ingredient, Double>();
        hashmap20.put(pr.getIngredientWithName("potato"), 4.0);
        hashmap20.put(pr.getIngredientWithName("vegetable oil"), 2.0);
        hashmap20.put(pr.getIngredientWithName("salt"), 2.0);
        hashmap20.put(pr.getIngredientWithName("onion"), 1.0);
        hashmap20.put(pr.getIngredientWithName("garlic"), 3.0);
        hashmap20.put(pr.getIngredientWithName("tomato"), 2.5);
        hashmap20.put(pr.getIngredientWithName("garbanzo bean"), 15.0);
        hashmap20.put(pr.getIngredientWithName("cumin"), 2.0);

        Recipe recipe20 = new Recipe("Spicy Vegan Potato Curry",
                "Abundant spices make this better than any restaurant curry.",
                hashmap20,
                new String [] {
                "Place potatoes into a large pot and cover with salted water. Bring to a boil over high heat, then reduce heat to medium-low, cover, and simmer until just tender, about 15 minutes. Drain and allow to steam dry for a minute or two.",
                        "Meanwhile, heat the vegetable oil in a large skillet over medium heat. Stir in the onion and garlic; cook and stir until the onion has softened and turned translucent, about 5 minutes. Season with cumin, cayenne pepper, curry powder, garam masala, ginger, and salt; cook for 2 minutes more. Add the tomatoes, garbanzo beans, peas, and potatoes. Pour in the coconut milk, and bring to a simmer. Simmer 5 to 10 minutes before serving."
                },
                6,
                new String [] {},
                MealType.DINNER,
                407);

        recipes.add(recipe20);

        return recipes;
    }


    public static ArrayList<Ingredient> generateBogusIngredients()
    {
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Ingredient("penne", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("parmesan", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("mozzarella", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("black olive", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("garbanzo bean", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("parsley", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("basil", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("lemon juice", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("tahini", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("garlic", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("lime", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("soy", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("mayonnaise", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("chicken thigh", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("salt", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("pepper", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("water", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("masala", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("milk", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("tomato", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("onion", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("chicken drumstick", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("cilantro", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("pasta", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("cheese", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("sour cream", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("olive oil", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("beef", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("turkey", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("rice", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("cumin", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("vegetable oil", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("canola oil", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("rosemary", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("dill", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("cucumber", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("yogurt", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("tortilla", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("lasagna noodles", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("oregano", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("egg", MeasurementUnit.PC, 0));
        ingredients.add(new Ingredient("tomato sauce", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("hamburger bun", MeasurementUnit.PC, 0));
        ingredients.add(new Ingredient("sugar", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("sausage", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("butter", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("flour", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("vinegar", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("baking soda", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("baking powder", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("banana", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("cod fish", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("cabbage", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("jalapeno", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("sushi rice", MeasurementUnit.CUP, 0));
        ingredients.add(new Ingredient("salmon", MeasurementUnit.OUNCE, 0));
        ingredients.add(new Ingredient("sea weed", MeasurementUnit.GRAM, 0));
        ingredients.add(new Ingredient("avocado", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("wasabi", MeasurementUnit.TABLESPOON, 0));
        ingredients.add(new Ingredient("potato", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("paprika", MeasurementUnit.TEASPOON, 0));
        ingredients.add(new Ingredient("chicken", MeasurementUnit.POUND, 0));
        ingredients.add(new Ingredient("chile", MeasurementUnit.TEASPOON, 0));


        return ingredients;
    }


    public static int getImageID(String name)
    {
        switch (name)
        {
            case "Spicy Vegan Potato Curry":
                return R.mipmap.vegan_curry;
            case "Baked French Fries":
                return R.mipmap.baked_french_fries;
            case "Guacamole":
                return R.mipmap.guacamole;
            case "Sushi":
                return R.mipmap.sushi;
            case "Breakfast Burritos":
                return R.mipmap.breakfast_burritos;
            case "Fish Tacos":
                return R.mipmap.fish_tacos;
            case "Banana Muffins":
                return R.mipmap.banana_muffins;
            case "Pancake":
                return R.mipmap.pancake;
            case "Calzone":
                return R.mipmap.calzone;
            case "Spicy Turkey Burger":
                return R.mipmap.spicy_turkey_burger;
            case "Classic Lasagna":
                return R.mipmap.classic_lasagna;
            case "Penne Pesto Pasta Salad":
                return R.mipmap.pesto_penne;
            case "Tzatziki":
                return R.mipmap.tzatziki;
            case "Sizzlin Fajitas":
                return R.mipmap.sizzlin_fajitas;
            case "Roasted Turkey":
                return R.mipmap.roasted_turkey;
            case "Hummus":
                return R.mipmap.hummus;
            case "Rusty Chicken Thighs":
                return R.mipmap.rusty_chicken_thighs;
            case "Indian-Style Chicken and Onions":
                return R.mipmap.indian_style_chicken_and_onions;
            case "Mexican Rice":
                return R.mipmap.mexican_rice;
            case "Baked Ziti":
                return R.mipmap.baked_ziti;
            case "black olive":
                return R.mipmap.black_olive;
            case "pepper":
                return R.mipmap.pepper;
            case "penne":
                return R.mipmap.penne;
            case "salmon":
                return R.mipmap.salmon;
            case "beef":
                return R.mipmap.beef;
            case "garbanzo bean":
                return R.mipmap.garbanzo_bean;
            case "tomato":
                return R.mipmap.tomato;
            case "tomato sauce":
                return R.mipmap.tomato_sauce;
            case "masala":
                return R.mipmap.masala;
            case "water":
                return R.mipmap.water;
            case "olive oil":
                return R.mipmap.olive_oil;
            case "canola oil":
                return R.mipmap.canola_oil;
            case "vegetable oil":
                return R.mipmap.vegetable_oil;
            case "milk":
                return R.mipmap.milk;
            case "cumin":
                return R.mipmap.cumin;
            case "lasagna noodles":
                return R.mipmap.lasagna_noodles;
            case "sour cream":
                return R.mipmap.sour_cream;
            case "rice":
                return R.mipmap.rice;
            case "cheese":
                return R.mipmap.cheese;
            case "cilantro":
                return R.mipmap.cilantro;
            case "turkey":
                return R.mipmap.turkey;
            case "cucumber":
                return R.mipmap.cucumber;
            case "pasta":
                return R.mipmap.pasta;
            case "egg":
                return R.mipmap.egg;
            case "jalapeno":
                return R.mipmap.jalapeno;
            case "baking soda":
                return R.mipmap.baking_soda;
            case "baking powder":
                return R.mipmap.baking_powder;
            case "cabbage":
                return R.mipmap.cabbage;
            case "sugar":
                return R.mipmap.sugar;
            case "oregano":
                return R.mipmap.oregano;
            case "dill":
                return R.mipmap.dill;
            case "chicken thigh":
                return R.mipmap.chicken_thigh;
            case "lemon juice":
                return R.mipmap.lemon_juice;
            case "basil":
                return R.mipmap.basil;
            case "parsley":
                return R.mipmap.parsley;
            case "parmesan":
                return R.mipmap.parmesan;
            case "mayonnaise":
                return R.mipmap.mayonnaise;
            case "soy":
                return R.mipmap.soy;
            case "lime":
                return R.mipmap.lime;
            case "garlic":
                return R.mipmap.garlic;
            case "vinegar":
                return R.mipmap.vinegar;
            case "salt":
                return R.mipmap.salt;
            case "onion":
                return R.mipmap.onion;
            case "chicken":
                return R.mipmap.chicken;
            case "rosemary":
                return R.mipmap.rosemary;
            case "yogurt":
                return R.mipmap.yogurt;
            case "tortilla":
                return R.mipmap.tortilla;
            case "hamburger bun":
                return R.mipmap.hamburger_bun;
            case "sausage":
                return R.mipmap.sausage;
            case "butter":
                return R.mipmap.butter;
            case "flour":
                return R.mipmap.flour;
            case "banana":
                return R.mipmap.banana;
            case "cod fish":
                return R.mipmap.cod_fish;
            case "sushi":
                return R.mipmap.sushi;
            case "sea weed":
                return R.mipmap.sea_weed;
            case "avocado":
                return R.mipmap.avocado;
            case "wasabi":
                return R.mipmap.wasabi;
            case "potato":
                return R.mipmap.potato;
            case "paprika":
                return R.mipmap.paprika;
            case "chile":
                return R.mipmap.chile;
            case "sushi rice":
                return R.mipmap.sushi_rice;
            case "chicken drumstick":
                return R.mipmap.drumstick;
            case "mozzarella":
                return R.mipmap.mozzarella;
            case "tahini":
                return R.mipmap.tahini;
                default:
                    return 0;

        }
    }
}
