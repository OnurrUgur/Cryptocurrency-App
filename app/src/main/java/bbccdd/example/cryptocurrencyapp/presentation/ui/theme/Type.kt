package bbccdd.example.cryptocurrencyapp.presentation.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import bbccdd.example.cryptocurrencyapp.R

val Roboto = FontFamily(
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_medium, FontWeight.Normal)

)
@OptIn(ExperimentalTextApi::class)
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )

    ),
    body2 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 21.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    h6 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    h1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    ),
    h2 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
)
