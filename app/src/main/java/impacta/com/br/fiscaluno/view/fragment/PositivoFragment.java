package impacta.com.br.fiscaluno.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import impacta.com.br.fiscaluno.R;

/**
 * Created by Admin on 21/05/2017.
 */

public class PositivoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_positivo, container, false);

        return view;
    }
}
