// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class Class4098 extends Item
{
    private static String[] field18198;
    private static final Predicate<Entity> field18199;
    private final Class241 field18200;
    
    public Class4098(final Class241 field18200, final Properties properties) {
        super(properties);
        this.field18200 = field18200;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final RayTraceResult method2716 = Item.method11733(class1847, class1848, RayTraceContext.FluidMode.ANY);
        if (method2716.getType() == RayTraceResult.Type.MISS) {
            return Class9355.method34676(method2715);
        }
        final List<Entity> method2717 = class1847.getEntitiesInAABBexcluding(class1848, class1848.getBoundingBox().expand(class1848.method1741(1.0f).scale(5.0)).intersect(1.0), Class4098.field18199);
        if (!method2717.isEmpty()) {
            final Vec3d method2718 = class1848.method1747(1.0f);
            for (final Entity class1850 : method2717) {
                if (!class1850.getBoundingBox().intersect(class1850.method1790()).contains(method2718)) {
                    continue;
                }
                return Class9355.method34676(method2715);
            }
        }
        if (method2716.getType() != RayTraceResult.Type.BLOCK) {
            return Class9355.method34676(method2715);
        }
        final Class423 class1851 = new Class423(class1847, method2716.getHitVec().x, method2716.getHitVec().y, method2716.getHitVec().z);
        class1851.method2064(this.field18200);
        class1851.rotationYaw = class1848.rotationYaw;
        if (class1847.method6978(class1851, class1851.getBoundingBox().intersect(-0.1))) {
            if (!class1847.isRemote) {
                class1847.method6886(class1851);
                if (!class1848.field3025.field27304) {
                    method2715.method27693(1);
                }
            }
            class1848.method2859(Class8276.field33981.method8449(this));
            return Class9355.method34674(method2715);
        }
        return Class9355.method34677(method2715);
    }
    
    static {
        field18199 = Class9170.field38850.and(Entity::method1749);
    }
}
