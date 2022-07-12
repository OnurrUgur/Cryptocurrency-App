package bbccdd.example.cryptocurrencyapp.presentation.coin_list

import bbccdd.example.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading : Boolean = false,
    val coins : List<Coin> = emptyList(),
    val error : String = ""
)
