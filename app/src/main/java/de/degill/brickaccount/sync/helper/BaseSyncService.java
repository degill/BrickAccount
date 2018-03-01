package de.degill.brickaccount.sync.helper;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import de.degill.brickaccount.sync.SyncAdapter;

public abstract class BaseSyncService extends Service {

    private static final Object S_SYNC_ADAPTER_LOCK = new Object();
    private static SyncAdapter sSyncAdapter = null;

    @Override
    public void onCreate() {
        super.onCreate();
        synchronized (S_SYNC_ADAPTER_LOCK) {
            if (sSyncAdapter == null) {
                sSyncAdapter = getSyncAdapter();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return sSyncAdapter.getSyncAdapterBinder();
    }

    protected abstract SyncAdapter getSyncAdapter();
}
