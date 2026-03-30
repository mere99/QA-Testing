package seminar5.ex2;

import java.util.HashMap;
import java.util.Map;

public class JucatorPrototypeFactory {
    private static Map<String, AbstractJucator> prototipuri = null;

    static
    {
        prototipuri=new HashMap<String, AbstractJucator>();
        prototipuri.put("Fotbal", new JucatorFotbal());
        prototipuri.put("Baschet", new JucatorBaschet());
    }
}
