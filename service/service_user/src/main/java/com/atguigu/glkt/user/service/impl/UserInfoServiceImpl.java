package com.atguigu.glkt.user.service.impl;

import com.atguigu.ggkt.model.user.UserInfo;
import com.atguigu.glkt.user.mapper.UserInfoMapper;
import com.atguigu.glkt.user.service.UserInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2023-02-15
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    //openid查询
    @Override
    public UserInfo getUserInfoOpenid(String openId) {
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("open_id", openId);
        UserInfo userInfo = baseMapper.selectOne(wrapper);
        return userInfo;
    }
}
