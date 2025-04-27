// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicate;
import com.mentalfrostbyte.jello.mods.impl.world.AutoCrystal;
import net.minecraft.entity.Entity;

public class Class165 implements Predicate<Entity>
{
    private static String[] field478;
    public final /* synthetic */ float field479;
    public final /* synthetic */ AutoCrystal field480;
    
    public Class165(final AutoCrystal field480, final float field481) {
        this.field480 = field480;
        this.field479 = field481;
    }
    
    public boolean apply(final Entity class399) {
        if (class399 != null) {
            if (class399 instanceof Class858) {
                return class399.method1732(AutoCrystal.method10665().field4684) <= this.field479;
            }
        }
        return false;
    }
}
