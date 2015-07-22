package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.JobExecutionPO;

public interface JobExecutionPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(JobExecutionPO record);

    int insertSelective(JobExecutionPO record);

    JobExecutionPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(JobExecutionPO record);

    int updateByPrimaryKey(JobExecutionPO record);
}