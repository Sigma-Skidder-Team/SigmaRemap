// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class410 extends Class409
{
    private static String[] field2507;
    
    public Class410(final Class7499<? extends Class410> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class410(final Class1847 class1847, final Class511 class1848) {
        super(Class7499.field29036, class1848, class1847);
    }
    
    public Class410(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29036, n, n2, n3, class1847);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b == 3) {
            for (int i = 0; i < 8; ++i) {
                this.field2391.method6709(new Class6910(Class8432.field34629, this.method2005()), this.getPosX(), this.getPosY(), this.getPosZ(), (this.field2423.nextFloat() - 0.5) * 0.08, (this.field2423.nextFloat() - 0.5) * 0.08, (this.field2423.nextFloat() - 0.5) * 0.08);
            }
        }
    }
    
    @Override
    public void method2016(final Class7006 class7006) {
        if (class7006.method21449() == Class2165.field12882) {
            ((Class7007)class7006).method21452().method1740(Class7929.method25699(this, this.method2019()), 0.0f);
        }
        if (!this.field2391.field10067) {
            if (this.field2423.nextInt(8) == 0) {
                int n = 1;
                if (this.field2423.nextInt(32) == 0) {
                    n = 4;
                }
                for (int i = 0; i < n; ++i) {
                    final Class818 class7007 = Class7499.field28966.method23371(this.field2391);
                    class7007.method4354(-24000);
                    class7007.method1730(this.getPosX(), this.getPosY(), this.getPosZ(), this.field2399, 0.0f);
                    this.field2391.method6886(class7007);
                }
            }
            this.field2391.method6761(this, (byte)3);
            this.method1652();
        }
    }
    
    @Override
    public Class3820 method2013() {
        return Class7739.field31374;
    }
}
