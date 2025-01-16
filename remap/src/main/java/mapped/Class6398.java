// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public final class Class6398 extends Class6397
{
    private static String[] field25516;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final World method16763 = class5491.method16763();
        if (!method16763.isRemote()) {
            this.field25515 = false;
            final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().get((IProperty<Direction>)Class3955.field17859));
            for (final Class802 class5493 : method16763.method7128((Class<? extends Class802>)Class802.class, new AxisAlignedBB(method16764))) {
                if (!class5493.method1768()) {
                    continue;
                }
                if (class5493.method4636()) {
                    continue;
                }
                if (class5493.method2625()) {
                    continue;
                }
                class5493.method4633();
                if (class5492.method27635(1, method16763.rand, null)) {
                    class5492.method27691(0);
                }
                this.field25515 = true;
                break;
            }
            if (!this.field25515) {
                final BlockState method16765 = method16763.getBlockState(method16764);
                if (method16765.method21755(Class7188.field27931)) {
                    if (method16765.get((IProperty<Integer>)Class3961.field17902) >= 5) {
                        if (class5492.method27635(1, method16763.rand, null)) {
                            class5492.method27691(0);
                        }
                        Class3961.method12083(method16763, method16764);
                        ((Class3961)method16765.getBlock()).method12085(method16763, method16765, method16764, null, Class2144.field12625);
                        this.field25515 = true;
                    }
                }
            }
        }
        return class5492;
    }
}
