package haifeng.cong.mall.service;

import haifeng.cong.mall.mbg.model.PmsBrand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/6/29 16:46
 *
 * @author conghaifeng
 */
@Service
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
