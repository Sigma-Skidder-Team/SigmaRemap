// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicate;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.world.AutoCrystal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class Class167 implements Predicate<Entity>
{
    private static String[] field486;
    public final /* synthetic */ AutoCrystal field487;
    
    public Class167(final AutoCrystal field487) {
        this.field487 = field487;
    }
    
    public boolean apply(final Entity class399) {
        if (class399 != null) {
            if (class399 instanceof LivingEntity) {
                if (class399.method1768()) {
                    if (class399.method1732(AutoCrystal.method10663().field4684) <= 9.0f) {
                        if (!(class399 instanceof ClientPlayerEntity)) {
                            if (!Client.getInstance().getFriendManager().method29878(class399)) {
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
