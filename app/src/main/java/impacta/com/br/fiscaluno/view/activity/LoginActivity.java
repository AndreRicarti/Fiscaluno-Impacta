package impacta.com.br.fiscaluno.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import impacta.com.br.fiscaluno.R;
import impacta.com.br.fiscaluno.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity {

    private Button bnLoginFacebook;
    private LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bnLoginFacebook = (Button) findViewById(R.id.bn_login_facebook);

        loginPresenter = new LoginPresenter();
        loginPresenter.setContext(this);

        bnLoginFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.actionButton();
                finish();
            }
        });

    }
}
