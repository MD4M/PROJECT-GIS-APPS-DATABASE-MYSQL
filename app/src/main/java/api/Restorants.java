package api;

import model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Restorants {
    @GET("restoran.php")
    Call<ListLocationModel> getRestoall();
}
