// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public final class Class6407 extends Class6404
{
    private static String[] field25523;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final World method16763 = class5491.method16763();
        final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().get((IProperty<Direction>)Class3955.field17859));
        final Class510 class5493 = new Class510(method16763, method16764.getX() + 0.5, method16764.getY(), method16764.getZ() + 0.5, null);
        method16763.method6886(class5493);
        method16763.method6706(null, class5493.getPosX(), class5493.getPosY(), class5493.getPosZ(), Class8520.field35632, Class286.field1582, 1.0f, 1.0f);
        class5492.method27693(1);
        return class5492;
    }
}
