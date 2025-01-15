// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class Class5999 extends Class5998
{
    private static String[] field24471;
    public final /* synthetic */ Class6588 field24472;
    
    public Class5999(final Class6588 field24472) {
        this.field24472 = field24472;
        super(field24472);
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        final Object method17922 = super.method17922(class7576);
        if (method17922 instanceof Class5999 && !(method17922 instanceof ConcurrentSkipListMap)) {
            return new ConcurrentSkipListMap((Map<?, ?>)method17922);
        }
        return method17922;
    }
}
