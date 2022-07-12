package bbccdd.example.cryptocurrencyapp.presentation

sealed class Screen(val route : String) {
    object CoinListScreen : Screen("coin_list-screen")
    object CoinDetailScreen : Screen("coin_detail_screen")
}
