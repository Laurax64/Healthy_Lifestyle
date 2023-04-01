package com.example.healthylifestyle.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.healthylifestyle.R


val Tinos = FontFamily(
    Font(R.font.tinos_regular),
    Font(R.font.tinos_bold, FontWeight.Bold)
)

val DancingScript = FontFamily(
    Font(R.font.dancing_script_regular),
    Font(R.font.dancing_script_bold, FontWeight.Bold)
)
// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = Tinos,
    h1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 60.sp,
        fontFamily = DancingScript
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 34.sp
)
)