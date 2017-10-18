package integrador.taller.prueba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_ciudad)
    TextView txtCiudad;

    CiudadData cityPost;
    Estado estadoPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);




    }

    @OnClick(R.id.btn_pushar)
    public void pushar(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final Api service = retrofit.create(Api.class);

        estadoPost = new Estado();
        estadoPost.setEstadoid(35);
        estadoPost.setNombre("Durango");
        estadoPost.setEstadoactivo(false);

        cityPost = new CiudadData();
        cityPost.setCiudadid(74);
        cityPost.setNombre("Gomez Palacio");
        cityPost.setEstadoactivo(true);
        cityPost.setEstado(estadoPost);

        Call<CiudadRespuesta> request = service.postCiudad(cityPost);
        request.enqueue(new Callback<CiudadRespuesta>() {
            @Override
            public void onResponse(Call<CiudadRespuesta> call, Response<CiudadRespuesta> response) {
                Log.e("Alto ahi rufian", response.body().toString());
            }

            @Override
            public void onFailure(Call<CiudadRespuesta> call, Throwable t) {
                Log.e("Alto ahi rufian", t.toString());
            }
        });

        //Call<CiudadRespuesta> request = service.getCiudad(18);
        /*Call<ConsultaCiudadesRespuesta> request = service.getTodas();
        request.enqueue(new Callback<ConsultaCiudadesRespuesta>() {
            @Override
            public void onResponse(Call<ConsultaCiudadesRespuesta> call, Response<ConsultaCiudadesRespuesta> response) {
                Log.e("alto ahi", response.body().toString());
                String nombres = "";
                for (int i = 0; i < response.body().getData().size(); i++){
                    nombres += response.body().getData().get(i).getNombre() + " ";

                }

                txtCiudad.setText(nombres);
            }

            @Override
            public void onFailure(Call<ConsultaCiudadesRespuesta> call, Throwable t) {

            }
        });

        */
       /* request.enqueue( new Callback<CiudadRespuesta>(){

            @Override
            public void onResponse(Call<CiudadRespuesta> call, Response<CiudadRespuesta> response) {
                Log.e("alto ahi", response.body().toString());
                txtCiudad.setText( response.body().getData().getNombre() );
            }

            @Override
            public void onFailure(Call<CiudadRespuesta> call, Throwable t) {
                Log.e("alto ahi", t.toString());
            }
        });*/
    }
}
