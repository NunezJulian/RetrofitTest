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
    Junta junta;

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
        estadoPost.setEstadoid(25);
        estadoPost.setNombre("Sinaloa");
        estadoPost.setEstadoactivo(true);

        cityPost = new CiudadData();
        cityPost.setNombre("Ahome");
        cityPost.setEstadoactivo(true);
        cityPost.setEstado(estadoPost);

        junta = new Junta();
        junta.setNombre("Test Junta");
        junta.setCiudad(cityPost);
        junta.setJuntaid(24);
        junta.setStatus(false);

        Call<JuntaResponse> request = service.modifyCity(25, "Test Prueba");
        request.enqueue(new Callback<JuntaResponse>() {
            @Override
            public void onResponse(Call<JuntaResponse> call, Response<
                    JuntaResponse> response) {
                Log.e("alto ahi", "Se modifico");
            }

            @Override
            public void onFailure(Call<JuntaResponse> call, Throwable t) {
                Log.e("alto ahi", t.toString());
            }
        });

       /* Call<CiudadRespuesta> request = service.postCiudad(cityPost);
        request.enqueue(new Callback<CiudadRespuesta>() {
            @Override
            public void onResponse(Call<CiudadRespuesta> call, Response<CiudadRespuesta> response) {
                Log.e("Alto ahi rufian", response.body().toString());
                String var = response.body().getMeta().getStatus();
                if (var.equals("OK")){
                    Toast.makeText(MainActivity.this, "Si se guardó", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, var, Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<CiudadRespuesta> call, Throwable t) {
                Log.e("Alto ahi rufian", t.toString());
            }
        });
        */

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
