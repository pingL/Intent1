package com.example.intnet1;

import java.io.File;

/**
 * Created by pingL on 2016/12/29,下午3:22.
 */

public abstract class AlbumStorageDirFactory {

    public abstract File getAlbumStorageDir(String albumName);
}
