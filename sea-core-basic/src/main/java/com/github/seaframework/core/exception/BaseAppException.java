package com.github.seaframework.core.exception;

import com.github.seaframework.core.enums.ErrorTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 统一异常定义
 *
 * @author spy
 * @version 1.0 2019/4/11
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseAppException extends RuntimeException {

    private String code;

    private String desc;

    private String type;

// 可扩展参数

    public BaseAppException() {
        super();
    }

    public BaseAppException(String code) {
        this(code, null, ErrorTypeEnum.APPLICATION.getCode());
    }

    public BaseAppException(String code, String desc) {
        this(code, desc, ErrorTypeEnum.APPLICATION.getCode());
    }

    public BaseAppException(String code, String desc, String type) {
        super(code + ":" + desc);
        this.code = code;
        this.desc = desc;
        this.type = type;
    }
}
