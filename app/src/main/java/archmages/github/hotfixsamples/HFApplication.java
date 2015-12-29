package archmages.github.hotfixsamples;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.util.Log;

import cn.jiajixin.nuwa.Nuwa;

/**
 * .
 * <p/>
 *
 * @author <a href="mailto:lmyu@wisorg.com">David.Yu</a>
 * @version V1.0, 29/12/15
 */
public class HFApplication extends Application{

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Nuwa.init(this);
        Nuwa.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
        Log.d("ylm", getFilesDir().getAbsolutePath());
    }
}
