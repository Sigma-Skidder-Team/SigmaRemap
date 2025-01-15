// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class2551 extends Class2466
{
    private static String[] field14580;
    public final /* synthetic */ Class2804 field14581;
    
    public Class2551(final Class2804 field14581) {
        this.field14581 = field14581;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final short shortValue = class8699.method29822(Class5260.field22304);
        if (shortValue != 0) {
            final Class8699 class8700 = new Class8699(60, null, class8699.method29841());
            class8700.method29823(Class5260.field22312, (Integer)class8699.method29818((Class5260<T>)Class5260.field22312, 0));
            class8700.method29823(Class5260.field22312, 0);
            class8700.method29823(Class5260.field22328, new Class7562(shortValue, (byte)1, (short)0, null));
            try {
                class8700.method29831(Class5224.class, true, true);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
