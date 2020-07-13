package haifeng.cong.mall.service.impl;

import com.github.pagehelper.PageHelper;
import haifeng.cong.mall.mbg.mapper.PmsBrandMapper;
import haifeng.cong.mall.mbg.model.PmsBrand;
import haifeng.cong.mall.mbg.model.PmsBrandExample;
import haifeng.cong.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company:
 * Create Time: 2020/7/1 15:05
 *
 * @author conghaifeng
 */
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
