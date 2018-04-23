package santander.com.br.testeibm.features.home.viewModel;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.GsonBuilder;

import santander.com.br.testeibm.R;
import santander.com.br.testeibm.features.home.model.Formulary;
import santander.com.br.testeibm.features.home.model.HomeProvider;
import santander.com.br.testeibm.shared.connector.NetworkUtils;
import santander.com.br.testeibm.shared.connector.RouterEndPointEnum;
import santander.com.br.testeibm.shared.connector.view.CoreActivity;

/**
 * Created by cledson.alves on 20/04/2018.
 */

public class HomeViewModel extends CoreActivity {
    private Activity activity;
    EditText txtMessage ;

    public HomeViewModel(Activity activity) {
        this.activity = activity;

        initComponetes();
    }

    public void initComponetes() {
        new DownloadDados().execute();
        txtMessage = activity.findViewById(R.id.txt_message);


    }

    public class DownloadDados extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... params) {
            return NetworkUtils.getJSONFromAPI(RouterEndPointEnum.FORMULARIO.getEndpoint());
        }

        @Override
        protected void onPostExecute(String dados) {
            Formulary formulary=  new GsonBuilder().create().fromJson(dados, Formulary.class);
            txtMessage.setHint(formulary.getCells()[0].getMessage().toString());
            txtMessage.setEnabled(formulary.getCells()[0].getHidden());


        }
    }




}
