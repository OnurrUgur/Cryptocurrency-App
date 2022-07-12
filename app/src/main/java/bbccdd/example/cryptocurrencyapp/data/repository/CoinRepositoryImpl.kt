package bbccdd.example.cryptocurrencyapp.data.repository

import bbccdd.example.cryptocurrencyapp.data.remote.CoinPaprikaApi
import bbccdd.example.cryptocurrencyapp.data.remote.data_transfer_object.CoinDetailDto
import bbccdd.example.cryptocurrencyapp.data.remote.data_transfer_object.CoinDto
import bbccdd.example.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}