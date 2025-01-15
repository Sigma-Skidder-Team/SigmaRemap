// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class418 extends Class416
{
    private static String[] field2526;
    
    public Class418(final EntityType<? extends Class418> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class418(final Class1847 class1847, final Class511 class1848, final double n, final double n2, final double n3) {
        super(EntityType.field29026, class1848, n, n2, n3, class1847);
    }
    
    public Class418(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(EntityType.field29026, n, n2, n3, n4, n5, n6, class1847);
    }
    
    @Override
    public void method2032(final Class7006 class7006) {
        super.method2032(class7006);
        if (!this.field2391.field10067) {
            Label_0067: {
                if (class7006.method21449() != Class2165.field12882) {
                    if (this.field2527 != null) {
                        if (this.field2527 instanceof Class759) {
                            if (!this.field2391.method6765().method31216(Class8878.field37316)) {
                                break Label_0067;
                            }
                        }
                    }
                    final Class7005 class7007 = (Class7005)class7006;
                    final BlockPos method1149 = class7007.method21447().method1149(class7007.method21448());
                    if (this.field2391.method6961(method1149)) {
                        this.field2391.method6692(method1149, Class7521.field29289.method11878());
                    }
                }
                else {
                    final Entity method1150 = ((Class7007)class7006).method21452();
                    if (!method1150.method1704()) {
                        final int method1151 = method1150.method1666();
                        method1150.method1664(5);
                        if (!method1150.method1740(Class7929.method25698(this, this.field2527), 5.0f)) {
                            method1150.method1665(method1151);
                        }
                        else {
                            this.method1900(this.field2527, method1150);
                        }
                    }
                }
            }
            this.method1652();
        }
    }
    
    @Override
    public boolean method1749() {
        return false;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        return false;
    }
}
