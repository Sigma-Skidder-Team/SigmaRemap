// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public final class Class6407 extends Class6404
{
    private static String[] field25523;
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class1847 method16763 = class5491.method16763();
        final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859));
        final Class510 class5493 = new Class510(method16763, method16764.getX() + 0.5, method16764.getY(), method16764.getZ() + 0.5, null);
        method16763.method6886(class5493);
        method16763.method6706(null, class5493.method1938(), class5493.method1941(), class5493.method1945(), Class8520.field35632, Class286.field1582, 1.0f, 1.0f);
        class5492.method27693(1);
        return class5492;
    }
}
