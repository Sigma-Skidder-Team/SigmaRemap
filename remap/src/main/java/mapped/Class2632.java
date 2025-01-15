// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2632 extends Class2466
{
    private static String[] field14726;
    public final /* synthetic */ Class3004 field14727;
    
    public Class2632(final Class3004 field14727) {
        this.field14727 = field14727;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        for (int intValue = class8699.method29824(Class5260.field22312), i = 0; i < intValue; ++i) {
            final byte byteValue = class8699.method29822(Class5260.field22289);
            class8699.method29823(Class5260.field22312, (byteValue & 0xF0) >> 4);
            class8699.method29824(Class5260.field22289);
            class8699.method29824(Class5260.field22289);
            class8699.method29823(Class5260.field22289, (byte)(byteValue & 0xF));
            class8699.method29823(Class5260.field22325, null);
        }
    }
}
