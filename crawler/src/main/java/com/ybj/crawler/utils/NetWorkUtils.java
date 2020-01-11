package com.ybj.crawler.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 */
@Slf4j
public class NetWorkUtils {

    public static String getPageContent(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.81 Safari/537.36");
        conn.setConnectTimeout(5000);
        if (conn.getResponseCode() == 200) {
            String pageContent = IOUtils.toString(conn.getInputStream(), "utf-8");
            return pageContent;
        } else {
            log.error("请求失败");
            return "请求失败";
        }
    }
}
