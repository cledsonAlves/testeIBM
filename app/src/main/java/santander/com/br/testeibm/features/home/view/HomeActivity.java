package santander.com.br.testeibm.features.home.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import santander.com.br.testeibm.R;
import santander.com.br.testeibm.features.home.viewModel.HomeViewModel;
import santander.com.br.testeibm.shared.connector.view.CoreActivity;

/**
 * Created by cledson.alves on 20/04/2018.
 */

public class HomeActivity extends CoreActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new HomeViewModel(this);
    }

}
