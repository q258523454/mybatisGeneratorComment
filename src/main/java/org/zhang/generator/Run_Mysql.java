package org.zhang.generator;

import org.zhang.util.GeneratorUtil;

/**
 * 描述：
 */
public class Run_Mysql {
    public static void main(String[] args) {
        String resourceXmlPath = "mybatis-generator/mysql/generatorConfigComment.xml";
        // 方法1 使用 properties 中的 数据库驱动（绝对路径）
        // GeneratorUtil.generator(resourceXmlPath);
        // 方法2
        GeneratorUtil.generator(resourceXmlPath, "lib/mysql-connector-java-8.0.17.jar");
    }
}