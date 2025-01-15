// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public final class Class6419 extends Class6404
{
    private static String[] field25523;
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final Direction class5493 = class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859);
        ((Class3831)class5492.method27622()).method11773(class5492.method27657()).method23356(class5491.method16763(), class5492, null, class5491.method16764().method1149(class5493), Class2101.field12188, class5493 != Direction.UP, false);
        class5492.method27693(1);
        return class5492;
    }
}
