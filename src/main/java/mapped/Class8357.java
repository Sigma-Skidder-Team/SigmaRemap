// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface Class8357 extends Class8356
{
    int method27894(final int p0, final int p1) throws CommandSyntaxException;
    
    default void method27893(final Class7628 class7628, final Class7628 class7629) throws CommandSyntaxException {
        class7628.method23971(this.method27894(class7628.method23969(), class7629.method23969()));
    }
}
