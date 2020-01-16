package com.ybj.project.service.impl;

import com.ybj.project.model.LoginLog;
import com.ybj.project.dao.LoginLogMapper;
import com.ybj.project.service.LoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jasig.cas.client.util.CommonUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ybj
 * @since 2020-01-14
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {



}
