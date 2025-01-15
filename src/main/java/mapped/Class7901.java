// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class7901
{
    private static String[] field32424;
    private static Map<Integer, Class8690> field32425;
    private static Class8891 field32426;
    
    public static float method25570(final int i, final float n, final float n2, final float n3) {
        synchronized (Class7901.field32425) {
            final Integer value = i;
            Class8690 class8690 = Class7901.field32425.get(value);
            if (class8690 == null) {
                class8690 = new Class8690(n, n2, n3);
                Class7901.field32425.put(value, class8690);
            }
            return class8690.method29789(n, n2, n3);
        }
    }
    
    public static int method25571() {
        synchronized (Class7901.field32426) {
            return Class7901.field32426.method31287();
        }
    }
    
    public static void method25572() {
        synchronized (Class7901.field32425) {
            Class7901.field32425.clear();
        }
    }
    
    static {
        Class7901.field32425 = new HashMap<Integer, Class8690>();
        Class7901.field32426 = new Class8891(1);
    }
}
