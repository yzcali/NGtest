package com.techproed.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    //bu classi projemizin her yerinden nesne uretmeden miras almadan
    // kullanilabilecek sekilde tasarlayalim.
    // static olacak program calisir calismaz ; bellekte yer tutmaya yarayan keyword
    static Properties properties;


    static {
        // okumak istediginiz configuration.properties file in dosya yolu
        String path = "configuration.properties";
        // dene-hata varsa yakala eger hata alirsan prog durdurma
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        } catch (Exception e) {

        }
    }

    public static String getProperty(String key) {
        //properties.getProperty("username")-----> manager2
        return properties.getProperty(key);
    }

}
