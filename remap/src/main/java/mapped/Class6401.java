// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

public class Class6401 extends Class6397
{
    private static String[] field25519;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        this.field25515 = false;
        final Item method27622 = class5492.getItem();
        if (method27622 instanceof Class4036) {
            final Direction class5493 = class5491.method16765().get((IProperty<Direction>)Class3955.field17859);
            final BlockPos method27623 = class5491.method16764().method1149(class5493);
            this.field25515 = (((Class4036)method27622).method12229(new Class7073(class5491.method16763(), method27623, class5493, class5492, class5491.method16763().method6961(method27623.method1139()) ? class5493 : Direction.UP)) == Class2201.field13400);
        }
        return class5492;
    }
}
