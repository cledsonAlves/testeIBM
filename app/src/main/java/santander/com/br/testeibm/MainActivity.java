package santander.com.br.testeibm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import santander.com.br.testeibm.shared.connector.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NetworkUtils.getJSONFromAPI("https://floating-mountain-50292.herokuapp.com/cells.json");
    }
}
