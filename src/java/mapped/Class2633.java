// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ThreadLocalRandom;

public class Class2633 extends Class2466
{
    public final /* synthetic */ Class2928 field14728;
    
    public Class2633(final Class2928 field14728) {
        this.field14728 = field14728;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class8699 method29836 = class8699.method29836(8);
        method29836.method29823(Class5260.field22292, (short)class8699.method29841().method18207(Class6639.class).method20151());
        method29836.method29823(Class5260.field22304, (Short)(-999));
        method29836.method29823(Class5260.field22289, (Byte)2);
        method29836.method29823(Class5260.field22304, (short)ThreadLocalRandom.current().nextInt());
        method29836.method29823(Class5260.field22312, 5);
        final Class74 class8700 = new Class74("");
        class8700.method420(new Class66("force_resync", Double.NaN));
        method29836.method29823(Class5260.field22334, new Class7562(1, (byte)1, (short)0, class8700));
        method29836.method29844(Class5213.class, true, false);
    }
}
