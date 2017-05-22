package impacta.com.br.fiscaluno.view.activity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.facebook.login.LoginFragment;

import impacta.com.br.fiscaluno.R;
import impacta.com.br.fiscaluno.presenter.QuestionarioPresenter;
import impacta.com.br.fiscaluno.util.EnumFragment;
import impacta.com.br.fiscaluno.util.Util;
import impacta.com.br.fiscaluno.view.fragment.AvaliacaoFragment;
import impacta.com.br.fiscaluno.view.fragment.InstituicaoFragment;
import impacta.com.br.fiscaluno.view.fragment.NegativoFragment;
import impacta.com.br.fiscaluno.view.fragment.PositivoFragment;

/**
 * Created by Admin on 21/05/2017.
 */

public class QuestionarioActivity extends AppCompatActivity {

    private FrameLayout fragmentContainer;
    private FragmentTransaction fragmentTransaction;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario);

        fragmentContainer = (FrameLayout) findViewById(R.id.fragment_questionario);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();

        Util.navigate(fragmentTransaction, R.id.fragment_questionario, new InstituicaoFragment());
    }

    public void avaliacaoFragment(View view) {
        Util.navigate(getSupportFragmentManager().beginTransaction(), R.id.fragment_questionario, new AvaliacaoFragment());
    }

    public void instituicaoFragment(View view) {
        Util.navigate(getSupportFragmentManager().beginTransaction(), R.id.fragment_questionario, new InstituicaoFragment());
    }

    public void negativoFragment(View view) {
        Util.navigate(getSupportFragmentManager().beginTransaction(), R.id.fragment_questionario, new NegativoFragment());
    }

    public void positicoFragment(View view) {
        Util.navigate(getSupportFragmentManager().beginTransaction(), R.id.fragment_questionario, new PositivoFragment());
    }

}
