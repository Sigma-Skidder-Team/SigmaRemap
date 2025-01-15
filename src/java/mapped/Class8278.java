// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.Collection;
import com.mojang.brigadier.context.CommandContext;

public class Class8278 implements Class8279
{
    private static String[] field34060;
    public final /* synthetic */ Class1932 field34061;
    public final /* synthetic */ Class9179 field34062;
    
    public Class8278(final Class9179 field34062, final Class1932 field34063) {
        this.field34062 = field34062;
        this.field34061 = field34063;
    }
    
    @Override
    public Collection<Class8263> method27517(final CommandContext<Class7492> commandContext) throws CommandSyntaxException {
        return Collections.singleton(Class9179.method33546(commandContext, this.field34061));
    }
    
    @Override
    public Either<Class8263, Class7909<Class8263>> method27518(final CommandContext<Class7492> commandContext) throws CommandSyntaxException {
        return (Either<Class8263, Class7909<Class8263>>)Either.left((Object)Class9179.method33546(commandContext, this.field34061));
    }
}
