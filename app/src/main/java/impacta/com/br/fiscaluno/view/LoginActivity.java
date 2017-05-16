package impacta.com.br.fiscaluno.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import impacta.com.br.fiscaluno.R;
import impacta.com.br.fiscaluno.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity {

    private Button bnLoginFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bnLoginFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new LoginPresenter().actionButton();
            }
        });

    }
}
