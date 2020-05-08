package com.github.seaframework.core.service.lifecycle;

import com.github.seaframework.core.model.BaseResult;

/**
 * 模块
 *
 * @author spy
 * @version 1.0 2019-08-03
 * @since 1.0
 */
public interface AbstractValidateLifeCycle {

    /**
     * check resource
     *
     * @return
     */
    BaseResult check();

    /**
     * validate resource
     *
     * @return
     */
    BaseResult validate();

}
