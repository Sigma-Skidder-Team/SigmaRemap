// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.net.InetAddress;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;

public class Class8027
{
    private final List<Class9506> field33044;
    private boolean field33045;
    
    public Class8027() {
        this.field33044 = Lists.newArrayList();
    }
    
    public synchronized boolean method26315() {
        return this.field33045;
    }
    
    public synchronized void method26316() {
        this.field33045 = false;
    }
    
    public synchronized List<Class9506> method26317() {
        return Collections.unmodifiableList(this.field33044);
    }
    
    public synchronized void method26318(final String s, final InetAddress inetAddress) {
        final String method5419 = Class917.method5419(s);
        final String method5420 = Class917.method5420(s);
        if (method5420 != null) {
            final String string = inetAddress.getHostAddress() + ":" + method5420;
            int n = 0;
            for (final Class9506 class9506 : this.field33044) {
                if (!class9506.method35415().equals(string)) {
                    continue;
                }
                class9506.method35416();
                n = 1;
                break;
            }
            if (n == 0) {
                this.field33044.add(new Class9506(method5419, string));
                this.field33045 = true;
            }
        }
    }
}
