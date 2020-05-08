package com.github.seaframework.core.serialize.exception;

import com.github.seaframework.core.exception.BaseAppException;
import com.github.seaframework.core.common.CoreErrorConst;
import lombok.extern.slf4j.Slf4j;

/**
 * 模块
 *
 * @author spy
 * @version 1.0 2019-07-26
 * @since 1.0
 */
@Slf4j
public class DeserializeException extends BaseAppException {

    public DeserializeException() {
        super(CoreErrorConst.UNSERIAL_ERR, "反序列化异常");
    }
}
