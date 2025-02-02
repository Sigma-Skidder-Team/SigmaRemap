// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class4103 extends Item
{
    private static String[] field18203;
    
    public Class4103(final Properties properties) {
        super(properties);
    }
    
    @Override
    public boolean method11712(final ItemStack class8321, final World class8322, final BlockState class8323, final BlockPos class8324, final LivingEntity class8325) {
        if (!class8322.isRemote) {
            class8321.method27636(1, class8325, class8326 -> class8326.method2794(Class2215.field13600));
        }
        final Block method21696 = class8323.getBlock();
        if (!class8323.method21755(Class7188.field27907)) {
            if (method21696 != Blocks.field29240) {
                if (method21696 != Blocks.field29241) {
                    if (method21696 != Blocks.field29242) {
                        if (method21696 != Blocks.field29243) {
                            if (method21696 != Blocks.field29388) {
                                if (method21696 != Blocks.field29411) {
                                    if (!method21696.method11785(Class7188.field27879)) {
                                        return super.method11712(class8321, class8322, class8323, class8324, class8325);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean method11713(final BlockState class7096) {
        final Block method21696 = class7096.getBlock();
        if (method21696 != Blocks.field29240) {
            if (method21696 != Blocks.REDSTONE_WIRE) {
                if (method21696 != Blocks.field29411) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public float method11706(final ItemStack class8321, final BlockState class8322) {
        final Block method21696 = class8322.getBlock();
        if (method21696 != Blocks.field29240 && !class8322.method21755(Class7188.field27907)) {
            return method21696.method11785(Class7188.field27879) ? 5.0f : super.method11706(class8321, class8322);
        }
        return 15.0f;
    }
}
