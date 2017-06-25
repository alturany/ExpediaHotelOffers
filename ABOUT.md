## About Project

I have picked java since it has been almost 12 years of being Java developer.

[Heroku link](https://expedia-hotel-offer2.herokuapp.com/ )

[Travis CI link](https://travis-ci.org/alturany/ExpediaHotelOffers)

Notes:

1. localization should be done 
1. I have invested in crafting a generic URI builder, so the [method](https://github.com/alturany/ExpediaHotelOffers/blob/master/src/main/java/com/expedia/offers/command/HotelOfferSearchCommand.java#L135) that generates Rest URI will require no changes if a new search parameter has been added.
1. Spring APIs have been used to simplify code as much as possible
1. Layers have been used to separate concerns and enable testing in isolation (View, controller, and Service layers)
1. I have no previous experience in
    1. Maven.
    1. Git.
    1. Spring.
    1. Rest services.
    1. Jackson JSON.
    1. ThymeLeaf.
    1. bootstrap.

Since I had no experience in almost all used technologies, that has leaded to:
1) longer time than your estimation.
2) Only basic scenarios testing has been done (no in depth testing).
3) search form is primitive, date picker should has been used instead of date fields, also many missing search fields.
4) results page is very primitive.
 
