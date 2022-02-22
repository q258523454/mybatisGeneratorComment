package org.zhang.generator;

import org.zhang.util.GeneratorUtil;

/**
 * 描述：
 */
public class Run_Oracle {
    public static void main(String[] args) {
        String resourceXmlPath = "mybatis-generator/oracle/generatorConfigComment_oracle.xml";
        // 方法1 使用 properties 中的 数据库驱动（绝对路径）
        // GeneratorUtil.generator(resourceXmlPath);
        // 方法2
        GeneratorUtil.generator(resourceXmlPath, "lib/ojdbc8-19.3.0.0.jar");
    }
}