// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public final class Class6408 extends Class6404
{
    private static String[] field25523;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final Direction class5493 = class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859);
        final BlockPos method1149 = class5491.method16764().method1149(class5493);
        final World method1150 = class5491.method16763();
        final Class857 class5494 = new Class857(method1150, method1149.getX() + 0.5, method1149.getY(), method1149.getZ() + 0.5);
        EntityType.method23360(method1150, null, class5494, class5492.method27657());
        class5494.rotationYaw = class5493.getHorizontalAngle();
        method1150.method6886(class5494);
        class5492.method27693(1);
        return class5492;
    }
}
