package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.JobExecutionParamsPO;

public interface JobExecutionParamsPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(JobExecutionParamsPO record);

    int insertSelective(JobExecutionParamsPO record);

    JobExecutionParamsPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(JobExecutionParamsPO record);

    int updateByPrimaryKey(JobExecutionParamsPO record);
}