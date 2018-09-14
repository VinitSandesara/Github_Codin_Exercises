package Services;

import Reader.IReader;
import Reader.ReadProperties;

public class ApiServices {


    private IReader reader;

    public IReader getReader() {
        return reader;
    }

    public ApiServices() {
        reader = new ReadProperties();
    }



}
