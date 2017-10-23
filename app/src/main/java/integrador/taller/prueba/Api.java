package integrador.taller.prueba;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Julian Nuñez on 17/10/17.
 * eSoft del Pacifico
 */

public interface Api {
    public static final  String BASE_URL= "http://201.165.0.142:8383/PTA/ws/";

    @GET("Ciudad/{idCiudad}")
    public Call<CiudadRespuesta> getCiudad (@Path("idCiudad") Integer idCiudad);

    @GET("Ciudad/consultaCiudades")
    public Call<ConsultaCiudadesRespuesta> getTodas();

    @POST("Ciudad")
    public Call<CiudadRespuesta> postCiudad (@Body CiudadData ciudad);

    @PUT("Junta")
    @FormUrlEncoded
    public Call<JuntaResponse> modifyCity(@Field("juntaid") Integer juntaid,
                                          @Field("nombre") String nombre);

}
