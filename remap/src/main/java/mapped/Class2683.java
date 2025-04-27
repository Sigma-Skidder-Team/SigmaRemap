// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2683 extends Class2466
{
    private static String[] field14824;
    public final /* synthetic */ Class2864 field14825;
    
    public Class2683(final Class2864 field14825) {
        this.field14825 = field14825;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22296, 0);
        final int intValue2 = class8699.method29818(Class5260.field22296, 1);
        if (intValue != 1010) {
            if (intValue == 2001) {
                class8699.method29821(Class5260.field22296, 1, Class7559.method23731((intValue2 & 0xFFF) << 4 | intValue2 >> 12));
            }
        }
        else {
            class8699.method29821(Class5260.field22296, 1, Class9526.field41005.get(intValue2 << 4));
        }
    }
}
