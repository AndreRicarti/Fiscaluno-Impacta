package impacta.com.br.fiscaluno.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Admin on 21/05/2017.
 */

public class Util {

    public static void navigate(FragmentTransaction fragmentTransaction, int container, Fragment fragment) {
        fragmentTransaction.replace(container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();
    }
}
