package bbccdd.example.cryptocurrencyapp.domain.repository

import bbccdd.example.cryptocurrencyapp.data.remote.data_transfer_object.CoinDetailDto
import bbccdd.example.cryptocurrencyapp.data.remote.data_transfer_object.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String) : CoinDetailDto

}