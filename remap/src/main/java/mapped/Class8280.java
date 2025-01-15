// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import com.mojang.brigadier.context.CommandContext;

public class Class8280 implements Class8279
{
    private static String[] field34063;
    public final /* synthetic */ Class1932 field34064;
    public final /* synthetic */ Class9179 field34065;
    
    public Class8280(final Class9179 field34065, final Class1932 field34066) {
        this.field34065 = field34065;
        this.field34064 = field34066;
    }
    
    @Override
    public Collection<Class8263> method27517(final CommandContext<Class7492> commandContext) throws CommandSyntaxException {
        return Class9179.method33545(commandContext, this.field34064).method25616();
    }
    
    @Override
    public Either<Class8263, Class7909<Class8263>> method27518(final CommandContext<Class7492> commandContext) throws CommandSyntaxException {
        return (Either<Class8263, Class7909<Class8263>>)Either.right((Object)Class9179.method33545(commandContext, this.field34064));
    }
}
