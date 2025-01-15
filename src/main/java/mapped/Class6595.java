// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public interface Class6595
{
    Class5414 method20041(final CommandContext<Class7492> p0) throws CommandSyntaxException;
    
    ArgumentBuilder<Class7492, ?> method20042(final ArgumentBuilder<Class7492, ?> p0, final Function<ArgumentBuilder<Class7492, ?>, ArgumentBuilder<Class7492, ?>> p1);
}
