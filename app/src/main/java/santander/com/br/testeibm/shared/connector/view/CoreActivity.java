package santander.com.br.testeibm.shared.connector.view;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import santander.com.br.testeibm.R;

/**
 * Created by cledson.alves on 20/04/2018.
 */

public class CoreActivity extends AppCompatActivity{
    private LinearLayout headerMain;
    private TextView textView;
    private TextView hdrTitulo;
    private ImageButton hdrCancel;
    private ImageView headerLogo;

    @Override
    @SuppressWarnings("All")
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
//        getSupportActionBar().hide();
    }

    public void configActionBar(@StringRes int title, boolean showLogo) {
        configActionBar(getString(title), showLogo);
    }
    public void configActionBar(String title, boolean showLogo) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setCustomView(R.layout.layout_header_pequeno);
            initHeader(actionBar, actionBar.getCustomView(), title, showLogo);
        }
    }

    private void initHeader(ActionBar actionBar, View view, String title, boolean showLogo) {
        headerMain = (LinearLayout) view.findViewById(R.id.header_main);
        textView = (TextView) view.findViewById(R.id.header_titulo);
        headerLogo = (ImageView) view.findViewById(R.id.header_logo);
        textView.setText(title);

        hdrCancel = (ImageButton) view.findViewById(R.id.header_cancel);

        hdrCancel.setImageResource(R.drawable.ic_back);
        hdrCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

            }
        });

    }

    private void buildHeader(ActionBar actionBar, @ColorRes int color, boolean showLogo) {
        @ColorRes int colorSegment = color;
        actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, colorSegment)));
        if (showLogo){
            headerLogo.setVisibility(View.VISIBLE);
        }else {
            headerLogo.setVisibility(View.GONE);
        }

        if (headerMain != null) {
            headerMain.setBackgroundColor(ContextCompat.getColor(this, color));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = getWindow();
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                window.setStatusBarColor(getResources().getColor(color));
            }
        }
    }
}
