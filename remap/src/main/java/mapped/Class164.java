// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicate;
import com.mentalfrostbyte.jello.mods.impl.world.AutoCrystal;
import net.minecraft.entity.Entity;

public class Class164 implements Predicate<Entity>
{
    private static String[] field475;
    public final /* synthetic */ float field476;
    public final /* synthetic */ AutoCrystal field477;
    
    public Class164(final AutoCrystal field477, final float field478) {
        this.field477 = field477;
        this.field476 = field478;
    }
    
    public boolean apply(final Entity class399) {
        return class399 != null && class399.method1732(AutoCrystal.method10664().field4684) <= this.field476 + 2.0f;
    }
}
