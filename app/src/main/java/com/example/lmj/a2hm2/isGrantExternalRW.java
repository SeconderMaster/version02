package com.example.lmj.a2hm2;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;

/**
 * Created by lmj on 2016/9/20.
 */
public class isGrantExternalRW {
    public static boolean isGrantExternalRW(Activity activity){
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M&&activity.checkSelfPermission(
                Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            activity.requestPermissions(new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
            return false;
        }
        return true;
    }
}
