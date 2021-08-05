package api;

import model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Hospitals {
    @GET("hospital.php")
    Call<ListLocationModel> getHosall();
}
