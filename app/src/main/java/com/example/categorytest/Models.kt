package com.example.categorytest

data class Fumigants(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class Insecticides(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class Fungicides(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class Weedicide(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class Bio_pesticides(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class Bio_fertilizers(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class MicronutrientFertilizer(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class AnimalFeedSupplement(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class Seeds(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class Adjuvant(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class SoilAndWaterTesting(
    val Technical_Description: String,
    val Commision: String,
    val One_time_security_deposit: String,
    val GST_ON_PRODUCT: String,
    val TDS: String,
    val GST: String
)

data class ProductCategory(
    val FERTILIZER: List<Fumigants>,
    val Feed: List<AnimalFeedSupplement>,
    val Seeds: List<Seeds>,
    val Adjuvant: List<Adjuvant>,
    val Implements: List<SoilAndWaterTesting>
)
