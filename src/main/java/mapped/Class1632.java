// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

public class Class1632 implements Runnable
{
    private static final Map<String, Integer> field9124;
    private static Class1632 field9125;
    
    public Class1632() {
        Class1632.field9125 = this;
    }
    
    public static Integer method5676(final String s) {
        final Map<String, Integer> method23319 = ((Class7494)Class8563.method28792()).method23319();
        final Integer n = method23319.get(s);
        if (n != null) {
            return n;
        }
        final Integer n2 = Class1632.field9124.get(s);
        if (n2 != null) {
            return n2;
        }
        final Integer n3 = method23319.get("default");
        if (n3 != null) {
            return n3;
        }
        try {
            return Class8563.method28794().method33560().method30251();
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return Class7906.field32452.method25613();
        }
    }
    
    @Override
    public void run() {
    }
    
    public static Map<String, Integer> method5677() {
        return new HashMap<String, Integer>(Class1632.field9124);
    }
    
    public static Class1632 method5678() {
        return Class1632.field9125;
    }
    
    static {
        field9124 = new ConcurrentHashMap<String, Integer>();
    }
}
