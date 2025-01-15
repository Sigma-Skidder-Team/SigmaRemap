// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2642 extends Class2466
{
    private static String[] field14745;
    public final /* synthetic */ Class2801 field14746;
    
    public Class2642(final Class2801 field14746) {
        this.field14746 = field14746;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final String s = class8699.method29818(Class5260.field22308, 0);
        if (s.length() > 100) {
            class8699.method29821(Class5260.field22308, 0, s.substring(0, 100));
        }
    }
}
