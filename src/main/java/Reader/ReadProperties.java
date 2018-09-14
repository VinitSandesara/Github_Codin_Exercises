package Reader;

import Services.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties implements IReader {

    private Properties properties;


    private void initPropertiesFile(String fileName) {
        if(isDefaultPropertiesFile(fileName)){
            properties = getDataFromProperties("ApiParams.properties");
        }else{
            properties = getDataFromProperties(fileName);
        }
    }

    public ReadProperties(String fileName){
        initPropertiesFile(fileName);
    }

    public ReadProperties() {
        initPropertiesFile("");
    }

    private Properties getDataFromProperties(String fileName) {
        String path = ResourceUtils.getResourcePath(fileName);
        Properties prop = new Properties();

        try {
            InputStream stream = new FileInputStream(new File(path));
            prop.load(stream);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return prop;
    }

    private boolean isDefaultPropertiesFile(String fileName) {
        if("".equalsIgnoreCase(fileName))
            return true;
        return false;
    }

    public String getSearchApiEndPoint() {
        return properties.getProperty("SearchApiEndPoint");
    }

    public String getAuthorName() {
        return properties.getProperty("AuthorName");
    }

    public String getLanguage() {
        return properties.getProperty("Language");
    }

    public String getSort() {
        return properties.getProperty("Sort");
    }

    public String getOrder() {
        return properties.getProperty("Order");
    }

    public String getPerPageList() {
        return properties.getProperty("PerPageList");
    }

    public String getPageNumber() {
        return properties.getProperty("PageNumber");
    }

    public String getQuery() {
        return properties.getProperty("Query");
    }
}
