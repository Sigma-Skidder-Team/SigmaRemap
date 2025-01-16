// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

@FunctionalInterface
public interface Class7410
{
    public static final Class7410 field28544 = class9104 -> p0 -> true;
    public static final Class7410 field28545 = class9104 -> p0 -> false;
    
    Predicate<BlockState> method22768(final StateContainer<Block, BlockState> p0);
}
