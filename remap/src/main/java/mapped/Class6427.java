// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public final class Class6427 extends Class6397
{
    private static String[] field25535;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final World method16763 = class5491.method16763();
        final Direction class5493 = class5491.method16765().get(Class3955.field17859);
        final BlockPos method16764 = class5491.method16764().method1149(class5493);
        if (method16763.method6961(method16764) && Class3938.method12052(method16763, method16764, class5492)) {
            method16763.setBlockState(method16764, ((StateHolder<O, BlockState>) Blocks.field29455.getDefaultState()).with((IProperty<Comparable>)Class3936.field17819, (class5493.getAxis() != Direction.Axis.Y) ? (class5493.getOpposite().getHorizontalIndex() * 4) : 0), 3);
            final TileEntity method16765 = method16763.getTileEntity(method16764);
            if (method16765 instanceof Class493) {
                Class3938.method12051(method16763, method16764, (Class493)method16765);
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
