// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public final class Class6403 extends Class6397
{
    private static String[] field25522;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final World method16763 = class5491.method16763();
        this.field25515 = true;
        final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().get((IProperty<Direction>)Class3955.field17859));
        final BlockState method16765 = method16763.getBlockState(method16764);
        if (!Class3827.method11760(method16765, method16763, method16764)) {
            if (!Class3827.method11759(method16765)) {
                if (!(method16765.getBlock() instanceof Class3976)) {
                    this.field25515 = false;
                }
                else {
                    Class3976.method12118(method16763, method16764);
                    method16763.method6690(method16764, false);
                }
            }
            else {
                method16763.method6692(method16764, ((StateHolder<Object, BlockState>)method16765).with((IProperty<Comparable>)Class8970.field37736, true));
            }
        }
        else {
            method16763.method6692(method16764, Class7521.field29289.getDefaultState());
        }
        if (this.field25515) {
            if (class5492.method27635(1, method16763.rand, null)) {
                class5492.method27691(0);
            }
        }
        return class5492;
    }
}
