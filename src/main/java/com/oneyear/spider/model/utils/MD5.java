/***********************************************************
 * 
 * @Copyright: 2017 One Year Studio All rights reserved. 
 *
 ***********************************************************/
package com.oneyear.spider.model.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;


/**
 * @ClassName MD5
 * @Description: TODO
 * @author wei
 * @Date: 2017年10月28日 
 */
public final class MD5 {


    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(MD5.class);

    /**
     * Message digest.
     */
    private static MessageDigest messageDigest;

    /**
     * Low 8 bits all sets to 1.
     */
    private static final int LOW_8_BITS_1 = 0xff;

    /**
     * Append size.
     */
    private static final int APPEND_SIZE = 16;

    /**
     * Private default constructor.
     */
    private MD5() {}

    static {
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (final NoSuchAlgorithmException e) {
            LOGGER.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    /**
     * Hashs(MD5) the specified string.
     *
     * @param string the specified string
     * @return hashed string from the specified string
     */
    public static String hash(final String string) {
        final char[] charArray = string.toCharArray();
        final byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            byteArray[i] = (byte) charArray[i];
        }

        final byte[] bytes = messageDigest.digest(byteArray);
        final StringBuffer hexValue = new StringBuffer();

        for (int i = 0; i < bytes.length; i++) {
            final int val = ((int) bytes[i]) & LOW_8_BITS_1;

            if (val < APPEND_SIZE) {
                hexValue.append("0");
            }

            hexValue.append(Integer.toHexString(val));
        }

        return hexValue.toString();
    }

}
