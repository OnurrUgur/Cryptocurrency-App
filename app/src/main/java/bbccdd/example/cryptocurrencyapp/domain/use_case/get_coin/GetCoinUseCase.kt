package bbccdd.example.cryptocurrencyapp.domain.use_case.get_coin

import bbccdd.example.cryptocurrencyapp.common.Resource
import bbccdd.example.cryptocurrencyapp.data.remote.data_transfer_object.toCoin
import bbccdd.example.cryptocurrencyapp.data.remote.data_transfer_object.toCoinDetail
import bbccdd.example.cryptocurrencyapp.domain.model.Coin
import bbccdd.example.cryptocurrencyapp.domain.model.CoinDetail
import bbccdd.example.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(coinId : String) : kotlinx.coroutines.flow.Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        }catch (e : HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error accoured"))
        }catch (e : IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }

}