// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class Class4064 extends Item
{
    private static String[] field18157;
    
    public Class4064(final Properties properties) {
        super(properties);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final List<Entity> method6739 = class1847.method6739((Class<? extends Entity>)Class426.class, class1848.getBoundingBox().intersect(2.0), class1851 -> {
            final boolean b;
            if (class1851 != null) {
                if (!(!class1851.isAlive())) {
                    if (!(!(class1851.method2098() instanceof Class852))) {
                        return b;
                    }
                }
            }
            return b;
        });
        final ItemStack method6740 = class1848.method2715(class1849);
        if (!method6739.isEmpty()) {
            final Class426 class1850 = method6739.get(0);
            class1850.method2081(class1850.method2082() - 0.5f);
            class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), Class8520.field35042, Class286.field1584, 1.0f, 1.0f);
            return Class9355.method34674(this.method12270(method6740, class1848, new ItemStack(Items.field31578)));
        }
        final RayTraceResult method6741 = Item.method11733(class1847, class1848, RayTraceContext.FluidMode.SOURCE_ONLY);
        if (method6741.getType() != RayTraceResult.Type.MISS) {
            if (method6741.getType() == RayTraceResult.Type.BLOCK) {
                final BlockPos method6742 = ((BlockRayTraceResult)method6741).getPos();
                if (!class1847.method6760(class1848, method6742)) {
                    return Class9355.method34676(method6740);
                }
                if (class1847.getFluidState(method6742).isTagged(Class7324.field28319)) {
                    class1847.method6706(class1848, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), Class8520.field35041, Class286.field1584, 1.0f, 1.0f);
                    return Class9355.method34674(this.method12270(method6740, class1848, Class5333.method16476(new ItemStack(Items.field31441), Class8644.field36251)));
                }
            }
            return Class9355.method34676(method6740);
        }
        return Class9355.method34676(method6740);
    }
    
    public ItemStack method12270(final ItemStack class8321, final PlayerEntity class8322, final ItemStack class8323) {
        class8321.method27693(1);
        class8322.method2859(Class8276.field33981.method8449(this));
        if (!class8321.method27620()) {
            if (!class8322.inventory.method2362(class8323)) {
                class8322.method2822(class8323, false);
            }
            return class8321;
        }
        return class8323;
    }
}
