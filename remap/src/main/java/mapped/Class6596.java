// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public final class Class6596 implements Class6595
{
    public final /* synthetic */ String field26157;
    
    public Class6596(final String field26157) {
        this.field26157 = field26157;
    }
    
    @Override
    public Class5414 method20041(final CommandContext<Class7492> commandContext) {
        return new Class5415(Class5415.method16535(commandContext), Class7000.method21433(commandContext, this.field26157), null);
    }
    
    @Override
    public ArgumentBuilder<Class7492, ?> method20042(final ArgumentBuilder<Class7492, ?> argumentBuilder, final Function<ArgumentBuilder<Class7492, ?>, ArgumentBuilder<Class7492, ?>> function) {
        return (ArgumentBuilder<Class7492, ?>)argumentBuilder.then(Class7788.method25001("storage").then(function.apply(Class7788.method25002(this.field26157, (ArgumentType<Object>)Class7000.method21429()).suggests(Class5415.method16536()))));
    }
}
