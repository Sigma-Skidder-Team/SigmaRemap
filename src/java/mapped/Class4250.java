// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Timer;

public class Class4250 implements Class4248
{
    private static String[] field19073;
    public final /* synthetic */ Timer field19074;
    public final /* synthetic */ Class4967 field19075;
    
    public Class4250(final Class4967 field19075, final Timer field19076) {
        this.field19075 = field19075;
        this.field19074 = field19076;
    }
    
    @Override
    public void method12753() {
        this.field19074.cancel();
    }
}
