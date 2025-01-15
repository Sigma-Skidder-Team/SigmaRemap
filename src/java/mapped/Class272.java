// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public enum Class272
{
    field1477(Class272.\uab7b\u6a9b\ud553\u85cc\ubfb4\u35ef[0]), 
    field1478(Class272.\uab7b\u6a9b\ud553\u85cc\ubfb4\u35ef[1]), 
    field1479(Class272.\uab7b\u6a9b\ud553\u85cc\ubfb4\u35ef[2]), 
    field1480(Class272.\uab7b\u6a9b\ud553\u85cc\ubfb4\u35ef[3]), 
    field1481(Class272.\uab7b\u6a9b\ud553\u85cc\ubfb4\u35ef[4]);
    
    public final String field1482;
    
    private Class272(final String field1482) {
        this.field1482 = field1482;
    }
    
    public static Class272 method919(final String str) {
        switch (str) {
            case "TLSv1.3": {
                return Class272.field1477;
            }
            case "TLSv1.2": {
                return Class272.field1478;
            }
            case "TLSv1.1": {
                return Class272.field1479;
            }
            case "TLSv1": {
                return Class272.field1480;
            }
            case "SSLv3": {
                return Class272.field1481;
            }
            default: {
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
            }
        }
    }
    
    public static List<Class272> method920(final String... array) {
        final ArrayList list = new ArrayList(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(method919(array[i]));
        }
        return (List<Class272>)Collections.unmodifiableList((List<?>)list);
    }
    
    public String method921() {
        return this.field1482;
    }
}
