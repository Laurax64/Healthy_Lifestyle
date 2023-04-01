package com.example.healthylifestyle.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.healthylifestyle.R

/**
 *  Data class that represents the information presented in the health factor item.
 */
data class HealthFactor(
    @StringRes val titleResourceId: Int,
    @StringRes val infoResourceId: Int,
    @StringRes val sourceResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )

val healthFactors = listOf(
    HealthFactor(R.string.title1, R.string.info1, R.string.source1, R.drawable.checkup),
    HealthFactor(R.string.title2, R.string.info2, R.string.source2, R.drawable.diet),
    HealthFactor(R.string.title3, R.string.info3, R.string.source3, R.drawable.exercise),
    HealthFactor(R.string.title4, R.string.info4, R.string.source4, R.drawable.living_space),
    HealthFactor(R.string.title5, R.string.info5, R.string.source5, R.drawable.nature),
    HealthFactor(R.string.title6, R.string.info6, R.string.source6, R.drawable.sleep),
    HealthFactor(R.string.title7, R.string.info7, R.string.source7, R.drawable.social),
    HealthFactor(R.string.title8, R.string.info8, R.string.source8, R.drawable.stress),
    HealthFactor(R.string.title9, R.string.info9, R.string.source9, R.drawable.sunshine),
    HealthFactor(R.string.title10, R.string.info10, R.string.source10, R.drawable.toxins)
)