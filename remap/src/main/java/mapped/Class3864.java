// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.function.Supplier;

public abstract class Class3864<E extends Class436> extends Class3841
{
    public final Supplier<Class5412<? extends E>> field17495;
    
    public Class3864(final Class9288 class9288, final Supplier<Class5412<? extends E>> field17495) {
        super(class9288);
        this.field17495 = field17495;
    }
    
    public abstract Class7191<? extends Class475> method11929(final Class7096 p0, final World p1, final BlockPos p2, final boolean p3);
}
