package com.github.seaframework.core.service;

import com.github.seaframework.core.model.BaseResult;
import com.github.seaframework.core.service.lifecycle.AbstractDestroyLifeCycle;
import com.github.seaframework.core.service.lifecycle.AbstractExecuteLifeCycle;
import com.github.seaframework.core.service.lifecycle.AbstractValidateLifeCycle;
import lombok.extern.slf4j.Slf4j;

/**
 * 模块
 *
 * @author spy
 * @version 1.0 2019-08-03
 * @since 1.0
 */
@Slf4j
public abstract class AbstractConditionBizService<Void>
        implements AbstractService, AbstractValidateLifeCycle,
        AbstractExecuteLifeCycle, AbstractDestroyLifeCycle {

    /**
     * 返回值
     *
     * @return
     */
    abstract <T> BaseResult<T> doService();

    /**
     * @return
     */
    abstract BaseResult success();

    /**
     * @return
     */
    abstract BaseResult failure();


    @Override
    public BaseResult<Void> execute() {


        return null;
    }
}
