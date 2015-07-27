package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.StepExecutionParamsPO;

public interface StepExecutionParamsPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(StepExecutionParamsPO record);

    int insertSelective(StepExecutionParamsPO record);

    StepExecutionParamsPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StepExecutionParamsPO record);

    int updateByPrimaryKey(StepExecutionParamsPO record);
}