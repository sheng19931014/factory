package com.factory.business.impl;

import com.factory.business.bo.UserInfoBo;
import com.factory.business.common.CommException;
import com.factory.business.inter.UserInfoBizInter;
import com.factory.dao.inter.UserInfoMapper;
import com.factory.dao.inter.pojo.UserInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description: factory
 * <p>
 * Created by 胡胜 on 2019/9/21 13:55
 */
@Component
public class UserInfoBizImpl implements UserInfoBizInter{

    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 添加用户信息
     * @param bo
     */
    public void addUserInfo(UserInfoBo bo) {
        try{
            UserInfo dao = new UserInfo();
            BeanUtils.copyProperties(bo, dao);
            userInfoMapper.insert(dao);
        }catch (Exception e){
            e.printStackTrace();
            throw new CommException("1001", "添加用户失败");
        }
    }
}
