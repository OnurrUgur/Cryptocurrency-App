package bbccdd.example.cryptocurrencyapp.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(content: @Composable () -> Unit){

    MaterialTheme(
        colors = LightColorPalette,
        shapes = Shapes,
        content = content,
        typography = Typography,

        )

}