package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.StepExecutionContextPO;

public interface StepExecutionContextPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(StepExecutionContextPO record);

    int insertSelective(StepExecutionContextPO record);

    StepExecutionContextPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StepExecutionContextPO record);

    int updateByPrimaryKeyWithBLOBs(StepExecutionContextPO record);

    int updateByPrimaryKey(StepExecutionContextPO record);
}