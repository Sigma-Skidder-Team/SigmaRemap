// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Timer;

public class Class4249 implements Handle
{
    private static String[] field19070;
    public final /* synthetic */ Timer field19071;
    public final /* synthetic */ Class1040 field19072;
    
    public Class4249(final Class1040 field19072, final Timer field19073) {
        this.field19072 = field19072;
        this.field19071 = field19073;
    }
    
    @Override
    public void destroy() {
        this.field19071.cancel();
    }
}
