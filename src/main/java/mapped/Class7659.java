// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.URI;
import java.util.Map;

public class Class7659 extends Class7662
{
    public String[] field30408;
    public boolean field30409;
    public boolean field30410;
    public String field30411;
    public String field30412;
    public Map<String, Class7662> field30413;
    
    public Class7659() {
        this.field30409 = true;
    }
    
    private static Class7659 method24281(final URI uri, Class7659 class7659) {
        if (class7659 == null) {
            class7659 = new Class7659();
        }
        class7659.field30411 = uri.getHost();
        class7659.field30430 = ("https".equals(uri.getScheme()) || "wss".equals(uri.getScheme()));
        class7659.field30432 = uri.getPort();
        final String rawQuery = uri.getRawQuery();
        if (rawQuery != null) {
            class7659.field30412 = rawQuery;
        }
        return class7659;
    }
}
