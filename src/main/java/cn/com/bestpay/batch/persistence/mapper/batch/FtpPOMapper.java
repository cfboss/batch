package cn.com.bestpay.batch.persistence.mapper.batch;

import cn.com.bestpay.batch.persistence.model.FtpPO;

public interface FtpPOMapper {
    FtpPO getFtpByJobId(String jobInstanceId);
}