// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;

@FunctionalInterface
public interface Class8561<T extends Number, R extends Class8684<T>>
{
    R method28779(final StringReader p0, final T p1, final T p2) throws CommandSyntaxException;
}
