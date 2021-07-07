package com.lambdaschool.sprint2_challenge

import com.lambdaschool.animatedlayoutdemocode.R
import com.lambdaschool.animatedlayoutdemocode.model.ShoppingItem

object ShoppingItemConstants {
    fun generateItems(): List<ShoppingItem> {
        val items = mutableListOf<ShoppingItem>()

        for(i in 0 until ICON_IDS.size) {
            items.add(ShoppingItem(ITEM_NAMES_RAW[i], ICON_IDS[i]))
        }

        return items
    }

    val ICON_IDS = intArrayOf(
        R.drawable.almond,
        R.drawable.apple_green,
        R.drawable.apple_red,
        R.drawable.apple_yellow,
        R.drawable.apple2,
        R.drawable.artichoke,
        R.drawable.asparagus,
        R.drawable.avocado,
        R.drawable.avocado2,
        R.drawable.bacon,
        R.drawable.banana,
        R.drawable.banana_split,
        R.drawable.barley,
        R.drawable.beans,
        R.drawable.beef,
        R.drawable.beer,
        R.drawable.beer_bottle,
        R.drawable.beetroot,
        R.drawable.bell_pepper,
        R.drawable.bell_pepper_green,
        R.drawable.bell_pepper_yellow,
        R.drawable.bell_pepper1,
        R.drawable.bell_pepper2,
        R.drawable.birthday_cake,
        R.drawable.biscotti,
        R.drawable.blackberry,
        R.drawable.blueberry,
        R.drawable.bowl_chopsticks,
        R.drawable.brazil_nut,
        R.drawable.bread,
        R.drawable.bread_slice,
        R.drawable.broccoli,
        R.drawable.brown_bread,
        R.drawable.bubblegum,
        R.drawable.bubblegum_machine,
        R.drawable.bun,
        R.drawable.butter,
        R.drawable.cabbage,
        R.drawable.cake,
        R.drawable.cake_slice,
        R.drawable.cake_slice2,
        R.drawable.candy,
        R.drawable.candy_cane,
        R.drawable.canned_food,
        R.drawable.cantaloupe,
        R.drawable.cantaloupe1,
        R.drawable.cantaloupe2,
        R.drawable.caramel_apple,
        R.drawable.carrot,
        R.drawable.cashew_nut,
        R.drawable.cassava,
        R.drawable.cassava2,
        R.drawable.cauliflower,
        R.drawable.celery,
        R.drawable.champagne,
        R.drawable.cheese_round,
        R.drawable.cheese_slice,
        R.drawable.cheese_wedge,
        R.drawable.cherry,
        R.drawable.cherry_tomatoes,
        R.drawable.chestnut,
        R.drawable.chicken,
        R.drawable.chicken_leg,
        R.drawable.chickpeas,
        R.drawable.chili_pepper,
        R.drawable.chocolate_bar,
        R.drawable.chocolate_bonbon,
        R.drawable.chocolate_chip_cookie,
        R.drawable.cocktail,
        R.drawable.cocoa,
        R.drawable.coconut,
        R.drawable.coconut2,
        R.drawable.coffee,
        R.drawable.coffee_bean,
        R.drawable.coffee_pot,
        R.drawable.cognac,
        R.drawable.cola_drink,
        R.drawable.cookie,
        R.drawable.cookie2,
        R.drawable.corn_cob,
        R.drawable.cotton_candy,
        R.drawable.crab,
        R.drawable.cracker,
        R.drawable.cranberry,
        R.drawable.croissant,
        R.drawable.cucumber,
        R.drawable.cupcake,
        R.drawable.cutlet,
        R.drawable.double_popsicle,
        R.drawable.doughnut,
        R.drawable.eclair,
        R.drawable.egg,
        R.drawable.eggplant,
        R.drawable.eggplant2,
        R.drawable.fig,
        R.drawable.fig2,
        R.drawable.fish,
        R.drawable.fish_fillet,
        R.drawable.flour,
        R.drawable.french_fries,
        R.drawable.fried_chicken_leg,
        R.drawable.fried_egg,
        R.drawable.frozen,
        R.drawable.fruit_squash,
        R.drawable.fruitcake,
        R.drawable.garlic,
        R.drawable.glass_bottle,
        R.drawable.glass_of_milk,
        R.drawable.goldenberry,
        R.drawable.grapefruit,
        R.drawable.grapefruit2,
        R.drawable.grapes_green,
        R.drawable.grapes_red,
        R.drawable.green_beans,
        R.drawable.ham,
        R.drawable.hamburguer,
        R.drawable.hard_boiled_egg,
        R.drawable.hazelnut,
        R.drawable.honey,
        R.drawable.hot_chocolate,
        R.drawable.hotdog,
        R.drawable.ice_cream_bar,
        R.drawable.ice_cream_cone,
        R.drawable.ice_cream_cup,
        R.drawable.ice_cream_double_cone,
        R.drawable.ice_cubes,
        R.drawable.jam,
        R.drawable.ketchup,
        R.drawable.kiwi2,
        R.drawable.leek,
        R.drawable.lemon,
        R.drawable.lemon2,
        R.drawable.lentils,
        R.drawable.lettuce,
        R.drawable.lime,
        R.drawable.lime2,
        R.drawable.lobster,
        R.drawable.lollipop1,
        R.drawable.macadamia_nut,
        R.drawable.macaron,
        R.drawable.maple_syrup,
        R.drawable.maple_syrup2,
        R.drawable.marshmallow,
        R.drawable.mayonnaise,
        R.drawable.meatballs,
        R.drawable.milk_carton,
        R.drawable.milk_gallon,
        R.drawable.milkshake,
        R.drawable.muffin,
        R.drawable.mushrooms,
        R.drawable.mushrooms2,
        R.drawable.mustard,
        R.drawable.noodles,
        R.drawable.nut_cake,
        R.drawable.oats,
        R.drawable.olives,
        R.drawable.olives_black,
        R.drawable.omelette,
        R.drawable.onion,
        R.drawable.onion_red,
        R.drawable.onion_red2,
        R.drawable.orange,
        R.drawable.orange_juice,
        R.drawable.orange2,
        R.drawable.pancake,
        R.drawable.pancakes,
        R.drawable.papaya,
        R.drawable.papaya2,
        R.drawable.peach,
        R.drawable.peach2,
        R.drawable.peanut,
        R.drawable.peanut_butter,
        R.drawable.pear_green,
        R.drawable.pear_green2,
        R.drawable.pear_yellow,
        R.drawable.peas,
        R.drawable.pecan,
        R.drawable.pepper_grinder,
        R.drawable.pepper_shaker,
        R.drawable.pickles,
        R.drawable.pie,
        R.drawable.pie_slice,
        R.drawable.pie1,
        R.drawable.pine_nuts,
        R.drawable.pineapple,
        R.drawable.pistachio,
        R.drawable.pitahaya,
        R.drawable.pitahaya2,
        R.drawable.pizza,
        R.drawable.pizza_round,
        R.drawable.plastic_bottle,
        R.drawable.plum,
        R.drawable.plum2,
        R.drawable.popcorn,
        R.drawable.popsicle,
        R.drawable.pork,
        R.drawable.portobello,
        R.drawable.potato,
        R.drawable.pretzel,
        R.drawable.pumpkin,
        R.drawable.pumpkin2,
        R.drawable.radish,
        R.drawable.raspberry,
        R.drawable.rice,
        R.drawable.rice_cracker,
        R.drawable.roasted_chicken,
        R.drawable.rock_candy,
        R.drawable.rocket_popsicle,
        R.drawable.romaine_lettuce,
        R.drawable.rye,
        R.drawable.salad,
        R.drawable.salmon_fillet,
        R.drawable.salmon_steak,
        R.drawable.salt_shaker,
        R.drawable.sandwich,
        R.drawable.sandwich2,
        R.drawable.sausage,
        R.drawable.shrimp,
        R.drawable.skewer,
        R.drawable.sliced_bread,
        R.drawable.soda_can,
        R.drawable.soft_cream_cone,
        R.drawable.soft_drink,
        R.drawable.soup,
        R.drawable.spaghetti,
        R.drawable.squash,
        R.drawable.squash2,
        R.drawable.steak,
        R.drawable.steak_raw,
        R.drawable.strawberry,
        R.drawable.sugar_cubes,
        R.drawable.sugarcane,
        R.drawable.sundae,
        R.drawable.sushi_maki,
        R.drawable.sushi_nigiri,
        R.drawable.sweet_potato,
        R.drawable.sweet_potato2,
        R.drawable.t_bone_steak,
        R.drawable.t_bone_steak_raw,
        R.drawable.tangerine,
        R.drawable.tea,
        R.drawable.tea_kettle,
        R.drawable.teabag,
        R.drawable.teapot,
        R.drawable.toast,
        R.drawable.toast_marmalade,
        R.drawable.tomato,
        R.drawable.tomato2,
        R.drawable.turnip,
        R.drawable.wafer,
        R.drawable.waffle,
        R.drawable.walnut,
        R.drawable.watermelon,
        R.drawable.watermelon1,
        R.drawable.watermelon2,
        R.drawable.wedding_cake,
        R.drawable.wheat,
        R.drawable.whisky_bottle,
        R.drawable.whisky_glass,
        R.drawable.whole_grain_bread,
        R.drawable.wine_bottle,
        R.drawable.wine_cup,
        R.drawable.wine_cup2
    )

    var ITEM_NAMES_RAW = arrayOf(
        "almond",
        "apple_green",
        "apple_red",
        "apple_yellow",
        "apple2",
        "artichoke",
        "asparagus",
        "avocado",
        "avocado2",
        "bacon",
        "banana",
        "banana_split",
        "barley",
        "beans",
        "beef",
        "beer",
        "beer_bottle",
        "beetroot",
        "bell_pepper",
        "bell_pepper_green",
        "bell_pepper_yellow",
        "bell_pepper1",
        "bell_pepper2",
        "birthday_cake",
        "biscotti",
        "blackberry",
        "blueberry",
        "bowl_chopsticks",
        "brazil_nut",
        "bread",
        "bread_slice",
        "broccoli",
        "brown_bread",
        "bubblegum",
        "bubblegum_machine",
        "bun",
        "butter",
        "cabbage",
        "cake",
        "cake_slice",
        "cake_slice2",
        "candy",
        "candy_cane",
        "canned_food",
        "cantaloupe",
        "cantaloupe1",
        "cantaloupe2",
        "caramel_apple",
        "carrot",
        "cashew_nut",
        "cassava",
        "cassava2",
        "cauliflower",
        "celery",
        "champagne",
        "cheese_round",
        "cheese_slice",
        "cheese_wedge",
        "cherry",
        "cherry_tomatoes",
        "chestnut",
        "chicken",
        "chicken_leg",
        "chickpeas",
        "chili_pepper",
        "chocolate_bar",
        "chocolate_bonbon",
        "chocolate_chip_cookie",
        "cocktail",
        "cocoa",
        "coconut",
        "coconut2",
        "coffee",
        "coffee_bean",
        "coffee_pot",
        "cognac",
        "cola_drink",
        "cookie",
        "cookie2",
        "corn_cob",
        "cotton_candy",
        "crab",
        "cracker",
        "cranberry",
        "croissant",
        "cucumber",
        "cupcake",
        "cutlet",
        "double_popsicle",
        "doughnut",
        "eclair",
        "egg",
        "eggplant",
        "eggplant2",
        "fig",
        "fig2",
        "fish",
        "fish_fillet",
        "flour",
        "french_fries",
        "fried_chicken_leg",
        "fried_egg",
        "frozen",
        "fruit_squash",
        "fruitcake",
        "garlic",
        "glass_bottle",
        "glass_of_milk",
        "goldenberry",
        "grapefruit",
        "grapefruit2",
        "grapes_green",
        "grapes_red",
        "green_beans",
        "ham",
        "hamburguer",
        "hard_boiled_egg",
        "hazelnut",
        "honey",
        "hot_chocolate",
        "hotdog",
        "ice_cream_bar",
        "ice_cream_cone",
        "ice_cream_cup",
        "ice_cream_double_cone",
        "ice_cubes",
        "jam",
        "ketchup",
        "kiwi2",
        "leek",
        "lemon",
        "lemon2",
        "lentils",
        "lettuce",
        "lime",
        "lime2",
        "lobster",
        "lollipop1",
        "macadamia_nut",
        "macaron",
        "maple_syrup",
        "maple_syrup2",
        "marshmallow",
        "mayonnaise",
        "meatballs",
        "milk_carton",
        "milk_gallon",
        "milkshake",
        "muffin",
        "mushrooms",
        "mushrooms2",
        "mustard",
        "noodles",
        "nut_cake",
        "oats",
        "olives",
        "olives_black",
        "omelette",
        "onion",
        "onion_red",
        "onion_red2",
        "orange",
        "orange_juice",
        "orange2",
        "pancake",
        "pancakes",
        "papaya",
        "papaya2",
        "peach",
        "peach2",
        "peanut",
        "peanut_butter",
        "pear_green",
        "pear_green2",
        "pear_yellow",
        "peas",
        "pecan",
        "pepper_grinder",
        "pepper_shaker",
        "pickles",
        "pie",
        "pie_slice",
        "pie1",
        "pine_nuts",
        "pineapple",
        "pistachio",
        "pitahaya",
        "pitahaya2",
        "pizza",
        "pizza_round",
        "plastic_bottle",
        "plum",
        "plum2",
        "popcorn",
        "popsicle",
        "pork",
        "portobello",
        "potato",
        "pretzel",
        "pumpkin",
        "pumpkin2",
        "radish",
        "raspberry",
        "rice",
        "rice_cracker",
        "roasted_chicken",
        "rock_candy",
        "rocket_popsicle",
        "romaine_lettuce",
        "rye",
        "salad",
        "salmon_fillet",
        "salmon_steak",
        "salt_shaker",
        "sandwich",
        "sandwich2",
        "sausage",
        "shrimp",
        "skewer",
        "sliced_bread",
        "soda_can",
        "soft_cream_cone",
        "soft_drink",
        "soup",
        "spaghetti",
        "squash",
        "squash2",
        "steak",
        "steak_raw",
        "strawberry",
        "sugar_cubes",
        "sugarcane",
        "sundae",
        "sushi_maki",
        "sushi_nigiri",
        "sweet_potato",
        "sweet_potato2",
        "t_bone_steak",
        "t_bone_steak_raw",
        "tangerine",
        "tea",
        "tea_kettle",
        "teabag",
        "teapot",
        "toast",
        "toast_marmalade",
        "tomato",
        "tomato2",
        "turnip",
        "wafer",
        "waffle",
        "walnut",
        "watermelon",
        "watermelon1",
        "watermelon2",
        "wedding_cake",
        "wheat",
        "whisky_bottle",
        "whisky_glass",
        "whole_grain_bread",
        "wine_bottle",
        "wine_cup",
        "wine_cup2"
    )
}
