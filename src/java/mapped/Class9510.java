// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class9510
{
    private Class9510() {
    }
    
    public static String method35436(final Map<String, String> map) {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(Class9347.method34653(entry.getKey())).append("=").append(Class9347.method34653((String)entry.getValue()));
        }
        return sb.toString();
    }
    
    public static Map<String, String> method35437(final String s) {
        final HashMap hashMap = new HashMap();
        final String[] split = s.split("&");
        for (int length = split.length, i = 0; i < length; ++i) {
            final String[] split2 = split[i].split("=");
            hashMap.put(Class9347.method34654(split2[0]), (split2.length <= 1) ? "" : Class9347.method34654(split2[1]));
        }
        return hashMap;
    }
}
