# BrickAccount
PLEASE DONT BUILD THIS ON YOUR ACTUAL PHONE!

This is a sample project which only consists of a malformed SyncAdapter, i.e. `authenticator.xml`, `syncadapter.xml` and `AndroidManifest.xml` entries.

Leaving `android:accountType` OR `android:contentAuthority` in the `syncadapter.xml` file empty results in a broken system.

I filed a bug report which you can follow here: https://code.google.com/p/android/issues/detail?id=261565
