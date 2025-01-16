// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public final class Class6594 implements Class6595
{
    public final /* synthetic */ String field26156;
    
    public Class6594(final String field26156) {
        this.field26156 = field26156;
    }
    
    @Override
    public Class5414 method20041(final CommandContext<Class7492> commandContext) throws CommandSyntaxException {
        final BlockPos method27768 = Class8330.method27768(commandContext, this.field26156 + "Pos");
        final TileEntity method27769 = ((Class7492)commandContext.getSource()).method23250().getTileEntity(method27768);
        if (method27769 != null) {
            return new Class5413(method27769, method27768);
        }
        throw Class5413.method16531().create();
    }
    
    @Override
    public ArgumentBuilder<Class7492, ?> method20042(final ArgumentBuilder<Class7492, ?> argumentBuilder, final Function<ArgumentBuilder<Class7492, ?>, ArgumentBuilder<Class7492, ?>> function) {
        return (ArgumentBuilder<Class7492, ?>)argumentBuilder.then(Class7788.method25001("block").then((ArgumentBuilder)function.apply((ArgumentBuilder<Class7492, ?>)Class7788.method25002(this.field26156 + "Pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()))));
    }
}
