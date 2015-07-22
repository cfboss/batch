package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.JobInstancePO;

public interface JobInstancePOMapper {
    int deleteByPrimaryKey(String id);

    int insert(JobInstancePO record);

    int insertSelective(JobInstancePO record);

    JobInstancePO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(JobInstancePO record);

    int updateByPrimaryKey(JobInstancePO record);
}