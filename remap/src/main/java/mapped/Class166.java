// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicate;
import com.mentalfrostbyte.Client;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Class166 implements Predicate<Entity>
{
    private static String[] field481;
    public final /* synthetic */ float field482;
    public final /* synthetic */ Vec3d field483;
    public final /* synthetic */ Vec3d field484;
    public final /* synthetic */ Class234 field485;
    
    public Class166(final Class234 field485, final float field486, final Vec3d field487, final Vec3d field488) {
        this.field485 = field485;
        this.field482 = field486;
        this.field483 = field487;
        this.field484 = field488;
    }
    
    public boolean apply(final Entity class399) {
        final boolean method18504 = class399.getBoundingBox().expand(this.field482, this.field482, this.field482).intersects(this.field483, this.field484);
        if (class399 != null) {
            if (class399.method1749()) {
                if (method18504) {
                    return !Client.getInstance().getBotManager().method31751(class399);
                }
            }
        }
        return false;
    }
}
