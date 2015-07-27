package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.StepInstancePO;

public interface StepInstancePOMapper {
    int deleteByPrimaryKey(String id);

    int insert(StepInstancePO record);

    int insertSelective(StepInstancePO record);

    StepInstancePO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StepInstancePO record);

    int updateByPrimaryKey(StepInstancePO record);
}