package com.chrys.de_africankitchen.models

data class generalrecipiemodel(
    var name : String,
    var country : String,
    var duration : Any,
    var ingredients : String,
    var methods : String,
    var images: String,
    var countryImg : String

) {
    constructor() : this ("", "", "", "", "","", "")
}
