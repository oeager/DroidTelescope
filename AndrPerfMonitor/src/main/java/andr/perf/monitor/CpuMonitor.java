package andr.perf.monitor;

import android.util.Log;

/**
 * Created by ZhouKeWen on 17/3/16.
 */

public class CpuMonitor {

    private static final String TAG = "CpuMonitor";

    public static void startMethodMonitor(long startTime) {
        long useTime = System.currentTimeMillis() - startTime;
        Log.i(TAG, "useTime =========" + useTime);
    }

}
