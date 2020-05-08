package com.github.seaframework.core.util;

import com.alibaba.fastjson.TypeReference;
import com.github.seaframework.core.BaseCoreTest;
import com.github.seaframework.core.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2019/8/29
 * @since 1.0
 */
@Slf4j
public class JSONUtilTest extends BaseCoreTest {

    @Test
    public void run17() throws Exception {
        User user = new User();
        user.setId(1L);
        user.setName("smith");

        String text = JSONUtil.toStr(user);
        log.info("text={}", text);
//        User userCopy = JSONUtil.toObj(text,User.class);

        User userCopy = JSONUtil.toObj(text, new TypeReference<User>() {
        }.getType());
        log.info("userCopy={}", userCopy);

    }


}
