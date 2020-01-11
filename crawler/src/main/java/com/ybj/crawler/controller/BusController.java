package com.ybj.crawler.controller;


import com.ybj.crawler.common.Constants;
import com.ybj.crawler.model.IPBean;
import com.ybj.crawler.utils.Crawler.IPCrawler.IPCrawler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @Author BusController
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/
@RestController
public class BusController {

    @RequestMapping(value = "/getAllIp", method = RequestMethod.POST)
    public List<IPBean> getAllIp() throws IOException {
        List<IPBean> ipBeanList=null;
        ipBeanList = IPCrawler.getIpList(Constants.HTTPS_URL, 1);
        return ipBeanList;
    }

}
