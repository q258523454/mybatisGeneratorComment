package org.zhang.generator;

import org.zhang.util.GeneratorUtil;

import java.net.URISyntaxException;

/**
 * 描述：
 */
public class Run_Gauss {
    public static void main(String[] args) throws URISyntaxException {
        String resourceXmlPath = "mybatis-generator/gauss/generatorConfigComment_gauss.xml";
        // 方法1 使用 properties 中的 数据库驱动（绝对路径）
        // GeneratorUtil.generator(resourceXmlPath);
        // 方法2
        GeneratorUtil.generator(resourceXmlPath, "lib/com.huawei.gauss.jdbc.ZenithDriver-GaussDB_100_1.0.0.0.jar");
    }
}