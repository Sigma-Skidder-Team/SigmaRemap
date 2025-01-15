// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicate;

public class Class166 implements Predicate<Class399>
{
    private static String[] field481;
    public final /* synthetic */ float field482;
    public final /* synthetic */ Class5487 field483;
    public final /* synthetic */ Class5487 field484;
    public final /* synthetic */ Class234 field485;
    
    public Class166(final Class234 field485, final float field486, final Class5487 field487, final Class5487 field488) {
        this.field485 = field485;
        this.field482 = field486;
        this.field483 = field487;
        this.field484 = field488;
    }
    
    public boolean apply(final Class399 class399) {
        final boolean method18504 = class399.method1886().method18494(this.field482, this.field482, this.field482).method18504(this.field483, this.field484);
        if (class399 != null) {
            if (class399.method1749()) {
                if (method18504) {
                    if (!Class9463.method35173().method35191().method31751(class399)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
