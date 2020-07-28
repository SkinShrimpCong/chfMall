package haifeng.cong.mall.service;

import haifeng.cong.mall.common.CommonResult;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company:
 * Create Time: 2020/7/15 16:55
 *
 * @author conghaifeng
 */
@Service
public interface UmsMemberService {

    /**
    * @Description: 生成验证码
    * @Param:
    * @return:
    * @Date 2020/7/15
    */
    CommonResult generateAuthCode(String telephone);

    /**
    * @Description: 判断验证码和手机号码是否匹配
    * @Param:
    * @return:
    * @Date 2020/7/15
    */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
