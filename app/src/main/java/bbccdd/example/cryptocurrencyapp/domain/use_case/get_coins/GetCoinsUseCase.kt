package bbccdd.example.cryptocurrencyapp.domain.use_case.get_coins

import bbccdd.example.cryptocurrencyapp.common.Resource
import bbccdd.example.cryptocurrencyapp.data.remote.data_transfer_object.toCoin
import bbccdd.example.cryptocurrencyapp.domain.model.Coin
import bbccdd.example.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke() : kotlinx.coroutines.flow.Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        }catch (e : HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error accoured"))
        }catch (e : IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }

}