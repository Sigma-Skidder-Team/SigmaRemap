// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.Proxy;

public final class Class7621
{
    private Class7621() {
    }
    
    public static String method23956(final Class8596 class8596, final Proxy.Type type) {
        final StringBuilder sb = new StringBuilder();
        sb.append(class8596.method29110());
        sb.append(' ');
        if (!method23957(class8596, type)) {
            sb.append(method23958(class8596.method29109()));
        }
        else {
            sb.append(class8596.method29109());
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }
    
    private static boolean method23957(final Class8596 class8596, final Proxy.Type type) {
        return !class8596.method29118() && type == Proxy.Type.HTTP;
    }
    
    public static String method23958(final Class8846 class8846) {
        final String method30940 = class8846.method30940();
        final String method30941 = class8846.method30944();
        return (method30941 == null) ? method30940 : (method30940 + '?' + method30941);
    }
}
