// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2682 extends Class2466
{
    private static String[] field14822;
    public final /* synthetic */ Class2811 field14823;
    
    public Class2682(final Class2811 field14823) {
        this.field14823 = field14823;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        for (int i = 0; i < 3; ++i) {
            final float floatValue = class8699.method29818(Class5260.field22302, i);
            if (floatValue < 0.0f) {
                class8699.method29821(Class5260.field22302, i, Float.valueOf((int)floatValue));
            }
        }
    }
}
