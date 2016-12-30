package com.example.intnet1;

import android.os.Environment;

import java.io.File;

/**
 * Created by pingL on 2016/12/29,下午3:12.
 */

public class BaseAlbumDirFactory extends AlbumStorageDirFactory {

    private static final String CAMERA_DIR = "/dcimteam/";

    @Override
    public File getAlbumStorageDir(String albumName) {

        return new File(
                Environment.getExternalStorageDirectory()
                + CAMERA_DIR
                + albumName
        );
    }
}
