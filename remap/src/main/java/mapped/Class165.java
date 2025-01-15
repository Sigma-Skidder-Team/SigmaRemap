// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;

public class Class165 implements Predicate<Entity>
{
    private static String[] field478;
    public final /* synthetic */ float field479;
    public final /* synthetic */ Class3362 field480;
    
    public Class165(final Class3362 field480, final float field481) {
        this.field480 = field480;
        this.field479 = field481;
    }
    
    public boolean apply(final Entity class399) {
        if (class399 != null) {
            if (class399 instanceof Class858) {
                if (class399.method1732(Class3362.method10665().field4684) <= this.field479) {
                    return true;
                }
            }
        }
        return false;
    }
}
