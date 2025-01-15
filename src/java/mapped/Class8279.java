// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import com.mojang.brigadier.context.CommandContext;

public interface Class8279
{
    Collection<Class8263> method27517(final CommandContext<Class7492> p0) throws CommandSyntaxException;
    
    Either<Class8263, Class7909<Class8263>> method27518(final CommandContext<Class7492> p0) throws CommandSyntaxException;
}
