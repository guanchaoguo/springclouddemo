package com.kiss250.myBlog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kiss250.myBlog.domain.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author white
 * @date 2024/05/06/09:49
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}