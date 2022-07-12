package bbccdd.example.cryptocurrencyapp.presentation.coin_detail

import bbccdd.example.cryptocurrencyapp.domain.model.Coin
import bbccdd.example.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading : Boolean = false,
    val coin : CoinDetail? = null ,
    val error : String = ""
)
