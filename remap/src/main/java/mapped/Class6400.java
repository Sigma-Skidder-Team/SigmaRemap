// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public final class Class6400 extends Class6397
{
    private static String[] field25518;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final World method16763 = class5491.method16763();
        final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().get((IProperty<Direction>)Class3955.field17859));
        final Class3901 class5493 = (Class3901)Class7521.field29342;
        if (method16763.method6961(method16764) && class5493.method11995(method16763, method16764)) {
            if (!method16763.isRemote) {
                method16763.setBlockState(method16764, class5493.getDefaultState(), 3);
            }
            class5492.method27693(1);
            this.field25515 = true;
        }
        else {
            this.field25515 = Class4055.method12256(class5491, class5492);
        }
        return class5492;
    }
}
