package infinity1087.android.com.examplehr.Services;

import infinity1087.android.com.examplehr.model.Example;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/Product/Get")
    Call<Example> getcontacts();
}
