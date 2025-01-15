// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class9233
{
    public static void method34045(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralArgumentBuilder literalArgumentBuilder = (LiteralArgumentBuilder)Class7788.method25001("gamerule").requires(class7492 -> class7492.method23210(2));
        Class8878.method31214(new Class8302(literalArgumentBuilder));
        commandDispatcher.register(literalArgumentBuilder);
    }
    
    private static <T extends Class8117<T>> int method34046(final CommandContext<Class7492> commandContext, final Class9424<T> class9424) {
        final Class7492 class9425 = (Class7492)commandContext.getSource();
        final Class8117<T> method31211 = class9425.method23255().method1583().method31211(class9424);
        method31211.method26707(commandContext, "value");
        class9425.method23257(new Class2259("commands.gamerule.set", new Object[] { class9424.method35022(), method31211.toString() }), true);
        return method31211.method26711();
    }
    
    private static <T extends Class8117<T>> int method34047(final Class7492 class7492, final Class9424<T> class7493) {
        final Class8117<T> method31211 = class7492.method23255().method1583().method31211(class7493);
        class7492.method23257(new Class2259("commands.gamerule.query", new Object[] { class7493.method35022(), method31211.toString() }), false);
        return method31211.method26711();
    }
}
