package com.github.seaframework.core.util;

import com.github.seaframework.core.common.CoreConst;
import com.github.seaframework.core.exception.ShouldNeverHappenException;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;

/**
 * The type Blob utils.
 */
public final class BlobUtil {

    private BlobUtil() {

    }

    /**
     * String 2 blob blob.
     *
     * @param str the str
     * @return the blob
     */
    public static Blob string2blob(String str) {
        if (str == null) {
            return null;
        }

        try {
            return new SerialBlob(str.getBytes(CoreConst.DEFAULT_CHARSET));
        } catch (Exception e) {
            throw new ShouldNeverHappenException(e);
        }
    }

    /**
     * Blob 2 string string.
     *
     * @param blob the blob
     * @return the string
     */
    public static String blob2string(Blob blob) {
        if (blob == null) {
            return null;
        }

        try {
            return new String(blob.getBytes((long) 1, (int) blob.length()), CoreConst.DEFAULT_CHARSET);
        } catch (Exception e) {
            throw new ShouldNeverHappenException(e);
        }
    }

    /**
     * Byte array to blob
     *
     * @param bytes the byte array
     * @return the blob
     */
    public static Blob bytes2Blob(byte[] bytes) {
        if (bytes == null) {
            return null;
        }

        try {
            return new SerialBlob(bytes);
        } catch (Exception e) {
            throw new ShouldNeverHappenException(e);
        }
    }

    /**
     * Blob to byte array.
     *
     * @param blob the blob
     * @return the byte array
     */
    public static byte[] blob2Bytes(Blob blob) {
        if (blob == null) {
            return new byte[0];
        }

        try {
            return blob.getBytes((long) 1, (int) blob.length());
        } catch (Exception e) {
            throw new ShouldNeverHappenException(e);
        }
    }
}
