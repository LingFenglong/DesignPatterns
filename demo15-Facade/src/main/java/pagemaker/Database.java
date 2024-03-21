package pagemaker;

import java.util.Properties;

public class Database {
    private Database() {

    }
    public static Properties getProperties() {
        Properties properties = new Properties();
        properties.put("baidu.com", "Baidu");
        properties.put("bing.cn", "Bing");
        properties.put("lingfenglong.com", "LingFenglong");
        return properties;
    }
}
