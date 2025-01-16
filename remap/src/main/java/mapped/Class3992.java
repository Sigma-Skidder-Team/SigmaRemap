// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class Class3992 extends Block
{
    private static String[] field18011;
    
    public Class3992(final Class9288 class9288) {
        super(class9288);
    }
    
    public int method12141(final Random random) {
        if (this == Blocks.field29180) {
            return MathHelper.method35658(random, 0, 2);
        }
        if (this == Blocks.DIAMOND_ORE) {
            return MathHelper.method35658(random, 3, 7);
        }
        if (this == Blocks.field29408) {
            return MathHelper.method35658(random, 3, 7);
        }
        if (this != Blocks.field29214) {
            return (this != Blocks.field29474) ? 0 : MathHelper.method35658(random, 2, 5);
        }
        return MathHelper.method35658(random, 2, 5);
    }
    
    @Override
    public void method11831(final BlockState class7096, final World class7097, final BlockPos class7098, final ItemStack class7099) {
        super.method11831(class7096, class7097, class7098, class7099);
        if (Class8742.method30195(Class7882.field32366, class7099) == 0) {
            final int method12141 = this.method12141(class7097.rand);
            if (method12141 > 0) {
                this.method11840(class7097, class7098, method12141);
            }
        }
    }
}
