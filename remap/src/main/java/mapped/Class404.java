// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class404 extends Class402
{
    private int field2489;
    
    public Class404(final EntityType<? extends Class404> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2489 = 200;
    }
    
    public Class404(final Class1847 class1847, final Class511 class1848) {
        super(EntityType.field29029, class1848, class1847);
        this.field2489 = 200;
    }
    
    public Class404(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29029, n, n2, n3, class1847);
        this.field2489 = 200;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2391.field10067) {
            if (!this.field2472) {
                this.field2391.method6709(Class8432.field34628, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public ItemStack method1974() {
        return new ItemStack(Class7739.field31580);
    }
    
    @Override
    public void method1970(final Class511 class511) {
        super.method1970(class511);
        class511.method2655(new Class1948(Class9439.field40497, this.field2489, 0));
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method315("Duration")) {
            this.field2489 = class51.method319("Duration");
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("Duration", this.field2489);
    }
}
