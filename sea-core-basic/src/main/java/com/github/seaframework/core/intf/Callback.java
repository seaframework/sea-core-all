package com.github.seaframework.core.intf;

/**
 * The interface Callback.
 * <p>
 * Supplier is more suite way for choose
 * </p>
 *
 * @param <T> the type parameter
 */
public interface Callback<T> {

    /**
     * Execute t.
     *
     * @return the t
     * @throws Throwable the throwable
     */
    T execute() throws Throwable;
}

