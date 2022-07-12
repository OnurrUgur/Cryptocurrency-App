package bbccdd.example.cryptocurrencyapp.presentation.ui.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val colorLightPrimary = Color(0xFF17579A)
val colorLightTextPrimary = Color(0xFF000000)
val colorLightTextSecondary = Color(0xFFf2f2f2)
val colorLightBackground = Color(0xFFFFFFFF)
val colorLightError = Color(0xFFD62222)
val DeepBlue = Color(0xff06164c)

val LightColorPalette = lightColors(
    primary = colorLightPrimary,
    primaryVariant = colorLightError,
    secondary = colorLightBackground,
    secondaryVariant = DeepBlue,
    onPrimary = colorLightTextSecondary,
    error = colorLightTextPrimary

)