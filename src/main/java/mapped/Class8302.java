// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public final class Class8302 implements Class8301
{
    public final /* synthetic */ LiteralArgumentBuilder field34122;
    
    public Class8302(final LiteralArgumentBuilder field34122) {
        this.field34122 = field34122;
    }
    
    @Override
    public <T extends Class8117<T>> void method27590(final Class9424<T> class9424, final Class8455<T> class9425) {
        this.field34122.then(((LiteralArgumentBuilder)Class7788.method25001(class9424.method35022()).executes(commandContext -> Class9233.method34050((Class7492)commandContext.getSource(), class9424))).then(class9425.method28219("value").executes(commandContext -> Class9233.method34049(commandContext, class9424))));
    }
}
