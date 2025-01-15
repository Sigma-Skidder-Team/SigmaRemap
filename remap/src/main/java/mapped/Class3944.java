// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class3944 extends Class3841
{
    private final Class181 field17837;
    
    public Class3944(final Class181 field17837, final Class9288 class9288) {
        super(class9288);
        this.field17837 = field17837;
    }
    
    @Override
    public boolean method11854() {
        return true;
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class465(this.field17837);
    }
    
    @Override
    public void method11853(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849, final Class511 class1850, final Class8321 class1851) {
        if (class1851.method27667()) {
            final Class436 method6727 = class1847.method6727(class1848);
            if (method6727 instanceof Class465) {
                ((Class465)method6727).method2384(class1851.method27664());
            }
        }
    }
    
    @Override
    public Class8321 method11862(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        final Class436 method6727 = class1855.method6727(class1856);
        return (method6727 instanceof Class465) ? ((Class465)method6727).method2389(class1857) : super.method11862(class1855, class1856, class1857);
    }
    
    public Class181 method12064() {
        return this.field17837;
    }
}
