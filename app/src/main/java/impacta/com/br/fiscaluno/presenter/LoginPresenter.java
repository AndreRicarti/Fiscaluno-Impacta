package impacta.com.br.fiscaluno.presenter;

import android.content.Context;
import android.content.Intent;

import impacta.com.br.fiscaluno.view.activity.QuestionarioActivity;

/**
 * Created by a.ricarti on 16/05/2017.
 */

public class LoginPresenter implements ILoginPresenter {

    private Context context;

    @Override
    public void actionButton() {
        Intent intent = new Intent(context, QuestionarioActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }
}
