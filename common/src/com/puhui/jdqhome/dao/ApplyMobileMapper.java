package com.puhui.jdqhome.dao;

import com.puhui.jdqhome.model.ApplyMobile;
import java.util.List;

public interface ApplyMobileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApplyMobile record);

    ApplyMobile selectByPrimaryKey(Long id);

    List<ApplyMobile> selectAll();

    int updateByPrimaryKey(ApplyMobile record);
}