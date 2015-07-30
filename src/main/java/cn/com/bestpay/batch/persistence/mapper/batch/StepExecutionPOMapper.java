package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.StepExecutionPO;

public interface StepExecutionPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(StepExecutionPO record);

    int insertSelective(StepExecutionPO record);

    StepExecutionPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StepExecutionPO record);

    int updateByPrimaryKey(StepExecutionPO record);
}