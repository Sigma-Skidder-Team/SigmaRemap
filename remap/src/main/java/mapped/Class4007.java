// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4007 extends Class3833
{
    private static final Class2250 field18066;
    
    public Class4007(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            class7099.method2857(Class8276.field34042);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class434 method11827(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        return new Class504((n, class1849, class1850) -> new Class3428(n, class1849, Class7318.method22434(class7097, class7098)), Class4007.field18066);
    }
    
    static {
        field18066 = new Class2259("container.crafting", new Object[0]);
    }
}
