package de.degill.brickaccount.sync;


import de.degill.brickaccount.sync.helper.BaseSyncService;

public final class SyncService extends BaseSyncService {

    @Override
    protected SyncAdapter getSyncAdapter() {
        return new SyncAdapter(getApplicationContext(), true);
    }
}
