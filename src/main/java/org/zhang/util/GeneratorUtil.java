package org.zhang.util;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public enum GeneratorUtil {
    ;

    /**
     * 使用 properties 中的 数据库驱动（绝对路径）
     * @param resourceXmlPath
     */
    public static void generator(String resourceXmlPath) {
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream(resourceXmlPath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(is);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
    }

    /**
     * 不使用xml的路径, 使用自定义驱动包路径, jar必须放在 resources下面路径
     * @param resourceXmlPath
     * @param driverRelativePath 驱动jar resources相对路径
     */
    public static void generator(String resourceXmlPath, String driverRelativePath) {
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream(resourceXmlPath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(is);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);

            // 获取当前resources的绝对路径
            config.getClassPathEntries().clear();
            String currPath = URLDecoder.decode(GeneratorUtil.class.getResource("").getPath(), "UTF-8");
            String prjPath = currPath.substring(0, currPath.indexOf("target"));
            String resPath = prjPath + "src/main/resources";
            config.getClassPathEntries().add(resPath + "/" + driverRelativePath);

            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
    }
}
