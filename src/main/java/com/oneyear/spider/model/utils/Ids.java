/***********************************************************
 * 
 * @Copyright: 2017 One Year Studio All rights reserved. 
 *
 ***********************************************************/
package com.oneyear.spider.model.utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Ids
 * @Description: generate unique id
 * @author wei
 * @Date: 2017年10月28日 
 */
public final class Ids {
	/**
     * Lock for unique id generation.
     */
    private static final Lock ID_GEN_LOCK = new ReentrantLock();

    /**
     * Sleep millisecond.
     */
    private static final long ID_GEN_SLEEP_MILLIS = 20;

    /**
     * Private default constructor.
     */
    private Ids() {}

    /**
     * Gets current date time string.
     *
     * <p>
     *   <b>Note</b>: This method is not safe in cluster environment.
     * </p>
     *
     * @return a time millis string
     */
    public static synchronized String genTimeMillisId() {
        String ret = null;

        ID_GEN_LOCK.lock();
        try {
            ret = String.valueOf(System.currentTimeMillis());

            try {
                Thread.sleep(ID_GEN_SLEEP_MILLIS);
            } catch (final InterruptedException e) {
                throw new RuntimeException("Generates time millis id fail");
            }
        } finally {
            ID_GEN_LOCK.unlock();
        }

        return ret;
    }
}
