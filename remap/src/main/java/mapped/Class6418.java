// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;

public final class Class6418 extends Class6404
{
    private static String[] field25523;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final Direction class5493 = class5491.method16765().get((IProperty<Direction>)Class3955.field17859);
        final double n = class5493.getXOffset();
        final double n2 = class5493.getYOffset();
        final double n3 = class5493.getZOffset();
        final Class406 class5494 = new Class406(class5491.method16763(), class5492, class5491.getX() + n, class5491.method16764().getY() + 0.2f, class5491.getZ() + n3, true);
        class5494.method1958(n, n2, n3, 0.5f, 1.0f);
        class5491.method16763().method6886(class5494);
        class5492.method27693(1);
        return class5492;
    }
    
    @Override
    public void method19088(final Class5491 class5491) {
        class5491.method16763().method6955(1004, class5491.method16764(), 0);
    }
}
