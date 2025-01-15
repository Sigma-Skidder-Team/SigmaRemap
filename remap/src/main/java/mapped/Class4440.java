// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import java.util.Comparator;

public final class Class4440 implements Comparator<Class7971>
{
    private static String[] field19777;
    public final /* synthetic */ String field19778;
    
    public Class4440(final String field19778) {
        this.field19778 = field19778;
    }
    
    @Override
    public int compare(final Class7971 class7971, final Class7971 class7972) {
        final Class8848 method25911 = class7971.method25911(this.field19778);
        final Class8848 method25912 = class7972.method25911(this.field19778);
        Date method25913;
        if (method25911 != null) {
            method25913 = method25911.method30981();
        }
        else {
            method25913 = new Date();
        }
        Date method25914;
        if (method25912 != null) {
            method25914 = method25912.method30981();
        }
        else {
            method25914 = new Date();
        }
        if (method25911 != null) {
            if (method25912 != null) {
                final long n = method25913.getTime() - new Date().getTime();
                final long n2 = method25914.getTime() - new Date().getTime();
                if (n < 0L) {
                    if (n2 < 0L) {
                        return method25914.compareTo(method25913);
                    }
                }
            }
        }
        return method25913.compareTo(method25914);
    }
}
