package com.chrys.de_africankitchen.models

data class mostpopularmodel(
    var name : String,
    var region : String,
    var duration : Any,
    var ingredients : String,
    var methods : String,
    var images: String,
    var countryImg : String
) {
    constructor() : this("", "", "", "", "", "", "")
}
