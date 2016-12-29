package com.example.intnet1;

import android.os.Environment;

import java.io.File;

/**
 * Created by pingL on 2016/12/29,下午3:12.
 *
 *
 */

public class FroyoAlbumDirFactory extends AlbumStorageDirFactory{
    @Override
    public File getAlbumStorageDir(String albumName) {
        return new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_PICTURES
                ),
                albumName
        );
    }
}
