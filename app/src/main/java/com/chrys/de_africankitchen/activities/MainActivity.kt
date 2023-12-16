package com.chrys.de_africankitchen.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.chrys.de_africankitchen.R
import com.chrys.de_africankitchen.models.generalrecipiemodel
import com.chrys.de_africankitchen.models.mostpopularmodel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import java.io.File

class MainActivity : AppCompatActivity() {

     lateinit var storageref : StorageReference
     lateinit var firebaseFirestore: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var handler = Handler()

        handler.postDelayed({
            val intent = Intent(this@MainActivity, StartActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)

//        storageref = FirebaseStorage.getInstance().reference
//
//        for (i in 1..100 ){
//            var imageref = storageref.child("images/image$i.jpg")
//            val file = Uri.fromFile(File("images/image$i.jpg"))
//
//            imageref.putFile(file)
//                .addOnSuccessListener { taskSnapshot ->
//                    // Image uploaded successfully
//                    val downloadUrl = taskSnapshot.storage.downloadUrl.toString()
//                    // Add the download URL to Firestore and Realtime Database
//                    addImageUrlToFirestore(downloadUrl)
//                }
//                .addOnFailureListener { exception ->
//                    // Handle any errors that occurred during the upload
//                }
//        }
//        }


//        var recipies = ArrayList<mostpopularmodel>()
//        var generalRecipies = ArrayList<generalrecipiemodel>()


//most popular section


//       adddatatoDb()


    }


    @SuppressLint("SuspiciousIndentation")
    fun adddatatoDb(){

        var recipies = ArrayList<mostpopularmodel>()
        var generalRecipies = ArrayList<generalrecipiemodel>()

            recipies.add(
            mostpopularmodel(
                "Pap en Vleis/shisha Nyama",
                "South Africa",
                "40 mins",
                "750 ml water\n" +
                        "A pinch of salt\n" +
                        "350 g maize meal\n" +
                        "2 T butter\n" +
                        "5 T soya sauce\n" +
                        "5 T teriyaki sauce\n" +
                        "200 g think beef strips\n" +
                        "2 T olive oil\n" +
                        "1 onion, thinly sliced\n" +
                        "2 garlic cloves, crushed\n" +
                        "1 x 10 cm piece ginger, peeled and grated\n" +
                        "Freshly ground black pepper, to taste\n" +
                        "125 ml sweet chilli sauce\n" +
                        "2 spring onions, sliced",

                "In a medium-sized saucepan, bring the water and salt to a rapid boil. Add half the maize meal, reduce the heat to medium, cover and cook for 8 minutes. Stir the mixture and add the remaining maize meal, a little at a time.\n" +
                        "\n" +
                        "Stir and beat it against the sides of the saucepan with the back of the wooden spoon. This should take about 5 minutes.\n" +
                        "\n" +
                        "Reduce the heat further, cover and cook for 10 to 15 minutes. Add the butter and mix. Remove from the heat and cool slightly.\n" +
                        "\n" +
                        "Press two spoonfuls of pap into each cup of a greased muffin tray to create a basket or cup-like shape. Set aside.\n" +
                        "\n" +
                        "Marinate the beef strips in half the soya and teriyaki sauces for 10 minutes.\n" +
                        "\n" +
                        "In a large frying pan, heat the oil and sauté the onion, garlic and ginger for a minute. Add the marinated beef strips, season with pepper and stir-fry for 3 minutes, or until browned and cooked through.\n" +
                        "\n" +
                        "Add the remaining soya and teriyaki sauces, sweet chilli sauce and spring onion and cook for 2 minutes. Fill the pap baskets and serve immediately",

                "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/papenvleis.jpeg?alt=media&token=6ac4a2be-1248-4d4a-b6c3-04fd3a79edad"
                ,

                "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058"
            )
        )

                recipies.add(mostpopularmodel("Piri Piri Chicken", "Mozambique", "1 hrs 40 mins",
                    "1 chicken, about 2kg\n" +
                            "For the piri-piri marinade\n" +
                            "2 dried hot chillies\n" +
                            "100ml red wine vinegar\n" +
                            "6 red chillies\n" +
                            "6 garlic cloves\n" +
                            "2 tsp smoked paprika\n" +
                            "1 tsp dried oregano\n" +
                            "1 tsp dried thyme\n" +
                            "1 tsp golden caster sugar\n" +
                            "2 lemons, juiced",

                    "STEP 1\n" +
                            "To make the marinade, tip the dried chillies and the vinegar into a pan and bring to the boil. Remove from the heat and leave the chillies to soak until the vinegar is cold. Put the red chillies, garlic, soaked dried chillies and vinegar in a food processor and blitz. Add the smoked paprika, oregano, thyme, sugar, a pinch of salt and the lemon juice. Blitz again to a paste and set aside.\n" +
                            "\n" +
                            "STEP 2\n" +
                            "Sit the chicken in a shallow dish and use a small knife to score all over with cuts 1cm deep. Make sure you do the legs and the underside. Tip the marinade over the chicken and massage into the cuts. Cover and chill for at least 4 hrs, but overnight would be better.\n" +
                            "\n" +
                            "STEP 3\n" +
                            "When you’re ready to cook, heat oven to 180C/160C fan/gas 4. Roast the chicken for 1 hr, then turn the heat up to 220C/200C fan/gas 7 and cook for a further 30-35 mins until a crust has formed on the outside of the chicken.\n" +
                            "\n" +
                            "STEP 4\n" +
                            "Remove from the oven and leave to rest for 30 mins. Serve with homemade wedges or jacket potatoes, coleslaw, " +
                            "some buttered corn cobs and chilli and mint peas.",

                    "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/piripiri.jpeg?alt=media&token=cb6e68c7-b2d7-407b-9e42-2907bfdc4553"
                    , "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b" ))

 recipies.add(mostpopularmodel("Jollof Rice", "Nigeria", "1 hr",
            "5 medium sized Roma tomatoes, roughly chopped\n" +
                    "1 red bell pepper, roughly chopped\n" +
                    "1 medium sized onion, roughly chopped, set aside\n" +
                    "2 scotch bonnet peppers (habanero peppers as they are sometimes called)\n" +
                    "1/4 cup of groundnut oil\n" +
                    "3 tbsp tomato paste\n" +
                    "2 cups of parboiled rice\n" +
                    "2 1/2 cups of chicken stock\n" +
                    "1 tsp salt to taste\n" +
                    "1/2 tsp curry powder\n" +
                    "1/2 tsp thyme\n" +
                    "1 tsp All purpose seasoning\n" +
                    "1 Knorr stock cube\n" +
                    "3 bay leaves\n" +
                    "Water, as needed",

            "Blend your tomatoes, red pepper, scotch bonnet peppers in a food processor or blender for about 45 seconds, make sure that everything is blended well.\n" +
                    "In a medium sized pot, heat your oil on medium-high heat. Once the oil is heated add the onions you set aside and fry just until they turn golden brown. Once the onions, have turned brown in color add the tomato paste and fry for 2-3 minutes. Then add the blended tomato mixture (reserve about 1/4 cup and set aside) and fry the mixture with the onions and tomato paste for about 30 minutes. Make sure you stir consistently so that the tomato mixture does not burn.\n" +
                    "After 30 minutes, turn the heat down to medium, and add the chicken stock. Mix and add your seasonings (salt, curry powder, thyme, all purpose seasoning, and the Knorr stock cube). Continue to boil for 10 minutes.\n" +
                    "Add the parboiled rice to the pot. Mix it very well with the tomato stew. At this point if you need to add water so that the rice is level with the tomato mixture/chicken stock go ahead and do so. Add the bay leaves, cover the pot, and cook on medium to low heat for 15-30 minutes.\n" +
                    "When the liquid has almost dried up add the remaining tomato stew, cover, and let it cook for another 5-10 minutes heat until the liquid has completely dried up. Turn off the heat, mix thoroughly, " +
                    "and your Jollof Rice is ready to be eaten!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/jollofrice.jpeg?alt=media&token=bf772a16-43ef-466c-95a8-eb39c9ddc8b1"

            , "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa" ))

        recipies.add(mostpopularmodel("Egusi soup", "Nigeria", "50 mins",
            "For the Beef and Stock:\n" +
                    "\n" +
                    "1 pound (450g) bone-in or boneless beef chuck roast, cut into 2-inch pieces\n" +
                    "1 medium red onion (about 6 ounces; 175g), thinly sliced\n" +
                    "2 tablespoons ground crayfish (see note)\n" +
                    "2 teaspoons (6g) Diamond Crystal kosher salt, plus more to taste; for table salt use half as much by volume or the same weight\n" +
                    "1/2 teaspoon Nigerian red dry pepper\n" +
                    "For the Egusi Soup:\n" +
                    "\n" +
                    "1 medium red onion (about 6 ounces; 175g), roughly chopped\n" +
                    "1/2 fresh habanero or Scotch bonnet pepper, stemmed (optional)\n" +
                    "2 cups (10 ounces; 300g) ground egusi seeds (see note)\n" +
                    "3/4 cup unrefined red palm oil (5 1/4 ounces; 150g), such as Obiji\n" +
                    "Kosher salt and Nigerian red dry pepper\n" +
                    "1 teaspoon ground crayfish (see note)\n" +
                    "3 1/2 ounces (100g) fresh pumpkin leaves, amaranth greens, or kale, rinsed and finely chopped (see note)\n" +
                    "3 1/2 ounces (100g) fresh waterleaf or spinach, rinsed and finely chopped (see note)\n" +
                    "1 tablespoon finely chopped fresh or dried bitter leaf or fresh dandelion greens",

            "For the Stock: In a medium pot, combine beef, onion, crayfish, salt, pepper, and 6 1/2 cups water and bring to a boil. Lower heat to maintain a simmer and cook until the stock is slightly reduced and the beef is mostly tender, about 45 minutes (the beef will tenderize further when cooked in the soup). Using a slotted spoon, remove beef and transfer to a medium heatproof bowl; set aside. Reserve stock (you should have about 5 1/2 cups).For the Egusi Soup: In a food processor or countertop blender, process onion, pepper (if using), and 1/4 cup water until smooth. Scrape into a medium bowl and stir in the ground egusi seeds. Add water, 1 tablespoon at a time, until a thick, creamy paste has formed (paste should be viscous and hold its shape). Set aside.\n" +
                    "    In a 4-quart saucepan, heat oil over low heat for 1 minute. Slowly add all of the reserved stock, along with the crayfish, and bring to a gentle simmer. Add paste, 1 heaped teaspoon at a time, to stock. Cover and cook, stirring and gently scraping the bottom of the pot occasionally, until all of the paste is firm and crumbly, about 25 minutes (patches of orange-red palm oil may bubble on top or around the sides).Add reserved beef and stir gently to break up the cooked paste into curds (stirring more or less affects the size of the curds). Season with salt and pepper to taste. Continue to cook until beef is heated through and tender, and some of the orange-red palm oil pools on top, about 10 minutes.\n" +
                    "    Mound pumpkin leaves and waterleaf on top of soup without stirring, then cover and let steam until greens are wilted, about 2 minutes. Stir in wilted greens. Add bitter leaf and cook until soft, about 8 minutes.\n" +
                    "    Divide soup among warmed bowls and serve hot or at room temperature with eba, dodo, or cooked white rice.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egusi.jpeg?alt=media&token=f68c8723-bef9-4b4a-b345-7d6c03f9272e",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"))


        recipies.add(mostpopularmodel("Bunny Chow", "South Africa", "1 hr",
            "1 pound chicken thighs or breast cut in bite-sized pieces\n" +
                    "1/2 cup canola or cooking oil\n" +
                    "2-3 Curry leaves\n" +
                    "1 teaspoons minced ginger\n" +
                    "2 teaspoons minced garlic\n" +
                    "1 Tablespoon curry powder or more\n" +
                    "1 medium onion diced\n" +
                    "2 medium tomatoes diced\n" +
                    "1 cinnamon stick\n" +
                    "1 1/2 teaspoon paprika\n" +
                    "3 green cardamom pods lightly crushed\n" +
                    "8 ounce or less potatoes cleaned and cut into cubes\n" +
                    "1 15 ounce can chickpeas rinsed and drained\n" +
                    "½ teaspoon cayenne pepper optional\n" +
                    "11/2 cup or more chicken broth or water\n" +
                    "Salt and pepper to taste",

            "When ready to cook, heat up large Sauce- pan with oil, and add onions, garlic,ginger, cinnamon stick, curry leaves, cardamom pods and curry powder, stir occasionally for about 2-3 minutes until onions is translucent.\n" +
                    "Add tomatoes followed by chicken, stir and sauté for about 2-3 more minutes. Add chicken stock/ water if necessary to prevent any burns\n" +
                    "Next add chickpeas, potatoes and chicken broth , about 1 1 1/2 cup , add more as needed. Bring to a boil and let it simmer until sauce thickens, it might take about 25 minutes or more\n" +
                    "Adjust for salt, pepper and stew consistency.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/bonny.jpeg?alt=media&token=c351e0f4-a35d-4d42-bca3-e2c83847eef0"

            , "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058" ))


        recipies.add(mostpopularmodel("Kapenta With Sadza", "Zimbabwe", " 45 mins",
            "1 lb Dried kapenta fish\n" +
                    "1 Large onion\n" +
                    "1 Large tomato\n" +
                    "4 cloves Garlic\n" +
                    "1 tbsp Olive oil\n" +
                    "Salt and pepper to taste",

            "Prepare a large pot of boiling water and place in your kapenta, boil for 15 minutes.\n" +
                    "After 15 minutes, remove your kapenta, pat it dry and then chop into thin chunks ready for frying.\n" +
                    "Finely chop your onion and garlic, and add to a hot frying pan of olive oil, cook until browned.\n" +
                    "Finely chop the tomato and add to the pan along with salt, pepper, groundnut powder and a 1/2 cup of water.\n" +
                    "Add your kapenta to the pan, making sure to immerse it in the sauce. Cover the pan and leave to simmer for 10 minutes on a low heat, stirring half way through.\n" +
                    "Take your fish stew off the heat and leave to rest for 2 minutes to allow the sauce to thicken.\n" +
                    "Your stewed kapenta is now ready to eat, serve with sadza or boiled rice.\n" +
                    "Enjoy!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kapenta.jpeg?alt=media&token=7025b86b-26d1-4dc2-a25e-eb52d681afce",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zimbabwe.jpg?alt=media&token=3e4aaabf-773b-42cb-8a12-b85f3a2d7a63" ))

        recipies.add(mostpopularmodel("Chambo With nsima", "Malawi", " 40 mins",
            "4 Tilapia fillets\n" +
                    "lemon juice\n" +
                    "flour\n" +
                    "1 large onion chopped\n" +
                    "2 Tablespoons Malawi curry spice blend\n" +
                    "1 cup water\n" +
                    "1 carrot chopped\n" +
                    "1 green pepper chopped\n" +
                    "1/4 cup fruit chutney",

            "Clean, salt and sprinkle fillets with lemon juice\n" +
                    "Roll in flour\n" +
                    "Heat about 4 tablespoons of oil in a large frying pan and fry the fillets about 4 minutes per side and remove the fillets.\n" +
                    "In the pan add the chopped onion and fry until translucent (about 5 minutes)\n" +
                    "Mix in 2 Tablespoons of the Malawi curry spice blend and fry with the onions for about 2 minutes\n" +
                    "Add the rest of the curry spice blend along with 1 1/2 cups of water stirring so all the spice blend is nicely incorporated into the water.\n" +
                    "Add in the chopped carrots and green pepper and turn heat to a simmer.\n" +
                    "simmer until the vegetables are soft about 10 minutes\n" +
                    "Add in the fruit chutney and stir\n" +
                    "Place the fillets into the saucepan and make sure they are covered by the gravy.\n" +
                    "Close the lid and let the fish rest in the sauce for a few minutes.\n" +
                    "Plate with lots of the sauce\n" +
                    "Serve with nsima (cornmeal porridge) or rice.\n" +
                    "Enjoy!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/chamboo.jpeg?alt=media&token=6613c6e8-82b6-4aed-8bc8-5c34c64ce3de",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653" ))

        recipies.add(mostpopularmodel("Nambian Vension", "Nambia", "2 hrs 30 mins",
            "Spice mixture:\n" +
                    "\n" +
                    "10 ml (2 t) ground cumin\n" +
                    "5 ml (1 t) poppy seeds\n" +
                    "2 ml (½ t) ground fennel\n" +
                    "2 ml (½ t) ground cardamom\n" +
                    "2 ml (½ t) milled black pepper\n" +
                    "2ml (½ t) ground turmeric\n" +
                    "1 ml (¼ t) ground cloves\n" +
                    "Roghan Josh:\n" +
                    "\n" +
                    "1.5 kg boneless venison meat (shoulder or leg)\n" +
                    "15 ml (1 T) butter\n" +
                    "30 ml (2 T) vegetable oil\n" +
                    "1 large onion, chopped\n" +
                    "2 – 3 green or red chilies, deseeded and sliced into thin strips\n" +
                    "6 medium garlic cloves, crushed\n" +
                    "30 ml (2 T) desiccated coconut\n" +
                    "4 cardamom pods, lightly crushed\n" +
                    "400 g tin whole peeled tomatoes, chopped in their juice\n" +
                    "7 ml (1½ t) salt\n" +
                    "5 ml ((½ t) garam masala\n" +
                    "125 ml plain yoghurt\n" +
                    "2 medium potatoes, peeled and chopped (cubes)",

            "Mix together all the spices.\n" +
                    "Trim the meat of fat and cut into chunks.\n" +
                    "On a medium heat, heat butter and oil in a large saucepan.\n" +
                    "Add onion and fry until glassy. Add the chili, garlic, ginger, coconut, and cardamom.\n" +
                    "Stir in the spice mixture, tomatoes, and salt.\n" +
                    "Cover and simmer gently on a low heat for 1 – 1½ hours, stirring occasionally until the meat is tender. Add the potatoes.\n" +
                    "Sprinkle with garam masala, stir in and cook for 5 minutes more.\n" +
                    "Stir in the yoghurt and heat through.\n" +
                    "Plate and garnish with thyme.\n" +
                    "Serve hot.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambian.jpeg?alt=media&token=2508177a-47a8-4981-992a-156f6611d223",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))

        recipies.add(mostpopularmodel("Muamba De Galinha", "Angola", " 1 hr 15 mins",
            "3 – 3 1/2 pound chicken cut in pieces\n" +
                    "Juice ½ lemon optional\n" +
                    "1 teaspoon white pepper\n" +
                    "1 teaspoon minced garlic\n" +
                    "½ teaspoon dried thyme\n" +
                    "1 teaspoon salt\n" +
                    "½ teaspoon smoked paprika\n" +
                    "½ teaspoon chicken bouillon powder\n" +
                    "¼ cup canola oil\n" +
                    "¼ cup palm oil\n" +
                    "4-5 garlic minced\n" +
                    "2-3 onions sliced\n" +
                    "2 tomatoes diced\n" +
                    "1 teaspoon white pepper\n" +
                    "1 teaspoon smoked paprika\n" +
                    "Whole hot pepper pierced chili, Scotch bonnet\n" +
                    "½ -1 pound butternut squash cut into large cubes\n" +
                    "18-20 Okra sliced in half\n" +
                    "2 cups or more chicken broth or water\n" +
                    "Salt to taste",

            "Place chicken in a large bowl or saucepan, rub with lemon juice ,\n" +
                    "Then add salt, garlic, thyme, white pepper and chicken bouillon.\n" +
                    "Mix chicken with a spoon or with hands until they are well coated, set aside.\n" +
                    "When ready to cook, heat up large saucepan with palm and canola oil, then add chicken, brown both sides for about 4-5 minutes.\n" +
                    "Add garlic, chili pepper and smoked paprika, stir for about a minute then add onions and tomatoes, sauté 2-3 minutes until onions is translucent.\n" +
                    "Add chicken stock if necessary to prevent any burns\n" +
                    "Next add chicken stock or water (about 2 cups or enough to cover chicken. Add chicken bouillon, and squash. Bring to a boil and let it simmer until sauce thickens, it might take about 20 or more depending on the type of chicken used. Throw in okra, continue cooking until desired texture is reached about 5 minutes or more\n" +
                    "Adjust for salt, pepper and stew consistency.\n" +
                    "Serve warm with Cornmeal mash or rice.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/muamba.jpeg?alt=media&token=ba75b40a-8d0e-456d-846d-13d1954575e3",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8" ))

        recipies.add(mostpopularmodel("Cape Breyeni", "South Africa", "1 hr 40 mins",
            "   1 1⁄2\n" +
                    "lbs chicken thighs, on the bone (750 g, or use drumsticks and thighs, but don\\'t remove the skin)\n" +
                    "salt and pepper, to taste, for the dish\n" +
                    "3⁄4\n" +
                    "cup buttermilk (180 ml)\n" +
                    "2\n" +
                    "tablespoons cilantro, fresh, chopped (30 ml chopped coriander leaves)\n" +
                    "1⁄2\n" +
                    "tablespoon cinnamon, ground (7 ml)\n" +
                    "1\n" +
                    "teaspoon turmeric (5 ml)\n" +
                    "1\n" +
                    "tablespoon cumin, ground (15 ml)\n" +
                    "1\n" +
                    "tablespoon coriander seed, ground (15 ml)\n" +
                    "1\n" +
                    "tablespoon masala (15 ml)\n" +
                    "1\n" +
                    "hot pepper, chopped (1 chilli)\n" +
                    "3⁄4\n" +
                    "cup basmati rice (180 ml)\n" +
                    "4\n" +
                    "ounces lentils, brown, rinsed (125 g)\n" +
                    "oil (for frying)\n" +
                    "1\n" +
                    "large onion, finely chopped\n" +
                    "2 -3\n" +
                    "large potatoes, peeled, chopped into chunks\n" +
                    "2\n" +
                    "cinnamon sticks (or use 1 teaspoon ground cinnamon)\n" +
                    "1\n" +
                    "tablespoon coriander seed, ground (extra to amount mentioned above)\n" +
                    "3\n" +
                    "cardamom pods, slit and seeds removed to use\n" +
                    "1\n" +
                    "tablespoon cumin, ground (extra to amount already mentioned)\n" +
                    "1\n" +
                    "pinch saffron, soaked in a little water (sub with a good pinch turmeric)\n" +
                    "3\n" +
                    "eggs, hard-boiled\n" +
                    "chopped cilantro, to garnish",

            "Preheat oven to 325 deg F/160 deg Celsius.\n" +
                    "Season chicken with salt and pepper. Mix together the buttermilk, cilantro, cinnamon, turmeric, cumin, ground coriander, masala and hot pepper. Pour over chicken pieces and marinate 3 hours or overnight.\n" +
                    "Parboil rice in 2 cups water for 20 minutes, and drain well.\n" +
                    "Simmer lentils in 2 cups water for 20 minutes, and drain well.\n" +
                    "Heat a fair amount of oil in a saucepan, and fry onion and potatoes until softened. Add the cinnamon, ground coriander, cardamom seeds, cumin and saffron (or sub with a good pinch turmeric) and cook, stirring, for a minute. Set aside.\n" +
                    "Layer half the rice, followed by half each of the lentils, and the spiced potatoes and onion in an ovenproof dish. Top with the chicken.\n" +
                    "Repeat the layers with the remaining ingredients, top with saffron/turmeric water, and cover it all with tinfoil and a tight-fitting lid.\n" +
                    "Bake for 1 1/2 - 2 hours or until chicken and rice are cooked through.\n" +
                    "Garnish with quarters of hardboiled eggs and sprinkle with cilantro/coriander leaves.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/cape.jpeg?alt=media&token=4cad7911-79ac-4900-85b5-97837e66b2cc",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058"))

        recipies.add(mostpopularmodel("ZanZibari Biryanis And Pilanus", "Tanzania", "1 hrs 5 mins",
            "2 tbsp extra virgin olive oil\n" +
                    "\n" +
                    "1 yellow onion, chopped\n" +
                    "\n" +
                    "1/2 red bell pepper, seeded and chopped\n" +
                    "\n" +
                    "handful of cashews, coarsely chopped (optional)\n" +
                    "\n" +
                    "3 cloves of garlic, minced\n" +
                    "\n" +
                    "1-2\" piece of fresh ginger, peeled and grated\n" +
                    "\n" +
                    "1 bay leaf\n" +
                    "\n" +
                    "2 tbsp of Piquant Post Spiced Pilaf blend\n" +
                    "\n" +
                    "2 cups of basmati rice\n" +
                    "\n" +
                    "1 cup (canned) coconut milk\n" +
                    "\n" +
                    "3 cups of low-salt broth (chicken or vegetarian)\n" +
                    "\n" +
                    "salt and pepper to taste (optional)",

            " Prep and chop all vegetables (onion, red pepper, cashews, garlic and ginger) and set aside. Heat a large skillet on Med-High. Add oil to pan.\n" +
                    "\n" +
                    "Once pan is hot, add the onion and red pepper and sauté for 5 mins, stirring occasionally. Add the cashews, ginger, garlic, bay leaf and Pilaf Spice. Stir to mix. Sauté for 2 mins.\n" +
                    "\n" +
                    "Add the rice and stir the mixture. Dry fry for 1 min. Add the broth and coconut milk, stirring to mix, and bring to a low boil.\n" +
                    "\n" +
                    "Reduce heat to Low and simmer for 15-20 mins or until the rice is cooked and liquid is absorbed. Serve as a side dish or top with cooked meats for a delicious meal.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zanzibari.jpeg?alt=media&token=07093bc7-6d03-4643-a7c5-f65b31a59ad7",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/tanzania.jpg?alt=media&token=0615f098-6c83-4bfa-bb5f-879720a5a5c3"))

        recipies.add(mostpopularmodel("Nyama No Irio", "Kenya", " 30 mins",
            "12\n" +
                    "ounces peas\n" +
                    "12\n" +
                    "ounces corn\n" +
                    "4\n" +
                    "cups mashed potatoes\n" +
                    "3\n" +
                    "tablespoons butter\n" +
                    "salt and pepper\n" +
                    "3\n" +
                    "lbs beef tenderloin, cubed\n" +
                    "3\n" +
                    "tablespoons olive oil\n" +
                    "6\n" +
                    "tablespoons flour\n" +
                    "2\n" +
                    "cups beef broth",

            "Mix together mashed potatoes with corn, peas, butter, salt and pepper.\n" +
                    "Sauté meat in oil until browned.\n" +
                    "Remove steak and add flour to the oil. Make a light brown roux.\n" +
                    "Add beef broth and simmer for 5 minutes.\n" +
                    "Place a mound of potatoes on the plate, cover with steak and gravy.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nyama.jpeg?alt=media&token=ed35d0f7-3258-4f38-9479-91a6b07844a9",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kenya.jpg?alt=media&token=d647919a-781b-4d6b-be82-da9e2ff675ec" ))

        recipies.add(mostpopularmodel("Ful Medames", "Egypt", " 30 mins",
            " 2 cans plain fava beans (13 to 15 ounces each can) (see notes if using dry fava beans)\n" +
                    "½ cup water\n" +
                    "Kosher salt\n" +
                    "½ to 1 teaspoon ground cumin\n" +
                    "1 to 2 hot peppers, chopped (jalapenos will work here)\n" +
                    "2 garlic cloves, chopped\n" +
                    "1 large lemon juice of\n" +
                    "Extra virgin olive oil (Early Harvest)\n" +
                    "1 cup chopped parsley\n" +
                    "1 tomato, diced\n" +
                    "To Serve:\n" +
                    "\n" +
                    "Warm pit bread\n" +
                    "Sliced tomatoes\n" +
                    "Sliced cucumbers\n" +
                    "Green onions\n" +
                    "Olives",

            "n a cast iron skillet or saucepan, add the fava beans and ½ cup water. Warm over medium-high heat. Season with kosher salt and cumin. Use a potato masher or fork to mash the fava beans.\n" +
                    "In a morter and pestle, add the hot peppers and garlic. Smash. Add in juice of one lemon and stir to combine.\n" +
                    "Pour the garlic and hot pepper sauce over the fava beans. Add a generous drizzle of extra virgin olive oil. Top with chopped parsley, diced tomatoes, and a few slices of hot peppers, if you like.\n" +
                    "Serve with pita bread, sliced veggies and olives.",


            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/ful.jpeg?alt=media&token=a6304e94-6696-4890-9138-553f4be3152d",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egypt.jpg?alt=media&token=5f8bf593-fe58-4aad-83a3-4742eaabda40"))

        recipies.add(mostpopularmodel("Potjiekos And Stew", "South Africa", "2 hrs",
            "4 tbsp knob of butter or oil\n" +
                    "1 chilli pepper fresh\n" +
                    "3 garlic cloves finely chopped\n" +
                    "500 g pack of fresh mushroom whole\n" +
                    "1 kg stewing beef bone on and cut in chunks\n" +
                    "500 mg sugar beans, red kidney beans, white kidney beans, haricot beans, black-eyed beans pre-soaked overnight\n" +
                    "4 carrots, and other seasonal vegetables of your choice roughly chopped\n" +
                    "12 baby potatoes\n" +
                    "2 tins sweet corn (mealies) creamed\n" +
                    "500 ml beef stock\n" +
                    "50 mixed herbs\n" +
                    "salt\n" +
                    "pepper\n" +
                    "1/2 cup red wine optional",

            "Braise onions and mushrooms in butter and flavoured salt.\n" +
                    "Add chili and garlic and sauté for 2 minutes.\n" +
                    "Add beef, return the lid and let it steam for 5 minutes.\n" +
                    "Add carrots and potatoes and other vegetables. Cover and let it steam for 5 minutes.\n" +
                    "Add beans, sweetcorn, 500 ml beef stock, 50 ml mixed herbs and ½ cup red wine (optional).\n" +
                    "Cover pot and leave to cook for 20 minutes.\n" +
                    "Keep covered and simmer for 1.5 hours, monitoring to ensure that mixture does not dry out.\n" +
                    "Add the fresh mushrooms about 20 minutes before serving.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/potjiekos.jpeg?alt=media&token=df315634-b4ba-47e0-8a14-e31a1649bfe8",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058" ))

        recipies.add(mostpopularmodel("Pastilla Au Pigeon / B'stilla", "Moroco", "1 hr 10 mins",
            "4 Pigeons\n" +
                    "3 Onions, chopped\n" +
                    "1tsp Ginger powder\n" +
                    "1tsp Turmeric\n" +
                    "1tsp Cinnamon powder\n" +
                    "2tsp Parsley\n" +
                    "1tsp Coriander Leaf\n" +
                    "250g Butter\n" +
                    "20g Caster Sugar\n" +
                    "1 Cinnamon Stick\n" +
                    "12 strands Saffron\n" +
                    "1tsp Ras el Hanout\n" +
                    "6 Eggs\n" +
                    "6 sheets Filo Pastry\n" +
                    "20g Roasted Almonds, chopped\n" +
                    "15g Flaked Almonds",

            "Season the pigeon with salt, pepper, the ginger powder,\n" +
                    "        cinnamon powder and turmeric. Heat a heavy pan and brown the pigeons in a little olive oil.\n" +
                    "        Remove the pigeon from the pan and add the onion along with the rest of the spices, including\n" +
                    "        the caster sugar. Saute this gently for 2-3 minutes before adding 230g butter. Return the pigeon to the pan,\n" +
                    "        put the lid on and let it simmer for 45 mins, until the pigeon is tender. When ready remove the pigeon from the pan\n" +
                    "        and allow it to cool. Beat the eggs, then add them to the pan and scramble them with the onion mixture, then set aside.\n" +
                    "        Remove the pigeon meat from the bones, cut it into small cubes, and then add it to the onion and egg mixture along with the\n" +
                    "        chopped almonds and some chopped fresh coriander. Melt the rest of the butter and brush it all over the pastry sheets.\n" +
                    "        Use 4 buttered sheets for the base of the pastilla, and place the pigeon, egg and onion mixture in the middle.\n" +
                    "        Place another 2 sheets of pastry on the top, then carefully fold the pastry over on the top to form a nice round shape.\n" +
                    "        Bake the pastilla in an oven at 180d for 15 minutes, or until golden brown. Sprinkle the cooked\n" +
                    "        pastilla with icing sugar and cinnamon powder, and garnish with the flaked almonds.",


            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/pastilla.jpeg?alt=media&token=1e96adf3-433b-4ec5-bb98-6efac83d33de",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroco.jpg?alt=media&token=087fe0be-f08a-4079-8330-e2ce1523e242"))




//        nigerian section

        generalRecipies .add(
            generalrecipiemodel("Jollof rice", "Nigeria", "1 hr",
                "5 medium sized Roma tomatoes, roughly chopped\n" +
                        "1 red bell pepper, roughly chopped\n" +
                        "1 medium sized onion, roughly chopped, set aside\n" +
                        "2 scotch bonnet peppers (habanero peppers as they are sometimes called)\n" +
                        "1/4 cup of groundnut oil\n" +
                        "3 tbsp tomato paste\n" +
                        "2 cups of parboiled rice\n" +
                        "2 1/2 cups of chicken stock\n" +
                        "1 tsp salt to taste\n" +
                        "1/2 tsp curry powder\n" +
                        "1/2 tsp thyme\n" +
                        "1 tsp All purpose seasoning\n" +
                        "1 Knorr stock cube\n" +
                        "3 bay leaves\n" +
                        "Water, as needed",

                "Blend your tomatoes, red pepper, scotch bonnet peppers in a food processor or blender for about 45 seconds, make sure that everything is blended well.\n" +
                        "In a medium sized pot, heat your oil on medium-high heat. Once the oil is heated add the onions you set aside and fry just until they turn golden brown. Once the onions, have turned brown in color add the tomato paste and fry for 2-3 minutes. Then add the blended tomato mixture (reserve about 1/4 cup and set aside) and fry the mixture with the onions and tomato paste for about 30 minutes. Make sure you stir consistently so that the tomato mixture does not burn.\n" +
                        "After 30 minutes, turn the heat down to medium, and add the chicken stock. Mix and add your seasonings (salt, curry powder, thyme, all purpose seasoning, and the Knorr stock cube). Continue to boil for 10 minutes.\n" +
                        "Add the parboiled rice to the pot. Mix it very well with the tomato stew. At this point if you need to add water so that the rice is level with the tomato mixture/chicken stock go ahead and do so. Add the bay leaves, cover the pot, and cook on medium to low heat for 15-30 minutes.\n" +
                        "When the liquid has almost dried up add the remaining tomato stew, cover, and let it cook for another 5-10 minutes heat until the liquid has completely dried up. Turn off the heat, mix thoroughly, and your Jollof Rice is ready to be eaten!",

                "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/jollofrice.jpeg?alt=media&token=bf772a16-43ef-466c-95a8-eb39c9ddc8b1",

                "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa" )
        )

//
//
        generalRecipies .add(generalrecipiemodel("Pounded Yam", "Nigeria", "15 mins",
            " 3 lb Yam\n" +
                    "        Water",

            "Peel the skins off the yams and slice them into about ½ inch thickness.\n" +
                    "Rinse and place the yams in a pot and add enough water to the level of the Yam.\n" +
                    "Cover and cook the yams for about 30 minutes, checking every 10 minutes or thereabout until the yams are fork tender.\n" +
                    "Put the boiled yams inside the food processor and blend, until it becomes smooth with a dough-like consistency.\n" +
                    "Serve with your favorite soup or stew",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/poundedyam.jpg?alt=media&token=c6a5ff91-3ef3-42f3-8b7a-f5a9cf1468ba",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"))

        generalRecipies .add(generalrecipiemodel("Ogbono soup", "Nigeria", "10 mins",
            " 1-2 pounds meat, oxtail, stew beef, tripe, and kpomo (cow skin)\n" +
                    "▢1 cup smoked fish, shredded\n" +
                    "▢1 cup onion, diced\n" +
                    "▢½ cup ground crayfish\n" +
                    "▢1 tablespoon chicken bouillon, adjust to tastes,\n" +
                    "3 cups greens, chopped (spinach, collards, kale, callaloo-African greens)\n" +
                    "▢¼-⅓ cup palm oil\n" +
                    "▢1 tablespoon red pepper flakes\n" +
                    "▢½ cup ground egusi, optional\n" +
                    "▢½ cup ground ogbono\n" +
                    "▢Salt and pepper, to taste",

            " Cooke the Meat and Make Stock\n" +
                    "In a medium-sized saucepan, boil meat and season with salt and pepper until tender (approximately 30-60 minutes depending on the choice of meat). You can shorten this process in half with a pressure cooker.\n" +
                    "Boil the cow skin and tripe together or separately until tender; use your best judgment. Remove cow skin tripe and add to the pot of boiled meat. Then add the smoked fish to the pot if using it.\n" +
                    "Reserve enough stock from the meat (about 3-4 cups).\n" +
                    "Mix ground ogbono with red palm oil, then add to the pot of boiled meat, followed by crayfish and scotch bonnet pepper. Bring to a boil.Then simmer it for 10 minutes or more. Add chicken bouillon or cubes if desired.\n" +
                    "Add more stock or water for the desired thickness. Then add spinach (or other greens), cook for 2-3 minutes more, turn the stove off, and serve piping hot.\n" +
                    "\n" +
                    "    Tips and Notes:\n" +
                    "Mix the ground ogbono with the palm oil to create a smooth paste that dissolves in the stew better.\n" +
                    "To reduce the ogbono’s viscosity, you can fry it before adding it to the soup.\n" +
                    "If using a variety of meats, it’s best to boil each separately because they take different times to cook. And some are pre-cooked. Use your best judgment when cooking and selecting meats.\n" +
                    "Where to find Ogbono Seeds under different aliases (apon, etima, odika, and dika): African Markets, online (Amazon, etc.), ground ogbono seeds also go by the names agbono, apon, etima, dika and odika. They can be hard",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/ogbono.jpeg?alt=media&token=22861c9e-278e-4f3c-be6e-e15345941984",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"))

        generalRecipies .add(generalrecipiemodel("Ewa riro", "Nigeria", "1 hr",
            "3 cups black-eyed peas\n" +
                    "1 red bell pepper\n" +
                    "1 medium onion\n" +
                    "1 roasted Turkey wing\n" +
                    "1 habanero pepper\n" +
                    "1 tablespoon crayfish\n" +
                    "1/2 tablespoon seasoning powder\n" +
                    "1/4 cup palm oil or to taste\n" +
                    "6 to 9 cups water\n" +
                    "salt to taste", "Pick out the debris in the Beans. Then rinse well and drain.\n" +
                    "Put the beans inside the pot together with the bell pepper, habanero, onion, and smoked turkey wings. add water and leave to come to a rolling boil over high heat.\n" +
                    "Reduce the heat to medium-low and continue to cook until the beans become tender. about one hour. a little more or less.\n" +
                    "Remove the bell pepper, habanero, and onion Blend and add to the beans.\n" +
                    "Remove the smoked turkey, debone, cut the meat into small pieces, and put it back inside the beans.Add the salt, seasoning powder (seasoning cube), crayfish, and palm oil. Add water if necessary and stir well until everything is well combined.\n" +
                    "Leave to simmer for about 3 to 5 minutes and serve with Plantains, Bread, or Garri. Enjoy!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/ewariro.jpeg?alt=media&token=434692cf-655e-4ff7-b1bb-53d06f4c69a9",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa" ))

        generalRecipies .add(generalrecipiemodel("Dodo (Fried Plantain)", "Nigeria", "15 mins",
            "Plantains: Use ripe plantains for this recipe. Now when it comes to how ripe your plantains should be, " +
                    "the best plantains for this recipe would be yellow on the outside, firm to the touch and not at all mushy. " +
                    "Super ripe/soft plantain would be mushy and super sweet.\n" +
                    "\n" +
                    "Oil: The oil for frying can be either vegetable oil, sunflower oil or canola oil. " +
                    "These are neutral, flavorless oils that have a low smoking point. ", "First, you will need to cut the plantain diagonally. " +
                    "This shape is the easiest " +
                    "shape to fry and is visually appealing. Other options are to cut your plantains into circles or cubes.\n  Once your plantain is cut into pieces, heat your oil in a deep fryer or pan.\n" +
                    "\n Once your plantain is fried, remove it from the oil and place on a paper towel so the oil is absorbed.\n" +
                    "\n" +
                    "5. Serve sweet fried plantain on its own or with Jollof rice, fried rice, dundun and more!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/dodo.jpeg?alt=media&token=e43658aa-8668-4acf-b426-e5a656cc9832",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa" ))

        generalRecipies .add(generalrecipiemodel(" Agege Bread", "Nigeria", "10 mins",
            "550g (3.6cups) strong bread flour\n" +
                    "\n" +
                    "3 and ⅛ teaspoon (8.8g) active dry yeast\n" +
                    "\n" +
                    "1 and ⅛ teaspoon (6.4g) salt\n" +
                    "\n" +
                    "4 tablespoon sunflower oil\n" +
                    "\n" +
                    "70g (⅓ cup) sugar\n" +
                    "\n" +
                    "150ml milk\n" +
                    "\n" +
                    "80ml lukewarm water\n" +
                    "\n" +
                    "200g tangzhong (Find below how to make tangzhong)\n" +
                    "\n" +
                    "How to make tangzhong:\n" +
                    "\n" +
                    "50g (⅓ cup) bread flour\n" +
                    "\n" +
                    "250ml (1 cup) water\n" +
                    "\n",

            "Mix flour in water and stir well so you don't have any lump. Cook on medium-low heat, stir consistently with a spoon or whisk to prevent the mixture from burning and sticking while you cook it.\n" +
                    "\n" +
                    "The mixture will become thicker and thicker. Once you notice lines start to appear in the mixture for every stir you make with the spoon the tangzhong is ready or if you have a thermometer use it to check the temperature. Once it's 65degrees it's done. Remove it from heat.\n" +
                    "\n" +
                    "Pour this mixture into a bowl and cover with a cling film sticking onto the tangzhong. Leave to cool to room temperature.\n" +
                    "\n" +
                    "HOW TO MAKE AGEGE BREAD (NIGERIAN BREAD)\n" +
                    "In a mixing bowl mix the flour, salt and sugar.\n" +
                    "\n" +
                    "In a different bowl put the water, 1 teaspoon of sugar and yeast and whisk. Leave the mixture for 5-10 minutes till the yeast foams.\n" +
                    "\n" +
                    "Activated yeast\n" +
                    "Activated yeast\n" +
                    "In another bowl, whisk together the milk, tangzhong(all) and sunflower oil.\n" +
                    "\n" +
                    "Make a well in the center of the flour and add in the yeast mixture and milk mixture. Mix and knead until the dough comes together. Keep kneading until the dough is smooth.\n" +
                    "\n" +
                    "Note: The dough will be wet and sticky at first but when you knead and knead well it becomes elastic. Work that arm????\n" +
                    "\n" +
                    "\n" +
                    "It should not be too sticky on the surface. I kneaded the dough for about 50 minutes by hand. Trust me you want the strongest person in your household for this task.\n" +
                    "\n" +
                    "If you're fortunate to have a mixer , use the dough hook and knead with it or a food processor that has that function. This will take about 15-20 minutes. Rest the processor at intervals.\n" +
                    "\n" +
                    "You need a floured surface because the dough will be wet and sticky at first.\n" +
                    "\n" +
                    "When the dough is ready, you should be able to take a piece of it and stretch it to a very thin membrane before it breaks and the break should be from a circle (Window pane test).\n" +
                    " \n" +
                    "FIRST PROOFING AGEGE BREAD\n" +
                    "Knead the dough into a ball shape. Grease a bowl with oil, place dough into the greased bowl and cover with a wet towel. Leave the dough till it's doubled in size. This takes about 50 minutes. \n" +
                    " \n" +
                    " \n" +
                    "Punch down the dough and put onto a flat floured surface and divide into 5 portions. Knead into balls.  Cover with cling film and let it rest for 10\n" +
                    "minutes.\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "Shape and place each of the rolls into greased bread pan, cover with the wet towel and let them rise until double the size. This will take approximately another 50 minutes.\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "Bake bread in pre heated oven and bake at 180 degrees Centigrade (370F) for 30 minutes. Preheat for 5 minutes.  After the 1st 15minutes baste the bread with egg for a shiny glaze. You can skip this part if you wish.\n",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/agegebread.webp?alt=media&token=07f25b42-cf1f-4063-bc57-ec48655c25b3",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"
        ))



        generalRecipies.add(generalrecipiemodel("Moi Moi (Bean Pudding)", "Nigeria", "45 mins",
            "1½ Cups dry beans Black eyed Peas or Brown Beans-”Ewa Oloyin”\n" +
                    "1 Red Bell pepper/Tatashe Medium size\n" +
                    "1 Habanero/scotch Bonnet/Rodo\n" +
                    "¾ Cup Diced onion\n" +
                    "2 Tablespoons Crayfish\n" +
                    "¼ Cup Vegetable Oil\n" +
                    "2 Bullion Cubes\n" +
                    "¾ Cup cooked minced Fish\n" +
                    "3 Hard boiled Eggs\n" +
                    "Salt to taste",

            "Soak the Beans for 15 minutes depending on how dry your beans are. The drier beans tend to be ready for peeling faster than the less dried beans.\n" +
                    " Pour the Beans in the Blender and add twice as much water as the Beans (by volume) blend the Beans for 3-4 seconds per time and repeat this 3 to 4 times – Remember we are peeling the beans and not blending them.\n" +
                    "Pour the beans back into a large bowl and add enough water to fully cover the Beans. Now agitate the Beans with your fingers and the skin will float then quickly separate the skin from the Beans by pouring through a sieve.\n" +
                    "Once that is done, pour the peeled Beans (the skinless Beans) inside a Blender, together with the Red Pepper, Habanero, and Onion – Blend to the smoothest consistency you can ever get.\n" +
                    "Combine the blended mixture with the remaining ingredients except for the boiled Eggs.\n" +
                    "Spray or brush the container you will be using with oil. Pour the mixture into the container and place the boiled egg over it. Cover it with a lid or seal with foil paper.\n" +
                    "Line the base of a large pot with either foil paper, sticks, leaves. Add enough water to the pot. (Add just enough not to submerge the moi moi bowls)." +
                    " This is to prevent the Moin moin from sticking to the base of the pot in case the water dries up before the moin moin gets done.\n" +
                    "Arrange the Moin moin inside the Pot and cook till done. This should take about 45 minutes to 1 hour a little more or less depending on the quantity of the Moin moin mixture in each container.\n" +
                    "To check for doneness, insert a toothpick into the middle of the Moin Moin/Moi. The toothpick should come out fairly clean and not wet.\n" +
                    " Remove from heat and serve.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moimoi.jpeg?alt=media&token=cc50c70b-b086-40c8-a443-7ea0733529a1",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"))

        generalRecipies.add(generalrecipiemodel("Nkwobi (Head or Legs Of Cow) ", "Nigeria", "50 mins",
            " 1.5 kg Cow leg (cut into sizable pieces) \n" +
                    "• 2 Seasoning cubes \n" +
                    "• 2 Ehuru seeds “Monodora myristica”(Calabash Nutmeg) \n" +
                    "• 8 Cooking spoon palm oil \n" +
                    "• 1 small-sized Edible Potash(akaun/ kanwa)/ 1 tbsp. ground potash \n" +
                    "• 2 tbsp. Ground crayfish \n" +
                    "• 2 Fresh red scotch bonnet pepper/ 2 tbsp. Ground chilli pepper \n" +
                    "• Salt (To taste) \n" +
                    "• 1 cup Ugba (also Known as Ukpaka) \n" +
                    "• Water \n" +
                    "To Garnish the dish, You'll need::: \n" +
                    "•1 Medium-sized Onion \n" +
                    "•10 Utazi leaves (Gongronema latifolium)",
            "Before preparing Nkwobi you have to take note of these:\n" +
                    "\n" +
                    "1. Cow leg: Cow leg is the Original bonny meat to use for this dish. This means it's got more of bones and less beef on it. If you don't have cow leg, you could substitute for goat leg or Calf leg. Before cooking the cow leg, you have to take note that it takes a very long time to cook. If you have a pressure cooker, you could use it to save time and Gas.\n" +
                    "\n" +
                    "• Wash the cow leg thoroughly and place in a pot. Add some chopped onion, Seasoning cubes and cook till soft. Make sure the liquid left in the pot is minimal and concentrated to ensure the seasoning gets into the bone meat. -Set this aside\n" +
                    "\n" +
                    "2. Ehuru/Ehu seeds: This is what gives the dish its authentic local flavor. It cannot be substituted for the normal Nutmeg. To make it easy to remove from the shell, it could either be pan roasted or roasted in open flame\n" +
                    "\n" +
                    ".• Pan roast: Place the ehuru seeds on an empty dry pan and leave to heat while tossing once in a while on dry heat till you hear it crack open. Peel the skin and place the the peeled ehuru in a mortar. Pound and set aside\n" +
                    "\n" +
                    "•Open flame roast: Place the ehuru seeds on a dry burner on medium heat. leave for a while till it chars. Crack open and place the the peeled ehuru in a mortar. Pound and set asid\n" +
                    "\n" +
                    "3. Potash: This is the special ingredient that makes the palmoil Curdle and change colour. To prepare, place the powdered potash in a bowl. Add some water and stir. What you need is the liquid and not the residue. Just stir and set aside. An alternative to potash is Ngu which is more Local than potash but its quite rare and is mostly found in remote areas\n" +
                    "\n" +
                    "4. Utazi leaves: Utazi is Used as a garnish for this meal. It has a Bitter taste and gives the dish a wonderful Bitter flavor. It's Used sparingly though since most people cannot stand the bitter taste. To prepare, wash and chop -Set aside\n" +
                    "\n" +
                    "5. Ugba: Usually, Nkwobi on its own is tasty but when oil bean seed 'Ugba' is added, it becomes simply mouth watering due to the additional flavor it gives the dish. To prepare, wash the ugba with clean water and set aside.\n" +
                    "\n" +
                    "6: Onions: This is Usually used as a Garnish and is eaten raw. To prepare, wash and slice the onion into rings - Set aside.\n" +
                    "\n" +
                    "Now you are done preparing the ingredients, its time to prepare the Main Nkwobi.\n" +
                    "\n" +
                    "Preparation of the Nkwobi sauce\n" +
                    "\n" +
                    "Step 1: In a Medium-sized pot/pan, Heat the palm oil till it gets a little bit hot (Not bleached). Gently sieve in the dissolved potash liquid making sure you don't pour in the residue. Ensure there are no lumps in the mixture by stirring thoroughly.\n" +
                    "\n" +
                    "Step 2: Keep stirring till the Oil Turns bright yellow and thickens.\n" +
                    "\n" +
                    "Step 3: Add the ground ehuru, Pepper, Crayfish to the sauce and mix.\n" +
                    "\n" +
                    "Step 4: Gently add the Ugba, pour the cooked cowleg into the sauce (with very little meat stock). Stir Very well and place the pot on the Burner and allow the mixture to simmer for about 5-8 minutes.\n" +
                    "\n" +
                    "Step 5: Dish Out into the traditional Nkwobi bowl  and garnish with the sliced onion rings and Utazi leaves.\n" +
                    "\n" +
                    "Serve with a Chilled drink or a glass of palmwine.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nkwobi.jpeg?alt=media&token=b3efad65-d4ee-40f2-83ee-4b6759be4873",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"))



        generalRecipies.add(generalrecipiemodel("Nshima", "Malawi", "15 mins",
            "4\n" +
                    "cups cornmeal (one cup per serving is sufficient)\n" +
                    "2\n" +
                    "teaspoons salt (to taste)\n" +
                    "16\n" +
                    "cups water (more as or if as needed)",

            "Pour cold water (two and 1/2 cups for each cup of cornmeal) into a large pot. Over high heat, begin to bring to a boil.\n" +
                    "After a few minutes, when the water is warm, slowly add the about half the cornmeal to the water one spoonful at a time, stirring continuously with a sturdy wooden spoon. Continue cooking (and stirring) until the mixture begins to boil and bubble. Reduce heat to medium and cook for a few minutes.\n" +
                    "Cooking the mixture over medium heat, add the remaining cornmeal, as before, sprinkling it spoonful by spoonful as you continue to stir. It is essential to keep stirring -- if making a large quantity, it may take one person to hold the pot and another to use two hands to stir.\n" +
                    "The nshima should be very thick (no liquid remaining) and smooth (no lumps). It may reach this point before all of the remaining cornmeal is added to the pot -- or it may be necessary to add even more cornmeal than this recipe indicates.\n" +
                    "Once the desired consistency is reached, turn off heat, cover the pot, and allow the nshima to stand for a few minutes before serving. Serve nshima immediately, hot, with the ndiwo of your choice.\n" +
                    "With clean hands, tear bits of nshima off and use them to scoop up the ndiwo.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nshima.jpg?alt=media&token=8d727a17-2f96-4077-8639-77341b75c456",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653"))


        generalRecipies.add(generalrecipiemodel("Ila Alasepo (Okra Soup)", "Nigeria", "50 mins",
            "Precooked meat – 2 cups\n" +
                    "Smoked fish – 2 pieces (washed and pulled)\n" +
                    "Fresh or dried prawns  – 1 cup\n" +
                    "3 cups beef stock or water *\n" +
                    "½ teaspoon cooking potash (Kaun) or Baking soda *optional\n" +
                    "1 cube maggi (2 cubes if using water)\n" +
                    "1 teaspoon pepper powder\n" +
                    "3 tablespoons blended crayfish\n" +
                    "¼ cup palm oil**\n" +
                    "Salt- to taste\n" +
                    "1 red bell pepper (Tatashe) – finely minced\n" +
                    "2 cups chopped okro",

            "Place a  pot on medium heat , pour in the meat stock (or water), cover and bring to a boil.\n" +
                    "Add in the cooking potash if using. Reduce heat to medium. Add in the prepared meat, fish, prawns, crayfish powder, maggi palm oil and pepper. Combine. Leave to simmer for 10-12 minutes\n" +
                    "Stir, taste and adjust for Seasoning\n" +
                    "Add in chopped okra and minced tatashe. stir well to combine. taste and adjust for seasoning. Simmer for another 3-5 minutes\n" +
                    "Note: If using baking soda, add it in about 2 minutes before cooking ends.\n" +
                    "\n" +
                    "Serve with Semolina, fufu, garri or pounded yam . Enjoy!",
            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/ila.jpg?alt=media&token=471c4164-8cf2-4062-9cd7-3fb8a4a80f30",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"))


//        mozambique section

        generalRecipies.add(generalrecipiemodel("Nsima", "Mozambique", "10 mins",
            "4 cups of corn flour\n" +
                    "5 cups water\n" +
                    "Salt to taste", "our the cups of cold water into a clean cooking pot and put it to boil\n" +
                    "Once boiling, add a cup of cornmeal to the boiling water, pouring bit by bit while stirring with a wooden spoon.\n" +
                    "Stir to make sure there are no lumps. Cover with a lid and allow to boil for 10 minutes.\n" +
                    "Pour the remaining corn meal into the boiling water and stir the mixture.\n" +
                    "Stir the mixture evenly to produce a smooth, thick, and lump-free paste.\n" +
                    "Add more cornmeal or water to get the desired texture.\n" +
                    "Leave it to simmer for 10 minutes in medium heat.\n" +
                    "Stir and scoop the nsima, shaping it into multiple balls into serving bowls.\n" +
                    "Allow it to cool.\n" +
                    "The locals serve with a number of different types of sauces or with meat, fish, or vegetables.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nsima.jpeg?alt=media&token=ed43ce00-c01c-4d8d-ab32-9a18913d8413",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b"))

        generalRecipies.add(generalrecipiemodel("Papo Secos | Portuguese Rolls", "Mozambique", "4 hrs",
            "FOR ACTIVATING THE YEAST\n" +
                    "▢1/2 cup lukewarm water (105°F to 110°F | 41°C to 43°C)\n" +
                    "▢2 1/4 teaspoons active dry yeast\n" +
                    "▢1 tablespoon granulated sugar\n" +
                    "FOR THE BREAD\n" +
                    "▢5 cups bread flour, plus up to 3 tablespoons more, if needed\n" +
                    "▢1 1/2 cups lukewarm water (105°F to 110°F | 41°C to 43°C)\n" +
                    "▢1 tablespoon table salt\n" +
                    "▢2 tablespoons salted or unsalted butter\n" +
                    "▢Cornmeal",

            "ACTIVATE THE YEAST\n" +
                    "In the bowl of a stand mixer fitted with the dough hook, mix the water, yeast, and sugar on low speed until combined. Let sit for 10 minutes until foamy.\n" +
                    "MAKE THE BREAD\n" +
                    "Add the flour, water, and butter and stir on low until the ingredients are combined and a cohesive dough forms, 3 minutes. Cover with plastic and let sit for 30 minutes.\n" +
                    "Sprinkle the salt over the top of the dough and mix on low (speed 2) for 5 minutes. If the dough rides up the hook, use a spatula to scrape it down.\n" +
                    "Bump the mixer to medium-high (speed 7) and knead for 2 minutes more. The dough should pull away from the sides of the bowl and be slightly sticky. If the dough hasn’t released from the bottom of the bowl, add some more flour—a tablespoon at a time—until it does.\n" +
                    "Remove the bowl from the mixer, cover it with plastic wrap, and place in a warm (68°F to 72°F | 20°C to 22°C), draft-free spot. The inside of your oven with the light turned on is ideal. Let the dough double in size, about 1 hour.\n" +
                    "☞ TESTER TIP: If you’ve always found it tricky to assess when exactly dough has doubled in size, lightly butter a plastic bread proofing bucket or clear glass bowl. Use a grease pencil or piece of tape to mark the level of the dough when you start. " +
                    "Makes it a lot more obvious when the dough has doubled.\n" +
                    "\n" +
                    "Reach down 1 side of the bowl and gently but firmly pull the dough up and fold it over itself. Don’t punch it down. Rotate the bowl a quarter turn and repeat. Continue turning and folding 2 more times. Cover and let rest until doubled in size, about 30 minutes.\n" +
                    "Repeat the turning and folding process, cover with plastic, and let the dough rest until doubled in size, about 30 minutes more.\nDivide the dough into ten equal pieces, about 4 1/4 ounces (120 grams) each. Lightly flour your hands. Cup one hand over a chunk of dough and roll it on your work surface in a circle to tighten the ball. Being somewhat neurotic, I count the turns—no fewer and no more than 40 revolutions. " +
                    "Repeat with the remaining dough.Place the balls on a baking sheet lined with a floured non-terrycloth kitchen towel or a baker’s couche. " +
                    "Cover them with a kitchen towel. Let rest for 20 minutes.\nTransfer the balls to your work surface. Heavily dust the towel again.\n" +
                    "Flour your hands. Flatten a dough ball into a 6-inch (15-cm) disc. Using the side of your hand, make a deep crease (think karate chop) across the middle of the disc.Grab both ends of the crease and gently tug them to elongate the dough into a slight oval.\n" +
                    "Fold one half of the dough over the other along the crease. The dough will have a half-moon shape.\n" +
                    "Twist the ends of the half-moon into fat points and, using your thumbs, flatten them a bit to seal.\n" +
                    "Gently transfer the papo seco to the towel, seam-side down. As you shape more rolls, arrange them in a row, few inches apart. Pull the towel up between each row to create a ridge that will hold the shape of the rolls during proofing." +
                    " Repeat the shaping and lining up the papo-secos, folding up the towel between rows.Cover the rolls with a towel and let rise in a warm place until almost doubled in size, about 30 minutes.\n" +
                    "BAKE THE PAPO SECOS\n" +
                    "Meanwhile, position a rack in the middle of the oven and slip in a baking stone or tiles. Place an empty metal tray on any rack that won’t interfere with the rising papo secos. (Do not use a glass pan as it could shatter.) Crank the heat to 500°F (260°C). The oven and stone will need time to properly heat.\n" +
                    "Have a cup of very hot tap water at the ready.\n" +
                    "Coat a baking peel or rimless baking sheet with cornmeal. Carefully turn a few of the papo secos seam-side up and arrange them on the peel.\nPlace the front edge of the peel at the back of the baking stone and quickly yank it toward you to shift the dough onto the baking stone. Repeat with the remaining papo secos. Quickly but carefully pour the hot water into the metal tray and immediately shut the oven door to trap the steam. Immediately reduce the heat to 425°F (218°C).\n" +
                    "☞ TESTER TIP: If your baking stone can’t fit all of the rolls, bake them in batches. As the Portuguese say, Não faz mal. No problem!\n" +
                    "\n" +
                    "Bake the papo secos until they’re puffed and golden brown, 15 to 20 minutes. Remove them from the oven and let them cool on a rack. " +
                    "To get that characteristic crusty outside, let the roll sit out several more hours prior to devouring.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/pao.jpeg?alt=media&token=bcd8748d-7917-4961-aeb0-0a83d3017136",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b"))

        generalRecipies.add(generalrecipiemodel("Couve: collard greens.", "Mozambique", "20 mins",
            "2 bunches of collard greens\n" +
                    "5 to 6 cloves of garlic (minced)\n" +
                    "1 teaspoon salt\n" +
                    "3 tablespoons olive oil",

            "Wash the collard greens and remove stem. Stack the leaves on top of each other with the curved edge on one side and roll tightly. Using a chiffonade cut, slice the roll crosswise with a sharp knife into thin ribbons. Heat olive oil over medium heat. Add garlic and salt, stirring until garlic turns golden and fragrant. " +
                    "Add greens and saute 3-4 minutes until they soften, becoming bright green. Turn off heat and add salt to taste.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/collard.jpg?alt=media&token=61fd2e9e-e9c7-4135-8579-e70abedad44b",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b"))

        generalRecipies.add(generalrecipiemodel("Makayabu", "Angola", "10 mins",
            "500 g salted cod salted and chopped into small sizeable pieces\n" +
                    "2 green bell pepper diced\n" +
                    "2 onion chopped\n" +
                    "3 garlic cloves zested\n" +
                    "2 bay leaves\n" +
                    "¼ sliced cabbages\n" +
                    "3 Zucchinis\n" +
                    "2 cubes",

            "Soak your salted fish in water to rehydrate it and remove any excess salt\n" +
                    "Sauté your onion, bay leaves, and garlic. Add your fish and fry it till golden brown. Remove and put it in a separate bowl\n" +
                    "In the same pan, add 150ml cooking oil and onions and sauté them. Add your Zucchinis and let it cook for 2 minutes\n" +
                    "Add your cabbages and stir for one minute. Simmer it for 4 minutes for the cabbage to cook\n" +
                    "Add your bell pepper and simmer it again for 4 minutes\n" +
                    "Add your fish and cubes to the vegetables, and stir for one minute. " +
                    "Simmer it for 3 minutes then serve with boiled cassavas or rice",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/makayabu.jpeg?alt=media&token=f51c9b57-5ae5-4611-ab8c-2bca20aa8211",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8"))

        generalRecipies.add(generalrecipiemodel("Prego: a steak roll.", "Mozambique", "20 mins",
            "Steak. I used sirloin but you can use rump or rib-eye. \n" +
                    "Peri-Peri sauce. I make my own but you can use store-bought too.\n" +
                    "Tomato puree. \n" +
                    "Lemon juice.\n" +
                    "Garlic. \n" +
                    "Bay leaf. \n" +
                    "Olive oil.\n" +
                    "Sugar. \n" +
                    "Salt. \n" +
                    "Butter. \n" +
                    "Fresh chillies. Any chillies you can find will be delicious.\n" +
                    "Bread rolls. \n" +
                    "Tomato and onion, for serving.",

            "Prepare the steak: Slice sirloin or rump steak in half horizontally to create two thin steaks, alternatively ask your butcher to cut thin steaks for you. " +
                    "Thin them out even more with a meat mallet until they are around 1cm/third of an inch thick.Make the marinade: Combine all the marinade ingredients in a blender and blend until smooth. Pour the marinade over the steaks and allow to marinate for at least 30 minutes but up to 24 hours, covered in the fridge.\n" +
                    "Cook the prego steaks: Heat a large griddle pan, skillet or outside grill until scorching hot then quickly cook the steaks (approximately 1-2 minutes per side) until caramelized on both sides. Remove and allow to rest.\n" +
                    "Make the chilli butter: Finely chop fresh chillies and mix with room temperature butter.\n" +
                    "Assemble and serve: To serve, spread the butter on fresh bread rolls (I used garlic rolls but traditionally Portuguese rolls are used) and top with the cooked steak, sliced tomato and onion.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/prego.jpeg?alt=media&token=f3fa885e-4f49-4462-8d30-20c027d6c911",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b"))

        generalRecipies .add(generalrecipiemodel("Amala", "Nigeria", "10 mins",
           "Equipments\n" +
                   "A large pot – use the pot to boil water until it reaches the rolling boiling point\n" +
                   "Scooping spoon – you need this to serve the food in sizeable portions.\n" +
                   "A spatula – is used to roll and knead the amala into a dough.\n" +
                   "\n" +
                   "\n" +
                   "Ingredients\n" +
                   "2 cups Yam Flour sifted\n" +
                   "4 cups Water\n" +
                   "¼-½ cup extra water or add as needed",

            "Bring the 4 cups of water to a rolling boil.\n" +
                    "Turn down the heat to medium and stir in the yam flour as quickly as possible to prevent lumps until it becomes doughy.\n" +
                    "Scrape down the sides of the pot, and add a splash of water. Then cover and let it cook for about 4-5 minutes on low to medium heat.\n" +
                    "Stir again and add more water as needed until the amala becomes sticky, light, and elastic.\n" +
                    "Serve with your choice of soup or stew.\n" +
                    "\n" +
                    "        Notes\n" +
                    "While making it, you must keep rolling the amala consistently to get a smooth and lump-free dough.\n" +
                    "The water added to the yam flour should be moderate. If the water is too much, you can add more flour.\n" +
                    "        On the other hand, if the flour is too much, I like to add more hot water",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/amala.jpg?alt=media&token=5b0cc2c2-b271-4d9a-bc98-8b5768a06bba",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa" ))

        generalRecipies.add(generalrecipiemodel("Pepper Soup", "Nigeria", "1 hr 30 mins",
            "For the Spice Mix (See Note):\n" +
                    "\n" +
                    "8 urheri pods (grains of Selim), seeded\n" +
                    "6 erhe seeds (calabash nutmeg), shelled\n" +
                    "2 gbafilo seeds, shelled and roughly chopped\n" +
                    "2 umilo seeds, shelled and roughly chopped\n" +
                    "1/2 teaspoon alligator pepper (grains of paradise)\n" +
                    "1/2 teaspoon uziza seeds\n" +
                    "For the Pepper Soup:\n" +
                    "\n" +
                    "1 small chicken (about 2 pounds; 905g), cut into 2-inch pieces (see note)\n" +
                    "2 quarts (1.9L) cold water\n" +
                    "2 teaspoons ground crayfish (see note)\n" +
                    "1 teaspoon (4g) Diamond Crystal kosher salt, plus more to taste; for table salt, use half as much by volume or the same weight\n" +
                    "1/2 teaspoon Nigerian red dry pepper or cayenne pepper, plus more to taste\n" +
                    "6 fresh lemongrass leaves, divided (see note)\n" +
                    "1 large (or 2 small) fresh makrut lime leaves\n" +
                    "2 to 3 sprigs fresh scent leaf, finely chopped, for garnish (see note)\n" +
                    "Boiled yam, plantain, white sweet potatoes, or cooked white rice, for serving\n" +
                    "Unrefined West African red palm oil, for serving",
            "For the Spice Mix: In a small stainless-steel or cast iron skillet, combine urheri, erhe, gbafilo, umilo, alligator pepper, and uziza. Over medium-low heat, toast spices, stirring and swirling frequently, until fragrant, about 5 minutes. Let cool to room temperature, about 10 minutes. " +
                    "Transfer spices to a spice grinder and grind until a crumbly, coarse powder forms, 2 to 3 minutes. Empty into a small bowl; set aside.For the Pepper Soup: In a large stockpot, combine chicken, water, ground crayfish, salt, cayenne pepper, half of the lemongrass, and prepared spice mix. " +
                    "Bring to a boil over high heat, then reduce heat to maintain a simmer. Simmer until chicken is cooked through and tender, " +
                    "but not falling off the bone, about 45 minutes (the time may vary depending on how the meat was cut).Add lime leaves and remaining lemongrass. Season with salt and cayenne pepper to taste. Let stand to allow flavors to develop, about 10 minutes.\n" +
                    "\nTo serve, divide chicken between warmed soup bowls. Ladle broth on top, garnish with scent leaf, and serve with or alongside boiled yams, plantains, white sweet potatoes, or rice, and a small bowl of palm oil for dipping.Make-Ahead and Storage\n" +
                    "The spice mix can be stored in an airtight container at cool room temperature for up to 6 months. Store away from light and heat. \n" +
                    "\n" +
                    "Pepper soup can be refrigerated in an airtight container for up to 1 week, or frozen for up to 2 months.\n" +
                    "Notes\n" +
                    "Individual spices and pre-made pepper soup spice mix can be purchased in Nigerian and West African stores, and online from websites like Ekaterra,  Mychopchop, and OsiAfrik.\n" +
                    "\n" +
                    "I prefer bone-in, skin-on chicken for its richer flavor. Cutting the chicken into bite-size pieces through the bone requires a heavy-duty cleaver. If you are unable to cut up the chicken yourself and you can’t find a butcher to do it for you, substitute with 1 1/2 pounds (680g) boneless, skin-on chicken thighs, cut into bite-size pieces, and 1/2 pound (225g) chicken wings, separated into drumettes and flats.\n" +
                    "\n" +
                    "You can substitute ground crayfish with an equal volume of dried prawns or shrimp, which are available in Chinese or Asian markets. \n" +
                    "\n" +
                    "This recipe is ideally made with the leaves of the lemongrass plant, which are more flavorful and aromatic than lemongrass stalks. If you can’t find them, substitute with 2 stalks of lemongrass. To prepare, discard the outer layer, smash the stalk under the flat side of a knife, and cut crosswise into 3 equal lengths. \n" +
                    "\n" +
                    "Scent leaf is a Nigerian herb, which is available fresh or dried. If you can't find it, feel free to substitute with cinnamon basil or other types of clove basil.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/peppersoup.jpeg?alt=media&token=5f77a86c-30f8-4480-ad85-4000f5e91de0",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"))

        generalRecipies.add(generalrecipiemodel("Rissois: battered shrimp", "Mozambique", "2 hrs",
            "FOR THE RISSÓIS PASTRY\n" +
                    "▢2 cups milk\n" +
                    "▢4 tablespoons (2 oz) unsalted butter\n" +
                    "▢1 teaspoon salt\n" +
                    "▢2 cups all-purpose flour, plus more for the work surface\n" +
                    "FOR THE RISSÓIS FILLING\n" +
                    "▢2 tablespoons (1 oz) unsalted butter\n" +
                    "▢1/4 cup finely chopped onion\n" +
                    "▢1 cup milk\n" +
                    "▢1/2 tablespoon finely chopped cilantro or parsley\n" +
                    "▢1 to 2 teaspoons store-bought or homemade hot-pepper sauce, or more to taste\n" +
                    "▢1/2 teaspoon coarse salt, or more to taste\n" +
                    "▢1/2 teaspoon freshly ground white pepper\n" +
                    "▢1/4 teaspoon freshly grated nutmeg\n" +
                    "▢2 tablespoons cornstarch or flour\n" +
                    "▢2 tablespoons water\n" +
                    "▢1/2 pound shrimp, peeled, deveined, cooked, well drained, and coarsely chopped (about 1 1/2 cups)\n" +
                    "FOR THE FRYING\n" +
                    "▢3 large eggs, beaten with 1/4 cup water for egg wash\n" +
                    "▢Fine plain bread crumbs\n" +
                    "▢Olive oil or other mild oil, for frying",

            "MAKE THE RISSÓIS PASTRY\n" +
                    "In a 2-quart saucepan over medium-high heat, warm the milk, butter, and salt until bubbles begin to form at the edge of the pan. Do not let the milk boil.\n" +
                    "Reduce the heat to medium-low. Using a wooden spoon, vigorously stir the flour into the milk. Keep stirring over medium-low heat until the mixture forms a dough. When the dough forms a ball that pulls away from the sides of the pan, remove the pan from the stove.\n" +
                    "Turn the dough out onto a lightly floured surface. Using a dough scraper or wooden spoon, turn the warm dough to sorta briefly knead it until smooth and the dough springs back slightly when pressed with your finger. Be careful not to overwork the dough.\n" +
                    "Divide the dough in half and shape it into 2 balls. Cover each with an upside-down bowl. Let cool to nearly room temperature, about 1 1/2 hours.\n" +
                    "MAKE THE RISSÓIS FILLING\n" +
                    "In a 1-quart saucepan over medium-high heat, melt the butter. Add the onion and cook, stirring occasionally, until lightly golden, about 10 minutes. You can turn the heat down a touch if the onions start to brown.\n" +
                    "Reduce the heat to medium-low, pour in the milk, and heat until bubbles begin to form at the edge of the pan. Do not let the milk boil. Remove the pan from the heat.\n" +
                    "Stir in the cilantro or parsley, hot pepper sauce, salt, pepper, and nutmeg.\n" +
                    "In a small bowl, stir together the cornstarch or flour with the water to form a slurry. Stir the slurry into the milk and simmer over medium-low heat, stirring constantly, until it thickens, 2 to 4 minutes. (Don't overcook it or the cornstarch will break down and the mixture will lose its thickening abilities.)\n" +
                    "Stir the chopped shrimp into the milk mixture in the pan and leave on the heat just until warmed through, about 1 minute. Remove the pan from the heat. Let cool completely.ASSEMBLE AND FRY THE RISSÓIS\n" +
                    "Take half the dough and roll it on a lightly floured surface to 1/8 inch thickness. Using a round cookie or biscuit cutter that's 3 1/2 to 4 inches in diameter (smaller if making appetizers for a party), cut out disks of dough.\n" +
                    "Place 1 teaspoon of filling in the middle of a circle. Fold the dough over to form a half circle, pressing the edges together. Place the filled dough on a baking sheet lined with plastic wrap. Repeat until all the filling is used. (The rissóis can be made ahead and frozen before frying. When you have unexpected guests, just take as many as you need from the freezer, thaw them, and proceed to batter and fry them. See * below for more instruction.)\n" +
                    "☞ TESTER TIP: If, when pressing the edges of the dough together, they don't stick, moisten your fingertips with water and slide them along the edge of the dough and try again.\n" +
                    "\n" +
                    "Working with 1 filled turnover at a time, dip it in the beaten egg, turning to coat all sides, and then quickly dip it in the bread crumbs, turning to coat it and gently shaking off any excess crumbs. Repeat with the remaining turnovers.\n" +
                    "Heat 2 or 3 inches of oil in a deep skillet over medium-high heat to a temperature of 350°F (175°C) or until small piece of pastry sizzles as soon as you slip it in the oil. Fry the rissóis, 2 or 3 at a time, until golden brown.\n" +
                    "Place the fried turnovers on paper towels or a brown paper bag to drain. Repeat with the remaining turnovers.\n" +
                    "Serve your shrimp turnovers hot or at room temperature. Notes\n" +
                    "PORTUGUESE SHRIMP TURNOVERS ~ RISSÓIS DE CAMARÃO VARIATION\n" +
                    "Although these are usually made with shrimp, a filling of chicken or shredded poached salt cod is tasty as well. Substitute 1 1/2 cups finely chopped cooked chicken, rabbit, or shredded poached salt cod for the shrimp. Stir briefly, add 1 tablespoon finely chopped celery, stir, and assemble.\n" +
                    "To freeze, line a sheet pan with plastic wrap and set the pastries down in a single layer without overlapping. Cover well with plastic wrap, smoothing out as much air as possible. Freeze. " +
                    "They will keep for at least a month, but you most likely will use them before that time.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/shrimp.jpeg?alt=media&token=d23f5d33-18fc-499b-b90b-dbf7837007f0",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b"))

        generalRecipies.add(generalrecipiemodel("Espetada: kebab.", "Mozambique", "23 mins",
            "3 strip steaks\n" +
                    "1 tablespoon garlic powder\n" +
                    "20 bay leaves (about 20)\n" +
                    "1 teaspoon sea salt\n" +
                    "1 teaspoon pepper\n" +
                    "1 teaspoon olive oil for brushing on skewers, about 1 teaspoon each",

            "Cut 3 strip steaks into cubes. " +
                    "Do this by first cutting long-ways down the middle, and then in horizontal slices to divide the steak into chunks.Combine 1 tablespoon garlic powder, 1 teaspoon sea salt, and 1 teaspoon pepper in a bowl. " +
                    "Sprinkle the seasoning mixture all over the cubed steak on all four sides." +
                    " Pat it down to press the seasoning into the steak.Take a skewer and layer a chunk of steak, then a bay leaf, in that order, " +
                    "until all of your meat is skewered with bay leaves between each piece of steak.Brush about 1 tsp. " +
                    "olive oil onto each skewer to prevent sticking when you grill them.\nGrill the skewers over High heat with the lid closed for 2 minutes.\n" +
                    "After 2 minutes is up, rotate the skewer to grill each side for 2 minutes. Watch closely, they cook fast! Once the skewers reach an internal temperature of 135°F (a perfect medium-rare) or your desired degree of doneness*, " +
                    "they are safe to remove from the grill. Serve, and enjoy!\n",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kebab.jpeg?alt=media&token=ae4e0b5d-75cc-40c5-95de-bc6834ef410e",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b"))

        generalRecipies.add(generalrecipiemodel("Egusi soup", "Nigeria", "50 mins",
            "For the Beef and Stock:\n" +
                    "\n" +
                    "1 pound (450g) bone-in or boneless beef chuck roast, cut into 2-inch pieces\n" +
                    "1 medium red onion (about 6 ounces; 175g), thinly sliced\n" +
                    "2 tablespoons ground crayfish (see note)\n" +
                    "2 teaspoons (6g) Diamond Crystal kosher salt, plus more to taste; for table salt use half as much by volume or the same weight\n" +
                    "1/2 teaspoon Nigerian red dry pepper\n" +
                    "For the Egusi Soup:\n" +
                    "\n" +
                    "1 medium red onion (about 6 ounces; 175g), roughly chopped\n" +
                    "1/2 fresh habanero or Scotch bonnet pepper, stemmed (optional)\n" +
                    "2 cups (10 ounces; 300g) ground egusi seeds (see note)\n" +
                    "3/4 cup unrefined red palm oil (5 1/4 ounces; 150g), such as Obiji\n" +
                    "Kosher salt and Nigerian red dry pepper\n" +
                    "1 teaspoon ground crayfish (see note)\n" +
                    "3 1/2 ounces (100g) fresh pumpkin leaves, amaranth greens, or kale, rinsed and finely chopped (see note)\n" +
                    "3 1/2 ounces (100g) fresh waterleaf or spinach, rinsed and finely chopped (see note)\n" +
                    "1 tablespoon finely chopped fresh or dried bitter leaf or fresh dandelion greens",

            "For the Stock: In a medium pot, combine beef, onion, crayfish, salt, pepper, and 6 1/2 cups water and bring to a boil. Lower heat to maintain a simmer and cook until the stock is slightly reduced and the beef is mostly tender, about 45 minutes (the beef will tenderize further when cooked in the soup). Using a slotted spoon, remove beef and transfer to a medium heatproof bowl; set aside. Reserve stock (you should have about 5 1/2 cups).For the Egusi Soup: In a food processor or countertop blender, process onion, pepper (if using), and 1/4 cup water until smooth. Scrape into a medium bowl and stir in the ground egusi seeds. Add water, 1 tablespoon at a time, until a thick, creamy paste has formed (paste should be viscous and hold its shape). Set aside.\n" +
                    "    In a 4-quart saucepan, heat oil over low heat for 1 minute. Slowly add all of the reserved stock, along with the crayfish, and bring to a gentle simmer. Add paste, 1 heaped teaspoon at a time, to stock. Cover and cook, stirring and gently scraping the bottom of the pot occasionally, until all of the paste is firm and crumbly, about 25 minutes (patches of orange-red palm oil may bubble on top or around the sides).Add reserved beef and stir gently to break up the cooked paste into curds (stirring more or less affects the size of the curds). Season with salt and pepper to taste. Continue to cook until beef is heated through and tender, and some of the orange-red palm oil pools on top, about 10 minutes.\n" +
                    "    Mound pumpkin leaves and waterleaf on top of soup without stirring, then cover and let steam until greens are wilted, about 2 minutes. Stir in wilted greens. Add bitter leaf and cook until soft, about 8 minutes.\n" +
                    "    Divide soup among warmed bowls and serve hot or at room temperature with eba, dodo, or cooked white rice.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egusi.jpeg?alt=media&token=f68c8723-bef9-4b4a-b345-7d6c03f9272e",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa" ))

        generalRecipies.add(generalrecipiemodel("Piri Piri Chicken", "Mozambique", "1 hrs 40 mins",
            "1 chicken, about 2kg\n" +
                    "For the piri-piri marinade\n" +
                    "2 dried hot chillies\n" +
                    "100ml red wine vinegar\n" +
                    "6 red chillies\n" +
                    "6 garlic cloves\n" +
                    "2 tsp smoked paprika\n" +
                    "1 tsp dried oregano\n" +
                    "1 tsp dried thyme\n" +
                    "1 tsp golden caster sugar\n" +
                    "2 lemons, juiced",

            "STEP 1\n" +
                    "To make the marinade, tip the dried chillies and the vinegar into a pan and bring to the boil. Remove from the heat and leave the chillies to soak until the vinegar is cold. Put the red chillies, garlic, soaked dried chillies and vinegar in a food processor and blitz. Add the smoked paprika, oregano, thyme, sugar, a pinch of salt and the lemon juice. Blitz again to a paste and set aside.\n" +
                    "\n" +
                    "STEP 2\n" +
                    "Sit the chicken in a shallow dish and use a small knife to score all over with cuts 1cm deep. Make sure you do the legs and the underside. Tip the marinade over the chicken and massage into the cuts. Cover and chill for at least 4 hrs, but overnight would be better.\n" +
                    "\n" +
                    "STEP 3\n" +
                    "When you’re ready to cook, heat oven to 180C/160C fan/gas 4. Roast the chicken for 1 hr, then turn the heat up to 220C/200C fan/gas 7 and cook for a further 30-35 mins until a crust has formed on the outside of the chicken.\n" +
                    "\n" +
                    "STEP 4\n" +
                    "Remove from the oven and leave to rest for 30 mins. Serve with homemade wedges or jacket potatoes, coleslaw, " +
                    "some buttered corn cobs and chilli and mint peas.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/piripiri.jpeg?alt=media&token=cb6e68c7-b2d7-407b-9e42-2907bfdc4553",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b" ))

        generalRecipies .add(generalrecipiemodel(" Mupunga Une Dovi (Peanut Butter Rice)", "Zimbabwe", "10 mins",
            "\n" +
                    "1 cup long grain rice \n" +
                    "Salt\n" +
                    "1 tbsp peanut butter ",

            "Cook the rice following the instructions on the packet, omitting the oil.\n" +
                    "Add 1/2 cup of water and the peanut butter and let it cook some more. You want your rice to be slightly overcooked.\n" +
                    "Cover and let the peanut butter cook for about 10 minutes.\n" +
                    "Using a flat wooden spoon or mugoti, stir in the peanut butter until the rice is well bonded together.\n" +
                    "Reduce the heat to low and cover for 10 minutes or until ready to serve.\n" +
                    "Serve with any stew or sauce of your liking or by itself. " +
                    "This rice is especially good the next morning, cold with a cup of tea.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mupunga.webp?alt=media&token=c81400e1-e822-4ef2-9761-d2589f86558f",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zimbabwe.jpg?alt=media&token=3e4aaabf-773b-42cb-8a12-b85f3a2d7a63"))


        generalRecipies.add(generalrecipiemodel("Matapa", "Mozambique", "1 hr",
            "2 bunches cassava leaves\n" +
                    "1 pound raw peanuts\n" +
                    "½ cup shrimps(shelled)\n" +
                    "1 cup coconut milk\n" +
                    "1 teaspoon ground garlic\n" +
                    "1 tablespoon ground pepper\n" +
                    "seasoning and salt to salt",

            "Wash the cassava leaves thoroughly and remove any tough stems.\n" +
                    "2 bunches cassava leaves\n" +
                    "Chop the leaves finely and set them aside.\n" +
                    "Roast the raw peanuts in a dry pan until they are golden brown and allow them to cool, then grind the peanuts to make peanut butter. You can use a food processor or mortar and pestle.\n" +
                    "1 pound raw peanuts\n" +
                    "Cook the shrimp until they turn pink and are fully cooked. Remove them from the pan and set aside, you can cook in oil.\n" +
                    "½ cup shrimps(shelled)\n" +
                    "Add the coconut milk, ground garlic, and ground pepper, stir well and let it simmer for a few minutes, allowing the flavors to blend.\n" +
                    "1 cup coconut milk\n" +
                    "Gradually add the homemade peanut butter to the coconut milk sauce, stirring constantly to combine.\n" +
                    "Add the finely chopped cassava leaves to the sauce and mix everything together, ensuring the leaves are well-coated with the sauce.\n" +
                    "Let the mixture simmer on low heat for about 15-20 minutes, stirring occasionally. This allows the flavors to meld and the leaves to soften.\n" +
                    "Add the cooked shrimp, salt and seasoning into the mixture.\n" +
                    "seasoning and salt to salt\n" +
                    "Once the cassava leaves are tender and the flavors are well combined, your Matapa is ready.\n" +
                    "Serve the Matapa warm with rice or as a side dish.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mapta.jpeg?alt=media&token=5849f527-6e56-411c-88af-0e0b5d30465e",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mozambique.jpg?alt=media&token=1c607d52-ba95-4c55-8325-02103c08fd5b" ))





//        malawi section

        generalRecipies.add(generalrecipiemodel("Kachumbari", "Malawi", "20 mins",
            "½ medium red onion, diced\n" +
                    "1 tsp salt\n" +
                    "2 large tomatoes\n" +
                    "¾ avocado\n" +
                    "1 small chili (optional)\n" +
                    "½ lime, juiced (approx 1 Tbsp juice)\n" +
                    "1 Tbsp fresh cilantro, chopped",

            "Place the diced onion in a small bowl and massage the salt into the onion pieces. Cover the salted onions with water and let stand for 10 min.\n" +
                    "Meanwhile, dice the tomatoes, avocado, and chili (if using). Place them in a medium bowl.\n" +
                    "Drain the onions and add them to the vegetables.\n" +
                    "Finish by adding the lime juice and cilantro.\n" +
                    "Mix well and taste the salad. Add salt or more lime juice if desired",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kachumbari.jpg?alt=media&token=790bb03c-74f0-476e-bad5-7ddb4cc98c1c",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653"))

        generalRecipies.add(generalrecipiemodel("Mbatata", "Malawi", "30 mins",
            "1\n" +
                    "cup mashed sweet potato\n" +
                    "1⁄4\n" +
                    "cup milk\n" +
                    "1\n" +
                    "egg, slightly beaten\n" +
                    "4\n" +
                    "tablespoons melted butter\n" +
                    "1 1⁄4\n" +
                    "cups sifted flour\n" +
                    "2\n" +
                    "teaspoons baking powder\n" +
                    "1⁄2\n" +
                    "cup sugar\n" +
                    "1⁄2\n" +
                    "teaspoon salt\n" +
                    "1\n" +
                    "teaspoon cinnamon\n" +
                    "1⁄2\n" +
                    "cup raisins",

            "Preheat oven to 375 degrees. Mix sweet potatoes, milk, and melted butter and beat well. Sift and stir in the remaining ingredients. Drop by spoonfulls onto greased cookie sheet and bake 15 minutes.\n" +
                    "Or chill 1-2 hour then turn onto a floured board, knead lightly and roll out 1/2 an inch thick. " +
                    "Cut with a cookie cutter. Place cookies on a greased baking sheet, and bake for 15 minutes. " +
                    "Sprinkle some cinnamon/sugar mixture on top",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mbata.jpg?alt=media&token=ebb9daff-1c25-4141-af19-9323025f2695",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653"))



        generalRecipies.add(generalrecipiemodel("Cecina", "Malawi", "50 mins",
            "12 guajillo chiles stemmed and seeded\n" +
                    "4 garlic cloves\n" +
                    "2 tablespoons apple cider vinegar\n" +
                    "2 teaspoons dried oregano\n" +
                    "1/2 teaspoon dried marjoram\n" +
                    "1/2 teaspoon dried thyme\n" +
                    "1 1/2 teaspoons kosher or coarse sea salt\n" +
                    "1/2 teaspoon freshly ground black pepper\n" +
                    "1 pound pork cutlets thinly sliced\n" +
                    "Vegetable oil to grill",

            "To Prepare\n" +
                    "Place chiles on an already hot comal or skillet set over medium heat. Toast for about 1 minute per side, flipping as they toast." +
                    " Place in bowl and cover with boiling hot water. " +
                    "Let them soak until they plump and rehydrate, for about 20 to 30 minutes.\n" +
                    "Place the re-hydrated chiles and 1 cup of their soaking liquid in the blender, along with the garlic, vinegar, oregano, marjoram, thyme, salt and pepper and puree until completely smooth. Pour into a container and set aside. It can be stored covered in the refrigerator for up to a couple months.\n" +
                    "One by one, or two by two, place the meat slices on a chopping board in between sheets of parchment paper. " +
                    "With a meat mallet, pound until very thin, until you can see the paper under the meat, but it is not completely breaking apart thin, about 1/8-inch thick.\n" +
                    "Once you are done, one by one, generously brush with the marinade on both sides of the meat to completely cover. You may cook immediately or refrigerate covered for up to 24 hours.\n" +
                    "When ready to cook, set the charcoal or gas grill, outside, to medium-high heat. Or to cook indoors, place a grill pan over medium-high heat. When hot, brush with vegetable oil. " +
                    "Grill the meat for about 1 to 2 minutes per side until completely cooked.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/cecina.jpg?alt=media&token=e8270c4f-4d78-4fab-9cf2-e430f794273e",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653"))

        generalRecipies.add(generalrecipiemodel("Jollof Rice", "Malawi", "10 mins",
            "5 medium sized Roma tomatoes, roughly chopped\n" +
                    "1 red bell pepper, roughly chopped\n" +
                    "1 medium sized onion, roughly chopped, set aside\n" +
                    "2 scotch bonnet peppers (habanero peppers as they are sometimes called)\n" +
                    "1/4 cup of groundnut oil\n" +
                    "3 tbsp tomato paste\n" +
                    "2 cups of parboiled rice\n" +
                    "2 1/2 cups of chicken stock\n" +
                    "1 tsp salt to taste\n" +
                    "1/2 tsp curry powder\n" +
                    "1/2 tsp thyme\n" +
                    "1 tsp All purpose seasoning\n" +
                    "1 Knorr stock cube\n" +
                    "3 bay leaves\n" +
                    "Water, as needed",

            "Blend your tomatoes, red pepper, scotch bonnet peppers in a food processor or blender for about 45 seconds, make sure that everything is blended well.\n" +
                    "In a medium sized pot, heat your oil on medium-high heat. Once the oil is heated add the onions you set aside and fry just until they turn golden brown. Once the onions, have turned brown in color add the tomato paste and fry for 2-3 minutes. Then add the blended tomato mixture (reserve about 1/4 cup and set aside) and fry the mixture with the onions and tomato paste for about 30 minutes. Make sure you stir consistently so that the tomato mixture does not burn.\n" +
                    "After 30 minutes, turn the heat down to medium, and add the chicken stock. Mix and add your seasonings (salt, curry powder, thyme, all purpose seasoning, and the Knorr stock cube). Continue to boil for 10 minutes.\n" +
                    "Add the parboiled rice to the pot. Mix it very well with the tomato stew. At this point if you need to add water so that the rice is level with the tomato mixture/chicken stock go ahead and do so. Add the bay leaves, cover the pot, and cook on medium to low heat for 15-30 minutes.\n" +
                    "When the liquid has almost dried up add the remaining tomato stew, cover, and let it cook for another 5-10 minutes heat until the liquid has completely dried up. Turn off the heat, mix thoroughly, and your Jollof Rice is ready to be eaten!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawijollof.jpg?alt=media&token=dc9c8211-1c11-470c-b350-7bdb25e0364c",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653"))

        generalRecipies.add(generalrecipiemodel("Cholent", "Malawi", "10 hrs",
            "2 tbsp sunflower oil\n" +
                    "1 large onion, peeled and cut into 2.5cm chunks\n" +
                    "6 garlic cloves, finely chopped\n" +
                    "1.2kg beef brisket, cut into 2.5cm cubes (remove sinew and excess fat)\n" +
                    "4 medium potatoes (approx 450g), peeled and cut into 5cm chunks\n" +
                    "1 large sweet potato (approx 250g), peeled and cut into 5cm chunks\n" +
                    "2 parsnips (approx 225g), peeled and cut into 2cm chunks\n" +
                    "225g carrots, peeled into 2cm chunks\n" +
                    "400g can butter beans, drained and rinsed\n" +
                    "400g can chickpeas, drained and rinsed\n" +
                    "150g pearl barley\n" +
                    "2 tbsp date syrup, or regular honey\n" +
                    "1 tsp sweet paprika\n" +
                    "1 tsp smoked paprika\n" +
                    "2 tbsp tomato purée\n" +
                    "1 tsp onion granules",

            "STEP 1\n" +
                    "Heat 1 tbsp of the sunflower oil in a large frying pan set over a medium-high heat and sauté the onions, stirring frequently, for 8-10 mins, until soft and translucent. Add the garlic and cook for a few minutes, until soft and fragrant. Sprinkle over 1 tbsp sugar and continue to cook for 2-3 mins, stirring frequently, until the garlic and onions are golden. Tip onto a plate and set aside.\n" +
                    "\n" +
                    "STEP 2\n" +
                    "Wipe the pan with kitchen paper and add the remaining oil. Season the cubed brisket with plenty of salt and pepper, and brown in batches, for 5-10 mins, until browned on all sides. Transfer the browned beef to a second plate or bowl.\n" +
                    "\n" +
                    "STEP 3\n" +
                    "Now, layer up the ingredients in a slow cooker. First, add the vegetables (including the cooked onions) in the base, then the beans and barley (give the dish a shake so that they fall into the gaps) and finally the browned beef.\n" +
                    "\n" +
                    "STEP 4\n" +
                    "Pour 250 ml water into a large jug and stir in the date syrup or honey, both paprikas, tomato purée, onion granules, 3 tsp salt, plus a good grinding of black pepper. Whisk well to combine. " +
                    "Pour over the beef and vegetables in the slow cooker. Top up with enough water (we added 1.5 litres) to just cover the contents – do not stir.\n" +
                    "\n" +
                    "STEP 5\n" +
                    "Set the slow cooker on low and leave to cook for 10-12 hrs until the meat and vegetables are tender, the beans soft and the gravy looks thick and stewy. " +
                    "Check the seasoning and add more salt and pepper if required, before serving piping hot.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/cholent.jpg?alt=media&token=77419420-d1d0-4446-a223-42fe1ab9855e",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653"))

        generalRecipies.add(generalrecipiemodel("Dziwala", "Malawi", "10 mins",
            "1lb locust meat (canned)\n" +
                    "Olive oil\n" +
                    "1tbsp. cayenne pepper\n" +
                    "½ cup lemon juice\n" +
                    "4 garlic cloves (crushed)\n" +
                    "Diced onion\n" +
                    "1tbsp. chilli pepper\n" +
                    "1 lemon\n" +
                    "Salt",

            "Pour your lemon juice in a large bowl and add your pepper. Stir well and add your locust meat. Make sure the juice covers the meat. Leave it to marinate properly for one hour\n" +
                    "Sauté your onions, and garlic for one minute and remove the pieces from the oil\n" +
                    "Remove your meat and sauté it on the oil until it turns crispy\n" +
                    "Remove your meat and squeeze your lemon juice and enjoy\n" +

                    "Consuming Dziwala can help keep you well-nourished and healthy. " +
                    "To those who think eating grasshopper is creepy, weird, and disgusting eww…, uhnnnn, don’t know what you are missing!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/dziwala.jpg?alt=media&token=335be786-132d-42fc-8fb0-ce110f3020f0",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653"))

        generalRecipies.add(
            generalrecipiemodel("Malva Pudding", "South Africa", "1 hr 15 mins",
                "Pudding" +
                        "1 tbsp butter room temperature\n" +
                        "1 cup brown sugar\n" +
                        "4 tbsp apricot jam\n" +
                        "1 large egg\n" +
                        "1 cup milk\n" +
                        "2 tbsp vinegar\n" +
                        "2 tsp vanilla essence\n" +
                        "1 cup all-purpose flour\n" +
                        "1 tsp baking soda\n" +
                        "½ tsp salt" +
                        "Sauce\n" +
                        "2 tbsp butter\n" +
                        "125 ml cream\n" +
                        "4 tbsp brown sugar\n" +
                        "2 tbsp water",

                "Pudding\n" +
                        "Preheat the oven to 180℃ (350℉). Ovens are temperamental, so if you know yours needs a bit more (or less) of a push, feel free to adjust.\n" +
                        "In a large mixing bowl add your first 4 ingredients - butter, sugar, jam and egg. Beat until it lightens and gets a bit fluffier. If you only have a fork, the fluffy part isn’t make-or-break.\n" +
                        "In a large measuring cup or a bowl, add milk, then vinegar and vanilla essence. Whisk lightly.\n" +
                        "In another measuring cup/bowl, add bicarb to flour and give it a quick stir.\n" +
                        "Alternating between the milk mixture and the flour, add to the large mixing bowl and mix well as you go along.\n" +
                        "Pour into a lightly greased oven-proof dish (ours was 30x15cm, but it could definitely have been a bit smaller).\n" +
                        "Bake for 45 minutes, or until a knife comes out with spongy crumbs stuck to it (it’s not likely to come out clean)" +
                        " rather than uncooked batter. The pudding will stay in its mold and rest for a bit once the sauce is poured over.\n" +
                        "Sauce\n" +
                        "Add all sauce ingredients together in a pot and bring to a boil.\n" +
                        "Let it simmer, stirring constantly, for 3 minutes. This time will give the sauce a richer, deeper taste.\n" +
                        "Stab the pudding a few times with a fork to help the sauce sink in so that it doesn’t pool at the sides and soak in only there." +
                        " Then pour the sauce over slowly, being sure you’re not leaving any part dry.",

                "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malvapudding.webp?alt=media&token=aaf5ab7c-ab37-4159-a601-abb1a4ea7f9f",

                "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058" )
        )



//        zimbabwe section

        generalRecipies.add(generalrecipiemodel("Derere/ Okra", " Zimbabwe", "18 mins",
            "500g okra\n" +
                    "\n" +
                    "1 small onion\n" +
                    "\n" +
                    "1 medium tomato\n" +
                    "\n" +
                    "1 tsp bicarbonate of soda\n" +
                    "\n" +
                    "1/4 tsp ground black pepper\n" +
                    "\n" +
                    "300ml boiling water",

            "Get your ingredients ready. Wash and cut your okra into rings. Chop your onion and tomato.\n" +
                    "Put boiling water in a saucepan/pot , add bicarbonate of soda and bring this water to the boil. As soon as the water boils, add your okra and onions.\n" +
                    " Whisk or stir briskly for about 3 minutes.  Add tomatoes and continue stirring until the tomatoes are cooked through (another 3 minutes). If you are adding chili pepper or cayenne powder, this would be the perfect time to add them. \n" +
                    "Season with salt and ground black pepper. Simmer for the final 2 minutes and you’re",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/derereokra.jpeg?alt=media&token=2bc2bfa8-90a2-4dbe-821c-3758700e7184",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zimbabwe.jpg?alt=media&token=3e4aaabf-773b-42cb-8a12-b85f3a2d7a63"))

        generalRecipies.add(generalrecipiemodel("Mutakura", "Zimbabwe", "30 mins",
            "1 cup sorghum, ½ cup groundnut, ½ cup cowpeas; or\n" +
                    "1 cup maize, 1 cup cowpeas, 1 cup groundnuts; or\n" +
                    "1 cup cowpeas, 1 cup nyimo, 1 cup groundnuts, 1 cup sorghum;",

            "After soaking the grains overnight boil them separately until they are tender.\n" +
                    "Combine all of the grains and boil for 30 minutes.\n" +
                    "Season and serve with a dressing of olive oil, lemon juice and chopped fresh chives or parsley if desired.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mutakura.webp?alt=media&token=f5d7287b-f44d-4e41-88b6-bd846cfd461f",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zimbabwe.jpg?alt=media&token=3e4aaabf-773b-42cb-8a12-b85f3a2d7a63"))

        generalRecipies.add(generalrecipiemodel(" Burgundy Wheat Salad", "Malawi", "15 mins",
            "120g fine bulgur wheat\n" +
                    "75ml olive oil\n" +
                    "4 tbsp lemon juice\n" +
                    "5 tomatoes\n" +
                    "4 finely sliced spring onions\n" +
                    "good handful chopped flat-leaf parsley\n" +
                    "good handful chopped mint leaves\n" +
                    "75ml olive oil\n" +
                    "4-5 tbsp lemon juice",

            "Soak 120g fine bulgur wheat in cold water for 15 mins. Drain well, put in a bowl and mix with 75ml olive oil and 4 tbsp lemon juice. " +
                    "Cover and leave for 30 mins to soften." +
                    " When ready to serve, deseed and finely chop 5 tomatoes and add with 4 " +
                    "finely sliced spring onions and a good handful each of chopped flat-leaf parsley and chopped mint leaves." +
                    " Finally, stir in another 75ml olive oil and 4-5 tbsp lemon juice and season well.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/burgundy.jpg?alt=media&token=62a32f0f-f45d-4bd3-ab7f-4605c8cfe0f1",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/malawi.jpg?alt=media&token=c5adc3c4-1c16-4631-aae5-225541bf0653"))


        generalRecipies.add(generalrecipiemodel("Mhandire", "Zimbabwe", "10 mins",
            "2 cups Chibage chakaomeswa (Dried corn)\n" +
                    "1/2 - 1 cup Nzungu (Groundnuts)\n" +
                    "3/4 tsp salt"
                    +
                    "Equipment\n" +
                    "\n" +
                    "Gango (Pan)\n" +
                    "Wooden spoon\n" +
                    "Bowl",
            "Before preparing the mhandire, soak your chibage (corn) in salted water for 1 day. " +
                    "The other 3 days, soak in plain water, changing it once a day, putting fresh water. For this recipe I used; 2 cups Chibage chakaomeswa (Dried corn);\n" +
                    "1/2 – 1 cup Nzungu (Groundnuts) and\n" +
                    "3/4 tsp salt\n" +
                    "After the soaking period, drain all the water. Place your pan on the stove and heat it up for a minute. Add the chibage and a sprinkling of salt. Toss/stir it about until golden brown.\n" +
                    "Add the groundnuts. Continue with the tossing/stirring for another 3 minutes. Enjoy!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mhandire.webp?alt=media&token=ef7388fd-0547-4128-8915-b200985bf4a3",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zimbabwe.jpg?alt=media&token=3e4aaabf-773b-42cb-8a12-b85f3a2d7a63"))

        generalRecipies.add(generalrecipiemodel("Kapenta With Sadza", "Zimbabwe", " 45 mins",
            "1 lb Dried kapenta fish\n" +
                    "1 Large onion\n" +
                    "1 Large tomato\n" +
                    "4 cloves Garlic\n" +
                    "1 tbsp Olive oil\n" +
                    "Salt and pepper to taste",

            "Prepare a large pot of boiling water and place in your kapenta, boil for 15 minutes.\n" +
                    "After 15 minutes, remove your kapenta, pat it dry and then chop into thin chunks ready for frying.\n" +
                    "Finely chop your onion and garlic, and add to a hot frying pan of olive oil, cook until browned.\n" +
                    "Finely chop the tomato and add to the pan along with salt, pepper, groundnut powder and a 1/2 cup of water.\n" +
                    "Add your kapenta to the pan, making sure to immerse it in the sauce. Cover the pan and leave to simmer for 10 minutes on a low heat, stirring half way through.\n" +
                    "Take your fish stew off the heat and leave to rest for 2 minutes to allow the sauce to thicken.\n" +
                    "Your stewed kapenta is now ready to eat, serve with sadza or boiled rice.\n" +
                    "Enjoy!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kapenta.jpeg?alt=media&token=7025b86b-26d1-4dc2-a25e-eb52d681afce",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zimbabwe.jpg?alt=media&token=3e4aaabf-773b-42cb-8a12-b85f3a2d7a63" ))



//        angola section
        generalRecipies.add(generalrecipiemodel("Funge", "Angola", "8 mins",
            "Equipment\n" +
                    "▢\n" +
                    "Wooden Spoon\n" +
                    "▢\n" +
                    "Whisk\n" +
                    "▢\n" +
                    "Oven Mitt\n" +
                    "▢\n" +
                    "Platter\n" +
                    "▢\n" +
                    "Mixing Bowl(s)\n" +
                    "▢\n" +
                    "Pot(s)" +
                    "" +
                    "Ingredients\n" +
                    "▢2 cups cassava flour\n" +
                    "▢4 cups water", "The Modern Way\n" +
                    "Preheat oven to 350 degrees. \n" +
                    "Bring 4 cups of water to a boil on the stove. Be sure to do this in a pot that can also be transferred to the oven with a lid.\n" +
                    "Put 2 cups of cassava flour in a bowl and wet with cold water until it is just damp. Mix to incorporate. \n" +
                    "When the water is boiling, add the pre-mixed flour and water into the boiling water, and whisk to combine. Continue to whisk until all of the lumps are out of the mixture. \n" +
                    "Cover with a lid and place in oven for about 45 minutes. \n" +
                    "Traditional Method\n" +
                    "Bring 4 cups of water to a boil on the stove.\n" +
                    "When the water is boiling, remove the pot from the stove. Sit on the ground with the pot in your lap (pro tip: put a beach towel over your lap, wear shoes, and have oven mitts handy). " +
                    "I did not splatter at all, but its better to be safe than sorry!\n" +
                    "Pour the cassava flour into the water and whisk as fast and as hard as you can with a wooden oar (or a wooden spoon) until the mixture is completely smooth. A lumpy funje is considered subpar. \n" +
                    "Enjoy right away! ",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/funge.jpg?alt=media&token=557b3e66-89c1-4c31-a2f4-013dc2aeb8ee",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8"))

        generalRecipies.add(generalrecipiemodel("Mufete", "Angola", "3 hrs",
            "Onion salsa\n" +
                    "1 small onion chopped\n" +
                    "a handful parsley chopped\n" +
                    "a splash lemon juice\n" +
                    "1 tbsp white wine vinegar\n" +
                    "1 tbsp olive oil\n" +
                    "Mufete\n" +
                    "1 whole carapau or tilapia fish\n" +
                    "2 medium-sized plantains\n" +
                    "2/3 sweet potatoes or regular potatoes\n" +
                    "farinha musseque toasted ground manioc or breadcrumbs, to garnish\n" +
                    "2/3 yams or cassavas\n" +
                    "1 tsp salt\n" +
                    "180 g dried butter beans or other white beans, soaked for at least 2 hours or overnight\n" +
                    "black pepper to taste\n" +
                    "1 small onion finely chopped\n" +
                    "sugar to taste\n" +
                    "50 ml palm oil\n" +
                    "1 bay leaf\n" +
                    "1 garlic clove crushed\n" +
                    "juice of 1 lemon",

            "Onion salsa\n" +
                    "Begin with theby combining the chopped onion and parsley in a bowl, then add the remaining ingredients with 1 tablespoon hot water and some salt. Mix well and set aside.\n" +
                    "Mufete\n" +
                    "Once the beans have soaked, discard the water and place beans and bay leaf in a pot with enough water to cover and boil for 30 minutes. Drain.\n" +
                    "Clean the fish and score the skin on both sides. In a small bowl, mix 1 teaspoon salt, the lemon juice, olive oil and crushed garlic and rub this mixture inside the fish, and into the scores on the skin. Leave to marinate for 15 minutes.\n" +
                    "Peel the sweet (or regular) potatoes, yams (or cassava) and plantains, place in a large pot of salted water and boil for 15 minutes. Once soft, drain and set aside.\n" +
                    "Light a barbecue (or pre-heat grill to medium heat) and place the marinated fish over charcoal fire or under the grill for 3-5 minutes each side, or until just cooked through.\n" +
                    "Fry the onions in the palm oil with the bay leaf until translucent. Add 475ml / 2 cups of water and the beans and simmer for 15 minutes. Adjust the seasoning to taste with salt and sugar.\n" +
                    "Once everything is cooked, assemble fish, sweet potatoes, plantain, and beans on a large plate to share." +
                    " Garnish the fish with a lemon wedge and sprinkle farinha (or breadcrumbs) over the beans.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mufete.jpeg?alt=media&token=ae195cf7-5d4a-4664-8cf2-7e04d7f800b7",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8"))

        generalRecipies.add(generalrecipiemodel("Calulu: Angolan Fish and Vegetable Stew Recipe", "Angola", "1 hr 10 mins",
            "Codfish fillets, cut into large bite-sized pieces - 2 lbs\n" +
                    "Onion, finely chopped - 1\n" +
                    "Garlic cloves, minced - 3 to 4\n" +
                    "Medium-sized tomatoes, diced - 3 to 4\n" +
                    "Lemon juice - 1 tbsp\n" +
                    "Green bell pepper, diced - 1\n" +
                    "Eggplant, diced into cubes - 1 cup\n" +
                    "Okras, stems removed and chopped diagonally - 8 pieces\n" +
                    "Spinach (you can substitute kale, sweet potato leaves, collard greens or cassava leaves) - 1 lb\n" +
                    "Bay leaves - 2\n" +
                    "Salt - to taste\n" +
                    "Pepper - to taste\n" +
                    "Water - 1 cup\n" +
                    "Red palm oil - ¼ cup\n" +
                    "Arrowroot starch or flour (optional) - 2 tbs",

            "Before preparing the ingredients, place the codfish into a bowl and season with salt and lemon juice on each piece. Set it aside to marinate for 20 to 30 minutes and prepare everything else.\n" +
                    "In a pot, heat the palm oil on a medium-high flame. When ready, saute the garlic and onions for a few minutes until softened.\n" +
                    "Add the eggplant, tomato, okra, bell pepper, and bay leaf into the pot. Saute them for a few minutes until everything is nicely incorporated.\n" +
                    "When done, add the spinach or green leaves you have into the pot and give it a gentle stir to mix everything. Then, add a cup of water (or you can also use vegetable broth) onto the pot.\n" +
                    "Add in the marinated fish with the other ingredients, like making stew or soup. You can also start layering the fish first before the ingredients.\n" +
                    "Once the fish is added, cover the pot, then lower the heat. Let the calulu cook for 15 to 20 minutes.\n" +
                    "After 15 to 20 minutes, lower the heat until the stew only simmers. Uncover the pot then give it a stir.\n" +
                    "If you want a thicker consistency, add the arrowroot or flour to the mixture. Mix it and cook the calulu again for another 5 minutes until the soup thickens.\n" +
                    "Turn off the heat, then serve the calulu on a plate or bowl. Serve it with rice if preferred, then enjoy!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/calulu.webp?alt=media&token=42bd78d7-aa33-465b-a136-b8e63101a79d",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8"))

                generalRecipies.add(generalrecipiemodel("Kizaca", "Angola", "1 hr",
            "4 cups of pounded cassava leaves\n" +
                    "1 dried fish soaked and shredded (optional)\n" +
                    "2 medium onions roughly chopped\n" +
                    "1 medium green pepper roughly chopped\n" +
                    "1 medium aubergine roughly chopped\n" +
                    "¾ cup of ground peanuts optional\n" +
                    "½ cup of palm oil or regular oil\n" +
                    "5 cups of water\n" +
                    "½ sachet Benny Stock\n" +
                    "2 garlic cloves crushed\n" +
                    "1 thumbnail of ginger crushed\n" +
                    "½ tsp. bicarbonate of soda",

            "To begin, soak the dried fish in warm water, cover and set aside.\n" +
                    "Bring 4 cups of water to boil in a medium pot, add the pounded cassava leaves, soda and a pinch of salt. Cover and boil for 30 minutes.\n" +
                    "Peel and roughly chop the onions, pepper, aubergine, garlic and ginger. Place in a food processor and blitz until smooth.\n" +
                    "Stir the mixture into the cassava leaves along with the seasoning and let simmer for a further 15 minutes.\n" +
                    "Mix the groundnuts with a little bit of water to form a paste.\n" +
                    "Once the leaves have softened and thickened, add Benny Stock, dried fish and peanut paste to the pot.\n" +
                    "Reduce the heat and let simmer for 15 minutes.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kizaca.jpeg?alt=media&token=6febbc27-9900-4e01-8131-fe4c1dc3fb9e",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8"))

                generalRecipies.add(generalrecipiemodel("Cachupa", "Angola", "4 hrs 30 mins",

            "4 tablespoons vegetable oil\n" +
                    "1/2 pounds of smoked bacon finely cubed\n" +
                    "1 onion diced\n" +
                    "2 large carrots diced\n" +
                    "5 cloves garlic minced\n" +
                    "2 Bay leaves optional\n" +
                    "3 tomatoes chopped\n" +
                    "1 cup dried red kidney beans soaked overnight (or use 1 can of white kidney beans)\n" +
                    "1 cup white kidney bean soaked overnight (or use 1 can of white kidney beans)\n" +
                    "1-2 large cans hominy to taste\n" +
                    "1 chorizo or churico sausages sliced\n" +
                    "1 buttercup squash 2 cups, largely cubed\n" +
                    "1 sweet potato largely cubed\n" +
                    "1 medium sized yucca cassava (1 ½ cups), largely cubes\n" +
                    "¾ cup 3/4 pound cubed ham\n" +
                    "1 cup 1 pound cubed brisket\n" +
                    "1 tablespoon paprika\n" +
                    "4 cups chopped kale\n" +
                    "Salt to taste\n" +
                    "Black pepper to taste\n" +
                    "Water veggies, or chicken stock as needed",

            "Cook Dried Beans\n" +
                    "Pour off the water with your dry red and white kidney beans soaked in.\n" +
                    "In a pot, add your dry white and red kidney beans that have been soaked overnight and fill with water so the beans are fully submerged.\n" +
                    "Boiled beans until tender, which may take about 45 minutes to an hour. Top with more water if necessary and make sure the lid you are using allows for steam to escape the pot while the beans are boiling.\n" +
                    "When the beans are tender and fully cooked, set aside until ready to add to your stew.\n" +
                    "Make Stew\n" +
                    "In a large separate pot place on the stove on low-medium heat. Add a tablespoon of oil to the pot and add your diced bacon that has been cubed to just about a cm.\n" +
                    "Cook on low to medium heat to render the bacon fat and stir constantly until the bacon is evenly browned.\n" +
                    "Add your diced onions. Sautee your onions until translucent.\n" +
                    "Add your minced garlic, Bay leaves and carrots to the pot and saute until the carrot begins to soften.\n" +
                    "Add your diced tomatoes and saute for about 5-10 minutes until the tomatoes start to stew. Taste and adjust for seasoning.\n" +
                    "If your brisket is raw, take 1 pound of brisket, whole, season with salt and pepper and add your pot with your stewed veggies.\n" +
                    "Top your pot, with your brisket with water or stock until the brisket is fully submerged.\n" +
                    "Cook on low for 2 ½ hours until brisket is done. Remove the brisket from the pot, and when cool enough to cut, cut your brisket into cubes and set aside.\n" +
                    "While your brisket cooks for 2 ½ hours prepare your other veggies like dicing your sweet potato, quash etc.\n" +
                    "To your pot, add drained cans of hominy. Add more hominy if you want more corn to your stew. You can always start with one can, and add the second can after seeing what the ratio of ingredients of your stew looks like. I prefer more corn.\n" +
                    "Add your boiled beans, drained to your stew.\n" +
                    "Add your starches, your chopped sweet potato, chopped squash, chopped yuca. I prefer to have them largely chopped because they tend to “get lost” in the stew if they are too finely chopped. An inch cubed is the smallest I would cut these. Add water or stock as needed\n" +
                    "Add your chopped ham, your chopped cooked brisket, your sliced sausage and mix well and cook for an additional 30-40 minutes on low stirring occasionally making sure to scrape the bottom so it does not burn. Really it will burn because of all the starches to stir periodically and try not to break up the starch in your stew while doing so.\n" +
                    "Add your tablespoon of paprika and adjust the seasoning of salt and pepper to taste.\n" +
                    "When the stew is almost ready, add your chopped kale and mix in and simmer for an additional 10-15 minutes. If you decide to use another leafy green like collard green for example, I would add them in after taking out your brisket to give the collards enough time to cook down.\n" +
                    "NOTES\n" +
                    "This recipe is an amalgamation of starches, proteins and so long as the basics are there, hominy and beans, the rest can be adjusted to preference. " +
                    "This dish can easily be made vegetarian but this rendition here is a typical presentation of Cachupa.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/cachupa.webp?alt=media&token=d51b2f2a-c1bd-4da2-8676-fc4ca4f58f92",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8"))

                generalRecipies.add(generalrecipiemodel("Muamba De Galinha", "Angola", " 1 hr 15 mins",
            "3 – 3 1/2 pound chicken cut in pieces\n" +
                    "Juice ½ lemon optional\n" +
                    "1 teaspoon white pepper\n" +
                    "1 teaspoon minced garlic\n" +
                    "½ teaspoon dried thyme\n" +
                    "1 teaspoon salt\n" +
                    "½ teaspoon smoked paprika\n" +
                    "½ teaspoon chicken bouillon powder\n" +
                    "¼ cup canola oil\n" +
                    "¼ cup palm oil\n" +
                    "4-5 garlic minced\n" +
                    "2-3 onions sliced\n" +
                    "2 tomatoes diced\n" +
                    "1 teaspoon white pepper\n" +
                    "1 teaspoon smoked paprika\n" +
                    "Whole hot pepper pierced chili, Scotch bonnet\n" +
                    "½ -1 pound butternut squash cut into large cubes\n" +
                    "18-20 Okra sliced in half\n" +
                    "2 cups or more chicken broth or water\n" +
                    "Salt to taste",

            " Place chicken in a large bowl or saucepan, rub with lemon juice ,\n" +
                    "Then add salt, garlic, thyme, white pepper and chicken bouillon.\n" +
                    "Mix chicken with a spoon or with hands until they are well coated, set aside.\n" +
                    "When ready to cook, heat up large saucepan with palm and canola oil, then add chicken, brown both sides for about 4-5 minutes.\n" +
                    "Add garlic, chili pepper and smoked paprika, stir for about a minute then add onions and tomatoes, sauté 2-3 minutes until onions is translucent.\n" +
                    "Add chicken stock if necessary to prevent any burns\n" +
                    "Next add chicken stock or water (about 2 cups or enough to cover chicken. Add chicken bouillon, and squash. Bring to a boil and let it simmer until sauce thickens, it might take about 20 or more depending on the type of chicken used. Throw in okra, continue cooking until desired texture is reached about 5 minutes or more\n" +
                    "Adjust for salt, pepper and stew consistency.\n" +
                    "Serve warm with Cornmeal mash or rice.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/muamba.jpeg?alt=media&token=ba75b40a-8d0e-456d-846d-13d1954575e3",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8"))



                generalRecipies.add(generalrecipiemodel("Fumbua (Wild Spinach Stew)", "Angola", "1 hr",
            "1/2 onion\n" +
                    "2 garlic cloves\n" +
                    "3 pieces smoked catfish approx 8oz\n" +
                    "2 tbsp palm oil\n" +
                    "4 tbsp peanut butter\n" +
                    "2 to matoes\n" +
                    "4 cups spinach\n" +
                    "1 tsp bouillon powder\n" +
                    "1/2 tsp salt\n" +
                    "1 tsp black pepper\n" +
                    "1 cup stock\n" +
                    "1 habanero optional\n" +
                    "1 cup water",

            "Soak the smoked fish in hot water for a few minutes.\n" +
                    "Chop the spinach and rinse, then place in a colander to drain the excess water.\n" +
                    "De-bone the smoked fish and break them into medium pieces. Rinse them out thoroughly.\n" +
                    "Chop the onions, tomato & habanero pepper, and mince the garlic.\n" +
                    "Pour in one cup of water and one cup of stock to a pot and bring to a boil.\n" +
                    "Add the chopped spinach to it and simmer for 10 minutes.\n" +
                    "Add the smoked fish, diced tomatoes, pepper, onion, garlic, bouillon powder, salt, and black pepper.\n" +
                    "Bring to a boil and simmer for about 10 minutes.\n" +
                    "Add the peanut butter and palm oil and simmer for another 10 minutes.\n" +
                    "NOTES\n" +
                    "This recipe serves 8 and contains 3 net carbs per serving Don't worry if you live in a county where it's hard to get traditional fumbwa leaves. " +
                    "You can safely substitute with spinach or kale and collards greens. Depending on your preference, you may leave out the habanero pepper to reduce heat or add cayenne pepper for a little more heat. Always taste for salt before you add any since the stock already has some salt in it." +
                    " You can use a cup of ground roasted peanuts instead of peanut butter.\n",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/fumbua.jpeg?alt=media&token=45bb631f-58a1-40c5-8159-49ddc6e0c1e8",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/angola.jpg?alt=media&token=88f3bb20-2cd3-4ecc-940d-ac96535e19d8"))

//        nambia section

                generalRecipies.add(generalrecipiemodel("Bratwurst", "Nambia", "2 hrs",
            "2 1/2 pounds boneless pork shoulder (can substitute part veal if desired) , cut into 1/2 inch pieces and put in freezer for 45 minutes prior to grinding\n" +
                    "12 ounces pork back fat , cut into 1/2 inch chunks and put in freezer for 45 minutes prior to grinding\n" +
                    "2 cups crushed ice\n" +
                    "For the Spice Mixture:\n" +
                    "1 1/2 tablespoons salt\n" +
                    "1/4 cup dried milk powder\n" +
                    "1 1/2 teaspoons freshly ground white pepper\n" +
                    "3/4 teaspoon freshly ground black pepper\n" +
                    "1 teaspoon ground mace (can substitute nutmeg but strongly recommend mace for traditional German flavor)\n" +
                    "\n" +
                    "1 teaspoon ground ginger\n" +
                    "1 teaspoon dried marjoram\n" +
                    "3/4 teaspoon mustard powder\n" +
                    "1/4 teaspoon ground cardamom\n" +
                    "1/4 teaspoon ground coriander\n" +
                    "1/4 teaspoon crushed caraway seeds\n" +
                    "32mm natural hog casing , about 4 feet",

            "Combine the pork, fat and crushed ice in a bowl and then, working quickly, use a meat grinder to grind the mixture through a 1/4 inch (6mm) die.  Preferably grind the meat mixture into a bowl set atop an ice bath to keep the meat cold.  Grind half of the ground mixture a second time. \n" +
                    "Note: It is imperative that the meat be at a constant cold temperature so that the fat doesn't get too soft.  You should be able to see clear definition between the lean meat the specks of fat in the ground mixture.\n" +
                    "Chill the meat in the refrigerator while you assemble the spice mixture.\n" +
                    "In a small bowl combine all the spices.\n" +
                    "Remove the ground meat from the fridge and place it on the stand mixer fitted with a paddle attachment.  Add the spice mix and dry milk powder.\n" +
                    "Mix the meat mixture with the paddle for 3-4 minutes until threads begin to appear in the meat: If you take a clump of meat and pull it apart with your fingers you will see tiny threads pulling apart.  When you see this your meat is ready.  *If the meat mixture is too dry and stiff, add a little ice water.  You want a soft/smooth mixture that will easily go into the casings.\n" +
                    "*This is also the time to taste your sausage mixture so you can adjust the seasonings if needed.  To do this, take a bit of the meat mixture, fry it up in a pan, taste it and adjust the seasonings if needed.\n" +
                    "Place the meat mixture back in the refrigerator while you prepare the casings.\n" +
                    "Thread your sausage stuffer with the prepared hog casings, fill the sausage stuffer with the meat mixture, and stuff the casings being careful to avoid air gaps while also being careful to not over-stuff the casings.\n" +
                    "Twist the sausages into links.  Use a sausage pricker to prick any air bubbles out of the links.\n" +
                    "For best results chill the sausages overnight.\n" +
                    "To prepare the bratwursts, you can gently poach them in lightly salted water (place sausages in pot of water, gradually bring liquid to a light simmer/do NOT boil, and poach sausages until partially cooked, 3-4 minutes) and then fry or grill them.  Poaching is optional if you want to ensure they're evenly cooked in the middle or if you want to infuse them with more flavor, such as poaching them in beer. Once poached they will keep in the fridge, tightly wrapped, for up to a week.\n" +
                    "You can either freeze the Bratwursts raw prior to poaching (then thaw, poach, fry/grill) or freeze them once they're poached.\n" +
                    "This yields roughly 10 bratwursts depending on the size and diameter.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/bratwurst.jpg?alt=media&token=150c66ce-9130-4606-9ddd-12d6450ec940",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))

                generalRecipies.add(generalrecipiemodel("Mahangu Soup", "Nambia", "10 mins",
            "1 cup mahangu (pearl millet) flour\n" +
                    "4 cups water\n" +
                    "1 onion, chopped\n" +
                    "2 tomatoes, chopped\n" +
                    "2 cloves of garlic, minced\n" +
                    "1 tablespoon cooking oil\n" +
                    "Salt and pepper to taste",

            "In a large pot, heat the cooking oil over medium heat.\n" +
                    "Add the chopped onion and minced garlic to the pot and sauté until they become translucent.\n" +
                    "Add the chopped tomatoes to the pot and cook until they soften.\n" +
                    "In a separate bowl, mix the mahangu flour with 1 cup of water to form a smooth paste.\n" +
                    "Slowly add the mahangu paste to the pot, stirring continuously to prevent lumps from forming.\n" +
                    "Gradually add the remaining 3 cups of water to the pot, stirring well to combine all the ingredients.\n" +
                    "Season the soup with salt and pepper to taste.\n" +
                    "Reduce the heat to low and let the soup simmer for about 20-30 minutes, stirring occasionally.\n" +
                    "Once the soup has thickened and the flavors have melded together, it is ready to be served.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mahangu.jpeg?alt=media&token=a7cb8096-9a43-49f4-aa1c-6e1b19a3233c",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))

                generalRecipies.add(generalrecipiemodel(" Vetkoeke", "Nambia", "10 mins",
            "4 cups flour\n" +
                    "2 tablespoons sugar\n" +
                    "2 teaspoons salt\n" +
                    "2 tablespoons butter\n" +
                    "2 teaspoons instant yeast\n" +
                    "1 1/2 cups warm water\n" +
                    "oil for frying",

            "In a large bowl, mix together the flour, sugar, and salt.\n" +
                    "Rub in the butter until the mixture resembles coarse crumbs.\n" +
                    "Stir in the yeast.\n" +
                    "Gradually add the warm water, mixing until a soft dough forms.\n" +
                    "Knead the dough for about 10 minutes, until smooth and elastic.\n" +
                    "Cover the bowl with a clean cloth and let the dough rise in a warm place for about an hour, or until it has doubled in size.\n" +
                    "Heat the oil in a large pot or deep fryer until hot.\n" +
                    "Divide the dough into 12 to 16 pieces and shape each piece into a ball.\n" +
                    "Fry the vetkoek in the hot oil, turning occasionally, until they are golden brown and cooked through.\n" +
                    "Remove the vetkoek from the oil and drain on paper towels.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/vetkoeke.webp?alt=media&token=9c508d7f-e871-4163-a0e7-bef47a639151",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))

                generalRecipies.add(generalrecipiemodel("Namibian Oysters", "Nambia", "45 mins",
            "Fresh Namibian oysters\n" +
                    "Lemon wedges\n" +
                    "Tabasco sauce (optional)\n" +
                    "Mignonette sauce (optional)",

            "Start by shucking the Namibian oysters. Use an oyster knife to carefully pry open the shells, being cautious not to spill any of the oyster liquor.\n" +
                    "\n" +
                    "Once the oysters are shucked, place them on a bed of crushed ice to keep them chilled.\n" +
                    "\n" +
                    "Serve the Namibian oysters with lemon wedges on the side. Squeeze some lemon juice over the oysters to enhance their flavor.\n" +
                    "\n" +
                    "If desired, you can also offer Tabasco sauce or mignonette sauce as condiments for added taste. These sauces can be drizzled over the oysters according to personal preference.\n" +
                    "\n" +
                    "Enjoy the fresh and delicious Namibian oysters!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/namibianoysters.jpeg?alt=media&token=57591a74-9035-4c04-8eb0-0a8560d21984",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))

                generalRecipies.add(generalrecipiemodel("Koshari", "Egypt", "1 hr 22 mins",
            "For the Crispy Onion Topping\n" +
                    "\n" +
                    "1 large onion, sliced into thin rings\n" +
                    "Salt\n" +
                    "⅓ cup all-purpose flour\n" +
                    "½ cup cooking oil\n" +
                    "For Tomato Sauce\n" +
                    "\n" +
                    "Cooking oil\n" +
                    "1 small onion, grated\n" +
                    "4 garlic cloves, minced\n" +
                    "1 tsp ground coriander\n" +
                    "½ -1 teaspoon crushed red pepper flakes (optional)\n" +
                    "1 can 28-oz tomato sauce\n" +
                    "Salt and pepper\n" +
                    "1-2 tablespoon distilled white vinegar\n" +
                    "For Koshari \n" +
                    "\n" +
                    "1 ½ cup brown lentils, picked over and well-rinsed\n" +
                    "1 ½ cup medium-grain rice, rinsed, soaked in water for 15 minutes, drained\n" +
                    "½ tsp each salt and pepper\n" +
                    "½ tsp coriander\n" +
                    "2 cups elbow pasta\n" +
                    "Cooking oil\n" +
                    "Water\n" +
                    "1 15-oz can chickpeas, rinsed, drained and warmed",

            "Make the crispy onion topping. \n" +
                    "\n" +
                    "Sprinkle the onion rings with salt, then toss them in the flour to coat. Shake off excess flour.\n" +
                    "In a large skillet, heat the cooking oil over medium-high heat, cook the onion rings, stirring often, until they turn a nice caramelized brown. " +
                    "Onions must be crispy, but not burned (15-20 minutes). Make the Tomato Sauce. \n" +
                    "\n" +
                    "In a saucepan, heat 1 tablespoon cooking oil. Add the grated onion, cook on medium-high until the onion turns a translucent gold (do not brown). Now add the garlic, coriander, and red pepper flakes, if using, and saute briefly until fragrant (30-45 seconds more).\n" +
                    "Stir in tomato sauce and pinch of salt. Bring to a simmer and cook until the sauce thickens (15 minutes or so).\n" +
                    "Stir in the distilled white vinegar, and turn the heat to low. Cover and keep warm until ready to serve. Make the Koshari\n" +
                    "\n" +
                    "Cook the lentils. Bring lentils and 4 cups of water to a boil in a medium pot or saucepan over high heat. Reduce the heat to low and cook until lentils are just tender (15-17 minutes). Drain from water and season with a little salt. (Note: when the lentils are ready, they should not be fully cooked. They should be only par-cooked and still have a bite to them as they need to finish cooking with the rice).\n" +
                    "Now, for the rice. Drain the rice from its soaking water. Combine the par-cooked lentils and the rice in the saucepan over medium-high heat with 1 tablespoon cooking oil, salt, pepper, and coriander. Cook for 3 minutes, stirring regularly. Add warm water to cover the rice and lentil mixture by about 1 ½ inches (you'll probably use about 3 cups of water here). Bring to a boil; the water should reduce a bit. Now cover and cook until all the liquid has been absorbed and both the rice and lentils are well cooked through (about 20 minutes). " +
                    " Keep covered and undisturbed for 5 minutes or so. Now make the pasta. While the rice and lentils are cooking, make the pasta according to package instructions by adding the elbow pasta to boiling water with a dash of salt and a little oil. Cook until the pasta is al dente. Drain.\n" +
                    "Cover the chickpeas and warm in the microwave briefly before serving.\n" +
                    "Put it All Together! \n" +
                    "\n" +
                    "To serve, fluff the rice and lentils with a fork and transfer to a serving platter. Top with the elbow pasta and ½ of the tomato sauce, then the chickpeas, and finally ½ of the crispy onions for garnish. " +
                    "Serve, passing the remaining sauce and crispy onions separately.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/koshari.jpg?alt=media&token=83e4d414-ae58-4ffb-b3d6-31bd0cbac29b",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egypt.jpg?alt=media&token=5f8bf593-fe58-4aad-83a3-4742eaabda40"))


                generalRecipies.add(generalrecipiemodel("Melktert (Milk Tart)", "Nambia", "3 hrs",
            "1 pre-baked pie crust\n" +
                    "4 cups milk\n" +
                    "1/2 cup sugar\n" +
                    "1/4 cup all-purpose flour\n" +
                    "3 tablespoons cornstarch\n" +
                    "4 large eggs\n" +
                    "1 teaspoon vanilla extract\n" +
                    "Ground cinnamon, for sprinkling",

            "In a saucepan, heat the milk over medium heat until it starts to simmer. Remove from heat.\n" +
                    "In a mixing bowl, whisk together the sugar, flour, and cornstarch until well combined.\n" +
                    "Add the eggs to the dry mixture and whisk until smooth.\n" +
                    "Slowly pour the hot milk into the egg mixture, whisking constantly.\n" +
                    "Pour the mixture back into the saucepan and return to medium heat.\n" +
                    "Cook, stirring constantly, until the mixture thickens and comes to a gentle boil.\n" +
                    "Remove from heat and stir in the vanilla extract.\n" +
                    "Pour the filling into the pre-baked pie crust and smooth the top with a spatula.\n" +
                    "Sprinkle ground cinnamon evenly over the top of the tart.\n" +
                    "Allow the tart to cool to room temperature, then refrigerate for at least 2 hours before serving.\n" +
                    "Slice and enjoy!\n" +
                    "Note: Melktert is traditionally served chilled.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/melktert.webp?alt=media&token=0086f2b3-372f-4708-b2c9-b95275eca029",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))

                generalRecipies.add(generalrecipiemodel("Schnitzel", "Nambia", "25 mins",
            "4 boneless pork chops\n" +
                    "1/2 cup all-purpose flour\n" +
                    "2 large eggs\n" +
                    "1 cup breadcrumbs\n" +
                    "1/2 teaspoon salt\n" +
                    "1/4 teaspoon black pepper\n" +
                    "1/4 cup vegetable oil\n" +
                    "Lemon wedges, for serving",

            "Preheat the oven to 375°F (190°C).\n" +
                    "Place the pork chops between two sheets of plastic wrap and pound them with a meat mallet until they are about 1/4 inch (6mm) thick.\n" +
                    "Set up three shallow dishes: one with flour, one with beaten eggs, and one with breadcrumbs mixed with salt and pepper.\n" +
                    "Dredge each pork chop in the flour, shaking off any excess.\n" +
                    "Dip each floured chop in the beaten eggs, then coat it evenly with breadcrumbs.\n" +
                    "Heat the oil in a large skillet over medium-high heat.\n" +
                    "Add the breaded pork chops to the skillet and cook until golden brown, about 3 minutes on each side.\n" +
                    "Transfer the pork chops to a baking sheet and bake in the preheated oven for 10-15 minutes until cooked through.\n" +
                    "Serve hot with lemon wedges on the side.\n" +
                    "Note: You can use chicken or veal instead of pork if you prefer.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/schnitzel.webp?alt=media&token=9f952755-ade0-416c-ae85-e41e040dfb78",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))



                generalRecipies.add(generalrecipiemodel("Eisbein / Grillhaxe", "Nambia", "3 hrs",
            "4 pork knuckles (Eisbein/Grillhaxe)\n" +
                    "2 tablespoons vegetable oil\n" +
                    "2 onions, sliced\n" +
                    "4 cloves of garlic, minced\n" +
                    "2 teaspoons caraway seeds\n" +
                    "2 teaspoons salt\n" +
                    "1 teaspoon black pepper\n" +
                    "1 teaspoon paprika\n" +
                    "1/2 teaspoon dried thyme\n" +
                    "4 cups chicken or vegetable broth\n" +
                    "1 cup beer (optional)\n" +
                    "Mustard and sauerkraut, for serving",

            "Preheat the oven to 350°F (175°C).\n" +
                    "Rinse the pork knuckles and pat them dry with paper towels.\n" +
                    "In a large oven-safe pot or roasting pan, heat the vegetable oil over medium-high heat.\n" +
                    "Add the sliced onions and minced garlic to the pot and sauté until they start to soften and brown.\n" +
                    "Push the onions and garlic to the sides of the pot and add the pork knuckles, searing them on all sides until golden brown.\n" +
                    "Sprinkle the caraway seeds, salt, black pepper, paprika, and dried thyme over the pork knuckles.\n" +
                    "Pour in the chicken or vegetable broth and beer (if using) until the pork knuckles are partially submerged.\n" +
                    "Cover the pot with a lid or aluminum foil and transfer it to the preheated oven.\n" +
                    "Roast for about 2 to 2 1/2 hours, or until the meat is tender and falling off the bone.\n" +
                    "Remove the lid or foil for the last 30 minutes of cooking to allow the skin to crisp up.\n" +
                    "Once cooked, remove the pork knuckles from the pot and let them rest for a few minutes.\n" +
                    "Serve the Eisbein / Grillhaxe with mustard and sauerkraut on the side.\n" +
                    "Note: Eisbein / Grillhaxe is traditionally served with hearty sides like sauerkraut, " +
                    "mashed potatoes, or bread dumplings. Enjoy!",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/grillhaxe.webp?alt=media&token=93208abc-92c6-4571-8799-16c0ae62a325",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))


                generalRecipies.add(generalrecipiemodel("Baklava", "Egypt", "45 mins",
            "FOR THE BAKLAVA\n" +
                    "16 oz package of Fillo Dough\n" +
                    "\n" +
                    "2 sticks butter (about 1 cup)\n" +
                    "\n" +
                    "½ cup shredded coconut\n" +
                    "\n" +
                    "¼ cup walnuts\n" +
                    "\n" +
                    "¼ cup pecans\n" +
                    "\n" +
                    "1/3 cup almonds\n" +
                    "\n" +
                    "½ cup pistachios\n" +
                    "\n" +
                    "FOR THE SYRUP\n" +
                    "3 cups sugar\n" +
                    "\n" +
                    "3 cups water\n" +
                    "\n" +
                    "½ lemon, squeezed for juice",

            "TO MAKE THE SYRUP\n" +
                    "Place the sugar, water and lemon juice in a pot on the stovetop. Mix well\n" +
                    "Turn heat to medium-high and allow the mixture to boil\n" +
                    "Boil until the mixture has a thick, “honey-like” consistency\n" +
                    "Remove from heat and set aside until ready to use\n" +
                    "TO MAKE THE BAKLAVA\n" +
                    "Preheat oven to 350 degrees\n" +
                    "Grind the pistachios in a food processor. Set aside until ready to use\n" +
                    "Next, grind the almonds, pecans, walnuts and coconut together in the food processor. Set aside for now\n" +
                    "Melt the butter completely in the microwave (should take about 1-2 minutes)\n" +
                    "Spread about three tablespoons of butter on the bottom of a 17 x 11 inch pan\n" +
                    "Roll out the fillo dough on a flat surface\n" +
                    "Take about 2-3 sheets of the fillo dough and place them flat in the pan. Using a brush (or your hands) spread butter evenly over the top fillo sheet\n" +
                    "Grab 2-3 more sheets of fillo dough and place them over the layer you just buttered. Repeat the buttering of the top layer again using a brush or your hands\n" +
                    "Repeat this step until you’ve gone through slightly more than half of the fillo dough package. This will be the bottom layer of your baklava. Save the rest of the fillo dough for later\n" +
                    "Next, cover the fillo dough you last buttered with the crushed nut mixture you processed earlier (the walnut, almond, coconut, pecan mixture only – NOT the pistachio mixture)\n" +
                    "Make sure the nut mixture is spread evenly\n" +
                    "Now, you’ll repeat steps 7-8 again to complete the top layers of your baklava. Again, just place 2-3 sheets of fillo dough over the crushed nut mixture and brush with butter, repeating until you have finished all the remaining fillo dough\n" +
                    "Cover the topmost layer of the baklava generously with butter\n" +
                    "Using a serrated knife, cut the baklava into even 2 x 2 squares\n" +
                    "Pour any remaining butter over the top so that it seeps through the cracks of the cuts you made\n" +
                    "Place in the oven and bake for about 25 minutes (bake time may vary depending on oven, Baklava should be a light golden brown when done)\n" +
                    "Once done baking, remove from oven and immediately pour the syrup you prepared earlier all over the baklava. Make sure to cover generously and evenly\n" +
                    "Lastly, sprinkle the crushed pistachios on each individual Baklava square",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/baklava.jpeg?alt=media&token=f9110ccf-54ff-4b77-9c5b-e11158594f81",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egypt.jpg?alt=media&token=5f8bf593-fe58-4aad-83a3-4742eaabda40"))

//        kenya section

                generalRecipies.add(generalrecipiemodel("Ugali", "Kenya", "15 mins",
            "2 cups white cornmeal (maize flour)\n" +
                    "4 cups water\n" +
                    "Salt, to taste",

            "Bring the water to a boil in a large pot.\n" +
                    "In a separate bowl, mix the cornmeal with 1 cup of cold water until smooth.\n" +
                    "Slowly pour the cornmeal mixture into the boiling water, stirring constantly with a wooden spoon to prevent lumps from forming.\n" +
                    "Reduce the heat to low and continue to stir the mixture until it thickens and starts to pull away from the sides of the pot.\n" +
                    "Cover the pot and let the Ugali simmer for about 10-15 minutes, stirring occasionally to prevent sticking.\n" +
                    "Once cooked, remove the pot from the heat and let the Ugali sit for a few minutes.\n" +
                    "Wet your hands with cold water and shape the Ugali into a ball or mound.\n" +
                    "Serve hot with your favorite stew or sauce.\n" +
                    "Note: Ugali is a staple food in many African countries and is often eaten with stews," +
                    " vegetables, or meats. It can also be enjoyed as a breakfast food with butter, jam, or honey.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/ugali.jpg?alt=media&token=f9d95807-9903-40c6-9970-d11d84a05696",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kenya.jpg?alt=media&token=d647919a-781b-4d6b-be82-da9e2ff675ec"))

                generalRecipies.add(generalrecipiemodel(" Sauerkraut", "Nambia", "1-2 weeks",
            "1 head of cabbage\n" +
                    "1 tablespoon salt",

            "Remove any outer leaves from the cabbage and set them aside.\n" +
                    "Cut the cabbage into quarters and remove the core.\n" +
                    "Thinly slice the cabbage into shreds.\n" +
                    "Place the shredded cabbage in a large mixing bowl.\n" +
                    "Sprinkle the salt over the cabbage.\n" +
                    "Using your hands, massage and squeeze the cabbage for about 5-10 minutes until it starts to release liquid.\n" +
                    "Transfer the cabbage and liquid into a clean glass jar or fermentation crock, pressing it down firmly.\n" +
                    "Pour any remaining liquid from the bowl into the jar.\n" +
                    "Place one of the reserved cabbage leaves on top of the shredded cabbage to keep it submerged in its own liquid.\n" +
                    "Cover the jar loosely with a clean cloth or fermentation lid.\n" +
                    "Allow the sauerkraut to ferment at room temperature for 1-2 weeks, depending on your desired level of sourness.\n" +
                    "Check the sauerkraut every few days, pressing down on the cabbage to keep it submerged in liquid.\n" +
                    "Once fermented to your liking, transfer the sauerkraut to a sealed container and refrigerate.\n" +
                    "Sauerkraut can be enjoyed as a side dish, added to sandwiches, or used in various recipes.\n" +
                    "Note: The fermentation process may produce a strong smell, but that is normal. " +
                    "Make sure to use clean utensils and containers during the preparation to " +
                    "avoid contamination.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/sauerkraut.webp?alt=media&token=81b960ec-b13f-4f3a-a884-54c8fe53b49c",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nambia.jpg?alt=media&token=e7a6a841-23ef-479b-9d9f-5c5670b410aa"))

                generalRecipies.add(generalrecipiemodel("Irio", "Kenya", "35 mins",
            "4 large potatoes, peeled and diced\n" +
                    "1 cup fresh or frozen peas\n" +
                    "1 cup fresh or frozen corn kernels\n" +
                    "2 cups finely chopped greens (such as kale, spinach, or collard greens)\n" +
                    "1 medium onion, finely chopped\n" +
                    "2 tablespoons vegetable oil\n" +
                    "Salt, to taste\n" +
                    "Black pepper, to taste",

            "Place the diced potatoes in a large pot and cover them with water. Bring the water to a boil and cook the potatoes until tender. Drain and set aside.\n" +
                    "In a separate pot, bring water to a boil and cook the peas and corn for about 5 minutes, or until they are tender. Drain and set aside.\n" +
                    "In a skillet, heat the vegetable oil over medium heat. Add the chopped onion and sauté until it becomes translucent.\n" +
                    "Add the chopped greens to the skillet and cook until they wilt and become tender. Remove from heat.\n" +
                    "In a large bowl, combine the cooked potatoes, peas, corn, and sautéed greens. Mash everything together using a potato masher or fork until well combined.\n" +
                    "Season the mixture with salt and black pepper to taste. Adjust the seasoning as needed.\n" +
                    "Serve the Irio warm as a side dish with your choice of main course.\n" +
                    "Note: Irio is often served with grilled or roasted meats, stews, or other Kenyan dishes. It can also be enjoyed on its own as a vegetarian dish. " +
                    "Feel free to customize the recipe by adding additional ingredients like carrots or spices to suit your taste.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/irio.jpg?alt=media&token=7ff1d6b6-2070-4e33-b4f8-90a7cad4108a",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kenya.jpg?alt=media&token=d647919a-781b-4d6b-be82-da9e2ff675ec"))

                generalRecipies.add(generalrecipiemodel(" Githeri", "Kenya", "2 hrs 30 mins",
            "2 cups dried beans (such as kidney beans or black-eyed peas)\n" +
                    "2 cups corn kernels (fresh or frozen)\n" +
                    "1 large onion, chopped\n" +
                    "2 medium tomatoes, chopped\n" +
                    "3 cloves garlic, minced\n" +
                    "2 tablespoons vegetable oil\n" +
                    "Salt, to taste\n" +
                    "Black pepper, to taste",

            "Rinse the dried beans and soak them in water overnight. Drain the beans and set them aside.\n" +
                    "In a large pot, bring the beans to a boil in enough water to cover them. Reduce the heat and let them simmer until they are tender. This usually takes about 1 to 1 1/2 hours.\n" +
                    "Add the corn kernels to the pot and continue to simmer for an additional 15-20 minutes, or until the corn is cooked.\n" +
                    "In a separate skillet, heat the vegetable oil over medium heat. Add the chopped onion and sauté until it becomes translucent.\n" +
                    "Add the chopped tomatoes and minced garlic to the skillet and cook until they soften and release their juices.\n" +
                    "Add the tomato mixture to the pot of beans and corn and stir well to combine.\n" +
                    "Season the Githeri with salt and black pepper to taste. Adjust the seasoning as needed.\n" +
                    "Let the Githeri simmer for another 5-10 minutes to allow the flavors to meld together.\n" +
                    "Serve the Githeri hot as a main dish or side dish.\n" +
                    "Note: Githeri is often served with a side of ugali or chapati bread. It can also be enjoyed on its own as a vegetarian dish." +
                    " Feel free to customize the recipe by adding additional ingredients like carrots, potatoes, or spices to suit your taste.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/githeri.jpg?alt=media&token=7d4921b7-4e1b-4a23-9e2b-33df5396c252",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kenya.jpg?alt=media&token=d647919a-781b-4d6b-be82-da9e2ff675ec" ))

                generalRecipies.add(generalrecipiemodel("Egyptian-beef-shawarma", "Egypt", "1 hr 30 mins",
            "EQUIPMENT\n" +
                    "Frying pan\n" +
                    "silicone spoon\n" +
                    "INGREDIENTS\n" +
                    "  \n" +
                    "Half kilo steak, cut into thin slices\n" +
                    "1 teaspoon paprika\n" +
                    "1 teaspoon black pepper\n" +
                    "1 Teaspoon salt\n" +
                    "1 pinch cinnamon\n" +
                    "1 teaspoon garlic powder\n" +
                    "1 teaspoon onion powder\n" +
                    "1 teaspoon seven spices\n" +
                    "2 tablespoons white vinegar\n" +
                    "4 tablespoons oil\n" +
                    "1 Large onion, sliced\n" +
                    "2 tomatoes, sliced\n" +
                    "4 fresh mint leaves\n" +
                    "1 Fresh parsley",

            "In a large bowl, put the meat and spices (salt - black pepper - cinnamon - paprika - garlic powder - onion powder - seven spices).\n" +
                    "Add two tablespoons of white vinegar\n" +
                    "Add two tablespoons of oil\n" +
                    "Stir the whole mixture and then put it in the refrigerator for at least an hour (the more time, the better)\n" +
                    "Put two tablespoons of oil in a frying pan and heat them well (the frying pan must be very hot so that there is no liquid from the meat)\n" +
                    "Put the meat in the pan and stir well for 10 minutes\n" +
                    "After ten minutes of stirring, the meat will have a slightly darker color (as in the picture).\n" +
                    "Place the shawarma in half of the pan and add the onion slices\n" +
                    "Add tomato slices to onions\n" +
                    "Stir the shawarma, onions and tomatoes, and leave them on the fire for 5 minutes\n" +
                    "Then add 4 leaves of fresh mint and stir in the shawarma\n" +
                    "Add parsley to shawarma\n" +
                    "Stir the parsley with shawarma for 5 minutes\n" +
                    "To make an Egyptian shawarma sandwich, you must put the tahini sauce first, then add the shawarma\n" +
                    "I add shawarma in the sandwich",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egyptianbeefshawarma.jpg?alt=media&token=68a95159-1815-4c14-892b-e453e932f8dd",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egypt.jpg?alt=media&token=5f8bf593-fe58-4aad-83a3-4742eaabda40"))

                generalRecipies .add(generalrecipiemodel("Matoke", "Kenya", "40 mins",
            "6-8 green bananas (also known as plantains)\n" +
                    "2 cups water\n" +
                    "1 large onion, chopped\n" +
                    "2 medium tomatoes, chopped\n" +
                    "3 cloves garlic, minced\n" +
                    "2 tablespoons vegetable oil\n" +
                    "Salt, to taste\n" +
                    "Black pepper, to taste",

            "Peel the green bananas and cut them into bite-sized pieces.\n" +
                    "In a large pot, bring the water to a boil. Add the banana pieces and let them simmer until they are tender. This usually takes about 20-30 minutes.\n" +
                    "In a separate skillet, heat the vegetable oil over medium heat. Add the chopped onion and sauté until it becomes translucent.\n" +
                    "Add the chopped tomatoes and minced garlic to the skillet and cook until they soften and release their juices.\n" +
                    "Add the tomato mixture to the pot of cooked bananas and stir well to combine.\n" +
                    "Season the Matoke with salt and black pepper to taste. Adjust the seasoning as needed.\n" +
                    "Let the Matoke simmer for another 5-10 minutes to allow the flavors to meld together.\n" +
                    "Serve the Matoke hot as a main dish or side dish.\n" +
                    "Note: Matoke is often served with a side of rice or chapati bread. It can also be enjoyed on its own as a vegetarian dish. " +
                    "Feel free to customize the recipe by adding additional ingredients like meat or spices to suit your taste.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/matoke.jpg?alt=media&token=8be1f823-63f3-44f4-8e29-fdab202e55df",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kenya.jpg?alt=media&token=d647919a-781b-4d6b-be82-da9e2ff675ec" ))


//        egypt section

                generalRecipies.add(generalrecipiemodel("Tamiya", "Egypt", "9 hrs 15 mins",
            "Main ingredients\n" +
                    "-\n" +
                    "1 pound (3 cups) dried fava beans, preferably skinless or Blanchard and Blanchard Frozen Fava Beans\n" +
                    "\n" +
                    "-\n" +
                    "6 to 8 scallions, minced\n" +
                    "\n" +
                    "-\n" +
                    "3 to 5 cloves garlic, crushed or 3-5 cubes Gefen Frozen Garlic\n" +
                    "\n" +
                    "-\n" +
                    "1/4 cup chopped cilantro or fresh parsley\n" +
                    "\n" +
                    "-\n" +
                    "1 to 2 teaspoons ground cumin\n" +
                    "\n" +
                    "-\n" +
                    "1 teaspoon Haddar Baking Powder\n" +
                    "\n" +
                    "-\n" +
                    "1/4 to 1/2 teaspoon cayenne\n" +
                    "\n" +
                    "-\n" +
                    "about 1 and 1/2 teaspoons salt\n" +
                    "\n" +
                    "-\n" +
                    "ground black pepper to taste\n" +
                    "\n" +
                    "-\n" +
                    "1 teaspoon ground coriander (optional)\n" +
                    "\n" +
                    "-\n" +
                    "all-purpose flour for coating\n" +
                    "\n" +
                    "-\n" +
                    "vegetable oil for deep-frying",

            "Prepare the Beans\n" +
                    "1.\n" +
                    "Soak the beans in water to cover overnight. Drain.\n" +
                    "\n" +
                    "2.\n" +
                    "If skinless beans are unavailable, rub to loosen the skins, then discard the skins. Pat the beans dry with a towel.\n" +
                    "\n" +
                    "Prepare the Fritters\n" +
                    "1.\n" +
                    "Grind the beans in a food mill or meat grinder. If neither appliance is available, process them in a food processor but only until the beans form a paste. (If blended too smoothly, the batter tends to fall apart during cooking.)\n" +
                    "\n" +
                    "2.\n" +
                    "Add the scallions, garlic, cilantro, cumin, baking powder, cayenne, salt, pepper, and coriander, if using. Refrigerate for at least 30 minutes.\n" +
                    "\n" +
                    "3.\n" +
                    "Shape the bean mixture into one-inch balls. Flatten slightly and coat with flour.\n" +
                    "\n" +
                    "4.\n" +
                    "Heat at least one and a half inches of oil over medium heat to 365 degrees.\n" +
                    "\n" +
                    "5.\n" +
                    "Fry the patties in batches, turning once, until golden brown on all sides, about 5 minutes.Remove with a wire mesh skimmer or slotted spoon.\n" +
                    "\n" +
                    "6.\n" +
                    "Serve as part of a meze or in pita bread with tomato-cucumber salad and tahina sauce.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/tamiya.jpg?alt=media&token=84fe1b53-a0fd-47b3-9a35-0306da0e7325",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egypt.jpg?alt=media&token=5f8bf593-fe58-4aad-83a3-4742eaabda40"))

                generalRecipies.add(generalrecipiemodel("Nyama choma", "Kenya", "30 mins",
            "2-3 pounds of meat (beef, goat, or lamb)\n" +
                    "1 tablespoon vegetable oil\n" +
                    "Salt, to taste\n" +
                    "Black pepper, to taste\n" +
                    "1 large onion, chopped\n" +
                    "3 cloves garlic, minced\n" +
                    "Juice of 1 lemon\n" +
                    "1/4 cup water",

            "Cut the meat into large pieces and place them in a large bowl.\n" +
                    "In a separate bowl, mix together the vegetable oil, salt, black pepper, chopped onion, minced garlic, and lemon juice to make a marinade.\n" +
                    "Pour the marinade over the meat and toss until the meat is well coated.\n" +
                    "Cover the bowl with plastic wrap and refrigerate for at least 2 hours or overnight to allow the flavors to develop.\n" +
                    "Preheat your grill or oven to high heat.\n" +
                    "If using a grill, skewer the meat onto metal or bamboo skewers. If using an oven, place the meat on a roasting rack.\n" +
                    "Grill or roast the meat for about 10-15 minutes on each side, or until it is cooked to your desired level of doneness.\n" +
                    "While the meat is cooking, mix together the remaining marinade with 1/4 cup of water to make a sauce.\n" +
                    "Serve the Nyama Choma hot off the grill or out of the oven with the sauce on the side.\n" +
                    "Note: Nyama Choma is often served with a side of ugali or chapati bread and a salad of sliced tomatoes and onions. It can also be enjoyed on its own as a flavorful and protein-packed dish. " +
                    "Feel free to customize the recipe by using your preferred type of meat or adding additional spices to suit your taste.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nyamachoma.jpg?alt=media&token=b79706a8-d17f-400c-aa7d-d71106b34518",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/kenya.jpg?alt=media&token=d647919a-781b-4d6b-be82-da9e2ff675ec"))





                generalRecipies.add(generalrecipiemodel("Boerewors (South African Sausage)", "South Africa", "2 hrs 38 mins",
            "2 lb beef roast, (top round roast or brisket), trimmed of sinew\n" +
                    "1 lb fatty pork shoulder/butt, or pork neck or belly\n" +
                    "1 Tbsp ground coriander seeds\n" +
                    "1 Tbsp salt\n" +
                    "½ tsp ground allspice\n" +
                    "½ tsp ground black pepper\n" +
                    "¼ tsp ground nutmeg\n" +
                    "1/8 tsp ground cloves\n" +
                    "¼ c malt vinegar\n" +
                    "hog casing for fresh sausage",

            "Preparing the Meat\n" +
                    "Cube the beef and pork into pieces that will fit easily into your meat grinder. Sprinkle the " +
                    "spices over meat and mix to coat. Cover the seasoned meat and refrigerate for at least 1 hour.\n" +
                    "After the meat has rested, follow the instructions that came with your meat grinder to grind the seasoned meat " +
                    "using the coarse grinding blade.*\n" +
                    "Add the vinegar to the ground meat and mix well. Stuffing the Sausage\n" +
                    "Thoroughly rinse (inside and out) one salted hog casing. Prepare the casing for stuffing as directed on the casing package.\n" +
                    "If using a Kitchen Aid, or similar, mixer, attach the thick sausage stuffer attachment to the meat grinder attachment.\n" +
                    "Place the entire casing onto the sausage stuffer attachment, leaving 4 inches hanging off the end. Tie a knot in this end of the casing to keep your sausage mixture from oozing out. Begin to stuff your casing as directed for your machine, moving slowly and being careful not to over-stuff the casing. (Don’t worry too much about unevenly stuffed sausage, we will take care of that later.)\n" +
                    "As you stuff the casing, coil the sausage onto a large plate. Stop stuffing when you only have 5-6 inches of casing left. Remove the casing from the sausage stuffer attachment.\n" +
                    "Before you knot the end, check the sausage for uneven areas. If you find any, gently even out the sausage mixture in the casing with your hands.\n" +
                    "Once the sausage is even to your liking, knot the end of the casing.\n" +
                    "If you still have additional sausage mixture (for us, this recipe made two 1.5 lb sausages), rinse and prepare another casing and stuff it as before.\n" +
                    "Once all your sausage mixture has been stuffed, refrigerate your sausages overnight " +
                    "(at least 12 hours) so that the flavors can come together before cooking. " +
                    "Cooking the Sausage\n" +
                    "The traditional way to cook boerewors is on the grill. Heat your grill to a medium-high heat (400F). (You should be able to hold your hand a few inches from the cooking grate for 4-5 seconds.) If desired, soak a large wooden skewer or two in water. Place the skewers through the sides of the sausage coil to make it easier to turn the sausage when it’s on the grill. If you like a little grilling adventure, cook the sausage coil loose.\n" +
                    "Place the boerewors onto the grill and cook for 4-5 minutes on the first side, until the color has changed and the sausage has nice grill marks. Flip the boerewors and cook for 3-4 minutes on the second side, until the sausage is firm.\n" +
                    "Remove the sausage from the grill and place on a large platter to serve." +
                    "Notes\n" +
                    "*If you don’t have a meat grinder, ask your butcher if he or she can grind your beef and pork for you. (Be sure to ask for a coarse grind.)" +
                    " Mix your butcher-ground meat with the spices, cover, and refrigerate for 1 hour. " +
                    "Then, continue with the recipe as directed." ,

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/boerewors.webp?alt=media&token=f818a192-4009-4aec-9c5f-870099895ed9",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058" ))

                generalRecipies.add(generalrecipiemodel("Mulukhiyah (Molokhia Soup)", "Egypt", "20 mins",
            "▢400 g frozen jute leaves 1 pack\n" +
                    "▢3 garlic cloves crushed\n" +
                    "▢½ onion\n" +
                    "▢2 tablespoon olive oil\n" +
                    "▢2 cups broth\n" +
                    "▢1 teaspoon cayenne pepper\n" +
                    "▢1 teaspoon black pepper\n" +
                    "▢1 teaspoon bouillon\n" +
                    "▢½ teaspoon salt or to taste",

            "If using fresh jute leaves, wash them and drain in a colander.\n" +
                    "Place the leaves in a blender and add about a cup of water. Blend till pureed and pour into a bowl.\n" +
                    "Chop the onions and garlic and sauté in olive oil till fragrant.\n" +
                    "Pour in chicken broth, and bring to a boil.\n" +
                    "Add in the jute leaves and cook for about 5 minutes. If using frozen, let it melt first, then simmer for 5 minutes.\n" +
                    "Add bouillon, cayenne pepper, black pepper, and salt and bring to a boil.\n" +
                    "Simmer for 5 more minutes and serve",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mulukhiyah.jpg?alt=media&token=3eb66ff9-8d2b-49e7-ae1b-4fed69569cba",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egypt.jpg?alt=media&token=5f8bf593-fe58-4aad-83a3-4742eaabda40"))

                generalRecipies.add(generalrecipiemodel("Stuffed Squab(pigeon)", "Egypt", "1 hr 50 mins",
            "Squabs with giblets -- 4 1-pound\n" +
                    "Lemon juice only -- 1\n" +
                    "Salt and pepper -- to season\n" +
                    "Butter or oil -- 3 Tablespoons\n" +
                    "Onions finely chopped -- 2\n" +
                    "Ground cinnamon -- 2 teaspoons\n" +
                    "Allspice- 1 teaspoon\n" +
                    "freekeh soaked 30 minutes in water to cover -- 2 cups (bulgur) can also be used\n" +
                    "Fresh mint chopped -- 1 Tablespoon\n" +
                    "Parsley chopped -- 1 Tablespoon\n" +
                    "Chicken broth -- 4 cups\n" +
                    "Salt and pepper -- to taste oil for deep frying optional",

            "Preheat oven to 350°F.\n" +
                    "Chop the giblets finely and set them aside.\n" +
                    "Squeeze the lemon juice over the squabs, season them inside and out with salt and pepper and set aside.\n" +
                    "Heat the butter or oil in a large skillet or saute pan over medium flame. Add the onions, chopped giblets and cinnamon," +
                    " allspice and saute until the onions are cooked through and translucent. Drain the freekeh or bulgur and squeeze out any extra moisture. Stir the freekeh or bulgur and the mint, parsley and salt and pepper into the onions.\n" +
                    "Remove from heat and stuff about 1/4 cup of the cracked wheat mixture into each squab. Set the remaining cracked wheat mixture aside.\n" +
                    "Sew the body cavity of each squab closed with a trussing needle and tie the legs together. Place the squabs, " +
                    "breast-side up in a large casserole dish or ovenproof pot. Pour 2 cups of the chicken stock over them and cover tightly with a lid or aluminum foil.\n" +
                    "Place the dish in the oven and braise for about 1 1/2 hours. Baste with the braising juices once or twice during this time.\n" +
                    "About 1/2 hour before you remove the squabs from the oven, bring the remaining chicken stock to a boil in a saucepan.\n" +
                    "Stir in the remaining cracked wheat mixture, cover tightly and reduce heat to low.\n" +
                    "Simmer for about 20 minutes, then remove from heat and let rest for about 10 minutes. When the birds are done braising either put them under the broiler to crisp up the skin or put them quickly in a deep fryer to do the same.\n" +
                    "To serve, fluff the reserved crack wheat with a fork and spread it over a heated serving platter. Remove the squabs from the oven and remove the trussing strings. Place the squabs neatly on the bed of cracked wheat and pour any braising juices over the squabs and wheat. Serve immediately.\n" +
                    "Hamam Mahshi Variations\n" +
                    "Stuffing Variations: Stir 1/2 cup of soaked and drained currants and/or 1/3 cup toasted pine nuts into the stuffing mixture for a fancier dish. Stir in a pinch of ground allspice, cloves or cardamom.\n" +
                    "Farrouj Mahshi (Stuffed chicken): Use 2 small (2-pound) " +
                    "chickens instead of squab and stuff each with 1/2 cup of the stuffing mixture. " +
                    "You may have to braised a bit longer to cook the chicken all the way through.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egyptsquab.jpg?alt=media&token=edc1e0c6-ab1e-48a5-a548-db8955b211ee",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egypt.jpg?alt=media&token=5f8bf593-fe58-4aad-83a3-4742eaabda40"))


                generalRecipies.add(generalrecipiemodel("Baba Ganoush", "Egypt", "30 mins",
            "EQUIPMENT\n" +
                    "Frying pan\n" +
                    "Food Chopper\n" +
                    "small bowl\n" +
                    "silicone spoon\n" +
                    "INGREDIENTS\n" +
                    "  \n" +
                    "1 kilo Big eggplant\n" +
                    "Half cup tahini\n" +
                    "2 tablespoons lemon juice\n" +
                    "1 tablespoons chopped red pepper\n" +
                    "3 tablespoons chopped dill\n" +
                    "Quarter cup water\n" +
                    "Quarter cup oil\n" +
                    "3 minced garlic cloves",

            "Wash the eggplant well and make some holes in it\n" +
                    "Put a frying pan on the fire and then put the eggplant on it to roast the eggplant\n" +
                    "Stir eggplant on all sides\n" +
                    "When the grilling is complete, put it on a plate and leave it to cool\n" +
                    "After the eggplant has cooled, remove the peel\n" +
                    "Put the peeled eggplant in a bowl\n" +
                    "Put the tahini, pepper, garlic, oil, lemon and water in a Food Chopper and mix them well\n" +
                    "Put the eggplant with the previous mixture and mix them a little\n" +
                    "Put the baba ganoush in a serving bowl, add two tablespoons of dill and mix well\n" +
                    "Add olive oil and a little dill to decorate the pope ganoush",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/babaganoush.jpg?alt=media&token=deff2d03-5d54-4d19-bd5c-b3f3e5b5864c",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/egypt.jpg?alt=media&token=5f8bf593-fe58-4aad-83a3-4742eaabda40"))


//        morocco section

                generalRecipies.add(generalrecipiemodel("Moroccan Couscous with Roasted Vegetables, Chick Peas and Almonds", "Morocco", "32 mins",
            "1 large red bell pepper, cored and diced\n" +
                    "2 medium carrots, halved through length and sliced fairly thin\n" +
                    "1 small red onion, diced into 1-inch chunks\n" +
                    "1 medium zucchini, halved through the length and sliced\n" +
                    "4 Tbsp olive oil, divided\n" +
                    "2 Tbsp fresh lemon juice\n" +
                    "2 tsp minced garlic (2 cloves)\n" +
                    "1 tsp ground cumin\n" +
                    "1 tsp ground coriander\n" +
                    "1/2 tsp ground cinnamon\n" +
                    "Salt\n" +
                    "1 1/3 cups dry couscous\n" +
                    "1 (14.5 oz) can low-sodium chicken broth\n" +
                    "1/2 tsp turmeric\n" +
                    "1/2 cup raisins\n" +
                    "1 (14 oz) can chick peas, drained and rinsed\n" +
                    "1/2 cup slivered almonds, toasted\n" +
                    "3 Tbsp minced fresh cilantro\n" +
                    "2 Tbsp minced fresh mint",

            "Preheat oven to 475 degrees. Spray a 18 by 13-inch rimmed baking sheet with non-stick cooking spray. Place bell pepper, carrots, onions and zucchini on baking sheet.\n" +
                    "Drizzle with 1 Tbsp olive oil and season with salt and toss to evenly coat. Roast in preheated oven about 15 minutes until tender, tossing once halfway through roasting.\n" +
                    "Then if desired move oven rack closer to broiler and broil for about 1 - 2 minutes to add a light char." +
                    "While vegetables are roasting, in a small mixing bowl whisk together remaining 3 Tbsp olive oil, lemon juice, garlic, cumin, coriander, cinnamon and season with 1/4 tsp salt, set aside.\n" +
                    "Bring chicken broth, 1/2 tsp salt and turmeric to a boil. Place couscous and raisins in a large mixing bowl, " +
                    "pour hot chicken broth over couscous and stir, cover bowl with plastic wrap and let rest for 5 minutes.\nAdd roasted vegetables, chick peas, almonds, cilantro, " +
                    "mint and lemon mixture to couscous and toss to evenly coat (while seasoning with a little more salt to taste as desired)." +
                    " Serve warm.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroccancouscous.jpg?alt=media&token=869b15ee-682f-4766-a450-001e663444ef",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroco.jpg?alt=media&token=087fe0be-f08a-4079-8330-e2ce1523e242"))

                generalRecipies.add(generalrecipiemodel("Tajine", "Morocco", " 2 hrs 5 mins",
            "For the chermoula paste\n" +
                    "2 red onions, chopped\n" +
                    "3 garlic cloves\n" +
                    "small knob fresh root ginger, peeled\n" +
                    "100ml/3½ fl oz lemon juice (about 3 lemons)\n" +
                    "100ml/3½ fl oz olive oil\n" +
                    "1 tbsp each honey, cumin, paprika, turmeric\n" +
                    "1 tsp hot chilli powder\n" +
                    "handful coriander, chopped\n" +
                    "For the tagine\n" +
                    "1 tbsp olive oil\n" +
                    "3 carrots, cut into chunks\n" +
                    "3 large parsnips, cut into chunks\n" +
                    "3 red onions, cut into chunks\n" +
                    "2large potatoes, cut into chunks\n" +
                    "4 leeks, ends trimmed and cut into chunks\n" +
                    "12 dried prunes, dates or figs\n" +
                    "2 sprigs mint, leaves only, finely chopped",

            "STEP 1\n" +
                    "To make the chermoula, whizz paste ingredients in a blender. Heat oven to 220C/fan 200C/gas 7. " +
                    "Tip the oil and vegetables into a heatproof casserole and cook on the hob until lightly browned, about 7 mins. " +
                    "You may have to do this in two batches.\n" +
                    "\n" +
                    "STEP 2\n" +
                    "Add the chermoula paste to the casserole, along with the dried fruit. Pour in 400ml water," +
                    " cover with a lid and cook in the oven for 45 mins. Reduce heat to 180C/fan 160C/gas 4 and cook for another 45 mins. " +
                    "Sprinkle with the mint. Serve on its own or with couscous or crusty bread.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/tainge.webp?alt=media&token=dc9f6e5d-be1c-421f-a3f0-8c58b9ed6b62",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroco.jpg?alt=media&token=087fe0be-f08a-4079-8330-e2ce1523e242"))

                generalRecipies.add(generalrecipiemodel("Harira", "Morocco", "2 hrs 15 mins",
            "8 oz. lamb, beef or chicken, diced\n" +
                    "3 tbsp vegetable or olive oil\n" +
                    "several soup bones (optional)\n" +
                    "2 lbs soft, ripe tomatoes - (about 6 large)\n" +
                    "1 handful dry chickpeas, soaked and peeled\n" +
                    "2 handfuls dry green or brown lentils\n" +
                    "1 large onion, grated\n" +
                    "1 stalk celery (with leaves), chopped\n" +
                    "1 small bunch flat leaf parsley, finely chopped\n" +
                    "1 small bunch cilantro, finely chopped\n" +
                    "1 tbsp smen (optional)\n" +
                    "1 tbsp salt\n" +
                    "1 tbsp ginger\n" +
                    "1.5 tsp black pepper\n" +
                    "1 tsp ground cinnamon - optional; see notes\n" +
                    "1/2 tsp turmeric\n" +
                    "3 tbsp tomato paste - combined with 1 or 2 cups water\n" +
                    "3 tbsp uncooked rice OR broken vermicelli\n" +
                    "1 cup flour - combined with 2 cups water\n" +
                    "lemon wedges and cilantro (optional) - for garnish",

            "Ahead of Time – Prep Ingredients\n" +
                    "Soak the chickpeas overnight. The next day, drain and peel them. This is easily done by pressing chickpeas one-by-one between your forefinger and thumb or by rubbing all of the chickpeas vigorously in a kitchen towel. " +
                    "(The prepped chickpeas may be be frozen until needed.)\n" +
                    "Pick through the lentils to remove any stones and debris; set aside until ready to use. \n" +
                    "Stew the tomatoes then pass them through a food mill to make a puree; discard the skins and seeds. Or, " +
                    "cut the tomatoes into quarters and process them, with or without skin, in a food processor until smooth. " +
                    "(The pureed tomatoes may be frozen until needed.)\n" +
                    "Grate the onion or process it to a thick pulp in a food processor. (The grated onion may be mixed with the pureed tomatoes " +
                    "and frozen until needed.)\n" +
                    "Wash the celery and finely chop it. Set aside. Remove and discard large pieces of stem from the parsley and cilantro. " +
                    "Wash the parsley and cilantro and leave to drain thoroughly before chopping finely by hand or in a food processor. (The chopped herbs may be mixed together and frozen until needed.)" +
                    "Make the Soup\n" +
                    "In a 6-quart or larger pressure cooker or stock pot, brown the meat in the oil over medium heat. Add the soup bones, peeled chickpeas, pureed tomatoes, grated onion, spices, smen (if using) and 3 cups (710 ml) of water. Bring to a boil, cover and cook with medium pressure for 25 minutes (or simmer for 50 to 60 minutes).\n" +
                    "Add the lentils, tomato paste mixture, chopped herbs and 8.5 cups (2 liters) water. Bring to a boil and cover.  Continue to step 3 or step 4.\n" +
                    "If planning to add rice, cook the soup with medium pressure for 30 minutes (or simmer for 60 minutes); add the rice, and continue cooking with pressure for another 15 minutes (or 30 minutes by simmering). \n" +
                    "OR if planning to add broken vermicelli, cook the soup with pressure for 45 minutes (or simmer for 90 minutes) before stirring in the broken vermicelli. " +
                    "Continue simmering for a few minutes until the vermicelli is tender. Taste and adjust seasoning. Thicken the soup to a silky, cream-like consistency by gradually adding the tedouira (flour and water mixture), stirring constantly to ensure that it’s well blended. Use only as much as is needed to make the soup as thick as you like. \n" +
                    "Simmer the soup for another 5 to 10 minutes, stirring occasionally and skimming off any foam that forms on the surface. \n" +
                    "Remove from the heat and serve. " +
                    "NOTES\n" +
                    "A skin will form on the soup as it cools. This can be stirred and blended back into the soup.\n" +
                    "When reheating the soup, use medium or low heat and stir frequently to avoid lentils sticking to the bottom of the pot and burning.\n" +
                    "If you’d like to freeze the soup, do so before adding the thickener and preferably before adding the rice or broken vermicelli. Allow it to cool completely before freezing. On the day of serving, thaw the soup over low heat then resume cooking from where you left off. \n" +
                    "Cinnamon is optional and can be omitted. While many Moroccan cooks use it when making harira, not everyone likes it. On a personal note, I do prefer harira with a small amount of cinnamon as indicated in the recipe. It’s very subtle and complementary to the overall flavor of the soup when used conservatively.\n" +
                    "Lemon wedges may be served on the side for those who like a squeeze of fresh " +
                    "lemon juice as a condiment for the soup. If desired, garnish with a little fresh parsley or cilantro.\n" +
                    "Blending the flour and water tedouira ahead of time will help ensure that it’s lump-free when adding it to the soup.\n" +
                    "To make gluten-free harira, you can use cornstarch, tapioca starch," +
                    " or another substitute for the flour to thicken the soup at the end of cooking.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/harira.webp?alt=media&token=d499c1d4-9ad4-4e4a-9595-29e1b895e5f0",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroco.jpg?alt=media&token=087fe0be-f08a-4079-8330-e2ce1523e242"))

                generalRecipies.add(generalrecipiemodel("Zaalouk", "Morocco", " 1 hrs 5 mins",
            "For the Salad:\n" +
                    "\n" +
                    "1 large eggplant, peeled and coarsely chopped\n" +
                    "4 large tomatoes, peeled, seeded, and chopped\n" +
                    "3 cloves garlic, finely chopped\n" +
                    "1/4 cup coarsely chopped fresh cilantro\n" +
                    "1/4 cup coarsely chopped fresh parsley\n" +
                    "1 tablespoon paprika\n" +
                    "1 tablespoon cumin\n" +
                    "1 1/2 teaspoons salt\n" +
                    "1/4 cup extra-virgin olive oil\n" +
                    "1/3 cup water\n" +
                    "1/8 teaspoon cayenne pepper, more to taste, optional\n" +
                    "1 lemon wedge, optional\n" +
                    "For Serving:\n" +
                    "\n" +
                    "Extra-virgin olive oil, or chili oil\n" +
                    "1 loaf crusty bread",

            "Gather the ingredients Combine eggplant, tomatoes, garlic, cilantro, parsley, paprika, cumin, salt, oil, water, and cayenne in a large deep skillet or pot. " +
                    "Cover and simmer over medium to medium-high heat for 30 minutes, stirring occasionally. With a spoon or potato masher, crush and blend tomatoes and eggplant." +
                    "Add lemon wedge to the pot, if using. Continue simmering mixture, uncovered, for 10 minutes. " +
                    "The lemon will give a tangy nuance but is not necessary. The zaalouk is ready when " +
                    "liquids are reduced and mixture can be stirred into a heap in the center of the pan." +
                    " Drizzle olive oil—or chile oil if you like spicy food. Serve with sliced crusty bread.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zaalouk.webp?alt=media&token=377fa112-9a76-4226-9271-a2dcb8dd8bf4",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroco.jpg?alt=media&token=087fe0be-f08a-4079-8330-e2ce1523e242"))

                generalRecipies.add(generalrecipiemodel(" Bulfaf", "Morocco", "55 mins",
            "2.2 lbs lamb or beef liver\n" +
                    "1.1 lbs thin layer of sheep's caul fat, - washed and dried\n" +
                    "Seasonings\n" +
                    "2 tsp ground cumin, - freshly ground is best\n" +
                    "2 tsp sweet paprika\n" +
                    "1/2 tsp cayenne pepper - or to taste, optional\n" +
                    "1 1/2 tsp salt, - or to taste\n" +
                    "1/2 tsp ground coriander seeds, - optional 2.2 lbs lamb or beef liver\n" +
                    "1.1 lbs thin layer of sheep's caul fat, - washed and dried\n" +
                    "Seasonings\n" +
                    "2 tsp ground cumin, - freshly ground is best\n" +
                    "2 tsp sweet paprika\n" +
                    "1/2 tsp cayenne pepper - or to taste, optional\n" +
                    "1 1/2 tsp salt, - or to taste\n" +
                    "1/2 tsp ground coriander seeds, - optional",

            "Prepare the Grill and Liver\n" +
                    "Preheat your grill. If you are using charcoal, make sure it burns until the coals are covered with grey ash and the flames have calmed down. This is the way to avoid burning the outer layer while inside hasn't cooked yet.\n" +
                    "Remove any membrane surrounding the liver. (There is usually more membrane on beef liver than sheep liver.) \n" +
                    "Wash the liver and pat dry. Slice it into 3/4\" (2 cm) thick slabs or steaks. \n" +
                    "Once the grill is ready, sear the liver on each side for about 2 minutes. This step helps firm up the liver and gives it more flavor.\n" +
                    "Cut the seared liver into 3/4\" (2 cm) cubes and toss them with half of the seasoning. Set aside." +
                    "Make the Boulfaf\n" +
                    "Cut the caul fat into thin strips about 3 1/2\" x 3/4\" (9 cm x 2 cm). Toss the strips of fat with the remaining seasoning. (optional)\n" +
                    "Roll a cube of seasoned liver with a single strip of caul fat and thread it onto the skewer, piercing the cube where the strip of caul fat overlaps. Repeat, allowing 6 to 8 wrapped cubes of liver per skewer.\n" +
                    "Grill the liver brochettes for 3 to 4 minutes per side, or until the fat begins to turn transparent and the liver is fully cooked but tender to the touch. " +
                    "No red juice should be left." +
                    "Serve the Boulfaf\n" +
                    "Serve the boulfaf while hot from the grill with extra seasoning on the side. Mint tea is a traditional accompaniment; some say a hot beverage is necessary for proper digestion.\n" +
                    "Boulfaf can be eaten directly form the skewer or enjoyed as a sandwich, with or without the caul fat." +
                    "NOTES\n" +
                    "If you find your strips of caul fat are breaking apart while working with them, dip them into a little water. This softens them and makes wrapping easier.\n" +
                    "It's preferable to work with thin strips of caul fat as they are easy to fold around the liver. " +
                    "The thicker strips can be cut into squares and inserted between cubes of " +
                    "liver if you are really not lucky in finding thin caul fat.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/liverkebabs.webp?alt=media&token=c6da1139-dea3-4d85-ae6f-8688f2e9bcf4",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroco.jpg?alt=media&token=087fe0be-f08a-4079-8330-e2ce1523e242"))



                generalRecipies.add(generalrecipiemodel("Rfissa(Chicken With Lentils)", "Morocco", "2 hrs 30 mins",
            "Rfissa Ingredients\n" +
                    "  Chicken (Cut in to pieces) (Alternatively use 4 chicken legs cut as 4 thighs and 4 drumsticks with skin removed)\n" +
                    "100 g Green Lentils \n" +
                    "2 tbsp Fenugreek Seeds \n" +
                    "3  Large Onions sliced \n" +
                    "1/2 tsp Ginger Powder \n" +
                    "1 tbsp Turmeric \n" +
                    "10  Safron Strands \n" +
                    "1/2 tsp Ras El Hanout \n" +
                    "2 tbsp Olive oil \n" +
                    "Some  Clarified butter for cooking (use normal butter as an alternative)\n" +
                    "Some  Chopped Parsley and Coriander for Garnish \n" +
                    "4  Eggs (Optional)\n" +
                    "Bread Base Ingredients\n" +
                    "250 g Plain Flour \n" +
                    "100 g Fine Semolina \n" +
                    "1 tsp Salt \n" +
                    "  Water \n" +
                    "  Oil for cooking ",

            "Marinate the chicken\n" +
                    "Step 1\n" +
                    "Mix the Ginger Powder, Turmeric, Ras El Hanout, Safran strands, Oil, some salt (1/2 tsp) and pepper.\n" +
                    "Step 2\n" +
                    "If not done already, cut the chicken in to large pieces, and marinate with the mixture made in the previous step, and leave in the fridge whilst preparing the bread.\n" +
                    "Making the bread\n" +
                    "Step 3\n" +
                    "Place flour, semolina and salt in a mixing bowl (I used my kitchen aid mixer for this). Then slowly add water whilst mixing until a dough is formed.\n" +
                    "Step 4\n" +
                    "Prepare either a large tray or flat bowl by adding some oil on the bottom surface. Divide the dough into balls about the size of a walnut, I found this to be around 30g each. Then place on to the tray, rolling it round to coat the outside with oil.\n" +
                    "Step 5\n" +
                    "Once divided, cover the tray with cling film (plastic wrap), and leave to rest for 30 minutes or so. Gives you the opportunity to have a rest for a bit :) Alternatively, if you're going to add boiled eggs, this would be your opportunity. For me, I put the on from cold, and time for 6 minutes once the water is boiling. After drawing the water and fill the pan with cold to stop further cooking.\n" +
                    "Step 6\n" +
                    "Pre-heat a frying pan on a medium-high heat.\n" +
                    "Step 7\n" +
                    "Next, add some more oil to a working surface, and taking two balls of dough at time, press each out carefully to a circle roughly about 10cm is diameter, then layer one on top of the other. Continue to slowly press out the dough to form a circle where the dough becomes translucent and is about the size of a frying pan. The technique is similar to making Smemen (a moroccan bread), but with the two layers, not folded, so you might want to check out the video at: https://www.youtube.com/watch?v=t50V0P76IwE\n" +
                    "Step 8\n" +
                    "Add some oil to the pan, and lay in the circle of dough. The aim is not to make this crispy or dried out, you just want it to the point where the dough is cooked, slightly browned on each side but remaining flexible and stretchy.\n" +
                    "Step 9\n" +
                    "As you remove them from the pan, you want to pull the two layers apart so you get two separate discs again. If you've done everything technically right, it shouldn't be too difficult. I used tongs for this, because otherwise it's pretty hot.\n" +
                    "Step 10\n" +
                    "When the bread is cooled, you want to roll the discs up, and then slice at about the width of Tagliatelle and place in the bottom of a large serving dish.\n" +
                    "The chicken\n" +
                    "Step 11\n" +
                    "Slice the onions in preparation.\n" +
                    "Step 12\n" +
                    "Heat a large casserole dish, add the clarified butter, and then fry off the chicken until slightly golden.\n" +
                    "Step 13\n" +
                    "Add the onions and mix so that they get heated. Do this occasionally until all of the onions have softened, this will take about 10-15 minutes.\n" +
                    "Step 14\n" +
                    "Add lentils and fenugreek seeds, plus around 800ml - 1l of water. Bring to a boil, then reduce the temperature to allow this to simmer. Allow water to reduce and form a sauce.\n" +
                    "Step 15\n" +
                    "(Personal step) - remove the chicken from the sauce to avoid breaking it as it should be deliciously tender. Then slowly mix in salt to taste. Then you can add back the chicken.\n" +
                    "Step 16\n" +
                    "Finally pour the chicken and sauce over the bread, garnish with some parsley and coriander. " +
                    "Enjoy :) If you made hard boiled eggs, then cut them in half and use to decorate.\n",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/risffa.webp?alt=media&token=b476f90d-5bb0-4646-a349-c48d89b025fe",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroco.jpg?alt=media&token=087fe0be-f08a-4079-8330-e2ce1523e242"))

                generalRecipies.add(generalrecipiemodel("Akara (Fried Black-Eyed Peas Cake)", "Nigeria", "2 hrs 20 mins",
            "1 cup dried black eyed peas (6 3/4 ounces; 190g), picked of any debris and rinsed\n" +
                    "1/4 large red onion (about 2 1/2 ounces; 75g), roughly chopped \n" +
                    "1/3 fresh habanero or Scotch bonnet pepper, stemmed\n" +
                    "1 teaspoon (3g) Diamond Crystal kosher salt; for table salt use half as much by volume or the same weight\n" +
                    "Vegetable oil, for frying (about 2 cups; 475ml)  \n" +
                    "Soft white bread, for serving\n",

            "In a medium bowl, cover peas with 2 inches cold water. " +
                    "Let soak at room temperature for at least 15 minutes and up to 1 hour (this short soaking time helps loosen the skins without overly softening the peas). \n" +
                    "\n" +
                    "Drain soaked peas, then transfer to a countertop blender or food processor along with 1 quart (945ml) water." +
                    " Pulse to slightly break up peas, about ten 1-second pulses. Pour into a medium bowl and let stand at room temperature for up to 30 minutes (skins will float to top as they separate from the peas).\n" +
                    "\n" +
                    "Set a colander over a large bowl. Slowly pour soaking water into the colander while using a free hand to keep the peas in the soaking bowl; the goal is to pour off as many of the floating skins as possible while leaving the peas behind. " +
                    "Pick out any peas that landed in the colander and return them to the bowl, then discard skins and soaking water. Cover peas with water, and repeat process until peas are nearly free of skins (you may need to gently massage the peas with your hands to separate any stubborn skins).\n" +
                    "\n" +
                    "Two image collage. Top: A hand pressing down on the peas in a glass bowl as it strains the water and shells out. Bottom: Strained peas in a glass bowl\n" +
                    "Serious Eats / Maureen Celestine\n" +
                    "Transfer skinned peas to a clean colander, rinse under cool running water, then return to medium bowl. " +
                    "Add fresh water to cover and let stand at room temperature for 10 minutes (this will further soften the peas for blending).\n" +
                    "\n" +
                    "Drain peas, then transfer to a countertop blender or food processor. " +
                    "Add 1/2 cup (120ml) water, onion, chile pepper, and salt. Blend, scraping down sides occasionally with a flexible spatula, until a smooth, thick paste has formed, about 3 minutes. Transfer paste to a medium bowl and whisk until light and fluffy, about 3 minutes.\n" +
                    "\n" +
                    "Line a rimmed baking sheet with paper towels. In a wok or Dutch oven, heat two inches of oil over medium-high heat to 350°F (175°C). Dip a heatproof spoon into the hot oil, scoop up roughly 1 tablespoon of batter, then carefully lower spoonful of batter into oil until batter is submerged and releases from spoon. It can be formed into a little football shape by molding the batter as it slides off the side of the spoon into the hot oil (rather than allowing the batter to spread as it slides off the spoon). " +
                    "Working quickly, repeat the process with 7 more scoops of batter (for a batch of 8). Fry, using a slotted spoon or spider to turn pieces halfway through, until akara are slightly puffed and golden brown on both sides, about 6 minutes. Transfer to prepared baking sheet to drain. \n" +
                    "\n" +
                    "Return oil to 350°F (175°C), and repeat with remaining batter. Serve fritters warm with soft white bread.\n" +
                    "\n" +
                    "Akara piled on a dark blue bowl next to a plate of white bread and a smaller server plate with akara.\n" +
                    "Serious Eats / Maureen Celestine\n" +
                    "Special Equipment\n" +
                    "Countertop blender or food processor.\n" +
                    "\n" +
                    "Make-Ahead and Storage\n" +
                    "Akara batter can be refrigerated in an airtight container for up to 3 days or frozen for up to 1 month. " +
                    "To defrost, transfer to the refrigerator at least 6 hours before using. When ready to fry, whisk to loosen and aerate batter, then proceed as directed in Step 6. \n" +
                    "\n" +
                    "Fried akara can be refrigerated in an airtight container for up to 5 days, or frozen for up to 1 month (defrost in the refrigerator overnight). To reheat, preheat oven to 320°F (160°C). Transfer akara to a rimmed baking sheet and heat until warm, about 10 minutes if refrigerated, or about 20 minutes if previously frozen.\n",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/akara.webp?alt=media&token=c9b6335d-b7d5-40dc-a9f9-60fd09cbbe57",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/nigeria.jpg?alt=media&token=2836e5ff-2019-4baf-8068-c0e963578daa"))

                generalRecipies.add(generalrecipiemodel("Pastela", "Morocco", "55 mins",
            "ALMOND FILLING\n" +
                    "\n" +
                    "▢2 cups almonds slivered and blanched\n" +
                    "▢2 tablespoons vegetable oil\n" +
                    "▢1/2 cup powdered sugar\n" +
                    "▢2 tablespoons orange blossom water\n" +
                    "▢2 tablespoons butter softened\n" +
                    "▢1/2 teaspoon ground cinnamon\n" +
                    "CHICKEN FILLING\n" +
                    "▢2 lbs chicken thighs boneless/skinless\n" +
                    "▢1 tablespoon vegetable oil\n" +
                    "▢2 teaspoons Ras el Hanout\n" +
                    "▢1 1/2 teaspoon kosher salt 1 teaspoon pepper\n" +
                    "▢1 teaspoon ground turmeric\n" +
                    "▢1 teaspoon ground cinnamon\n" +
                    "▢1/8 teaspoon saffron threads\n" +
                    "▢1 medium yellow onion finely sliced\n" +
                    "▢3 cloves garlic minced\n" +
                    "▢1/4 cup parsley chopped\n" +
                    "▢5 eggs\n" +
                    "▢1 lb filo sheets\n" +
                    "▢8 tbsp butter melted\n" +
                    "DECORATION\n" +
                    "▢powdered sugar\n" +
                    "▢ground cinnamon",

            "ALMOND MIXTURE\n" +
                    "In a large skillet heat the oil over medium heat. Stir and cook almonds until golden brown. Remove from skillet with slotted spoon, reserving oil in skillet, to a paper towel lined plate.\n" +
                    "Transfer the fried almonds to a food processor and add the powdered sugar, cinnamon, orange blossom water, and softened butter. Pulse all the ingredients together until a loose, wet crumb mixture. Set aside.\n" +
                    "CHICKEN FILLING\n" +
                    "In a small bowl mix together the Ras el Hanout, cinnamon, salt, black pepper, turmeric and saffron threads.\n" +
                    "Place the chicken in a Ziploc bag and add the spices. Seal and toss to coat, rubbing spices on chicken." +
                    "Heat the reserved oil and add the other tablespoon of oil in skillet over medium-high heat. Add the chicken and brown on both sides for about 6 minutes total. Remove the chicken from the pan and set aside to cool. When easy to handle, dice the chicken and set aside.\n" +
                    "In the same skillet, add the onion slices and garlic. Cook over medium heat, tossing until softened. Return the chicken pack to the skillet along with parsley and Stir. Cook over medium-high heat for about 10 minutes or until the chicken is fully cooked through. Season to taste.\n" +
                    "Beat 4 of the eggs together and slowly pour over the chicken mixture. Turn heat to low and carefully stir through to coat the chicken, " +
                    "cooking as eggs thicken and coat chicken. Remove from the heat and let cool." +
                    "ASSEMBLY / BAKE\n" +
                    "Preheat oven to 375°F. Prepare a 10-inch pie dish or heat-safe skillet and coat with oil or cooking spray.\n" +
                    "Take 2 sheets of phyllo dough and drape over center of baking dish. Gently press in to mold bottom and sides, then brush with melted butter. " +
                    "Repeat same 4 more times leaving overhang on " +
                    "4 sides by starting a little off center each time then rotate dish." +
                    "Spread the almond mixture on top of the buttered phyllo sheets, carefully spreading to edges and cover again with 2 more sheets of phyllo. Brush with butter, layer 2 more sheets of phyllo and brush with butter. Top with chicken mixture, carefully spreading to edges. Cover again with 2 more sheets of phyllo in center. Carefully fold the hanging phyllo edges up and over the center. Gently press them down and brush one more time with melted butter. Whisk remaining egg and brush all over the pastilla (See Note 1).\n" +
                    "Bake on the center rack of your heated oven for 20 minutes or until the phyllo is golden brown. Remove from oven and let cool a few minutes. Using a spatula, carefully run it around the rim and edges of the phyllo to release if stuck. Place a baking sheet on top and quickly flip to release pastilla on the baking sheet. Place in oven to brown the flat top (that used to be the bottom) for 5 minutes.\n" +
                    "Remove from oven and let rest 5 minutes. Using a spatula, lift the pastilla to a serving plate. Sprinkle the top with powdered sugar and make lines of cinnamon if " +
                    "desired for pattern (as pictured). Serve warm.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroccanpastilla.jpg?alt=media&token=b2b839eb-26ca-4814-8799-5211827a474d",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/moroco.jpg?alt=media&token=087fe0be-f08a-4079-8330-e2ce1523e242"))


                generalRecipies.add(generalrecipiemodel("Bobotie", "South Africa", "1 hr 20 mins",
            "For the curried mince\n" +
                    "3 slices bread, crusts removed - This is based on 3 slices of shop-cut bread. If you are cutting the bread yourself, 1 x slice of about 3cm thickness will do. You can use white or brown bread\n" +
                    "350 millilitre milk\n" +
                    "2 tablespoons vegetable oil\n" +
                    "2 teaspoons butter\n" +
                    "2 sliced onions\n" +
                    "2 garlic cloves - or 1 teaspoon garlic paste\n" +
                    "2 tablespoons mild curry powder\n" +
                    "2 tablespoons fruit chutney, heaped\n" +
                    "2 tablespoons apricot jam\n" +
                    "1 tablespoon Worcester Sauce\n" +
                    "1 teaspoon turmeric\n" +
                    "2 tablespoons red wine vinegar\n" +
                    "1 kilogram beef mince\n" +
                    "100 millilitre sultanas\n" +
                    "1.5 teaspoons salt\n" +
                    "1 beef stock cube, crumbled\n" +
                    "1 egg, lightly beaten\n" +
                    "For the savoury custard topping\n" +
                    "2 eggs\n" +
                    "1 pinch salt\n" +
                    "1 pinch turmeric\n" +
                    "6 bay leaves",

            "Prepare the bread\n" +
                    "Roughly tear the crustless bread into pieces. Place it in a bowl and cover with the milk.\n" +
                    "Leave this to soak while you get on with the rest of the Bobotie.\n" +
                    "3 slices bread, crusts removed,350 millilitre milk\n" +
                    "Prepare the curried mince\n" +
                    "Switch the oven on to pre-heat at 180C/356F (160C fan/320F fan).\n" +
                    "Heat the oil and butter in a large pan and add the chopped onions and garlic.\n" +
                    "Gently fry over medium heat until the onions are soft and translucent\n" +
                    "2 tablespoons vegetable oil,2 teaspoons butter,2 sliced onions,2 garlic cloves\n" +
                    "At this point, add the curry powder, chutney, apricot jam, Worcester sauce, turmeric and red wine vinegar and stir together.\n" +
                    "Gently fry whilst stirring for 1-2 minutes until everything is heated through.\n" +
                    "2 tablespoons mild curry powder,2 tablespoons fruit chutney, heaped,2 tablespoons apricot jam,1 tablespoon Worcester Sauce,1 teaspoon turmeric,2 tablespoons red wine vinegar\n" +
                    "Revisit the bread that's now been soaking in the milk for a few minutes.\n" +
                    "Drain the bread from the milk and mash it with a fork.\n" +
                    "Retain the milk because you will use this for your savoury egg custard topping.\n" +
                    "Add the mince together with the mashed bread and sultanas to the spicy onion mix in the pan.\n" +
                    "1 kilogram beef mince,100 millilitre sultanas\n" +
                    "Also add the salt and crumble the beef stock cube into the pan. Give it a good mix and gently fry, whilst stirring, until the mince has lost its pinkness.\n" +
                    "1.5 teaspoons salt,1 beef stock cube, crumbled\n" +
                    "Remove from the heat and stir in the lightly beaten egg.\n" +
                    "1 egg, lightly beaten\n" +
                    "Spoon the meat mixture into a greased oven dish of about 30cm x 20cm and smooth the top.\n" +
                    "Prepare the savoury custard topping\n" +
                    "Break the two remaining eggs into the leftover milk together with a pinch of salt and a pinch of turmeric. Whisk well until the yolks are broken up and well mixed in.\n" +
                    "2 eggs,1 pinch salt,1 pinch turmeric\n" +
                    "Gently pour the mixture over the top of the meat and place the bay leaves on top. Try to space them out equally in a pattern of your choice.\n" +
                    "6 bay leaves\n" +
                    "Bake on the middle shelf of the oven for 50 minutes to 1 hour.\n" +
                    "The cooking time is a good guide, but ensure you have a bit of a crispy edge on the sides, as that's the best bit of a well-baked Bobotie!\n" +
                    "An extra few minutes in the oven to crisp up the sides is not a problem.\n",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/bobotie.webp?alt=media&token=15033747-8124-4d2d-a741-3ff27e496cb4",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058" ))

                generalRecipies .add(generalrecipiemodel(" Mupunga Une Dovi (Peanut Butter Rice)", "Zimbabwe", "10 mins",
            "\n" +
                    "1 cup long grain rice \n" +
                    "Salt\n" +
                    "1 tbsp peanut butter ",

            "Cook the rice following the instructions on the packet, omitting the oil.\n" +
                    "Add 1/2 cup of water and the peanut butter and let it cook some more. You want your rice to be slightly overcooked.\n" +
                    "Cover and let the peanut butter cook for about 10 minutes.\n" +
                    "Using a flat wooden spoon or mugoti, stir in the peanut butter until the rice is well bonded together.\n" +
                    "Reduce the heat to low and cover for 10 minutes or until ready to serve.\n" +
                    "Serve with any stew or sauce of your liking or by itself. " +
                    "This rice is especially good the next morning, cold with a cup of tea.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/mupunga.webp?alt=media&token=c81400e1-e822-4ef2-9761-d2589f86558f",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/zimbabwe.jpg?alt=media&token=3e4aaabf-773b-42cb-8a12-b85f3a2d7a63"))




                generalRecipies.add(generalrecipiemodel("Chakalaka ", "South Africa", "40 mins",
            "3\n" +
                    "medium onions, diced\n" +
                    "3\n" +
                    "medium carrots, diced\n" +
                    "2\n" +
                    "medium green bell peppers, diced\n" +
                    "3\n" +
                    "medium tomatoes, diced\n" +
                    "curry powder, to your taste\n" +
                    "salt, to taste\n" +
                    "pepper, to taste\n" +
                    "green chili (optional)\n" +
                    "1\n" +
                    "vegetable bouillon cube\n" +
                    "1\n" +
                    "teaspoon chili powder\n" +
                    "1 -2\n" +
                    "tablespoon oil, for frying\n" +
                    "1⁄4\n" +
                    "cup water",

            "Fry the onion and pepper together with oil in a large skillet until the onion is clear.\n" +
                    "Add the grated carrots, tomatoes, water, " +
                    "and all the seasonings to your liking and cook for about 15-20 minutes.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/chakalaka.jpg?alt=media&token=38683fea-3255-4b46-ad3e-15832c8c8513",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058" ))



                generalRecipies.add(generalrecipiemodel("Bunny Chow", "South Africa", "1 hr",
            "1 pound chicken thighs or breast cut in bite-sized pieces\n" +
                    "1/2 cup canola or cooking oil\n" +
                    "2-3 Curry leaves\n" +
                    "1 teaspoons minced ginger\n" +
                    "2 teaspoons minced garlic\n" +
                    "1 Tablespoon curry powder or more\n" +
                    "1 medium onion diced\n" +
                    "2 medium tomatoes diced\n" +
                    "1 cinnamon stick\n" +
                    "1 1/2 teaspoon paprika\n" +
                    "3 green cardamom pods lightly crushed\n" +
                    "8 ounce or less potatoes cleaned and cut into cubes\n" +
                    "1 15 ounce can chickpeas rinsed and drained\n" +
                    "½ teaspoon cayenne pepper optional\n" +
                    "11/2 cup or more chicken broth or water\n" +
                    "Salt and pepper to taste",

            "When ready to cook, heat up large Sauce- pan with oil, and add onions, garlic,ginger, cinnamon stick, curry leaves, cardamom pods and curry powder, stir occasionally for about 2-3 minutes until onions is translucent.\n" +
                    "Add tomatoes followed by chicken, stir and sauté for about 2-3 more minutes. Add chicken stock/ water if necessary to prevent any burns\n" +
                    "Next add chickpeas, potatoes and chicken broth , about 1 1 1/2 cup , add more as needed. Bring to a boil and let it simmer until sauce thickens, it might take about 25 minutes or more\n" +
                    "Adjust for salt, pepper and stew consistency.",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/bonny.jpeg?alt=media&token=c351e0f4-a35d-4d42-bca3-e2c83847eef0",

            "https://firebasestorage.googleapis.com/v0/b/de-kitchen.appspot.com/o/southafrican.jpg?alt=media&token=35e18b8d-50ae-4710-8072-e8d62636d058" ))



        val dbref = FirebaseDatabase.getInstance()
        val reciperef = dbref.getReference("recipies")

        val mprecipies = reciperef.child("mostpopularRecipies")

        mprecipies.removeValue()


        recipies.forEachIndexed { index, mostpopularmodel ->
            mprecipies.child("recipie${index + 1}").setValue(mostpopularmodel)
        }

        val gnRecipies = reciperef.child("generalRecipies")

        gnRecipies.removeValue()

        generalRecipies.forEachIndexed { index, generalrecipiemodel ->
            gnRecipies.child("gnRecipie${index + 1}").setValue(generalrecipiemodel)
        }



    }

//    fun addImageUrlToFirestore(downloadUrl: String) {
//        val firestore = FirebaseFirestore.getInstance()
//
//        val data = hashMapOf(
//            "imageUrl" to downloadUrl
//        )
//
//        firestore.collection("images").add(data)
//            .addOnSuccessListener { documentReference ->
//                // Image URL added to Firestore successfully
//            }
//            .addOnFailureListener { exception ->
//                // Handle any errors that occurred during the Firestore operation
//            }
//    }
   }



