// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;

public class Class167 implements Predicate<Entity>
{
    private static String[] field486;
    public final /* synthetic */ Class3362 field487;
    
    public Class167(final Class3362 field487) {
        this.field487 = field487;
    }
    
    public boolean apply(final Entity class399) {
        if (class399 != null) {
            if (class399 instanceof Class511) {
                if (class399.method1768()) {
                    if (class399.method1732(Class3362.method10663().field4684) <= 9.0f) {
                        if (!(class399 instanceof Class756)) {
                            if (!Class9463.method35173().method35190().method29878(class399)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
