// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class9156
{
    public static void method33414(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("stop").requires(class7492 -> class7492.method23210(4))).executes(commandContext -> {
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.stop.stopping", new Object[0]), true);
            ((Class7492)commandContext.getSource()).method23255().method1456(false);
            return 1;
        }));
    }
}
