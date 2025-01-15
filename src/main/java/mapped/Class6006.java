// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class Class6006 extends Class6005
{
    private static String[] field24479;
    public final /* synthetic */ Class6588 field24480;
    
    public Class6006(final Class6588 field24480) {
        this.field24480 = field24480;
        super(field24480);
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
