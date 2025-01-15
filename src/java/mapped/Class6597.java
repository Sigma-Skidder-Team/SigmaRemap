// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public final class Class6597 implements Class6595
{
    public final /* synthetic */ String field26158;
    
    public Class6597(final String field26158) {
        this.field26158 = field26158;
    }
    
    @Override
    public Class5414 method20041(final CommandContext<Class7492> commandContext) throws CommandSyntaxException {
        return new Class5416(Class6886.method21144(commandContext, this.field26158));
    }
    
    @Override
    public ArgumentBuilder<Class7492, ?> method20042(final ArgumentBuilder<Class7492, ?> argumentBuilder, final Function<ArgumentBuilder<Class7492, ?>, ArgumentBuilder<Class7492, ?>> function) {
        return (ArgumentBuilder<Class7492, ?>)argumentBuilder.then(Class7788.method25001("entity").then((ArgumentBuilder)function.apply((ArgumentBuilder<Class7492, ?>)Class7788.method25002(this.field26158, (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21143()))));
    }
}
