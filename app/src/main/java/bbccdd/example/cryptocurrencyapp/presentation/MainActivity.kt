package bbccdd.example.cryptocurrencyapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import bbccdd.example.cryptocurrencyapp.presentation.coin_detail.CoinDetailScreen
import bbccdd.example.cryptocurrencyapp.presentation.coin_list.CoinListScreen
import bbccdd.example.cryptocurrencyapp.presentation.ui.theme.AppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                val systemUiController = rememberSystemUiController()
                systemUiController.setStatusBarColor(color = MaterialTheme.colors.background)
                systemUiController.setSystemBarsColor(color = MaterialTheme.colors.background)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Screen.CoinListScreen.route ) {
                        composable(route = Screen.CoinListScreen.route){
                            CoinListScreen(navController)
                        }
                        composable(route = Screen.CoinDetailScreen.route + "/{coinId}"){
                            CoinDetailScreen()
                        }
                    }
                }
            }
        }
    }
}



