package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.JobExecutionContextPO;

public interface JobExecutionContextPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(JobExecutionContextPO record);

    int insertSelective(JobExecutionContextPO record);

    JobExecutionContextPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(JobExecutionContextPO record);

    int updateByPrimaryKeyWithBLOBs(JobExecutionContextPO record);

    int updateByPrimaryKey(JobExecutionContextPO record);
}