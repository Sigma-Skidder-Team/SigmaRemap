// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Class9477
{
    private static final int field40749 = 15;
    private static final int field40750 = 31;
    private static final int field40751 = 63;
    private static final int field40752 = 127;
    public static final Class8975[] field40753;
    public static final Map<Class1929, Integer> field40754;
    
    private Class9477() {
    }
    
    private static Map<Class1929, Integer> method35284() {
        final LinkedHashMap m = new LinkedHashMap(Class9477.field40753.length);
        for (int i = 0; i < Class9477.field40753.length; ++i) {
            if (!m.containsKey(Class9477.field40753[i].field37840)) {
                m.put(Class9477.field40753[i].field37840, i);
            }
        }
        return (Map<Class1929, Integer>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    public static Class1929 method35285(final Class1929 class1929) throws IOException {
        for (int i = 0; i < class1929.method7766(); ++i) {
            final byte method7765 = class1929.method7765(i);
            if (method7765 >= 65 && method7765 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + class1929.method7743());
            }
        }
        return class1929;
    }
    
    static {
        field40753 = new Class8975[] { new Class8975(Class8975.field37839, ""), new Class8975(Class8975.field37836, "GET"), new Class8975(Class8975.field37836, "POST"), new Class8975(Class8975.field37837, "/"), new Class8975(Class8975.field37837, "/index.html"), new Class8975(Class8975.field37838, "http"), new Class8975(Class8975.field37838, "https"), new Class8975(Class8975.field37835, "200"), new Class8975(Class8975.field37835, "204"), new Class8975(Class8975.field37835, "206"), new Class8975(Class8975.field37835, "304"), new Class8975(Class8975.field37835, "400"), new Class8975(Class8975.field37835, "404"), new Class8975(Class8975.field37835, "500"), new Class8975("accept-charset", ""), new Class8975("accept-encoding", "gzip, deflate"), new Class8975("accept-language", ""), new Class8975("accept-ranges", ""), new Class8975("accept", ""), new Class8975("access-control-allow-origin", ""), new Class8975("age", ""), new Class8975("allow", ""), new Class8975("authorization", ""), new Class8975("cache-control", ""), new Class8975("content-disposition", ""), new Class8975("content-encoding", ""), new Class8975("content-language", ""), new Class8975("content-length", ""), new Class8975("content-location", ""), new Class8975("content-range", ""), new Class8975("content-type", ""), new Class8975("cookie", ""), new Class8975("date", ""), new Class8975("etag", ""), new Class8975("expect", ""), new Class8975("expires", ""), new Class8975("from", ""), new Class8975("host", ""), new Class8975("if-match", ""), new Class8975("if-modified-since", ""), new Class8975("if-none-match", ""), new Class8975("if-range", ""), new Class8975("if-unmodified-since", ""), new Class8975("last-modified", ""), new Class8975("link", ""), new Class8975("location", ""), new Class8975("max-forwards", ""), new Class8975("proxy-authenticate", ""), new Class8975("proxy-authorization", ""), new Class8975("range", ""), new Class8975("referer", ""), new Class8975("refresh", ""), new Class8975("retry-after", ""), new Class8975("server", ""), new Class8975("set-cookie", ""), new Class8975("strict-transport-security", ""), new Class8975("transfer-encoding", ""), new Class8975("user-agent", ""), new Class8975("vary", ""), new Class8975("via", ""), new Class8975("www-authenticate", "") };
        field40754 = method35284();
    }
}
