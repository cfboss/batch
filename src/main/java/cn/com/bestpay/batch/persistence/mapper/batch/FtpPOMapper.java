package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.FtpPO;

public interface FtpPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(FtpPO record);

    int insertSelective(FtpPO record);

    FtpPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FtpPO record);

    int updateByPrimaryKey(FtpPO record);
}